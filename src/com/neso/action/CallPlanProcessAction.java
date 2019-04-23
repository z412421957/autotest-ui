package com.neso.action;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.neso.factory.CommonUtil;
import com.neso.pageobject.CallPlanProcess;

public class CallPlanProcessAction extends CommonUtil{

	private WebDriver driver = super.getDriver();
	private Actions action = new Actions(driver);
	private static CallPlanProcess cp = new CallPlanProcess();
	
	// load
	public static Map<String, String> getPageLoad() {
		actionStartLogger(CallPlanProcessAction.class,"getPageLoad",0);
		Map<String, String> result = new HashMap<String, String>();
		w(3);
		result.put("id", String.valueOf(cp.getPlanIDText().isEnabled()));
		result.put("planStatus", cp.getPlanStatusValue().getText());
		result.put("name", String.valueOf(cp.getPlanNameText().isEnabled()));
		result.put("createBox", String.valueOf(cp.getCreateDateBox().isEnabled()));
		result.put("merchant", String.valueOf(cp.getMerchantIDText().isEnabled()));
		result.put("createBy", String.valueOf(cp.getCreateByText().isEnabled()));
		result.put("planBox", String.valueOf(cp.getPlanDateBox().isEnabled()));
		result.put("reset", String.valueOf(cp.getResetButton().isEnabled()));
		result.put("search", String.valueOf(cp.getSearchButton().isEnabled()));
		result.put("searchResult", cp.getSrContent().getText());
		result.put("merchantList", cp.getMmContent().getText());
		result.put("callHistory", String.valueOf(cp.getCallHistoryLogButton().isEnabled()));
		result.put("customerFlag", String.valueOf(cp.getCustomerFlagButton().isEnabled()));
		result.put("pen", String.valueOf(cp.getPenGlobeButton().isEnabled()));
		result.put("merchantQuery", String.valueOf(cp.getMerchantQueryButton().isEnabled()));
		return result;
	}
	
	// search
	public static Map<String, String> getSearchDefault() {
		actionStartLogger(CallPlanProcessAction.class,"getSearchDefault",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cp.getSearchButton(),1);
		w(10);
		result.put("name", cp.getSrPlanNameValue("[1]").getText());
		return result;
	}
	
	public static Map<String, String> getSearchPlanID(Map<String, String> map) {
		actionStartLogger(CallPlanProcessAction.class,"getSearchPlanID",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cp.getResetButton(), 1);
		s(cp.getPlanIDText(), map.get("id"), 1);
		result.put("error", cp.getPlanIDError().getText());
		s(cp.getPlanIDText(), map.get("id2"), 1);
		c(cp.getSearchButton(),1);
		w(2);
		result.put("result", cp.getSrContent().getText());
		s(cp.getPlanIDText(), map.get("id3"), 1);
		c(cp.getSearchButton(),1);
		result.put("name", cp.getSrPlanNameValue("").getText());
		return result;
	}
	
	public static Map<String, String> getSearchPlanStatus() {
		actionStartLogger(CallPlanProcessAction.class,"getSearchPlanStatus",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cp.getResetButton(), 1);
		c(cp.getPlanStatusButton(), 1);
		c(cp.getKendoList("3"), 1);
		result.put("status", cp.getPlanStatusValue().getText());
		c(cp.getSearchButton(), 1);
		result.put("name", cp.getSrPlanNameValue("[1]").getText());
		return result;
	}
	
	public static Map<String, String> getSearchMerchantID(Map<String, String> map) {
		actionStartLogger(CallPlanProcessAction.class,"getSearchMerchantID",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cp.getResetButton(), 1);
		s(cp.getMerchantIDText(), map.get("merchant"), 1);
		c(cp.getSearchButton(),1);
		w(5);
		result.put("content", cp.getSrContent().getText());
		s(cp.getMerchantIDText(),map.get("merchant2"),1);
		c(cp.getSearchButton(),1);
		w(5);
		result.put("merchant", cp.getMmMerchantID().getText());
		return result;
	}
	
	public static Map<String, String> getCallStatus() {
		actionStartLogger(CallPlanProcessAction.class,"getCallStatus",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cp.getResetButton(), 1);
		cp.getCallStatusButton().click();
		c(cp.getCallStatusValue("1"),1);
		c(cp.getCallStatusValue("3"),1);
		c(cp.getSearchButton(),1);
		w(3);
		result.put("name", cp.getSrPlanNameValue("[1]").getText());
		return result;
	}
	
