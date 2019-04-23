package com.neso.action;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.neso.factory.CommonUtil;
import com.neso.pageobject.CallHistory;

public class CallHistoryAction extends CommonUtil{
	private WebDriver driver = super.getDriver();
	private Actions action = new Actions(driver);
	private static CallHistory ch = new CallHistory();
	
	// data load
	public static Map<String, String> getDataLoad(){
		actionStartLogger(CallHistoryAction.class,"getDataLoad",0);
		Map<String,String> result = new HashMap<String,String>();
		result.put("marchant", String.valueOf(ch.getMerchantNumberText().isEnabled()));
		result.put("customer", String.valueOf(ch.getCustomerNumberText().isEnabled()));
		result.put("phone", String.valueOf(ch.getPhoneNumberText().isEnabled()));
		result.put("agentId", String.valueOf(ch.getAgentIDText().isEnabled()));
		result.put("agentExtension", String.valueOf(ch.getAgentExtensionText().isEnabled()));
		result.put("reminderButton", String.valueOf(ch.getReminderButton().getAttribute("class")));
		return result;
	}
	
	// search rules
	public static Map<String, String> getDefaultSearch(){
		actionStartLogger(CallHistoryAction.class,"getDefaultSearch",0);
		Map<String,String> result = new HashMap<String,String>();
		c(ch.getSearchButton(),2);
		result.put("editButton", String.valueOf(ch.getEditButton_1().isEnabled()));
		return result;
	}
	
	public static Map<String, String> getInputType(Map<String,String> map){
		actionStartLogger(CallHistoryAction.class,"getInputType",0);
		Map<String,String> result = new HashMap<String,String>();
		s(ch.getMerchantNumberText(),map.get("merchant"),1);
		result.put("merchant", ch.getMerchantNumberText().getAttribute("class"));
		s(ch.getCustomerNumberText(),map.get("customer"),1);
		result.put("customer", ch.getCustomerNumberText().getAttribute("class"));
		result.put("search", String.valueOf(ch.getSearchButton().isEnabled()));
		elementClear(ch.getMerchantNumberText());
		elementClear(ch.getCustomerNumberText());
		return result;
	}
	
	public static Map<String, String> getInputLength(Map<String,String> map){
		actionStartLogger(CallHistoryAction.class,"getInputLength",0);
		Map<String,String> result = new HashMap<String,String>();
		s(ch.getAgentIDText(),map.get("agentID"),2);
		s(ch.getAgentExtensionText(),map.get("agentExtension"),1);
		s(ch.getPhoneNumberText(),map.get("phone"),1);
		result.put("agentID", ch.getAgentIDText().getAttribute("value"));
		result.put("agentExtension", ch.getAgentExtensionText().getAttribute("value"));
		result.put("phone", ch.getPhoneNumberText().getAttribute("value"));
		elementClear(ch.getAgentIDText());
		elementClear(ch.getAgentExtensionText());
		elementClear(ch.getPhoneNumberText());
		return result;
	}
	
	public static Map<String, String> getInputLength2(Map<String,String> map){
		actionStartLogger(CallHistoryAction.class,"getInputLength2",0);
		Map<String,String> result = new HashMap<String,String>();
		s(ch.getMerchantNumberText(),map.get("merchant"),2);
		s(ch.getCustomerNumberText(),map.get("customer"),1);
		result.put("merchant", ch.getMerchantNumberText().getAttribute("class"));
		result.put("customer", ch.getCustomerNumberText().getAttribute("class"));
		result.put("search", String.valueOf(ch.getSearchButton().isEnabled()));
		elementClear(ch.getMerchantNumberText());
		elementClear(ch.getCustomerNumberText());
		return result;
	}
	
	public static Map<String, String> getSearch(Map<String,String> map){
		actionStartLogger(CallHistoryAction.class,"getSearch",0);
		Map<String,String> result = new HashMap<String,String>();
		s(ch.getMerchantNumberText(),map.get("merchant"),2);
		s(ch.getCustomerNumberText(),map.get("customer"),1);
		s(ch.getPhoneNumberText(),map.get("phone"),1);
		s(ch.getAgentIDText(),map.get("agentID"),1);
		s(ch.getDateText_1(),map.get("time"),1);
		s(ch.getDateText_1(),map.get("time"),1);
		s(ch.getDateText_1(),map.get("time"),1);
		c(ch.getSearchButton(),1);
		w(10);
		result.put("merchant",ch.getMerchantID_1().getText());
		return result;
	}
	
	public static Map<String, String> getLoadFollowUp(){
		actionStartLogger(CallHistoryAction.class,"getLoadFollowUp",0);
		Map<String,String> result = new HashMap<String,String>();
		ch.getSearchResultsDiv_1().click();
		w(5);
		result.put("follow", ch.getFollowUpType_1().getText());
		result.put("reminder", String.valueOf(ch.getReminderButton().isEnabled()));
		return result;
	}
	
	// edit 
	public static Map<String, String> getEditRules(Map<String,String> map){
		actionStartLogger(CallHistoryAction.class,"getEditRules",0);
		Map<String,String> result = new HashMap<String,String>();
		c(ch.getEditButton_1(),1);
		c(ch.getEditSaveButton(),2);
		result.put("error", ch.getErrorMessage().getText());
		s(ch.getEditCustomerNumberText(),map.get("customer"),1);
		s(ch.getEditMerchantNumberText(),map.get("merchant"),1);
		result.put("customer", ch.getMerchantNumberText().getAttribute("class"));
		result.put("merchant", ch.getCustomerNumberText().getAttribute("class"));
		c(ch.getEditCancelButton(),1);
		return result;
	}
	
	public static void getEdit(Map<String,String> map){
		actionStartLogger(CallHistoryAction.class,"getEdit",0);
		c(ch.getEditButton_1(),2);
		s(ch.getEditCustomerNumberText(),map.get("customer"),2);
		s(ch.getEditMerchantNumberText(),map.get("merchant"),1);
		c(ch.getEditSaveButton(),1);
		w(15);
	}
	
	// link to other page
	public static Map<String, String> getLinkOtherPage(){
		actionStartLogger(CallHistoryAction.class,"getLinkOtherPage",0);
		Map<String,String> result = new HashMap<String,String>();
		c(ch.getCustomer_1(),2);
		w(10);
		result.put("customerUrl", getNewWindowUrl());
		c(ch.getMerchantID_1(),2);
		w(20);
		result.put("merchantUrl", getNewWindowUrl());
		c(ch.getOrderMaintainButton(),2);
		w(5);
		result.put("orderMaintainUrl", getNewWindowUrl());
		c(ch.getOrderDetailButton(),2);
		w(20);
		result.put("orderDetailUrl", getNewWindowUrl());
		result.put("followID", ch.getFollowUpID_1().getText());
		c(ch.getFollowUpID_1(),2);
		w(2);
		result.put("followUpIDUrl", getNewWindowUrl());
		return result;
	}
	
}
