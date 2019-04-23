package com.neso.testcase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.neso.action.CallPlanProcessAction;
import com.neso.action.MerchantQueryAction;
import com.neso.factory.CommonUtil;
import com.sqlconnect.SqlFactory;

public class CallPlanProcessCase extends CommonUtil{
	
	// load
	@Test
	public void checkPageLoad() {
		printLogger(CallPlanProcessCase.class,"load");
		Map<String, String> result = CallPlanProcessAction.getPageLoad();
		assert result.get("id").equals("true") : "";
		assert result.get("planStatus").equals("All") : "";
		assert result.get("name").equals("true") : "";
		assert result.get("createBox").equals("true") : "";
		assert result.get("merchant").equals("true") : "";
		assert result.get("createBy").equals("true") : "";
		assert result.get("planBox").equals("true") : "";
		assert result.get("reset").equals("true") : "";
		assert result.get("search").equals("true") : "";
		assert result.get("searchResult").equals("No records available.") : "";
		assert result.get("merchantList").equals("No records available.") : "";
		assert result.get("callHistory").equals("true") : "";
		assert result.get("customerFlag").equals("true") : "";
		assert result.get("pen").equals("true") : "";
		assert result.get("merchantQuery").equals("true") : "";
	}
	
	// search
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkSearchDefault(String username,String password) {
		printLogger(CallPlanProcessCase.class,"search");
		String url = "jdbc:sqlserver://EHISSQL:1433";
		String sql = "SELECT PlanName FROM CRM.dbo.NESO_CRM_CallPlan WITH(NOLOCK) WHERE STATUS <> 'D' order by Priority ASC,Status DESC";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		Map<String, String> result = CallPlanProcessAction.getSearchDefault();
		assert result.get("name").equals(list.get(0).get("PlanName")) : "";
	}
	
