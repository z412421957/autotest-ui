package com.neso.testcase;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.neso.action.CurrentEventSearchAction;
import com.neso.factory.CommonUtil;
import com.sqlconnect.SqlFactory;

public class CurrentEventSearchCase extends CommonUtil{
	
	// load
	@Test
	public void checkLoad() {
		printLogger(CurrentEventSearchCase.class,"load");
		Map<String, String> result = CurrentEventSearchAction.getLoad();
		for(String key : result.keySet()) {
			assert result.get(key).equals("All") : key;
		}
	}
	
	// add new
	@Test
	public void checkAddNewLoad() {
		printLogger(CurrentEventSearchCase.class,"addNew");
		Map<String, String> result = new CurrentEventSearchAction().getAddNewLoad();
		assert result.get("event").equals("true") : "event";
		assert result.get("bu").equals("Newegg.com") : "bu";
		assert result.get("type").equals("Order") : "type";
		assert result.get("solution").equals("Honor") : "solution";
		assert result.get("save").equals("true") : "save";
		assert result.get("cancel").equals("true") : "cancel";
		assert result.get("new").equals("true") : "new";
	}
	
	@Test
	public void checkAddNewRules() {
		Map<String, String> result = CurrentEventSearchAction.getAddNewRules();
		assert result.get("item").contains("ng-invalid") : "";
		assert result.get("manufacturer").contains("ng-invalid") : "";
		assert result.get("category").contains("ng-invalid") : "";
		assert result.get("subject").contains("ng-invalid") : "";
		assert result.get("period").contains("ng-invalid") : "";
		assert result.get("to").contains("ng-invalid") : "";
	}
	
	@Test
	public void checkAddNew() {
		Map<String, String> map = new HashMap<String, String>();
		String rand = getRandom(9999,1000);
		map.put("item", "garretest");
		map.put("manufacturer", "Alextest");
		map.put("category", "garre test" + rand);
		map.put("category2", "garre test edit" +rand);
		map.put("subject", "garre test");
		map.put("period", new SimpleDateFormat("MMddyyyy").format(new Date()));
		map.put("to", new SimpleDateFormat("MMddyyyy").format(new Date()));
		map.put("detail", "garre test");
		Map<String, String> result = CurrentEventSearchAction.getAddNew(map);
		assert result.get("item").equals("") : "";
		new CurrentEventSearchAction().closeWindows();
	}
	
	// search
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkSearchAndVoid(String username, String password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("item", "garretest");
		map.put("manufacturer", "Alextest");
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT Category FROM Newegg.dbo.NESO_CurrentEvent WITH(NOLOCK) WHERE InUser = 'km11' and Status = 'O' and ItemNumber = 'garretest' and GETDATE()<EndDate";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		for(int i = 0;i < list.size();i++) {
			map.put("category", list.get(i).get("Category"));
			Map<String, String> result = CurrentEventSearchAction.getSearchAndVoid(map);
			assert result.get("category").contains("garre test edit") : "edit failed";
			assert result.get("status").equals("Void") : "void failed";
		}
	}
	

}
