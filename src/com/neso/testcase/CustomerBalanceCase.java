package com.neso.testcase;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.neso.action.CustomerBalanceAction;
import com.neso.factory.CommonUtil;

public class CustomerBalanceCase extends CommonUtil{

	// page load
	@Test
	public void checkPageLoad() {
		printLogger(CustomerBalanceCase.class,"pageLoad");
		Map<String, String> result = CustomerBalanceAction.getPageLoad();
		assert result.get("customer").equals("true") : "";
		assert result.get("invoice").equals("false") : "";
		assert result.get("bu").equals("All") : "";
		assert result.get("search").equals("true") : "";
		assert result.get("discrepancy").equals("false") : "";
	}
	
	// search
	@Test
	public void checkNoCustomer() {
		printLogger(CustomerBalanceCase.class,"search");
		Map<String, String> map = new HashMap<String, String>();
		map.put("customer", "999999999");
		Map<String, String> result = CustomerBalanceAction.getNoCustomer(map);
		assert result.get("error").equals("Customer was not found,please check customer number!") : "";
	}
	
	@Test
	public void checkDeactivatedCustomer() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("customer", "9897557");
		Map<String, String> result = CustomerBalanceAction.getDeactivatedCustomer(map);
		assert result.get("error").equals("Customer " + map.get("customer") + " has been deactivated.") : "";	
	}
	
	@Test
	public void checkCustomerLoad() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("customer", "7402162");
		Map<String, String> result = CustomerBalanceAction.getCustomerLoad(map);
		assert !result.get("company").equals("") : "";
	}
	
	@Test
	public void checkUSDCurrency() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("customer", "26243981");
		map.put("bu", "2");
		Map<String, String> result = CustomerBalanceAction.getUSDCurrency(map);
		assert result.get("currency").equals("USD") : "";
	}
	
	@Test
	public void checkRevertLoad() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("customer", "26243981");
		map.put("bu", "1");
		map.put("currency", "1");
		Map<String, String> result = CustomerBalanceAction.getRevertLoad(map);
		assert !result.get("currency").equals("USD") : "";
	}
	
	@Test
	public void checkDiscrepancyOnly() {
		Map<String, String> result = CustomerBalanceAction.getDiscrepancyOnly();
		String c1 = result.get("count1").split("of")[1].split("count")[0].trim();
		String c2 = result.get("count2").split("of")[1].split("count")[0].trim();
		assert Integer.valueOf(c1) > Integer.valueOf(c2) : "";
	}
	
	@Test
	public void checkPaymentHistory() {
		Map<String, String> result = CustomerBalanceAction.getPaymentHistory();
		assert result.get("invoice").equals(result.get("payment")) : "";
	}
	
	@Test
	public void checkCSView() {
		Map<String, String> result = CustomerBalanceAction.getCSView();
		assert !result.get("currency").equals("") : "";
	}
	
	// link
	@Test
	public void checkLink() {
		printLogger(CustomerBalanceCase.class,"link");
		Map<String, String> map = new HashMap<String, String>();
		map.put("customer", "26243981");
		map.put("so", "122954758");
		map.put("invoice", "70083229");
		map.put("rma", "43816360");
		Map<String, String> result = CustomerBalanceAction.getLink(map);
		
		
	}
}