	@Test
	public void checkSearchPlanID() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", "garre test");
		map.put("id2", "99999");
		map.put("id3", "1");
		Map<String, String> result = CallPlanProcessAction.getSearchPlanID(map);
		assert result.get("error").equals("Input is not in a correct format.") : "";
		assert result.get("result").equals("No records available.") : "";
		assert result.get("name").equals("Reggie 1") : "";
	}
	
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkSearchPlanStatus(String username,String password) {
		Map<String, String> result = CallPlanProcessAction.getSearchPlanStatus();
		String url = "jdbc:sqlserver://EHISSQL:1433";
		String sql = "SELECT PlanName FROM CRM.dbo.NESO_CRM_CallPlan WITH(NOLOCK) WHERE STATUS <> 'D' AND Status = 'E'";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		assert result.get("status").equals("Expired") : "";
		assert result.get("name").equals(list.get(0).get("PlanName")) : "";
	}
	
	@Test
	public void checkSearchMerchantID() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("merchant", "99999999");
		map.put("merchant2", "100429");
		Map<String, String> result = CallPlanProcessAction.getSearchMerchantID(map);
		assert result.get("content").equals("No records available.") : "content";
		assert result.get("merchant").equals(map.get("merchant2")) : "merchant";
	}
	
	@Test
	public void checkCallStatus() {
		Map<String, String> result = CallPlanProcessAction.getCallStatus();
		assert !result.get("name").equals("") : "";
	}
	
	@Test
	public void checkCreateBy() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("createBy", "yy69");
		Map<String, String> result = CallPlanProcessAction.getCreateBy(map);
		assert result.get("name").equals("PRD Testing") : "";
	}
	
	@Test
	public void checkDate() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("createStart", "05302018");
		map.put("createEnd", "06012018");
		map.put("planStart", "05242018");
		map.put("planEnd", "06212018");
		Map<String, String> result = CallPlanProcessAction.getDate(map);
		assert result.get("name").equals("PRD Testing") : ""; 
	}
	
	@Test
	public void checkAssignTo() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("assign", "AC5C");
		Map<String, String> result = new CallPlanProcessAction().getAssignTo(map);
		assert result.get("assign").equals("ALAN.K.CHAN") : "";
	}
	
	// add plan
	@Test
	public void checkAddPlanRules() {
		printLogger(CallPlanProcessCase.class,"addPlan");
		Map<String, String> result = CallPlanProcessAction.getAddPlanRules();
		assert result.get("name").equals("Plan name is required.") : "";
		assert result.get("priority").equals("Priority must be select.") : "";
	}
	
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkAddPlan(String username,String password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "garre auto test");
		map.put("priority", "3");
		CallPlanProcessAction.getAddPlan(map);
		String url = "jdbc:sqlserver://EHISSQL:1433";
		String sql = "SELECT PlanName FROM CRM.dbo.NESO_CRM_CallPlan WITH(NOLOCK) WHERE STATUS = 'O' and InUser = 'km11'";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		int i = 0;
		while(list.size() < 1 && i < 15) {
			w(30);
			i++;
			list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		}
		assert list.size() > 0 : "";
	}
	
	// edit
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkEditPlanRules(String username,String password) {
		printLogger(CallPlanProcessCase.class,"editPlan");
		Map<String, String> map = new HashMap<String, String>();
		String url = "jdbc:sqlserver://EHISSQL:1433";
		String sql = "SELECT TransactionNumber FROM CRM.dbo.NESO_CRM_CallPlan WITH(NOLOCK) WHERE STATUS = 'O' and InUser = 'km11'";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		assert list.size() > 0 : "";
		map.put("id", list.get(0).get("TransactionNumber"));
		map.put("name", "test");
		map.put("priority", "1");
		CallPlanProcessAction.getEditPlanRules(map);
	}
	
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkEditPlan(String username,String password) {
		Map<String, String> map = new HashMap<String, String>();
		String rand = getRandom(9999,1000);
		map.put("name", "garre test edit" + rand);
		map.put("priority", "2");
		CallPlanProcessAction.getEditPlan(map);
		String url = "jdbc:sqlserver://EHISSQL:1433";
		String sql = "SELECT top 10 PlanName,Priority FROM CRM.dbo.NESO_CRM_CallPlan WITH(NOLOCK) WHERE STATUS = 'O' and InUser = 'km11' order by InDate DESC";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 2);
		while(!inforRepeat(list.get(0).get("PlanName"),map.get("name"),30,15)) {
			list = SqlFactory.getSqlOfListMap(url, username, password, sql, 2);
		}
		assert list.get(0).get("PlanName").equals(map.get("name")) : "";
		assert list.get(0).get("Priority").equals("1") : "";
	}
	
	// add call plan
	@Test
	public void checkAddCallPlan() {
		printLogger(CallPlanProcessCase.class,"addCallPlan");
		CallPlanProcessAction.getClickLinkToPage();
		Map<String, String> map = new HashMap<String, String>();
		map.put("searched", "100429");
		map.put("searchedType", "2");
		map.put("ownership", "1");
		map.put("assign", "AC5C");
		new MerchantQueryAction().getAddCallPlan(map);
	}
	
	//match merchant
	@Test
	public void checkMatchMerchantRules() {
		printLogger(CallPlanProcessCase.class,"matchMerchant");
		Map<String, String> map = new HashMap<String, String>();
		map.put("assign", "AC5C");
		Map<String, String> result = new CallPlanProcessAction().getMatchMerchantRules(map);
		assert result.get("error").equals("Assign to agent must be select.") : "";
		assert result.get("error2").equals("All of the matched merchant assign is 'AC5C'.") : "";
	}
	
	@Test
	public void checkMatchMerchant() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("assign", "KM11");
		Map<String, String> result = new CallPlanProcessAction().getMatchMerchant(map);
		assert result.get("assign").equals("Ken.L.Ma") : "";
		assert result.get("update").contains("disabled") : "";
		assert result.get("assignButton").contains("disabled") : "";
		assert result.get("delete").contains("disabled") : "";
	}
	
	// delete merchant
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkDeleteMerchant(String username,String password) {
		printLogger(CallPlanProcessCase.class,"deleteMerchant");
		Map<String, String> result = CallPlanProcessAction.getDeleteMerchant();
		String url = "jdbc:sqlserver://EHISSQL:1433";
		String sql = "select TransactionNumber from CRM.dbo.NESO_CRM_CallPlanMerchants where InUser = 'km11' and CallStatus = 'O'";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		assert list.size() < 1 : "";
		sql = "UPDATE TOP (1) CRM.dbo.NESO_CRM_CallPlanMerchants SET CallStatus = 'O' WHERE CallPlanID = " + result.get("id");
		list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
	}
	
	// update merchant status
	@Test
	public void checkUpdateMerchantStatus() {
		printLogger(CallPlanProcessCase.class,"updateMerchantStatus");
		Map<String, String> result = CallPlanProcessAction.getUpdateMerchantStatus();
		assert result.get("status").equals(result.get("status2")) : "";
	}
	
	// add note
	@Test
	public void checkAddNote() {
		printLogger(CallPlanProcessCase.class,"addNote");
		Map<String, String> result = CallPlanProcessAction.getAddNote();
		assert result.get("save").equals("false") : "";
	}
	
	// add contact
	@Test
	public void checkAddContact() {
		printLogger(CallPlanProcessCase.class,"addContact");
		Map<String, String> result = CallPlanProcessAction.getAddContact();
		assert result.get("box").equals("true") : "";
		assert !result.get("id").equals("") : "";
		assert !result.get("name").equals("") : "";
		assert result.get("save").equals("false") : "";
		assert result.get("save2").equals("false") : "";
	}
	
	// add opportunity
	@Test
	public void checkAddOpportunity() {
		printLogger(CallPlanProcessCase.class,"addOpportunity");
		Map<String, String> result = CallPlanProcessAction.getAddOpportunity();
		assert result.get("box").equals("true") : "";
		assert !result.get("id").equals("") : "";
		assert !result.get("name").equals("") : "";
		assert result.get("save").equals("false") : "";
		assert result.get("save2").equals("false") : "";
	}
	
	// delete call plan
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkDeleteCallPlan(String username,String password) {
		printLogger(CallPlanProcessCase.class,"deleteCallPlan");
		Map<String, String> result = CallPlanProcessAction.getDeleteCallPlan1();
		assert result.get("error").equals("All of you selected matched merchant can not be deleted.") : "";
		String url = "jdbc:sqlserver://EHISSQL:1433";
		String sql = "UPDATE TOP (3) CRM.dbo.NESO_CRM_CallPlanMerchants SET CallStatus = 'D' WHERE InUser = 'km11' and CallStatus <> 'D'";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		CallPlanProcessAction.getDeleteCallPlan2();
	}

}
