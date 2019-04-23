package com.neso.testcase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.neso.action.CallHistoryAction;
import com.neso.factory.CommonUtil;
import com.sqlconnect.SqlFactory;

public class CallHistoryCase extends CommonUtil{
	
	// data load
	@Test
	public void checkDataLoad(){
		printLogger(CallHistoryCase.class,"dataLoad");
		Map<String, String> result = CallHistoryAction.getDataLoad();
		for(String key : result.keySet()){
			if(key.equals("reminderButton"))
				assert result.get(key).contains("disabled") : "remind button";
			else
				assert result.get(key).equals("true") : "";
		}
	}
	
	// search rules
	@Test
	public void checkDefaultSearch(){
		printLogger(CallHistoryCase.class,"searchRules");
		Map<String, String> result = CallHistoryAction.getDefaultSearch();
		assert result.get("editButton").equals("true") : "";
	}
	
	@Test
	public void checkInputTypeRules(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("merchant", "merchant");
		map.put("customer", "customer");
		Map<String, String> result = CallHistoryAction.getInputType(map);
		assert result.get("merchant").contains("ng-invalid") : "";
		assert result.get("customer").contains("ng-invalid") : "";
		assert result.get("search").equals("true") : "";
	}
	
	@Test
	public void checkInputLength(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("agentID", "12345");
		map.put("agentExtension", "123456");
		map.put("phone", "123456789101112131415");
		Map<String, String> result = CallHistoryAction.getInputLength(map);
		assert result.get("agentID").equals("1234") : "";
		assert result.get("agentExtension").equals("12345") : "";
		assert result.get("phone").equals("12345678910111213141") : "";
	}
	
	@Test
	public void checkInputLength2(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("merchant", "2147483648");
		map.put("customer", "2147483648");
		Map<String, String> result = CallHistoryAction.getInputLength2(map);
		assert result.get("merchant").contains("ng-invalid") : "";
		assert result.get("customer").contains("ng-invalid") : "";
		//assert result.get("search").equals("false") : "";
	}
	
	@Test
	public void checkSearch(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("merchant", "100429");
		map.put("customer", "7395822");
		map.put("phone", "4234324234");
		map.put("agentID", "md29");
		map.put("time", "08082017");
		Map<String, String> result = CallHistoryAction.getSearch(map);
		assert result.get("merchant").equals(map.get("merchant")) : "";
	}
	
	@Test
	public void checkLoadFollowUp(){
		Map<String, String> result = CallHistoryAction.getLoadFollowUp();
		assert !result.get("follow").equals("") : "";
		assert result.get("reminder").equals("true") : "";
	}
	
	// edit  customerNumber: 15997816
	@Test
	public void checkEditRules(){
		printLogger(CallHistoryCase.class,"edit");
		Map<String, String> map = new HashMap<String, String>();
		map.put("customer", "test");
		map.put("merchant", "test");
		Map<String, String> result = CallHistoryAction.getEditRules(map);
		assert result.get("error").equals("'Customer #' or 'Merchant #' cannot be null!") : "";
		assert result.get("customer").contains("ng-invalid") : "";
		assert result.get("merchant").contains("ng-invalid") : "";
	}
	
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkEdit(String username,String password){
		Map<String, String> map = new HashMap<String, String>();
		map.put("customer","7395062");
		map.put("merchant", "100429");
		CallHistoryAction.getEdit(map);
		String url = "jdbc:sqlserver://EHISSQL:1433";
		String sql = "SELECT TOP 10 CustomerNumber FROM [CRM].[dbo].[NESO_PhoneLog] where merchantID = 100429";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		while(!inforRepeat(map.get("customer"),list.get(0).get("CustomerNumber"),15,15)) {
			list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		}
		assert map.get("customer").equals(list.get(0).get("CustomerNumber")) : "";
		map.put("customer", "7395822");
		CallHistoryAction.getEdit(map);
		list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		while(!inforRepeat(map.get("customer"),list.get(0).get("CustomerNumber"),15,15)) {
			list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		}
		assert map.get("customer").equals(list.get(0).get("CustomerNumber")) : "";
	}
	
	// link to other page
	@Test
	@Parameters({"customerUrl","merchantUrl","orderMaintainUrl","orderDetailUrl","followUpIDUrl"})
	public void checkLinkOtherPage(String customerUrl,String merchantUrl,String orderMaintainUrl,String orderDetailUrl,String followUpIDUrl){
		printLogger(CallHistoryCase.class,"linkOtherPage");
		Map<String, String> result = CallHistoryAction.getLinkOtherPage();
		assert result.get("customerUrl").equals(String.format(customerUrl, "7395822")) : "111111";
		assert result.get("merchantUrl").equals(String.format(merchantUrl, "100429")) : "2222222";
		//assert result.get("orderMaintainUrl").equals(orderMaintainUrl) : "";
		assert result.get("orderDetailUrl").equals(orderDetailUrl) : "3333333333";
		assert result.get("followUpIDUrl").equals(String.format(followUpIDUrl, result.get("followID"))) : "4444444444";
	}
	
}
