package com.neso.testcase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.neso.action.MerchantBalanceAction;
import com.neso.factory.CommonUtil;
import com.sqlconnect.SqlFactory;

public class MerchantBalanceCase extends CommonUtil{

	// load
	@Test
	public void checkLoad() {
		printLogger(MerchantBalanceCase.class,"load");
		Map<String, String> result = MerchantBalanceAction.getLoad();
		assert result.get("invoice").contains("k-switch-off") : "";
		assert result.get("balance").equals("No records available.") : "";
		assert result.get("invoiceList").equals("No records available.") : "";
	}
	
	// search
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkSearchMerchantID(String username,String password) {
		printLogger(MerchantBalanceCase.class,"search");
		Map<String, String> map = new HashMap<String, String>();
		map.put("merchant", "2147483648");
		map.put("merchant2", "99999");
		map.put("merchant3", "100429");
		Map<String, String> result = MerchantBalanceAction.getSearchMerchantID(map);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT MerchantName,ContactEmail FROM Customer.dbo.MerchantInfo WITH(NOLOCK) WHERE MerchantID = 100429";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 2);
		assert result.get("name").equals(list.get(0).get("MerchantName")) : "";
		assert result.get("contact").equals(list.get(0).get("ContactEmail")) : "";
	}
	
	@Test
	@Parameters({"url"})
	public void checkSearchInvoiceDate(String url) {
		Map<String, String> map = new HashMap<String, String>();
		openWindow(url);
		map.put("merchant", "100429");
		Map<String, String> result = MerchantBalanceAction.getSearchInvoiceDate(map);
		assert result.get("name").equals("") : "";
		assert !result.get("name2").equals("") : "";
		assert result.get("merchant").equals(map.get("merchant")) : "";
	}
	
	@Test
	@Parameters({"url"})
	public void checkSearchBu(String url) {
		openWindow(url);
		Map<String, String> map = new HashMap<String, String>();
		map.put("merchant", "100429");
		Map<String, String> result = MerchantBalanceAction.getSearchBu(map);
		assert !result.get("name").equals("") : "";
		assert result.get("bu").equals("All") : "";
	}
	
	@Test
	@Parameters({"url"})
	public void checkSearchDiscrepancyOnly(String url) {
		openWindow(url);
		Map<String, String> map = new HashMap<String, String>();
		map.put("merchant", "100429");
		Map<String, String> result = MerchantBalanceAction.getSearchDiscrepancyOnly(map);
		assert !result.get("name").equals("") : "";
	}
	
	// mail to customer
	@Test
	@Parameters({"url"})
	public void checkMailToCustomerRules(String url) {
		printLogger(MerchantBalanceCase.class,"mailToCustomer");
		openWindow(url);
		Map<String, String> map = new HashMap<String, String>();
		map.put("merchant", "100429");
		Map<String, String> result = MerchantBalanceAction.getMailToCustomerRules(map);
		assert result.get("error").equals("Must choose a Merchant!") : "";
		assert result.get("box").equals("true") : "";
		assert result.get("type").equals("Primary Customer") : "";
	}
	
	@Test
	public void checkMailToCustomer() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("template", "normal follow-up email");
		Map<String, String> result = new MerchantBalanceAction().getMailToCustomer(map);
		assert result.get("error").equals("Must choose a Customer!") : "";
	}
	
	// late pay notification
	@Test
	@Parameters({"url"})
	public void checkLatePayNotification(String url) {
		printLogger(MerchantBalanceCase.class,"latePayNotification");
		openWindow(url);
		Map<String, String> map = new HashMap<String, String>();
		map.put("merchant", "100429");
		map.put("invoice", "49515489");
		Map<String, String> result = MerchantBalanceAction.getLatePayNotification(map);
		assert result.get("error").equals("Please select a no balance invoice info in Invoice List!") : "";
		assert result.get("error2").equals("Please select a no balance invoice info in Invoice List!") : "";
	}
	
	// note to PG
	@Test
	@Parameters({"url"})
	public void checkNoteToPG(String url) {
		printLogger(MerchantBalanceCase.class,"noteToPG");
		openWindow(url);
		Map<String, String> map = new HashMap<String, String>();
		map.put("merchant", "100429");
		map.put("note", "garre auto test");
		Map<String, String> result = MerchantBalanceAction.getNoteToPG(map);
		assert result.get("error").equals("Must choose a Merchant!") : "";
		assert result.get("error2").equals("This funcation is not available because we can't get merchant status and latepay status.") : "";
//		assert result.get("box1").equals("false") : "";
//		assert result.get("box2").equals("false") : "";
//		assert result.get("type").equals("Primary Customer") : "";
//		assert result.get("error2").equals("Must choose one type of reason!");
	}
	
	
}
