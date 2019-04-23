package com.neso.action;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.neso.factory.CommonUtil;
import com.neso.pageobject.CtiCallDashboard;

public class CtiCallDashboardAction extends CommonUtil{
	private WebDriver driver = super.getDriver();
	private Actions action = new Actions(driver);
	private static CtiCallDashboard cc = new CtiCallDashboard();
	
	// data load
	public static Map<String,String> getRecentButtonChecked(){
		actionStartLogger(CtiCallDashboardAction.class,"getRecentButtonChecked",0);
		Map<String,String> result = new HashMap<String,String>();
		result.put("week", String.valueOf(cc.getRecentWeekButton().isSelected()));
		result.put("month", String.valueOf(cc.getRecentMonthButton().isSelected()));
		result.put("year", String.valueOf(cc.getRecentYearButton().isSelected()));
		return result;
	}
	
	public static Map<String,String> getAgentLoad(){
		actionStartLogger(CtiCallDashboardAction.class,"getAgentLoad",0);
		Map<String,String> result = new HashMap<String,String>();
		result.put("agent", cc.getAgentNumber().getText());
		result.put("worked1", cc.getWorkedMonthsNumber_1().getText().replace("(", "").replace(")", ""));
		result.put("worked2", cc.getWorkedMonthsNumber_2().getText().replace("(", "").replace(")", ""));
		result.put("worked3", cc.getWorkedMonthsNumber_3().getText().replace("(", "").replace(")", ""));
		return result;
	}
	
	public static Map<String,String> getTotalCallsLoad(){
		actionStartLogger(CtiCallDashboardAction.class,"getTotalCallsLoad",0);
		Map<String,String> result = new HashMap<String,String>();
		result.put("total", cc.getTotalCallsNumber().getText());
		result.put("type1", cc.getTypeNumber_1().getText().replace("(", "").replace(")", ""));
		result.put("type2", cc.getTypeNumber_2().getText().replace("(", "").replace(")", ""));
		result.put("type3", cc.getTypeNumber_3().getText().replace("(", "").replace(")", ""));
		result.put("duration1", cc.getCallDurationNumber_1().getText().replace("(", "").replace(")", ""));
		result.put("duration2", cc.getCallDurationNumber_2().getText().replace("(", "").replace(")", ""));
		result.put("duration3", cc.getCallDurationNumber_3().getText().replace("(", "").replace(")", ""));
		return result;
	}
	
	// detail filter
	public static Map<String,String> getDetailFilter(){
		actionStartLogger(CtiCallDashboardAction.class,"getDetailFilter",0);
		Map<String,String> map = new HashMap<String,String>();
		Map<String,String> result = new HashMap<String,String>();
		c(cc.getDetailButton(),2);
		w(5);
		result.put("extension1", cc.getDetailInfoExtension_2().getText());
		map.put("name", cc.getDetailInfoName_2().getText());
		map.put("phone", cc.getDetailInfoPhone_2().getText());
		s(cc.getAgentExtensionText(),result.get("extension1"),2);
		s(cc.getAgentNameText(),map.get("name"),2);
		s(cc.getPhoneNumberText(),map.get("phone"),2);
		result.put("extension2", cc.getDetailInfoExtension_1().getText());
		return result;
	}
	
	public static Map<String,String> getClearFilter(){
		actionStartLogger(CtiCallDashboardAction.class,"getClearFilter",0);
		Map<String,String> result = new HashMap<String,String>();
		cc.getAgentExtensionText().clear();
		cc.getAgentNameText().clear();
		cc.getPhoneNumberText().clear();
		c(cc.getSearchButton(),1);
		c(cc.getDetailButton(),4);
		result.put("extension",cc.getDetailInfoExtension_2().getText());
		return result;
	}
	
	// condition report
	public static Map<String,String> getRecentReport(){
		actionStartLogger(CtiCallDashboardAction.class,"getRecentReport",0);
		Map<String,String> result = new HashMap<String,String>();
		c(cc.getReportButton(),1);
		result.put("totalCalls1", cc.getTotalCallsNumber().getText());
		c(cc.getRecentWeekButton(),2);
		result.put("totalCalls2", cc.getTotalCallsNumber().getText());
		return result;
	}
	
