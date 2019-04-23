package com.neso.testcase;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sqlconnect.SqlFactory;
import com.neso.action.CtiCallDashboardAction;
import com.neso.factory.CommonUtil;

public class CtiCallDashboardCase extends CommonUtil{
	
	// data load
	@Test
	public void checkRecentButtonChecked(){
		printLogger(CtiCallDashboardCase.class,"dataLoad");
		Map<String,String> result = CtiCallDashboardAction.getRecentButtonChecked();
		assert result.get("week").equals("false") : "CTI Call Dashboard : Recent week button check failed";
		assert result.get("month").equals("false") : "CTI Call Dashboard : Recent month button check failed";
		assert result.get("year").equals("false") : "CTI Call Dashboard : Recent year button check failed";
	}
	
	@Test
	@Parameters({"browser","environment","url"})
	public void checkAgentLoad(String browser,String environment,String url){
		Map<String,String> result = CtiCallDashboardAction.getAgentLoad();
		int sum = Integer.valueOf(result.get("worked1")) + Integer.valueOf(result.get("worked2")) + Integer.valueOf(result.get("worked3"));
		assert result.get("agent").equals(String.valueOf(sum)) : "CTI Call Dashboard : Agent is different from the sum of worked months number!";
	}
	
	@Test
	public void checkTotalCallsLoad(){
		Map<String,String> result = CtiCallDashboardAction.getTotalCallsLoad();
		int sumType = Integer.valueOf(result.get("type1")) + Integer.valueOf(result.get("type2")) + Integer.valueOf(result.get("type3"));
		int sumDuration = Integer.valueOf(result.get("duration1")) + Integer.valueOf(result.get("duration2")) + Integer.valueOf(result.get("duration3"));
		assert result.get("total").equals(String.valueOf(sumType)) : "CTI Call Dashboard : Total calls is different from the sum of type number!";
		assert result.get("total").equals(String.valueOf(sumDuration)) : "CTI Call Dashboard : Total calls is different from the sum of call duration number!";
	}
	
	// detail filter
	@Test
	public void checkDetailFilter(){
		printLogger(CtiCallDashboardCase.class,"detailFilter");
		Map<String,String> result = CtiCallDashboardAction.getDetailFilter();
		assert result.get("extension1").equals(result.get("extension2")) : "CTI Call Dashboard : Search with detail filter failed";
	}
	
	@Test
	public void checkClearFilter(){
		Map<String,String> result = CtiCallDashboardAction.getClearFilter();
		assert !result.get("extension").equals("") : "CTI Call Dashboard : Search with clear detail filter failed";
	}
	
	// condition report
	@Test
	public void checkRecentReport(){
		printLogger(CtiCallDashboardCase.class,"conditionReport");
		Map<String,String> result = CtiCallDashboardAction.getRecentReport();
		assert result.get("totalCalls1").equals(result.get("totalCalls2")) : "CTI Call Dashboard : Recent 1 week check failed";
	}
	
	@Test
	public void checkTypeReport(){
		Map<String,String> result = CtiCallDashboardAction.getTypeReport();
		assert Integer.parseInt(result.get("totalCalls1")) > Integer.parseInt(result.get("totalCalls2")) : "CTI Call Dashboard : Condition type with customer check failed";
	}
	
	@Test
	public void checkWorkedMonthsReport(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("number1","2");
		map.put("number2","5");
		Map<String,String> result = CtiCallDashboardAction.getWorkedMonthsReport(map);
		assert Integer.parseInt(result.get("totalCalls1")) > Integer.parseInt(result.get("totalCalls2")) : "CTI Call Dashboard : Condition worked months with 1~3 check failed";
		assert Integer.parseInt(result.get("totalCalls3")) > Integer.parseInt(result.get("totalCalls2")) : "CTI Call Dashboard : Condition worked months with other input check failed";
	}
	
	@Test
	public void checkCallDurationReport(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("number1","200");
		map.put("number2","400");
		Map<String,String> result = CtiCallDashboardAction.getCallDurationReport(map);
		assert Integer.parseInt(result.get("totalCalls1")) > Integer.parseInt(result.get("totalCalls2")) : "CTI Call Dashboard : Condition call duration with 1~240 check failed";
		assert Integer.parseInt(result.get("totalCalls3")) > Integer.parseInt(result.get("totalCalls2")) : "CTI Call Dashboard : Condition call duration with other input check failed";
	}
	
	
	// agent report
	@Test
	public void checkAgentReport(){
		printLogger(CtiCallDashboardCase.class,"agentReport");
		Map<String,String> result = CtiCallDashboardAction.getAgentReport();
		assert Integer.parseInt(result.get("totalCalls1")) < Integer.parseInt(result.get("totalCalls2")) : "CTI Call Dashboard : Switch agent check failed";
		assert Integer.parseInt(result.get("totalCalls2")) < Integer.parseInt(result.get("totalCalls3")) : "CTI Call Dashboard : Switch agent check failed";
	}
	
	// search
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkPhoneNumberSearch(String username,String password){
		printLogger(CtiCallDashboardCase.class,"search");
		Map<String,String> map = new HashMap<String,String>();
		String url = "jdbc:sqlserver://EHISSQL:1433";
		String sql = "SELECT TOP 5 IncomingCallNumber FROM CTI.dbo.CTICalling WITH(NOLOCK) where CustomerID != '0' order by IncomingDate DESC";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		map.put("phoneNumber", list.get(4).get("IncomingCallNumber"));
		Map<String,String> result = CtiCallDashboardAction.getPhoneNumberSearch(map);
		assert Integer.parseInt(result.get("totalCalls")) > 0 : "CTI Call Dashboard : Search with phone number failed";
	}
		
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkCustomerIDSearch(String username,String password){
		Map<String,String> map = new HashMap<String,String>();
		String url = "jdbc:sqlserver://EHISSQL:1433";
		String sql = "SELECT TOP 5 CustomerID FROM CTI.dbo.CTICalling WITH(NOLOCK) where CustomerID != '0' order by IncomingDate DESC";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		map.put("customerID", list.get(4).get("CustomerID"));
		Map<String,String> result = CtiCallDashboardAction.getCustomerIDSearch(map);
		assert Integer.parseInt(result.get("totalCalls")) > 0 : "CTI Call Dashboard : Search with phone number failed";
	}
		
	@Test
	public void checkResetSearch(){
		Map<String,String> result = CtiCallDashboardAction.getResetSearch();
		assert Integer.parseInt(result.get("totalCalls")) == 0 : "CTI Call Dashboard : Search with reset failed";
	}
		
	@Test
	public void checkTimeSearch(){
		Map<String,String> map = new HashMap<String,String>();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
	    c.add(Calendar.MONTH, -1);
	    map.put("startTime", sdf.format(c.getTime()));
	    map.put("endTime", sdf.format(new Date()));
		Map<String,String> result = CtiCallDashboardAction.getTimeSearch(map);
		assert Integer.parseInt(result.get("totalCalls")) > 0 : "CTI Call Dashboard : Search with time failed";
	}
	
	
	@AfterTest
	@Parameters({"url"})
	public void loadPage(String url){
		openWindow(url);
	}
}
