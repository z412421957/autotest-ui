package com.neso.testcase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.neso.action.NETTermApplicationAction;
import com.neso.factory.CommonUtil;
import com.sqlconnect.SqlFactory;

public class NETTermApplicationCase extends CommonUtil{

	// data load
	@Test
	public void checkDataLoad(){
		printLogger(NETTermApplicationCase.class,"dataLoad");
		Map<String, String> result = NETTermApplicationAction.getDataLoad();
		assert result.get("application").equals("Application#:") : "";
	}
	
	@Test
	public void checkTextLoad(){
		Map<String, String> result = NETTermApplicationAction.getTextLoad();
		assert result.get("application").equals("true") : "";
		assert result.get("merchant").equals("true") : "";
	}
	
	@Test
	public void checkButtonLoad(){
		Map<String, String> result = NETTermApplicationAction.getButtonLoad();
		assert result.get("new").equals("true") : "";
		assert result.get("submit").equals("true") : "";
		assert result.get("approve").equals("false") : "";
		assert result.get("decline").equals("false") : "";
	}
	
	// add new
	@Test
	public void checkAddNewRules(){
		printLogger(NETTermApplicationCase.class,"addNew");
		Map<String, String> map = new HashMap<String, String>();
		map.put("merchant", "1087928");
		Map<String, String> result = NETTermApplicationAction.getAddNewRules(map);
		assert result.get("contact").equals("true") : "";
		assert result.get("mail").equals("true") : "";
		assert result.get("limitAmount").equals("true") : "";
	}
	
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkAddNew(String username, String password){
		Map<String, String> map = new HashMap<String, String>();
		String rand = getRandom(10,10000);
		map.put("limitAmount", "1");
		map.put("bankName", "autotest bank " + rand);
		map.put("bankAddress", "autotest bank " + rand);
		map.put("contactName", "autotest contact " + rand);
		map.put("contactPhone", "123-321-1234");
		map.put("city", "autotest city " + rand);
		map.put("zipCode", "98001");
		map.put("state", "WASHINGTON");
		map.put("accountType", "autotest type " + rand);
		map.put("bankAccount", "autotest " + rand);
		map.put("companyName", "autotest company " + rand);
		map.put("emailAddress", "autotest@email.garre");
		map.put("bContactName", "autotest contact " + rand);
		map.put("bContactPhone", "123-321-1234");
		NETTermApplicationAction.getAddNew(map);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT top 10 TransactionNumber FROM Newegg.dbo.NESO_B2BNettermApplication WITH(NOLOCK) WHERE MerchantID = 1087928 and Status = 'P'";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		int i = 0;
		while(list.size() < 1 && i < 15){
			w(15);
			list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
			i ++;
		}
		assert list.size() > 0 : "";
	}
	
	// edit
	@Test
	@Parameters({"url","sqlUsername","sqlPassword"})
	public void checkEdit(String u, String username, String password){
		printLogger(NETTermApplicationCase.class,"edit");
		openWindow(u);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT top 10 TransactionNumber FROM Newegg.dbo.NESO_B2BNettermApplication WITH(NOLOCK) WHERE MerchantID = 1087928 and Status = 'P'";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		assert list.size() > 0 : "";
		Map<String, String> map = new HashMap<String, String>();
		String rand = getRandom(10,10000);
		map.put("application", list.get(0).get("TransactionNumber"));
		map.put("bankName", "editbank " + rand);
		map.put("companyName", "editcompany " + rand);
		NETTermApplicationAction.getEdit(map);
		sql = "SELECT top 10 BankName,ReCompanyName1 FROM Newegg.dbo.NESO_B2BNettermApplication WITH(NOLOCK) WHERE MerchantID = 1087928 and TransactionNumber = " + map.get("application");
		list = SqlFactory.getSqlOfListMap(url, username, password, sql, 2);
		while(!inforRepeat(list.get(0).get("BankName"), map.get("bankName"), 15,15)){
			list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		}
		assert list.get(0).get("BankName").equals(map.get("bankName")) : "";
		assert list.get(0).get("ReCompanyName1").equals(map.get("companyName")) : "";
	}
	