	public static Map<String,String> getTypeReport(){
		actionStartLogger(CtiCallDashboardAction.class,"getTypeReport",0);
		Map<String,String> result = new HashMap<String,String>();
		result.put("totalCalls1", cc.getTotalCallsNumber().getText());
		c(cc.getTypeButton_1(),2);
		result.put("totalCalls2", cc.getTotalCallsNumber().getText());
		return result;
	}
	
	public static Map<String,String> getWorkedMonthsReport(Map<String,String> map){
		actionStartLogger(CtiCallDashboardAction.class,"getWorkedMonthsReport",0);
		Map<String,String> result = new HashMap<String,String>();
		result.put("totalCalls1", cc.getTotalCallsNumber().getText());
		c(cc.getWorkedMonthsButton_2(),2);
		result.put("totalCalls2", cc.getTotalCallsNumber().getText());
		s(cc.getWorkedMonthsText_1(),map.get("number1"),2);
		s(cc.getWorkedMonthsText_2(),map.get("number2"),2);
		c(cc.getWorkedMonthsButton_4(),2);
		result.put("totalCalls3", cc.getTotalCallsNumber().getText());
		return result;
	}
	
	public static Map<String,String> getCallDurationReport(Map<String,String> map){
		actionStartLogger(CtiCallDashboardAction.class,"getCallDurationReport",0);
		Map<String,String> result = new HashMap<String,String>();
		result.put("totalCalls1", cc.getTotalCallsNumber().getText());
		c(cc.getCallDurationButton_2(),2);
		result.put("totalCalls2", cc.getTotalCallsNumber().getText());
		s(cc.getCallDurationText_1(),map.get("number1"),2);
		s(cc.getCallDurationText_2(),map.get("number2"),2);
		c(cc.getCallDurationButton_4(),2);
		result.put("totalCalls3", cc.getTotalCallsNumber().getText());
		return result;
	}
	
	// agent report
	public static Map<String,String> getAgentReport(){
		actionStartLogger(CtiCallDashboardAction.class,"getAgentReport",0);
		Map<String,String> result = new HashMap<String,String>();
		c(cc.getAgentButton(),2);
		c(cc.getAgentValueButton_1(),1);
		result.put("totalCalls1", cc.getTotalCallsNumber().getText());
		c(cc.getAgentValueButton_2(),1);
		result.put("totalCalls2", cc.getTotalCallsNumber().getText());
		c(cc.getAgentValueButton_3(),1);
		result.put("totalCalls3", cc.getTotalCallsNumber().getText());
		return result;
	}
	
	// search
	public static Map<String,String> getPhoneNumberSearch(Map<String,String> map){
		actionStartLogger(CtiCallDashboardAction.class,"getPhoneNumberSearch",0);
		Map<String,String> result = new HashMap<String,String>();
		s(cc.getSearchText(),map.get("phoneNumber"),2);
		c(cc.getSearchButton(),2);
		result.put("totalCalls", cc.getTotalCallsNumber().getText());
		return result;
	}
		
	public static Map<String,String> getCustomerIDSearch(Map<String,String> map){
		actionStartLogger(CtiCallDashboardAction.class,"getCustomerIDSearch",0);
		Map<String,String> result = new HashMap<String,String>();
		s(cc.getSearchText(),map.get("customerID"),2);
		c(cc.getSearchButton(),2);
		result.put("totalCalls", cc.getTotalCallsNumber().getText());
		return result;
	}
		
	public static Map<String,String> getResetSearch(){
		actionStartLogger(CtiCallDashboardAction.class,"getResetSearch",0);
		Map<String,String> result = new HashMap<String,String>();
		c(cc.getResetButton(),2);
		result.put("totalCalls", cc.getTotalCallsNumber().getText());
		return result;
	}
		
	public static Map<String,String> getTimeSearch(Map<String,String> map){
		actionStartLogger(CtiCallDashboardAction.class,"getTimeSearch",0);
		Map<String,String> result = new HashMap<String,String>();
		s(cc.getStartTimeText(),map.get("startTime"),2);
		s(cc.getEndTimeText(),map.get("endTime"),2);
		c(cc.getSearchButton(),2);
		result.put("totalCalls", cc.getTotalCallsNumber().getText());
		return result;
	}
}