	public static Map<String, String> getCreateBy(Map<String, String> map) {
		actionStartLogger(CallPlanProcessAction.class,"getCreateBy",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cp.getResetButton(), 1);
		s(cp.getCreateByText(), map.get("createBy"),1);
		c(cp.getSearchButton(),1);
		w(4);
		result.put("name", cp.getSrPlanNameValue("").getText());
		return result;
	}
	
	public static Map<String, String> getDate(Map<String, String> map) {
		actionStartLogger(CallPlanProcessAction.class,"getDate",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cp.getResetButton(), 1);
		c(cp.getCreateDateBox(),1);
		s(cp.getCreateDateStartText(), map.get("createStart"),1);
		s(cp.getCreateDateEndText(), map.get("createEnd"),1);
		c(cp.getPlanDateBox(),1);
		s(cp.getPlanDateStartText(), map.get("planStart"),1);
		s(cp.getPlanDateEndText(), map.get("planEnd"),1);
		c(cp.getSearchButton(),1);
		w(4);
		result.put("name", cp.getSrPlanNameValue("").getText());
		return result;
	}
	
	public Map<String, String> getAssignTo(Map<String, String> map) {
		actionStartLogger(CallPlanProcessAction.class,"getAssignTo",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cp.getResetButton(), 1);
		s(cp.getAssignToText(), map.get("assign"),1);
		w(2);
		action.sendKeys(Keys.ENTER).build().perform();
		c(cp.getSearchButton(),1);
		w(4);
		result.put("assign", cp.getMmAssignTo("[1]").getText());
		return result;
	}
	
	// add plan
	public static Map<String, String> getAddPlanRules() {
		actionStartLogger(CallPlanProcessAction.class,"getAddPlanRules",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cp.getResetButton(), 1);
		c(cp.getAddNewButton(),1);
		c(cp.getAnSaveButton(),1);
		result.put("name", cp.getAnPlanNameError().getText());
		result.put("priority", cp.getAnPriorityError().getText());
		c(cp.getAnCancelButton(),1);
		return result;
	}
	
	public static void getAddPlan(Map<String, String> map) {
		actionStartLogger(CallPlanProcessAction.class,"getAddPlan",0);
		c(cp.getAddNewButton(),1);
		s(cp.getAnPlanNameText(), map.get("name"),1);
		c(cp.getAnPriorityButton(),1);
		c(cp.getKendoList(map.get("priority")),1);
		c(cp.getAnSaveButton(),1);
		w(30);
	}
	
	//edit
	public static void getEditPlanRules(Map<String, String> map) {
		actionStartLogger(CallPlanProcessAction.class,"getEditPlanRules",0);
		s(cp.getPlanIDText(), map.get("id"),1);
		c(cp.getSearchButton(),1);
		w(6);
		c(cp.getSrEditButton(),1);
		w(2);
		cp.getEpPlanNameText().clear();
		c(cp.getEpSaveButton(),1);
		s(cp.getEpPlanNameText(), map.get("name"),1);
		c(cp.getEpPriorityButton(),1);
		c(cp.getKendoList(map.get("priority")),1);
		c(cp.getEpSaveButton(),1);
		c(cp.getEpCancelButton(),1);
	}
	
	public static void getEditPlan(Map<String, String> map) {
		actionStartLogger(CallPlanProcessAction.class,"getEditPlan",0);
		c(cp.getSrEditButton(),1);
		w(2);
		s(cp.getEpPlanNameText(),map.get("name"),1);
		c(cp.getEpPriorityButton(), 1);
		c(cp.getKendoList(map.get("priority")),1);
		c(cp.getEpSaveButton(),1);
		w(30);
	}
	
	// add call plan
	public static void getClickLinkToPage() {
		c(cp.getMerchantQueryButton(),1);
		w(8);
	}
	
 	//match merchant
	public Map<String, String> getMatchMerchantRules(Map<String, String> map) {
		actionStartLogger(CallPlanProcessAction.class,"getMatchMerchantRules",0);
		Map<String, String> result = new HashMap<String, String>();
		if (String.valueOf(cp.getMmBox().isSelected()).equals("false"))
			c(cp.getMmBox(),1);
		c(cp.getMmAssignButton(),1);
		c(cp.getMmAssignSaveButton(),1);
		w(1);
		result.put("error", cp.getErrorMessage().getText());
		s(cp.getMmAssignAssignToText(), map.get("assign"),1);
		w(2);
		action.sendKeys(Keys.ENTER).build().perform();
		c(cp.getMmAssignSaveButton(),1);
		w(1);
		result.put("error2", cp.getErrorMessage().getText());
		c(cp.getMmAssignCancelButton(),1);
		return result;
	}
	
