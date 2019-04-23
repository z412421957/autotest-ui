package com.neso.testcase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.neso.action.ContactProcessAction;
import com.neso.factory.CommonUtil;
import com.sqlconnect.SqlFactory;

public class ContactProcessCase extends CommonUtil{

	// load
	@Test
	public void checkLoad() {
		printLogger(ContactProcessCase.class,"load");
		Map<String, String> result = ContactProcessAction.getLoad();
		assert result.get("reward").equals("All") : "reward";
		assert result.get("opt").equals("All") : "opt";
		assert result.get("customer").equals("All") : "customer";
		assert result.get("acct").equals("All") : "acct";
		assert result.get("join").contains("disabled") : "join";
		assert result.get("delete").contains("disabled") : "delete";
		assert result.get("merchant").contains("nk-button-disabled") : "merchant";
		assert result.get("sales").contains("nk-button-disabled") : "sales";
		assert result.get("contact").contains("nk-button-disabled") : "contact";
		assert !result.get("pen").contains("nk-button-disabled") : "pen";
	}
	
	// add new
	@Test
	public void checkAddNewLoad() {
		printLogger(ContactProcessCase.class,"addNew");
		Map<String, String> result = ContactProcessAction.getAddNewLoad();
		assert result.get("merchantBox") == null : "";
		assert result.get("customerBox").equals("true") : "";
		assert result.get("acctBox") == null : "";
		assert result.get("optBox") == null : "";
		assert result.get("merchantIDText").contains("nk-input-readonly") : "";
		assert result.get("customerNumberText").contains("k-state-disabled") : "";
		assert result.get("save").contains("nk-button-disabled") : "";
	}
	
	@Test
	public void checkAddNewRules() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("merchantID", "999999");
		map.put("merchantID2", "100429");
		Map<String, String> result = ContactProcessAction.getAddNewRules(map);
		assert result.get("merchantName").contains("nk-input-readonly") : "";
		assert result.get("merchantName1").equals("") : "";
		assert !result.get("merchantName2").equals("") : "";
		assert result.get("merchantName3").equals("") : "";
		assert !result.get("merchantText").contains("nk-input-readonly") : "";
	}
	
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkAddNew(String username, String password) {
		Map<String, String> map = new HashMap<String, String>();
		String rand = getRandom(89999,10000);
		map.put("name", "Richard Chen");
		map.put("phone", "123456");
		map.put("name2", "test" + rand);
		ContactProcessAction.getAddNew(map);
		String url = "jdbc:sqlserver://EHISSQL:1433";
		String sql = "SELECT MerchantID FROM CRM.dbo.NESO_CRM_Contact WITH(NOLOCK) WHERE MerchantID = 100429 and customername = '" + map.get("name2") + "' and Status = 'O'";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		assert list.size() > 0 : "";
	}
	
	// search 
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkSearch(String username, String password) {
		printLogger(ContactProcessCase.class,"search");
		String url = "jdbc:sqlserver://EHISSQL:1433";
		String sql = "SELECT CustomerName FROM CRM.dbo.NESO_CRM_Contact WITH(NOLOCK) WHERE MerchantID = 100429 and customername like 'test%' and Status = 'O'";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		assert list.size() > 0 : "db don't have information";
		Map<String, String> map = new HashMap<String, String>();
		map.put("merchantName", "Richard Chen");
		map.put("merchantID", "100429");
		map.put("customerName", list.get(0).get("CustomerName"));
		map.put("rewardType", "5");
		map.put("customerStatus", "3");
		map.put("opt", "2");
		map.put("acct", "2");
		Map<String, String> result = ContactProcessAction.getSearch(map);
		assert result.get("merchantID").equals("100429") : "";
	}
	
	// edit
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkEdit(String username, String password) {
		printLogger(ContactProcessCase.class,"edit");
		String rand = getRandom(89999,10000);
		Map<String, String> map = new HashMap<String, String>();
		map.put("customerName", "test" + rand);
		map.put("workPhone", rand);
		Map<String, String> result = ContactProcessAction.getEdit(map);
		String url = "jdbc:sqlserver://EHISSQL:1433";
		String sql = "SELECT CustomerName,WorkPhone FROM CRM.dbo.NESO_CRM_Contact WITH(NOLOCK) WHERE MerchantID = 100429 and TransactionNumber = " + result.get("id");
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 2);
		assert list.get(0).get("CustomerName").equals(map.get("customerName")) : "customer name edit error";
		assert list.get(0).get("WorkPhone").equals(map.get("workPhone"))  : "work phone edit error";
	}
	
	// link to current
	@Test
	public void checkLinkToCurrent() {
		printLogger(ContactProcessCase.class,"linkToCurrent");
		Map<String, String> result = ContactProcessAction.getLinkToCurrent();
		assert result.get("id").equals("100429") : "";
	}
	
	// contact note
	@Test
	public void checkContactNote() {
		printLogger(ContactProcessCase.class,"contactNote");
		String rand = getRandom(89999,10000);
		Map<String, String> map = new HashMap<String, String>();
		map.put("customerName", "note" + rand);
		ContactProcessAction.getContactNote(map);
	}
	
	// delete
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkDelete(String username, String password) {
		printLogger(ContactProcessCase.class,"delete");
		Map<String, String> map = new HashMap<String, String>();
		String url = "jdbc:sqlserver://EHISSQL:1433";
		String sql = "SELECT TransactionNumber FROM CRM.dbo.NESO_CRM_Contact WITH(NOLOCK) WHERE MerchantID = 100429 and customername like 'test%' and Status = 'O'";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		for(int i = 0; i < list.size(); i++) {
			map.put("id", list.get(i).get("TransactionNumber"));
			ContactProcessAction.getDelete(map);
		}
		w(20);
		List<Map<String,String>> result = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		assert result.size() < 1 : "";
	}
	
	
}
