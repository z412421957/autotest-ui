package com.neso.action;

import java.util.HashMap;
import java.util.Map;

import com.neso.factory.CommonUtil;
import com.neso.pageobject.QuoteQuery;

public class QuoteQueryAction extends CommonUtil{

	private static QuoteQuery qq = new QuoteQuery();
	
	// page load
	public static Map<String, String> getPageLoad() {
		actionStartLogger(QuoteQueryAction.class,"getPageLoad",0);
		Map<String, String> result = new HashMap<String, String>();
		w(5);
		result.put("quote", String.valueOf(qq.getQuoteButton().isSelected()));
		result.put("status", qq.getStatusValue().getText());
		result.put("ae", qq.getAeValue().getText());
		result.put("bu", qq.getBuValue().getText());
		result.put("search", String.valueOf(qq.getSearchButton().isEnabled()));
		return result;
	}
	
	// quote query
	public static Map<String, String> getQuoteQuery(Map<String, String> map) {
		actionStartLogger(QuoteQueryAction.class,"getQuoteQuery",0);
		Map<String, String> result = new HashMap<String, String>();
		//c(qq.getCreateDateButton(),1);
		//s(qq.getFromDateText(),map.get("from"),1);
		s(qq.getKeyWordText(),map.get("keyWord"),1);
		s(qq.getCustomerNumberText(),map.get("customer"),1);
		s(qq.getCreateByText(),map.get("createBy"),1);
		c(qq.getStatusButton(),1);
		c(qq.getKendoList(Integer.valueOf(map.get("status"))),1);
		s(qq.getCompanyText(),map.get("company"),1);
		s(qq.getEmailAddressText(),map.get("email"),1);
		c(qq.getSearchButton(),1);
		w(5);
		result.put("quote", qq.getQuoteNumber("").getText());
		return result;
	}
	
	// menu rules
	public static void getAddNote(Map<String, String> map) {
		actionStartLogger(QuoteQueryAction.class,"getMenuRules",0);
		c(qq.getMenuButton(""),1);
		c(qq.getMenuList(map.get("note")),1);
		c(qq.getCloseButton(),3);
		c(qq.getMenuButton(""),1);
		c(qq.getMenuList(map.get("note")),1);
		w(10);
		c(qq.getPrivateBox(),3);
		s(qq.getNoteText(), map.get("value"),1);
		c(qq.getSaveButton(),1);
		w(3);
		c(qq.getCloseButton(),1);
	}
	
	// button rules
	public static Map<String, String> getButtonRules() {
		actionStartLogger(QuoteQueryAction.class,"getButtonRules",0);
		Map<String, String> result = new HashMap<String, String>();
		c(qq.getNewButton(),1);
		w(20);
		result.put("new", getNewWindowUrl());
		return result;
	}
	
	
	
}