	// approve
	@Test
	@Parameters({"url","sqlUsername","sqlPassword"})
	public void checkApprove(String u, String username, String password){
		printLogger(NETTermApplicationCase.class,"approve");
		openWindow(u);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT top 10 TransactionNumber FROM Newegg.dbo.NESO_B2BNettermApplication WITH(NOLOCK) WHERE MerchantID = 1087928 and Status = 'P'";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		assert list.size() > 0 : "";
		Map<String, String> map = new HashMap<String, String>();
		map.put("application", list.get(0).get("TransactionNumber"));
		map.put("memo", "automatic test for PRD， please ignore this request");
		NETTermApplicationAction.getApprove(map);
//		sql = "SELECT top 10 Status FROM Newegg.dbo.NESO_B2BNettermApplication WITH(NOLOCK) WHERE MerchantID = 1087928 and TransactionNumber = " + map.get("application");
//		list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
//		while(!inforRepeat(list.get(0).get("Status"),"A",10,10)){
//			list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
//		}
//		assert list.get(0).get("Status").equals("A") : "";
	}
	
	// copy new
	@Test
	@Parameters({"url","sqlUsername","sqlPassword"})
	public void checkCopyNew(String u, String username, String password){
		printLogger(NETTermApplicationCase.class,"copyNew");
		openWindow(u);
		Map<String, String> map = new HashMap<String, String>();
		map.put("application", "938");
		NETTermApplicationAction.getCopyNew(map);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT top 10 Status FROM Newegg.dbo.NESO_B2BNettermApplication WITH(NOLOCK) WHERE MerchantID = 1087928 and Status = 'P'";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		int i = 0;
		while(list.size() < 2 && i < 10){
			w(15);
			list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
			i ++;
		}
		assert list.size() > 1 : "";
	}
	
	// decline
	@Test
	@Parameters({"url","sqlUsername","sqlPassword"})
	public void checkDecline(String u, String username, String password){
		printLogger(NETTermApplicationCase.class,"decline");
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT top 10 TransactionNumber FROM Newegg.dbo.NESO_B2BNettermApplication WITH(NOLOCK) WHERE MerchantID = 1087928 and Status = 'P'";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		Map<String, String> map = new HashMap<String, String>();
		map.put("memo", "automatic test for PRD， please ignore this request");
		// 这里应该是 i < list.size() - 1,由于bug没修复，目前就都decline了
		for (int i = 0;i < list.size(); i++)
		{
			openWindow(u);
			map.put("application", list.get(i).get("TransactionNumber"));
			NETTermApplicationAction.getDecline(map);
		}
		sql = "SELECT top 10 Status FROM Newegg.dbo.NESO_B2BNettermApplication WITH(NOLOCK) WHERE MerchantID = 1087928 and TransactionNumber = " + map.get("application");
		list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		while(!inforRepeat(list.get(0).get("Status"),"D",10,10)) {
			list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		}
		assert list.get(0).get("Status").equals("D") : "";
	}
	
	// query data load
	@Test
	@Parameters({"url2"})
	public void checkQueryDataLoad(String u){
		printLogger(NETTermApplicationCase.class,"queryDataLoad");
		openWindow(u);
		Map<String, String> result = NETTermApplicationAction.getQueryDataLoad();
		assert result.get("merchant").equals("true") : "";
		assert result.get("status").trim().equals("Pending") : "";
		assert result.get("dateButton").equals("false") : "";
		assert result.get("search").equals("true") : "";
	}
	
	// query search
	@Test
	public void checkQuerySearch(){
		printLogger(NETTermApplicationCase.class,"querySearch");
		Map<String, String> map = new HashMap<String, String>();
		map.put("merchant", "1087928");
		map.put("status", "Approved");
		Map<String, String> result = NETTermApplicationAction.getQuerySearch(map);
		assert result.get("status").trim().equals("Pending") : "";
		assert result.get("content").trim().equals("No records available.") : "";
	}
	
	// query decline
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkQueryDecline(String username, String password){
		printLogger(NETTermApplicationCase.class,"queryDecline");
		Map<String, String> map = new HashMap<String, String>();
		map.put("merchant", "1087928");
		NETTermApplicationAction.getQueryDecline(map);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT top 10 TransactionNumber FROM Newegg.dbo.NESO_B2BNettermApplication WITH(NOLOCK) WHERE MerchantID = 1087928 and Status = 'P'";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		int i = 0;
		while(list.size() > 0 && i < 10) {
			w(30);
			list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		}
		assert list.size() == 0 : "";
	}
	
}
