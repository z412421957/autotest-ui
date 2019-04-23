package com.neso.testcase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.neso.action.MerchantQueryAction;
import com.neso.factory.CommonUtil;
import com.sqlconnect.SqlFactory;

public class MerchantQueryCase extends CommonUtil{

	// load
	@Test
	public void checkLoad() {
		printLogger(MerchantQueryCase.class,"load");
		Map<String, String> result = MerchantQueryAction.getLoad();
		assert result.get("type").equals("All") : "type";
		assert result.get("searchPrev").equals("true") : "searchPrev";
		assert result.get("searchNext").equals("false") : "searchNext";
		//assert result.get("content").trim().equals("No records available.") : "content";
		assert result.get("add1").contains("disabled") : "add1";
		assert result.get("add2").contains("disabled") : "add2";
		assert result.get("add3").contains("disabled") : "add3";
		//assert result.get("add4").contains("disabled") : "add4";
	}
	
	// search
	@Test
	public void checkReset() {
		printLogger(MerchantQueryCase.class,"search");
		Map<String, String> result = MerchantQueryAction.getReset();
		assert result.get("merchant").equals("All") : "merchant : " + result.get("merchant");
		assert result.get("latePay").equals("All") : "latepay : " + result.get("latePay");
		assert result.get("bu").equals("All") : "bu : " + result.get("bu");
		assert result.get("netTerm").equals("All") : "netTerm : " + result.get("netTerm");
		assert result.get("seat").equals("All") : "seat : " + result.get("seat");
		assert result.get("b2b").equals("All") : "b2b : " + result.get("b2b");
		assert result.get("ownership").equals("Managed") : "ownership : " + result.get("ownership");
	}
	
	@Test
	public void checkSearch() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("ownership", "1");
		map.put("searchBy", "2");
		map.put("merchant", "3");
		map.put("latePay", "8");
		map.put("seat", "2");
		map.put("bu", "2");
		map.put("keyword", "100429");
		Map<String, String> result = MerchantQueryAction.getSearch(map);
		assert result.get("merchant").equals(map.get("keyword")) : "";
		assert result.get("export").equals("") : "";
	}
	
	// add to customer group
	@Test
	public void checkAddCustomerGroup() {
		printLogger(MerchantQueryCase.class,"addCustomerGroup");
		Map<String, String> result = MerchantQueryAction.getAddCustomerGroup();
		assert result.get("box").equals("false") : "";
	}
	
	// add black white
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkAddBlack(String username, String password) {
		printLogger(MerchantQueryCase.class,"addBlackWhite");
		MerchantQueryAction.getAddBlack();
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT TOP 10 Condition FROM codeCenter.dbo.CustomerGroupConditions WITH(NOLOCK) WHERE CustomerNumber = 7395822 AND Status <>'V' and CustomerGroupID = 44";
		List<Map<String,String>> result = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		assert result.get(0).get("Condition").equals("01") : "";
	}
	
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkAddWhite(String username, String password) {
		MerchantQueryAction.getAddWhite();
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT TOP 10 Condition FROM codeCenter.dbo.CustomerGroupConditions WITH(NOLOCK) WHERE CustomerNumber = 7395822 AND Status <>'V'";
		List<Map<String,String>> result = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		assert result.get(0).get("Condition").equals("02") : "";
	}
	
	// button
	@Test
	@Parameters({"url"})
	public void checkButton1(String url) {
		printLogger(MerchantQueryCase.class,"button");
		openWindow(url);
		Map<String, String> result = new MerchantQueryAction().getButton1();
		assert result.get("merchant").equals("https://central3testing.newegg.org/neso-crm-merchant-balance/main") : result.get("merchant");
		assert result.get("process").equals("https://central3testing.newegg.org/neso-soprocess/main") : result.get("process");
		assert result.get("history").equals("https://central3testing.newegg.org/neso-crm-call-history/main") : result.get("history");
	}
	
	@Test
	public void checkButton2() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("ownership", "1");
		map.put("searchBy", "2");
		map.put("keyword", "100429");
		
	}
	
	
}
