package com.neso.testcase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.neso.action.CallFilterAction;
import com.neso.factory.CommonUtil;
import com.sqlconnect.SqlFactory;

public class CallFilterCase extends CommonUtil{

	//  load
	@Test
	public void checkLoad() {
		printLogger(CallFilterCase.class,"load");
		Map<String, String> result = CallFilterAction.getLoad();
		assert result.get("name").equals("true") : "name";
		assert result.get("createBy").equals("true") : "create by";
		assert result.get("agent").equals("true") : "agent";
		assert result.get("merchantStatus").equals("All") : "merchant status";
		assert result.get("latePayStatus").equals("All") : "late pay status";
		assert result.get("bu").equals("All") : "bu";
		assert result.get("netTerm").equals("All") : "net term";
		assert result.get("seatSize").equals("All") : "seat size";
		assert result.get("b2b").equals("All") : "b2b";
		assert result.get("ownership").equals("All") : "owner ship";
		assert result.get("reset").equals("true") : "reset";
		assert result.get("searchButton").equals("true") : "search button";
		assert result.get("searchResult").equals("") : "search result";
		assert result.get("add").equals("true") : "add";
	}
	
	// add new
	@Test
	public void checkAddNewRules() {
		printLogger(CallFilterCase.class,"addNew");
		Map<String, String> result = CallFilterAction.getAddNewRules();
		assert result.get("filterError").contains("ng-invalid") : "";
	}
	
	@Test 
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkAddNew(String username, String password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "garre test");
		map.put("priority", "2");
		CallFilterAction.getAddNew(map);
		String sql = "SELECT TransactionNumber FROM CRM.dbo.NESO_CRM_CallPlanFilter WITH(NOLOCK) WHERE STATUS = 'O' AND [Public]= '0' and InUser = 'km11'";
		String url = "jdbc:sqlserver://ehissql:1433";
		List<Map<String, String>> result = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		int i = 0;
		while(result.size() < 2 && i < 10) {
			w(30);
			result = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
			i ++;
		}
		assert result.size() > 0 : "";
	}
	
	// search
	@Test
	public void checkSearch() {
		printLogger(CallFilterCase.class,"search");
		Map<String, String> result = CallFilterAction.getSearch();
		assert !result.get("createBy").equals("") : "";
	}
	
	@Test
	public void checkSearchRules() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "autotest");
		map.put("createBy", "km11");
		//map.put("agent", "AC5C");
		map.put("bu", "2");
		map.put("seatSize", "2");
		map.put("merchant", "4");
		map.put("latePay", "2");
		map.put("agentNum", "1");
		Map<String, String> result = CallFilterAction.getSearchRules(map);
		assert result.get("seatSize").equals("1 - 4") : "1111";
		assert result.get("merchant").equals("Inactive 30D +") : "2222";
		assert result.get("latePay").equals("Paid On Time") : "3333";
		assert result.get("bu").equals("Neweggbusiness.com") : "4444";
		assert result.get("createBy").equals("Ken.L.Ma (km11)") : "5555";
	}
	
	@Test
	public void checkSearchResult() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", "50");
		map.put("name", "autotest");
		map.put("agent", "AC5C");
		map.put("seatSize", "1 - 4");
		map.put("merchant", "Inactive 30D +");
		map.put("latePay", "Paid On Time");
		map.put("createBy", "km11");
		Map<String, String> result = CallFilterAction.getSearchResult(map);
		assert result.get("createBy").equals("Ken.L.Ma (km11)") : "";
	}
	
	@Test
	public void checkResetRules() {
		Map<String, String> result = CallFilterAction.getResetRules();
		assert !result.get("createBy").equals("") : "";
	}
	
	// edit
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkEdit(String username,String password) {
		printLogger(CallFilterCase.class,"edit");
		Map<String, String> map = new HashMap<String, String>();
		map.put("filter", "garre");
		map.put("name", "garre test edit");
		map.put("priority", "5");
		CallFilterAction.getEdit(map);
		String sql = "SELECT FilterName,Priority FROM CRM.dbo.NESO_CRM_CallPlanFilter WITH(NOLOCK) WHERE STATUS = 'O' AND [Public]= '0' and InUser = 'km11' and MerchantStatus = '' order by LastEditDate desc";
		String url = "jdbc:sqlserver://ehissql:1433";
		List<Map<String, String>> result = SqlFactory.getSqlOfListMap(url, username, password, sql, 2);
		while(!inforRepeat(result.get(0).get("FilterName"),map.get("name"),30,20)) {
			result = SqlFactory.getSqlOfListMap(url, username, password, sql, 2);
		}
		assert result.get(0).get("FilterName").equals(map.get("name")) : "filter name";
		assert result.get(0).get("Priority").equals("5") : "priority";
	}
	
	// delete
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkDelete(String username,String password) {
		printLogger(CallFilterCase.class,"delete");
		Map<String, String> map = new HashMap<String, String>();
		String sql = "SELECT TransactionNumber FROM CRM.dbo.NESO_CRM_CallPlanFilter WITH(NOLOCK) WHERE STATUS = 'O' AND [Public]= '0' and InUser = 'km11' and MerchantStatus = '' order by LastEditDate desc";
		String url = "jdbc:sqlserver://ehissql:1433";
		List<Map<String, String>> result = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		for(int i = 0;i < result.size();i ++) {
			map.put("id", result.get(i).get("TransactionNumber"));
			CallFilterAction.getDelete(map);
		}
		w(30);
		result = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		int i = 0;
		while(result.size() > 0 && i < 20) {
			w(30);
			result = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
			i ++;
		}
		assert result.size() == 0 : "";
	}
	
}
