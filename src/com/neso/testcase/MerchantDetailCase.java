package com.neso.testcase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.neso.action.MerchantDetailAction;
import com.neso.factory.CommonUtil;
import com.sqlconnect.SqlFactory;

public class MerchantDetailCase extends CommonUtil{

	// data load
	@Test
	public void checkDataLoad(){
		printLogger(MerchantDetailCase.class,"dataLoad");
		Map<String, String> result = MerchantDetailAction.getDataLoad();
		for(String key : result.keySet()) {
			if(key.equals("merchant") || key.equals("shippingCarrier"))
				assert result.get(key).equals("true") : "false : " + key;
			else if (key.equals("reminder"))
				assert result.get(key).equals("link-button link-button-disabled") : "false : " + key;
			else
				assert result.get(key).equals("false") : "false : " + key;
		}
	}
	
	// search
	@Test
	public void checkSearchRules(){
		printLogger(MerchantDetailCase.class,"search");
		Map<String, String> map = new HashMap<String, String>();
		map.put("merchant","test");
		map.put("merchant2", "123456");
		Map<String, String> result = MerchantDetailAction.getSearchRules(map);
		assert result.get("merchantError").contains("ng-invalid") : "Must input a valid number check failed.";
		assert result.get("notExists").equals("The merchant does not exists!") : "The merchant does not exists check failed.";
	}
	
	@Test
	public void checkSearch(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("merchant", "1052168");
		Map<String, String> result = MerchantDetailAction.getSearch(map);
		assert result.get("reminderButton").equals("true") : "Reminder button should be disabled, check failed.";
		assert result.get("customerType").equals("Primary") : "Customer type should be Primary, check failed.";
	}
	
	// shipping account contract
	@Test
	public void checkAccountContractRules(){
		printLogger(MerchantDetailCase.class,"shippingAccountContract");
		Map<String, String> map = new HashMap<String, String>();
		map.put("file", getPath("\\build") + "\\testpic\\test01.jpg");
		Map<String, String> result = MerchantDetailAction.getAccountContractRules(map);
		assert result.get("noFile").equals("false") : "No file check failed.";
		assert result.get("noDescription").contains("ng-invalid") : "No description check failed.";
	}
	
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkAccountContract(String username,String password){
		Map<String, String> map = new HashMap<String, String>();
		map.put("description", "autotest");
		Map<String, String> result = MerchantDetailAction.getAccountContract(map);
		assert result.get("shippingCarrier").equals("Fedex") : "Choose the shipping carrier with Fedex failed.";
		String url = "jdbc:sqlserver://EHISSQL:1433";
		String sql = "SELECT top 10 Status FROM [CRM].[dbo].[NESO_ThirdShippingAccountContract] WITH(NOLOCK) where MerchantID = 1052168 and Status = 'O'";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		int i = 0;
		while(list.size() > 0 && i < 10){
			w(15);
			list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
			i ++;
		}
		assert list.size() < 1 : "Sql check failed.";
	}
	
	// Mail To Customer
	@Test
	@Parameters({"url"})
	public void checkMailCustomer(String url){
		printLogger(MerchantDetailCase.class,"mailCustomer");
		Map<String, String> map = new HashMap<String, String>();
		openWindow(url);
		map.put("merchant", "1052168");
		map.put("template", "normal follow-up email");
		Map<String, String> result = MerchantDetailAction.getMailCustomer(map);
		assert result.get("noMail").equals("Must choose a Merchant!") : "Must choose a Merchant check failed.";
		assert result.get("noCustomer").equals("Must choose a Customer!") : "Must choose a Customer check failed";
		assert result.get("success").trim().equals("47234274| Success") : "Send email check failed";
	}
	
	// Note To P&G
	@Test
	@Parameters({"url"})
	public void checkNotePG(String url){
		printLogger(MerchantDetailCase.class,"notePG");
		Map<String, String> map = new HashMap<String, String>();
		openWindow(url);
		map.put("merchant", "1052168");
		Map<String, String> result = MerchantDetailAction.getNotePG(map);
		assert result.get("noNote").equals("Must choose a Merchant!") : "Must choose a Merchant check failed.";
		assert result.get("error").equals("This funcation is not available because we can't get merchant status and latepay status.") : "";
	}									   
	
	// link to other page
	@Test
	@Parameters({"soProcess","customerBalance","merchantBalance","customerReport","merchantReport","merchantDashboard","penGlobe","reminder","newSO"})
	public void checkLinkOtherPage1(String soProcess,String customerBalance,String merchantBalance,String customerReport,String merchantReport,String merchantDashboard,String penGlobe,String reminder,String newSO){
		printLogger(MerchantDetailCase.class,"linkOtherPage");
		Map<String, String> result = MerchantDetailAction.getLinkOtherPage1();
		System.out.println(result.get("soProcess"));
		assert result.get("soProcess").equals(soProcess + "?customernumber=47234274") : "Link error : soProcess";
		assert result.get("customerBalance").equals(customerBalance + "?customerNumber=47234274") : "Link error : customerBalance";
		assert result.get("merchantBalance").equals(merchantBalance + "?merchantid=1052168") : "Link error : merchantBalance";
		assert result.get("customerReport").equals(customerReport + "?customernumber=47234274") : "Link error : customerReport";
		assert result.get("merchantDashboard").equals(merchantDashboard) : "Link error : merchantDashboard";
		assert result.get("penGlobe").equals(penGlobe + "?merchantid=1052168") : "Link error : penGlobe";
		assert result.get("reminder").equals(reminder) : "Link error : reminder";
		//assert result.get("newSO").equals(newSO + "?CustomerNumber=47234274") : "Link error : newSO";
	}
	
	@Test
	@Parameters({"url","soProcess","customerBalance","merchantBalance","customerReport","merchantReport","penGlobe","newSO"})
	public void checkLinkOtherPage2(String url,String soProcess,String customerBalance,String merchantBalance,String customerReport,String merchantReport,String penGlobe,String newSO){
		openWindow(url);
		Map<String, String> result = MerchantDetailAction.getLinkOtherPage2();
		assert result.get("soProcess").equals(soProcess) : "Link error : soProcess";
		assert result.get("customerBalance").equals(customerBalance) : "Link error : customerBalance";
		assert result.get("merchantBalance").equals(merchantBalance) : "Link error : merchantBalance";
		assert result.get("customerReport").equals(customerReport) : "Link error : merchantBalance";
		//assert result.get("penGlobe").equals(penGlobe) : "Link error : penGlobe";
		//assert result.get("newSO").equals(newSO) : "Link error : newSO";
	}
}
