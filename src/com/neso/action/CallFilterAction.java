package com.neso.action;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.neso.factory.CommonUtil;
import com.neso.pageobject.CallFilter;

public class CallFilterAction extends CommonUtil{
	
	private WebDriver driver = super.getDriver();
	private static CallFilter cf = new CallFilter();
	
	// load
	public static Map<String, String> getLoad() {
		actionStartLogger(CallFilterAction.class,"getLoad",0);
		Map<String, String> result = new HashMap<String, String>();
		w(4);
		result.put("name", String.valueOf(cf.getFilterNameText().isEnabled()));
		result.put("createBy", String.valueOf(cf.getCreateByText().isEnabled()));
		result.put("agent", String.valueOf(cf.getManagedAgentText().isEnabled()));
		result.put("merchantStatus", cf.getMerchantStatusValue().getText());
		result.put("latePayStatus", cf.getLatePayStatusValue().getText());
		result.put("bu", cf.getBuValue().getText());
		result.put("netTerm", cf.getNetTermUsageValue().getText());
		result.put("seatSize", cf.getSeatSizeValue().getText());
		result.put("b2b", cf.getB2bUnitValue().getText());
		result.put("ownership", cf.getOwnershipTypeValue().getText());
		result.put("reset", String.valueOf(cf.getResetButton().isEnabled()));
		result.put("searchButton", String.valueOf(cf.getSearchButton().isEnabled()));
		result.put("searchResult", cf.getSearchResultBody().getText());
		result.put("add", String.valueOf(cf.getAddNewButton().isEnabled()));
		return result;
	}
	
	// add new
	public static Map<String, String> getAddNewRules() {
		actionStartLogger(CallFilterAction.class,"getAddNewRules",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cf.getAddNewButton(),1);
		c(cf.getAnSaveButton(),2);
		result.put("filterError", cf.getAnFilterNameText().getAttribute("class"));
		c(cf.getAnCancelButton(),1);
		return result;
	}
	
	public static void getAddNew(Map<String, String> map) {
		actionStartLogger(CallFilterAction.class,"getAddNew",0);
		c(cf.getAddNewButton(),1);
		s(cf.getAnFilterNameText(),map.get("name"),1);
		c(cf.getAnPriorityButton(),1);
		c(cf.getKendoList(Integer.valueOf(map.get("priority"))),1);
		w(2);
		cf.getAnSaveButton().click();
		w(20);
	}
	
	// search
	public static Map<String, String> getSearch() {
		actionStartLogger(CallFilterAction.class,"getSearch",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cf.getSearchButton(),1);
		w(3);
		result.put("createBy", cf.getSrCreateBy_1().getText());
		return result;
	}
	
	public static Map<String, String> getSearchRules(Map<String, String> map) {
		actionStartLogger(CallFilterAction.class,"getSearchRules",0);
		Map<String, String> result = new HashMap<String, String>();
		s(cf.getFilterNameText(),map.get("name"),1);
		s(cf.getCreateByText(),map.get("createBy"),1);
//		s(cf.getManagedAgentText(),map.get("agent"),1);
//		c(cf.getKendoList(Integer.valueOf(map.get("agentNum"))),2);
		c(cf.getBuButton(),1);
		c(cf.getKendoList(Integer.valueOf(map.get("bu"))),2);
		c(cf.getSeatSizeButton(),1);
		c(cf.getKendoList(Integer.valueOf(map.get("seatSize"))),2);
		c(cf.getMerchantStatusButton(),1);
		c(cf.getKendoList(Integer.valueOf(map.get("merchant"))),2);
		c(cf.getLatePayStatusButton(),1);
		c(cf.getKendoList(Integer.valueOf(map.get("latePay"))),2);
		result.put("seatSize", cf.getSeatSizeValue().getText());
		result.put("merchant", cf.getMerchantStatusValue().getText());
		result.put("latePay", cf.getLatePayStatusValue().getText());
		result.put("bu", cf.getBuValue().getText());
		c(cf.getSearchButton(),1);
		w(3);
		result.put("createBy", cf.getSrCreateBy().getText());
		return result;
	}
	
	public static Map<String, String> getSearchResult(Map<String, String> map) {
		actionStartLogger(CallFilterAction.class,"getSearchResult",0);
		Map<String, String> result = new HashMap<String, String>();
		s(cf.getSrFilterIDText(),map.get("id"),1);
		s(cf.getSrFilterNameText(),map.get("name"),1);
		s(cf.getSrMerchantStatusText(),map.get("merchant"),1);
		s(cf.getSrSeatSizeText(),map.get("seatSize"),1);
		s(cf.getSrLatePayStatusText(),map.get("latePay"),1);
		s(cf.getSrCreateByText(),map.get("createBy"),1);
		s(cf.getSrManagedAgentText(),map.get("agent"),1);
		result.put("createBy", cf.getSrCreateBy().getText());
		return result;
	}
	
	public static Map<String, String> getResetRules() {
		actionStartLogger(CallFilterAction.class,"getResetRules",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cf.getResetButton(),1);
		c(cf.getSearchButton(),1);
		w(3);
		result.put("createBy", cf.getSrCreateBy_1().getText());
		return result;
	}
	
	// edit
	public static void getEdit(Map<String, String> map) {
		actionStartLogger(CallFilterAction.class,"getEdit",0);
		s(cf.getFilterNameText(),map.get("filter"),1);
		c(cf.getSearchButton(),1);
		w(3);
		c(cf.getSrEditButton(),1);
		s(cf.getAnFilterNameText(),map.get("name"),2);
		c(cf.getAnPriorityButton(),1);
		c(cf.getKendoList(Integer.valueOf(map.get("priority"))),2);
		c(cf.getAnSaveButton(),1);
		w(20);
	}
	
	// delete
	public static void getDelete(Map<String, String> map) {
		actionStartLogger(CallFilterAction.class,"getDelete",0);
		s(cf.getSrFilterIDText(),map.get("id"),1);
		w(3);
		c(cf.getSrDeleteButton(),1);
		c(cf.getOkButton(),1);
		w(5);
	}
	
	
}
