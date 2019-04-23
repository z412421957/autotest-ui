package com.neso.testcase;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.neso.action.CustomerQueryAction;
import com.neso.factory.CommonUtil;

public class CustomerQueryCase extends CommonUtil{

	// load
	@Test
	public void checkLoad() {
		printLogger(CustomerQueryCase.class,"load");
		Map<String, String> result = CustomerQueryAction.getLoad();
		for(String key : result.keySet()) {
			if (key.equals("searchBy") || key.equals("ownership") || key.equals("bu"))
				assert result.get(key).equals("All") : key;
			else if (key.equals("content"))
				assert result.get(key).trim().equals("No records available.") : key;
			else if (key.equals("customer") || key.equals("account") || key.equals("call") || key.equals("batch") || key.equals("reminder") || key.equals("login") || key.equals("contact"))
				assert result.get(key).contains("k-state-disabled") || result.get(key).contains("disabled") : key;
			else 
				assert !result.get(key).contains("k-state-disabled") && !result.get(key).contains("disabled") : key;
		}						
	}
	
	// search
	@Test
	public void checkSearchBy() {
		printLogger(CustomerQueryCase.class,"search");
		Map<String, String> map = new HashMap<String, String>();
		map.put("agent", "ac5c");
		map.put("customer", "7402162");
		map.put("companyName", "newegg");
		map.put("contactWith", "Ken MA");
		Map<String, String> result = CustomerQueryAction.getSearchBy(map);
		assert !result.get("customer").equals("") : result.get("customer");
		assert result.get("company2").equals("garre test") : result.get("company2");
		assert result.get("company3").toLowerCase().equals(map.get("companyName")) : result.get("company3");
		assert !result.get("customer4").equals("") : result.get("customer4");
	}
	
	@Test
	public void checkSearchCondition() {
		Map<String, String> result = CustomerQueryAction.getSearchCondition();
		assert result.get("country").equals("USA") : "";
		assert result.get("ownership").equals("Self-Serve") : "";
	}
	
	// button
	@Test
	@Parameters({"url"})
	public void checkButton(String url) {
		printLogger(CustomerQueryCase.class,"button");
		openWindow(url);
		Map<String, String> result = new CustomerQueryAction().getButton();
		assert result.get("so").equals("https://central3testing.newegg.org/neso-soprocess/main") : result.get("so");
		assert result.get("tax").equals("http://centraltest.newegg.org/Portal/#/NeweggCentral.NESO.CustomerTaxExempt/CustomerExempt") : result.get("tax");
		//assert result.get("new").equals("") : "";
		assert result.get("crd").equals("http://central.newegg.org/Portal/#/NeweggCentral.NESO.CreditRequest/QueryCreditRequest") : result.get("crd");
	}
	
	@Test
	public void checkButton2() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("search", "ac5c");
		Map<String, String> result = new CustomerQueryAction().getButton2(map);
		assert result.get("batch").contains("https://central3testing.newegg.org/neso-order-batch-create/main") : "batch new button";
		assert result.get("tax").equals("http://centraltest.newegg.org/Portal/#/NeweggCentral.NESO.CustomerTaxExempt/CustomerExempt?customernumber=" + result.get("customer")) : result.get("tax");
		assert result.get("crd").equals("http://central.newegg.org/Portal/#/NeweggCentral.NESO.CreditRequest/QueryCreditRequest?customernumber=" + result.get("customer")) : "crd req query button";
		//assert result.get("reminder").contains("54857687") : "reminder button";
		assert result.get("so").contains("https://central3testing.newegg.org/neso-soprocess/main?customernumber=" + result.get("customer")) : "so process button";
		assert result.get("customerDetail").contains("https://central3testing.newegg.org/neso-customermaintain/customermaintain?customerNumber=" + result.get("customer")) : result.get("customerDetail");
	}
	
	// link
	@Test
	@Parameters({"url"})
	public void checkLink(String url) {
		printLogger(CustomerQueryCase.class,"link");
		openWindow(url);
		Map<String, String> result = CustomerQueryAction.getLink();
		assert result.get("customerBalance").equals("https://central3testing.newegg.org/neso-customerbalance/customerbalance") : result.get("customerBalance");
		assert result.get("customerReport").equals("https://central3testing.newegg.org/neso-customer-reportcard/customerreportcard") : result.get("customerReport");
		assert result.get("messageCenter").equals("https://central3testing.newegg.org/neso-messagecenter/messagecenter") : "";
		assert result.get("rmaQuery").equals("http://centraltest.newegg.org/Portal/#/RMAInbound/RMAQuery") : result.get("rmaQuery");
		assert result.get("claimQuery").equals("http://centraltest.newegg.org/Portal/#/NeweggCentral.NESO.Claim/ClaimProcess") : result.get("claimQuery");
		assert result.get("penGlobe").equals("https://central3testing.newegg.org/neso-penglobe/penglobe") : result.get("penGlobe");
	}
	
	@Test
	@Parameters({"url"})
	public void checkLink2(String url) {
		printLogger(CustomerQueryCase.class,"link");
		Map<String, String> map = new HashMap<String, String>();
		map.put("search", "ac5c");
		Map<String, String> result = CustomerQueryAction.getLink2(map);
		assert result.get("customerBalance").equals("https://central3testing.newegg.org/neso-customerbalance/customerbalance?customerNumber=" + result.get("customer")) : result.get("customerBalance");
		assert result.get("customerReport").equals("https://central3testing.newegg.org/neso-customer-reportcard/customerreportcard?customernumber=" + result.get("customer")) : result.get("customerReport");
		assert result.get("messageCenter").equals("https://central3testing.newegg.org/neso-messagecenter/messagecenter?customernumber=" + result.get("customer")) : "";
		assert result.get("rmaQuery").equals("http://centraltest.newegg.org/Portal/#/RMAInbound/RMAQuery?CustomerNumber=" + result.get("customer")) : result.get("rmaQuery");
		assert result.get("claimQuery").equals("http://centraltest.newegg.org/Portal/#/NeweggCentral.NESO.Claim/ClaimProcess?customernumber=" + result.get("customer")) : result.get("claimQuery");
		assert result.get("penGlobe").equals("https://central3testing.newegg.org/neso-penglobe/penglobe?customernumber=" + result.get("customer")) : result.get("penGlobe");
	}
	
}