	public Map<String, String> getMatchMerchant(Map<String, String> map) {
		actionStartLogger(CallPlanProcessAction.class,"getMatchMerchant",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cp.getMmAssignButton(),1);
		s(cp.getMmAssignAssignToText(), map.get("assign"),1);
		w(2);
		action.sendKeys(Keys.ENTER).build().perform();
		c(cp.getMmAssignSaveButton(),1);
		w(5);
		result.put("assign", cp.getMmAssignTo("").getText());
		result.put("update", cp.getMmUpdateStatusButton().getAttribute("class"));
		result.put("assignButton", cp.getMmAssignButton().getAttribute("class"));
		result.put("delete", cp.getMmDeleteButton().getAttribute("class"));
		return result;
	}
	
	// delete merchant
	public static Map<String, String> getDeleteMerchant() {
		actionStartLogger(CallPlanProcessAction.class,"getDeleteMerchant",0);
		Map<String, String> result = new HashMap<String, String>();
		if (String.valueOf(cp.getMmBox().isSelected()).equals("false"))
			c(cp.getMmBox(),1);
		c(cp.getMmDeleteButton(),1);
		c(cp.getMmDeleteCancelButton(),1);
		result.put("id", cp.getSrPlanID("").getText());
		c(cp.getMmDeleteButton(),1);
		c(cp.getMmDeleteOKButton(),1);
		w(20);
		return result;
	}
	
	// update merchant status
	public static Map<String, String> getUpdateMerchantStatus() {
		actionStartLogger(CallPlanProcessAction.class,"getUpdateMerchantStatus",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cp.getSearchButton(),1);
		w(6);
		if (String.valueOf(cp.getMmBox().isSelected()).equals("false"))
			c(cp.getMmBox(),1);
		c(cp.getMmUpdateStatusButton(),1);
		result.put("status", cp.getMmUpdateCallStatusValue().getText());
		w(3);
		cp.getMmUpdateSaveButton().click();
		w(5);
		result.put("status2", cp.getMmCallStatus("").getText());
		return result;
	}
	
	// add note
	public static Map<String, String> getAddNote() {
		actionStartLogger(CallPlanProcessAction.class,"getAddNote",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cp.getMmAddNoteButton(),1);
		w(3);
		result.put("save", String.valueOf(cp.getMmNoteSaveButton().isEnabled()));
		c(cp.getMmNoteCloseButton(),1);
		return result;
	}
	
	// add contact
	public static Map<String, String> getAddContact() {
		actionStartLogger(CallPlanProcessAction.class,"getAddContact",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cp.getMmAddContactButton(),1);
		w(3);
		result.put("box", String.valueOf(cp.getMmContactMerchantBox().isSelected()));
		result.put("id", cp.getMmContactMerchantIDText().getAttribute("value"));
		result.put("name", cp.getMmContactMerchantNameText().getAttribute("value"));
		result.put("save", String.valueOf(cp.getMmContactSaveDetailButton().isEnabled()));
		result.put("save2", String.valueOf(cp.getMmContactSaveButton().isEnabled()));
		c(cp.getMmContactCloseButton(),1);
		return result;
	}
	
	// add opportunity
	public static Map<String, String> getAddOpportunity() {
		actionStartLogger(CallPlanProcessAction.class,"getAddOpportunity",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cp.getMmAddOpportunityButton(),1);
		w(3);
		result.put("box", String.valueOf(cp.getMmOpportunityMerchantBox().isSelected()));
		result.put("id", cp.getMmOpportunityMerchantIDText().getAttribute("value"));
		result.put("name", cp.getMmOpportunityMerchantNameText().getAttribute("value"));
		result.put("save", String.valueOf(cp.getMmOpportunitySaveDetailButton().isEnabled()));
		result.put("save2", String.valueOf(cp.getMmOpportunitySaveButton().isEnabled()));
		c(cp.getMmOpportunityCloseButton(),1);
		return result;
	}
	
	// delete call plan
	public static Map<String, String> getDeleteCallPlan1() {
		actionStartLogger(CallPlanProcessAction.class,"getDeleteCallPlan1",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cp.getMmDeleteButton(),1);
		c(cp.getMmDeleteOKButton(),1);
		w(1);
		result.put("error", cp.getErrorMessage().getText());
		w(3);
		c(cp.getSrDeleteButton(),1);
		c(cp.getSrDeleteOKButton(),1);
		w(2);
		return result;
	}
	
	public static Map<String, String> getDeleteCallPlan2() {
		actionStartLogger(CallPlanProcessAction.class,"getDeleteCallPlan2",0);
		Map<String, String> result = new HashMap<String, String>();
		w(30);
		c(cp.getSrDeleteButton(),1);
		c(cp.getSrDeleteOKButton(),1);
		w(5);
		return result;
	}
	
	
}
