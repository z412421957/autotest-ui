package com.neso.action;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.neso.factory.CommonUtil;
import com.neso.pageobject.RewardsBlockedList;

public class RewardsBlockedListAction extends CommonUtil{
	
	private WebDriver driver = super.getDriver();
	private static RewardsBlockedList rb = new RewardsBlockedList();
	
	// load
	public static Map<String, String> getPageLoad() {
		actionStartLogger(RewardsBlockedListAction.class,"getPageLoad",0);
		Map<String, String> result = new HashMap<String, String>();
		w(5);
		result.put("type", rb.getSearchTypeValue().getText());
		result.put("keywords", String.valueOf(rb.getKeywordsText().isEnabled()));
		result.put("box", String.valueOf(rb.getBlockDateButton().isEnabled()));
		result.put("reset", String.valueOf(rb.getResetButton().isEnabled()));
		result.put("search", String.valueOf(rb.getSearchButton().isEnabled()));
		result.put("export", String.valueOf(rb.getExportCurrentPageButton().isEnabled()));
		result.put("add", String.valueOf(rb.getAddButton().isEnabled()));
		return result;
	}
	
	// add
	public static Map<String, String> getAddRules() {
		actionStartLogger(RewardsBlockedListAction.class,"getAddRules",0);
		Map<String, String> result = new HashMap<String, String>();
		c(rb.getAddButton(),1);
		result.put("name", rb.getAdMerchantNameValue().getText());
		result.put("primary", rb.getAdPrimaryCustomerValue().getText());
		result.put("contact", rb.getAdContactWithValue().getText());
		result.put("memo", rb.getAdMemoText().getAttribute("value"));
		c(rb.getAdSaveButton(),1);
		result.put("merchant", rb.getAdMerchantIDTextng().getAttribute("class"));
		c(rb.getAdCancelButton(),1);
		return result;
	}
	
	public static Map<String, String> getAdd(Map<String, String> map) {
		actionStartLogger(RewardsBlockedListAction.class,"getAddRules",0);
		Map<String, String> result = new HashMap<String, String>();
		c(rb.getAddButton(),1);
		s(rb.getAdMerchantIDText(), map.get("merchant"), 1);
		c(rb.getAdMerchantSearchButton(),1);
		c(rb.getAdSaveButton(),3);
		w(20);
		c(rb.getAddButton(),1);
		s(rb.getAdMerchantIDText(), map.get("merchant"), 1);
		c(rb.getAdMerchantSearchButton(), 1);
		w(1);
		result.put("error", rb.getErrorMessage().getText());
		c(rb.getAdCancelButton(),1);
		return result;
	}
	
	// query
	public static Map<String, String> getSearch(Map<String, String> map) {
		actionStartLogger(RewardsBlockedListAction.class,"getSearch",0);
		Map<String, String> result = new HashMap<String, String>();
		s(rb.getKeywordsText(), map.get("merchant"), 1);
		c(rb.getBlockDateButton(),1);
		c(rb.getSearchButton(),1);
		w(4);
		result.put("merchant", rb.getMerchantID().getText());
		c(rb.getSearchTypeButton(),1);
		c(rb.getKendoList(2),1);
		s(rb.getKeywordsText(), map.get("name"),1);
		c(rb.getSearchButton(),1);
		w(4);
		result.put("merchant2", rb.getMerchantID().getText());
		c(rb.getSearchTypeButton(),1);
		c(rb.getKendoList(3),1);
		s(rb.getKeywordsText(), map.get("primary"),1);
		c(rb.getSearchButton(),1);
		w(4);
		result.put("merchant3", rb.getMerchantID().getText());
		c(rb.getSearchTypeButton(),1);
		c(rb.getKendoList(4),1);
		s(rb.getKeywordsText(), map.get("block"),1);
		c(rb.getSearchButton(),1);
		w(4);
		result.put("merchant4", rb.getMerchantID().getText());
		result.put("export", String.valueOf(rb.getExportCurrentPageButton().isEnabled()));
		c(rb.getResetButton(),1);
		s(rb.getMerchantIDText(), map.get("merchant"),1);
		result.put("merchant5", rb.getMerchantID().getText());
		return result;
	}
	
	public static Map<String, String> getLink() {
		actionStartLogger(RewardsBlockedListAction.class,"getLink",0);
		Map<String, String> result = new HashMap<String, String>();
		c(rb.getMerchantID(), 1);
		w(15);
		result.put("merchant", getNewWindowUrl());
		c(rb.getPrimaryCustomer(), 1);
		w(15);
		result.put("primary", getNewWindowUrl());
		return result;
	}
	
	// remove
	public static Map<String, String> getRemove(Map<String, String> map) {
		actionStartLogger(RewardsBlockedListAction.class,"getRemove",0);
		Map<String, String> result = new HashMap<String, String>();
		s(rb.getKeywordsText(), map.get("merchant"), 1);
		c(rb.getSearchButton(),1);
		w(4);
		c(rb.getRemoveButton(),1);
		c(rb.getRemoveCancelButton(),1);
		c(rb.getRemoveButton(),1);
		c(rb.getRemoveOKButton(),1);
		w(20);
		c(rb.getSearchButton(),1);
		result.put("result", rb.getResultContent().getText());
		return result;
	}

}
