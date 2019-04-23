package com.neso.testcase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.neso.action.CustomerGroupMaintainAction;
import com.neso.factory.CommonUtil;
import com.sqlconnect.SqlFactory;

public class CustomerGroupMaintainCase extends CommonUtil{

	// load
	@Test
	public void checkPageLoad() {
		printLogger(CustomerGroupMaintainCase.class,"load");
		Map<String, String> result = CustomerGroupMaintainAction.getPageLoad();	
		assert result.get("status").equals("All") : "";
		assert result.get("customer").equals("true") : "";
		assert result.get("reset").equals("true") : "";
		assert result.get("search").equals("true") : "";
		assert result.get("new").equals("true") : "";
		assert result.get("modify").equals("false") : "";
		assert result.get("deactive").equals("false") : "";
		assert result.get("active").equals("false") : "";
		assert result.get("assign").equals("false") : "";
	}
		
	// add new
	@Test
	public void checkAddNewLoad() {
		printLogger(CustomerGroupMaintainCase.class,"addNew");
		Map<String, String> result = CustomerGroupMaintainAction.getAddNewLoad();
		for (String key : result.keySet()) {
			assert result.get(key).equals("true") : "";
		}
	}
	
	@Test
	public void checkAddNewRules() {
		Map<String, String> result = CustomerGroupMaintainAction.getAddNewRules();
		assert result.get("red").contains("ng-invalid") : "";
	}
	
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkAddNewNoApply(String username,String password) {
		String rand = getRandom(89999,10000);
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "garretest" + rand);
		map.put("description", "garretest" + rand);
		CustomerGroupMaintainAction.getAddNewNoApply(map);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT CustomerGroupID FROM CodeCenter.dbo.CustomerGroup WITH (NOLOCK) where InUser = 'km11' and STATUS = 1 and IsAssignByRule = 0";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		assert list.size() > 0 : "";
	}
	
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkAddNewApply(String username,String password) {
		String rand = getRandom(89999,10000);
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "garretest" + rand);
		map.put("description", "garretest" + rand);
		CustomerGroupMaintainAction.getAddNewApply(map);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT CustomerGroupID FROM CodeCenter.dbo.CustomerGroup WITH (NOLOCK) where InUser = 'km11' and STATUS = 1 and IsAssignByRule = 1";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		assert list.size() > 0 : "";
	}
		
	// search
	@Test
	public void checkSearch() {
		printLogger(CustomerGroupMaintainCase.class,"search");
		Map<String, String> map = new HashMap<String, String>();
		map.put("group1", "garre test");
		map.put("group2", "99999999");
		map.put("group3", "72");
		Map<String, String> result = CustomerGroupMaintainAction.getSearch(map);
		assert !result.get("name").equals("") : "";
		assert result.get("error").contains("ng-invalid") : "";
		assert result.get("content").equals("No records available.") : "";
		assert !result.get("name").equals("") : "";
	}
	
	// modify
	@Test
	public void checkModifyRules() {
		printLogger(CustomerGroupMaintainCase.class,"modify");
		Map<String, String> map = new HashMap<String, String>();
		map.put("group", "72");
		Map<String, String> result = CustomerGroupMaintainAction.getModifyRules(map);
		assert result.get("modify").equals("false") : "";
	}
	
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkModifyNoApply(String username,String password) {
		Map<String, String> map = new HashMap<String, String>();
		String rand = getRandom(89999,10000);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT CustomerGroupID FROM CodeCenter.dbo.CustomerGroup WITH (NOLOCK) where InUser = 'km11' and STATUS = 1 and IsAssignByRule = 0";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		map.put("group", list.get(0).get("CustomerGroupID"));
		map.put("name", "test modify " + rand);
		map.put("description", "description modify " + rand);
		CustomerGroupMaintainAction.getModifyNoApply(map);
		sql = "SELECT CustomerGroupName,Description FROM CodeCenter.dbo.CustomerGroup WITH (NOLOCK) where InUser = 'km11' and STATUS = 1 and IsAssignByRule = 0";
		list = SqlFactory.getSqlOfListMap(url, username, password, sql, 2);
		assert list.get(0).get("CustomerGroupName").equals(map.get("name")) : "";
		assert list.get(0).get("Description").equals(map.get("description")) : "";
	}
	
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkModifyApply(String username,String password) {
		Map<String, String> map = new HashMap<String, String>();
		String rand = getRandom(89999,10000);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT CustomerGroupID FROM CodeCenter.dbo.CustomerGroup WITH (NOLOCK) where InUser = 'km11' and STATUS = 1 and IsAssignByRule = 1";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		map.put("group", list.get(0).get("CustomerGroupID"));
		map.put("name", "test modify " + rand);
		map.put("description", "description modify " + rand);
		Map<String, String> result = new CustomerGroupMaintainAction().getModifyApply(map);
		sql = "SELECT CustomerGroupName,Description FROM CodeCenter.dbo.CustomerGroup WITH (NOLOCK) where InUser = 'km11' and STATUS = 1 and IsAssignByRule = 1";
		list = SqlFactory.getSqlOfListMap(url, username, password, sql, 2);
		assert result.get("url").equals("https://central3testing.newegg.org/neso-crm-customer-group/edit?customergroupid=" + map.get("group")) : "";
		assert result.get("black").equals("false") : "";
		assert result.get("white").equals("false") : "";
		assert list.get(0).get("CustomerGroupName").equals(map.get("name")) : "";
		assert list.get(0).get("Description").equals(map.get("description")) : "";
	}
	
	// assign price types
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkAssignPriceTypesRules(String username,String password) {
		printLogger(CustomerGroupMaintainCase.class,"assignPriceTypes");
		Map<String, String> map = new HashMap<String, String>();
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT CustomerGroupID FROM CodeCenter.dbo.CustomerGroup WITH (NOLOCK) where InUser = 'km11' and STATUS = 1 and IsAssignByRule = 0";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		map.put("group", list.get(0).get("CustomerGroupID"));
		Map<String, String> result = CustomerGroupMaintainAction.getAssignPriceTypesRules(map);
		assert result.get("type1").equals("true") : "";
		assert result.get("type2").equals("true") : "";
	}
	
	@Test
	public void checkAssignPriceTypes() {
		Map<String, String> result = CustomerGroupMaintainAction.getAssignPriceTypes();
		assert !result.get("type").equals("") : "";
	}
	
	@Test
	public void checkAssignRemoveTypes() {
		Map<String, String> result = CustomerGroupMaintainAction.getAssignRemoveTypes();
		assert result.get("content").equals("No records available.") : "";
	}
	
	// associate customers
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkRemoveCustomer(String username,String password) {
		printLogger(CustomerGroupMaintainCase.class,"assignCustomers");
		Map<String, String> map = new HashMap<String, String>();
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT CustomerGroupID FROM CodeCenter.dbo.CustomerGroup WITH (NOLOCK) where InUser = 'km11' and STATUS = 1 and IsAssignByRule = 0";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		map.put("group2", list.get(0).get("CustomerGroupID"));
		map.put("group", "72");
		Map<String, String> result = CustomerGroupMaintainAction.getRemoveCustomer(map);
		assert result.get("remove").equals("false") : "";
		assert result.get("error").equals("Please select at least one customer to be removed from the group.") : "";
	}
	
	// deactive
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkDeactive(String username,String password) {
		printLogger(CustomerGroupMaintainCase.class,"deactive");
		Map<String, String> map = new HashMap<String, String>();
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT CustomerGroupID FROM CodeCenter.dbo.CustomerGroup WITH (NOLOCK) where InUser = 'km11' and STATUS = 1 and CustomerGroupID != 539";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		for(int i = 0;i < list.size();i++) {
			map.put("group", list.get(i).get("CustomerGroupID"));
			CustomerGroupMaintainAction.getDeactive(map);
		}
		w(10);
		list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		assert list.size() < 1 : "";
	}
	
	
}
