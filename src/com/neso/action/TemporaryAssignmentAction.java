package com.neso.action;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.neso.factory.CommonUtil;
import com.neso.pageobject.TemporaryAssignment;

public class TemporaryAssignmentAction extends CommonUtil{

	private WebDriver driver = super.getDriver();
	private static TemporaryAssignment ta = new TemporaryAssignment();
	
	
	// add merchant
	public static void getAddMerchant(Map<String,String> map){
		actionStartLogger(TemporaryAssignmentAction.class,"getAddMerchant",0);
		c(ta.getAddButton(),1);
		s(ta.getAdMerchantText(),map.get("merchant"),2);
		c(ta.getAdMerchantSearch(),1);
		w(10);
		s(ta.getAdAgentText(),map.get("agent"),1);
		w(6);
		ta.getAdAgentList_1().click();
		s(ta.getAdMemoText(),map.get("memo"),2);
		c(ta.getAdSaveButton(),2);
		w(6);
	}
	
	// add merchant rules
	public static Map<String,String> getMerchantAssigned(Map<String,String> map){
		actionStartLogger(TemporaryAssignmentAction.class,"getMerchantAssigned",0);
		Map<String,String> result = new HashMap<String,String>();
		c(ta.getAddButton(),1);
		s(ta.getAdMerchantText(),map.get("merchant"),2);
		c(ta.getAdMerchantSearch(),2);
		w(2);
		result.put("error", ta.getAdErrorMessage().getText());
		result.put("save", String.valueOf(ta.getAdSaveButton().isEnabled()));
		return result;
	}
	
	public static Map<String,String> getMerchantInfo(Map<String,String> map){
		actionStartLogger(TemporaryAssignmentAction.class,"getMerchantInfo",0);
		Map<String,String> result = new HashMap<String,String>();
		s(ta.getAdMerchantText(),map.get("merchant"),2);
		c(ta.getAdMerchantSearch(),2);
		w(5);
		s(ta.getAdAgentText(),map.get("agent"),1);
		w(6);
		ta.getAdAgentList_1().click();
		w(2);
		result.put("name", ta.getAdMerchantName().getText());
		result.put("save", String.valueOf(ta.getAdSaveButton().isEnabled()));
		c(ta.getAdCancelButton(),1);
		return result;
	}
	
	
	// Assignment Query Search
	public static Map<String,String> getSearchAll(){
		actionStartLogger(TemporaryAssignmentAction.class,"getSearchAll",0);
		Map<String,String> result = new HashMap<String,String>();
		c(ta.getQrSearchButton(),2);
		w(3);
		result.put("search", String.valueOf(ta.getQrChckeBox_2().isEnabled()));
		result.put("unassign", String.valueOf(ta.getQrUnassignButton().isEnabled()));
		return result;
	}
	
	public static Map<String,String> getSearchAgent(Map<String,String> map){
		actionStartLogger(TemporaryAssignmentAction.class,"getSearchAgent",0);
		Map<String,String> result = new HashMap<String,String>();
		s(ta.getQrAgentText(),map.get("agent"),2);
		w(4);
		c(ta.getKendoList(),1);
		c(ta.getQrSearchButton(),2);
		w(2);
		result.put("merchant", ta.getQrMerchant_1().getText());
		result.put("unassign", String.valueOf(ta.getQrUnassignButton().isEnabled()));
		return result;
	}
	
	public static Map<String,String> getClickColumn(){
		actionStartLogger(TemporaryAssignmentAction.class,"getClickColumn",0);
		Map<String,String> result = new HashMap<String,String>();
		c(ta.getQrCheckBoxAll(),2);
		result.put("unassign", String.valueOf(ta.getQrUnassignButton().isEnabled()));
		return result;
	}
	
	
	// Assignment Log Query
	public static Map<String, String> getLogLink() {
		actionStartLogger(TemporaryAssignmentAction.class,"getLogLink",0);
		Map<String,String> result = new HashMap<String,String>();
		c(ta.getQrLogQueryButton(),1);
		w(12);
		result.put("link", getNewWindowUrl());
		return result;
	}
	
	public static Map<String,String> getLogSearchAll(){
		actionStartLogger(TemporaryAssignmentAction.class,"getLogSearchAll",0);
		Map<String,String> result = new HashMap<String,String>();
		c(ta.getQrLogSearchButton(),2);
		w(3);
		result.put("merchantName", ta.getQrLogAssignmentName_5().getText());
		return result;
	}
	
	public static Map<String,String> getLogSearchAgent(Map<String,String> map){
		actionStartLogger(TemporaryAssignmentAction.class,"getLogSearchAgent",0);
		Map<String,String> result = new HashMap<String,String>();
		s(ta.getQrLogAgentText(),map.get("agent"),2);
		w(5);
		c(ta.getKendoList(),1);
		c(ta.getQrLogSearchButton(),2);
		w(2);
		result.put("merchant", ta.getQrLogAssignmentMerchant_1().getText());
		return result;
	}
	
	public static Map<String,String> getLogSearchMerchant(Map<String,String> map){
		actionStartLogger(TemporaryAssignmentAction.class,"getLogSearchMerchant",0);
		Map<String,String> result = new HashMap<String,String>();
		c(ta.getQrLogAgentClearButton(),1);
		s(ta.getQrLogMerchantText(),map.get("merchant"),2);
		c(ta.getQrLogSearchButton(),2);
		w(3);
		result.put("merchant", ta.getQrLogAssignmentMerchant_1().getText());
		return result;
	}
	
	public static Map<String,String> getLogMerchantAndAgent(Map<String,String> map){
		actionStartLogger(TemporaryAssignmentAction.class,"getLogMerchantAndAgent",0);
		Map<String,String> result = new HashMap<String,String>();
		s(ta.getQrLogMerchantText(),map.get("merchant"),2);
		s(ta.getQrLogAgentText(),map.get("agent"),1);
		w(5);
		c(ta.getKendoList(),1);
		c(ta.getQrLogSearchButton(),2);
		w(3);
		result.put("message", ta.getQrLogAssignmentMessage().getText());
		return result;
	}
	
	// cancel merchant
	public static void getCancelUnassign(Map<String,String> map){
		actionStartLogger(TemporaryAssignmentAction.class,"getCancelUnassign",0);
		s(ta.getQrAgentText(),map.get("agent"),2);
		w(4);
		c(ta.getKendoList(),1);
		c(ta.getQrSearchButton(),2);
		w(3);
		c(ta.getQrCheckBoxAll(),1);
		c(ta.getQrUnassignButton_1(),2);
		c(ta.getQrUnassignCancelButton(),2);
	}
	
	public static Map<String,String> getRunUnassign(){
		actionStartLogger(TemporaryAssignmentAction.class,"getRunUnassign",0);
		Map<String,String> result = new HashMap<String,String>();
		System.out.println(ta.getQrItemNumber().getText());
		if(ta.getQrItemNumber().getText().equals("1 - 1 of 1 count") || ta.getQrItemNumber().getText().equals("2 - 2 of 2 count")){
			c(ta.getQrCheckBoxAll(),1);
			c(ta.getQrUnassignButton(),2);
			c(ta.getQrUnassignOkButton(),2);
			w(10);
			result.put("result", "true");
		}
		else{
			result.put("result", "false");
		}
		return result;	
	}
	
	public static Map<String,String> getCheckAssignment(){
		actionStartLogger(TemporaryAssignmentAction.class,"getCheckAssignment",0);
		Map<String,String> result = new HashMap<String,String>();
		c(ta.getQrSearchButton(),2);
		w(1);
		result.put("text", ta.getQrItemNumber().getText());
		return result;
	}
}
