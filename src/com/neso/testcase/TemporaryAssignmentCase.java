package com.neso.testcase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.neso.action.TemporaryAssignmentAction;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.neso.factory.CommonUtil;
import com.sqlconnect.SqlFactory;

public class TemporaryAssignmentCase extends CommonUtil{
	
	
	// add merchant
	@Test
	public void checkAddMerchant(){
		printLogger(TemporaryAssignmentCase.class,"addMerchant");
		Map<String,String> map = new HashMap<String,String>();
		map.put("merchant", "534264");
		map.put("agent", "gg80");
		map.put("memo", "autotest memo");
		TemporaryAssignmentAction.getAddMerchant(map); 
	}
	
	// add merchant rules
	@Test
	@Parameters({"url"})
	public void checkMerchantAssigned(String url){
//		loadPage(url);
		printLogger(TemporaryAssignmentCase.class,"addMerchantRules");
		Map<String,String> map = new HashMap<String,String>();
		map.put("merchant", "534264");
		Map<String,String> result = TemporaryAssignmentAction.getMerchantAssigned(map);
		assert !result.get("error").equals("") : "Assignment Set : The error message is check failed";
		assert result.get("save").equals("false") : "Assignment Set : The save button is enabled";
	}
	
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkMerchantInfo(String username,String password){
		Map<String,String> map = new HashMap<String,String>();
		map.put("merchant", "535522");
		map.put("agent", "gg80");
		Map<String,String> result = TemporaryAssignmentAction.getMerchantInfo(map);
		String url = "jdbc:sqlserver://EHISSQL:1433";
		String sql = "select top 10 MerchantName from Customer.dbo.merchantInfo with(nolock)  where MerchantID = " + map.get("merchant");
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);  
		assert result.get("name").equals(list.get(0).get("MerchantName")) : "Assignment Set : The merchant name search failed";
		assert result.get("save").equals("true") : "Assignment Set : The save button is not enabled";
	}

	
	// Assignment Query Search
	@Test
	public void checkSearchAll(){
		printLogger(TemporaryAssignmentCase.class,"assignmentQuerySearch");
		Map<String,String> result = TemporaryAssignmentAction.getSearchAll();
		assert !result.get("search").equals("") : "Assignment Query : The search all is failed";
		assert result.get("unassign").equals("false") : "Assignment Query : The unassign button is enabled";
	}
	
	@Test
	public void checkSearchAgent(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("agent", "gg80");
		Map<String,String> result = TemporaryAssignmentAction.getSearchAgent(map);
		assert result.get("merchant").equals("534264") : "Assignment Query : The search agent is failed";
		assert result.get("unassign").equals("false") : "Assignment Query : The unassign button is enabled";
	}

	@Test
	public void checkClickColumn(){
		Map<String,String> result = TemporaryAssignmentAction.getClickColumn();
		assert result.get("unassign").equals("true") : "Assignment Query : The unassign button is not enabled";
	}
	
	// Assignment Log Query
	@Test
	@Parameters({"url2"})
	public void checkLogLink(String url) {
		printLogger(TemporaryAssignmentCase.class,"assignmentLogQuery");
		Map<String,String> result = TemporaryAssignmentAction.getLogLink();
		assert result.get("link").equals(url) : "Assignment Query : The log link is error";
	}
	
	@Test
	@Parameters({"url2"})
	public void checkLogSearchAll(String url){
		loadPage(url);
		Map<String,String> result = TemporaryAssignmentAction.getLogSearchAll();
		assert !result.get("merchantName").equals("") : "Assignment Query : The search all is failed";
	}
	
	@Test
	public void checkLogSearchAgent(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("agent", "gg80");
		Map<String,String> result = TemporaryAssignmentAction.getLogSearchAgent(map);
		assert result.get("merchant").equals("534264") : "Assignment Query : The search agent is failed";
	}
	
	@Test
	public void checkLogSearchMerchant(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("merchant", "534264");
		Map<String,String> result = TemporaryAssignmentAction.getLogSearchMerchant(map);
		assert result.get("merchant").equals(map.get("merchant")) : "Assignment Query : The search merchant is failed";
	}
	
	@Test
	public void checkLogMerchantAndAgent(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("agent", "gg80");
		map.put("merchant", "534264");
		Map<String,String> result = TemporaryAssignmentAction.getLogMerchantAndAgent(map);
		assert !result.get("message").equals("") : "Assignment Query : The search merchant and agent is failed";
	}
	
	// cancel merchant
	@Test
	@Parameters({"url"})
	public void checkCancelUnassign(String url){
		loadPage(url);
		printLogger(TemporaryAssignmentCase.class,"cancelMerchant");
		Map<String,String> map = new HashMap<String,String>();
		map.put("agent", "gg80");
		TemporaryAssignmentAction.getCancelUnassign(map);
	}
	
	@Test
	public void checkRunUnassign(){
		Map<String,String> run = TemporaryAssignmentAction.getRunUnassign();
		assert run.get("result").equals("true") : "Assignment Query : The search agent is failed";
		Map<String,String> result = TemporaryAssignmentAction.getCheckAssignment();
		int i = 0;
		while(!result.get("text").equals("0 - 0 of 0 count") && i < 15){
			w(30);
			result = TemporaryAssignmentAction.getCheckAssignment();
			i++;
		}
		assert result.get("text").equals("0 - 0 of 0 count") : "Assignment Query : The delete assignment is failed";
	}
	
	public void loadPage(String url){
		openWindow(url);
		w(5);
	}
}
