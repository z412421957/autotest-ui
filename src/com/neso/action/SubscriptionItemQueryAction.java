package com.neso.action;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.neso.factory.CommonUtil;
import com.neso.pageobject.SubscriptionItemQuery;

public class SubscriptionItemQueryAction extends CommonUtil{
	private WebDriver driver = super.getDriver();
	private static SubscriptionItemQuery si = new SubscriptionItemQuery();
	
	// load
	public static Map<String, String> getPageLoad() {
		actionStartLogger(SubscriptionItemQueryAction.class,"getPageLoad",0);
		Map<String, String> result = new HashMap<String, String>();
		w(8);
		result.put("itemText", String.valueOf(si.getItemNumberText().isEnabled()));
		result.put("search", String.valueOf(si.getSearchButton().isEnabled()));
		result.put("item", si.getItemNumberValue().getText());
		result.put("bu", si.getBuValue().getText());
		result.put("program", si.getProgramNumberValue().getText());
		return result;
	}
	
	// query
	public static Map<String, String> getBuProgramRules() {
		actionStartLogger(SubscriptionItemQueryAction.class,"getBuProgramRules",0);
		Map<String, String> result = new HashMap<String, String>();
		c(si.getBuButton(),1);
		c(si.getKendoList(2),1);
		c(si.getProgramNumberButton(),1);
		c(si.getKendoList(2),1);
		result.put("program", si.getProgramNumberValue().getText());
		return result;
	}
	
	public static Map<String, String> getItemNumberRules(Map<String, String> map) {
		actionStartLogger(SubscriptionItemQueryAction.class,"getItemTextRules",0);
		Map<String, String> result = new HashMap<String, String>();
		s(si.getItemNumberText(), map.get("item"),1);
		result.put("item", si.getItemNumberText().getAttribute("class"));
		c(si.getItemNumberButton(),1);
		c(si.getKendoList(2),1);
		s(si.getItemNumberText(), map.get("item"),1);
		result.put("item2", si.getItemNumberText().getAttribute("class"));
		return result;
	}
	
	public static Map<String, String> getItemNumberSearch(Map<String, String> map) {
		actionStartLogger(SubscriptionItemQueryAction.class,"getItemNumberSearch",0);
		Map<String, String> result = new HashMap<String, String>();
		s(si.getItemNumberText(), map.get("item"), 1);
		c(si.getSearchButton(), 1);
		w(5);
		result.put("content", si.getResultContent().getText());
		s(si.getItemNumberText(), map.get("item2"), 1);
		c(si.getSearchButton(), 1);
		w(5);
		result.put("program", si.getResultProgramNumber().getText());
		c(si.getResultItemNumber(), 1);
		w(20);
		result.put("itemLink", getNewWindowUrl());
		c(si.getResultItemNumberIcon(), 1);
		w(3);
		result.put("iconLink", getNewWindowUrl());
		return result;
	}
	
	public static Map<String, String> getProgramDetailLoad() {
		actionStartLogger(SubscriptionItemQueryAction.class,"getProgramDetailLoad",0);
		Map<String, String> result = new HashMap<String, String>();
		c(si.getResultProgramNumber(),1);
		w(5);
		result.put("program", si.getPdProgramNumberText().getAttribute("readonly"));
		result.put("description", si.getPdDescriptionText().getAttribute("readonly"));
		result.put("type", si.getPdItemTypeText().getAttribute("readonly"));
		result.put("memo", si.getPdMemoText().getAttribute("readonly"));
		si.getPdExitButton().click();
		return result;
	}
	
}
