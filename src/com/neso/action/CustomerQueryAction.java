package com.neso.action;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.neso.factory.CommonUtil;
import com.neso.pageobject.CustomerQuery;

public class CustomerQueryAction extends CommonUtil{
	private WebDriver driver = super.getDriver();
	private Actions action = new Actions(driver);
	private static CustomerQuery cq = new CustomerQuery();
	
	
	// load
	public static Map<String, String> getLoad() {
		actionStartLogger(CustomerQueryAction.class,"getLoad",0);
		Map<String, String> result = new HashMap<String, String>();
		w(3);
		result.put("searchBy", cq.getSearchByValue().getText());
		c(cq.getAdvancedBox(),1);
		w(2);
		result.put("ownership", cq.getOwnershipTypeValue().getText());
		result.put("bu", cq.getBuValue().getText());
		result.put("content", cq.getSearchResultContent().getText());
		result.put("account", cq.getDeactiveAccountButton().getAttribute("class"));
		result.put("so", cq.getSoProcessButton().getAttribute("class"));
		result.put("customer", cq.getCustomerDetailButton().getAttribute("class"));
		result.put("batch", cq.getBatchNewButton().getAttribute("class"));
		result.put("tax", cq.getTaxRequestButton().getAttribute("class"));
		result.put("new", cq.getNewSoButton().getAttribute("class"));
		result.put("crd", cq.getCrdQueryButton().getAttribute("class"));
		result.put("call", cq.getCallHistoryButton().getAttribute("class"));
		result.put("reminder", cq.getReminderButton().getAttribute("class"));
		result.put("login", cq.getLoginButton().getAttribute("class"));
		result.put("balance", cq.getCustomerBalanceButton().getAttribute("class"));
		result.put("reportCard", cq.getCustomerReportCardButton().getAttribute("class"));
		result.put("message", cq.getMessageCenterButton().getAttribute("class"));
		result.put("rma", cq.getRmaQueryButton().getAttribute("class"));
		result.put("claim", cq.getClaimQueryButton().getAttribute("class"));
		result.put("icc", cq.getIccRequestButton().getAttribute("class"));
		result.put("contact", cq.getContactHistoryButton().getAttribute("class"));
		result.put("pen", cq.getPenGlobeButton().getAttribute("class"));
		return result;
	}
	
	// search
	public static Map<String, String> getSearchBy(Map<String, String> map) {
		actionStartLogger(CustomerQueryAction.class,"getSearchBy",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cq.getBasicBox(),1);
		s(cq.getSearchText(),map.get("agent"),1);
		c(cq.getSearchButton(),1);
		w(4);
		result.put("customer", cq.getSrCustomerNumber("[1]").getText());
		c(cq.getSearchByButton(), 1);
		c(cq.getKendoList(2),1);
		s(cq.getSearchText(),map.get("customer"),1);
		c(cq.getSearchButton(),1);
		w(4);
		result.put("company2", cq.getSrCompanyName("").getText());
		c(cq.getSearchByButton(), 1);
		c(cq.getKendoList(3),1);
		s(cq.getSearchText(),map.get("companyName"),1);
		c(cq.getSearchButton(),1);
		w(4);
		result.put("company3", cq.getSrCompanyName("[1]").getText());
		c(cq.getSearchByButton(), 1);
		c(cq.getKendoList(4),1);
		s(cq.getSearchText(),map.get("contactWith"),1);
		c(cq.getSearchButton(),1);
		w(4);
		result.put("customer4", cq.getSrCustomerNumber("[1]").getText());
		return result;
	}
	
	public static Map<String, String> getSearchCondition() {
		actionStartLogger(CustomerQueryAction.class,"getSearchCondition",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cq.getResetButton(),1);
		c(cq.getAdvancedBox(),1);
		c(cq.getOwnershipTypeButton(),1);
		c(cq.getKendoList(2),1);
		c(cq.getBuButton(),1);
		c(cq.getKendoList(2),1);
		c(cq.getSearchButton(),1);
		w(5);
		result.put("country", cq.getSrShippingCountry("[1]").getText());
		result.put("ownership", cq.getSrOwnershipType("[1]").getText());
		return result;
	}
	
	// button
	public Map<String, String> getButton() {
		actionStartLogger(CustomerQueryAction.class,"getButton",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cq.getSoProcessButton(),1);
		w(20);
		result.put("so", getNewWindowUrl());
		c(cq.getTaxRequestButton(),1);
		w(4);
		result.put("tax", getNewWindowUrl());
//		c(cq.getNewSoButton(),1);
//		w(4);
//		result.put("new", getNewWindowUrl());
		c(cq.getCrdQueryButton(),1);
		w(4);
		result.put("crd", getNewWindowUrl());
		return result;
	}
	
	public Map<String, String> getButton2(Map<String, String> map) {
		actionStartLogger(CustomerQueryAction.class,"getButton2",0);
		Map<String, String> result = new HashMap<String, String>();
		s(cq.getSearchText(), map.get("search"),1);
		c(cq.getSearchButton(),1);
		w(6);
		cq.getSrResultDiv_2().click();
		w(5);
		result.put("customer", cq.getSrCustomerNumber("[2]").getText());
		c(cq.getBatchNewButton(),3);
		w(20);
		result.put("batch", getNewWindowUrl());
		c(cq.getTaxRequestButton(),1);
		w(4);
		result.put("tax", getNewWindowUrl());
		c(cq.getCrdQueryButton(),1);
		w(4);
		result.put("crd", getNewWindowUrl());
		c(cq.getReminderButton(),1);
		w(4);
		result.put("reminder", getNewWindowUrl());
		c(cq.getSoProcessButton(),1);
		w(20);
		result.put("so", getNewWindowUrl());
		c(cq.getCustomerDetailButton(),3);
		w(20);
		result.put("customerDetail", getNewWindowUrl());
		w(3);
		return result;
	}
	
	// link
	public static Map<String, String> getLink() {
		actionStartLogger(CustomerQueryAction.class,"getLink",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cq.getCustomerBalanceButton(),1);
		w(15);
		result.put("customerBalance", getNewWindowUrl());
		c(cq.getCustomerReportCardButton(),1);
		w(20);
		result.put("customerReport", getNewWindowUrl());
		c(cq.getMessageCenterButton(),1);
		w(20);
		result.put("messageCenter", getNewWindowUrl());
		c(cq.getRmaQueryButton(),1);
		w(4);
		result.put("rmaQuery", getNewWindowUrl());
		c(cq.getClaimQueryButton(),1);
		w(4);
		result.put("claimQuery", getNewWindowUrl());
		c(cq.getPenGlobeButton(),1);
		w(20);
		result.put("penGlobe", getNewWindowUrl());
		return result;
	}
	
	public static Map<String, String> getLink2(Map<String, String> map) { 
		actionStartLogger(CustomerQueryAction.class,"getLink2",0);
		Map<String, String> result = new HashMap<String, String>();
		s(cq.getSearchText(), map.get("search"),1);
		c(cq.getSearchButton(),1);
		w(6);
		cq.getSrResultDiv_1().click();
		w(5);
		result.put("customer", cq.getSrCustomerNumber("[1]").getText());
		c(cq.getCustomerBalanceButton(),3);
		w(15);
		result.put("customerBalance", getNewWindowUrl());
		c(cq.getCustomerReportCardButton(),1);
		w(20);
		result.put("customerReport", getNewWindowUrl());
		c(cq.getMessageCenterButton(),1);
		w(20);
		result.put("messageCenter", getNewWindowUrl());
		c(cq.getRmaQueryButton(),1);
		w(4);
		result.put("rmaQuery", getNewWindowUrl());
		c(cq.getClaimQueryButton(),1);
		w(4);
		result.put("claimQuery", getNewWindowUrl());
		c(cq.getPenGlobeButton(),1);
		w(20);
		result.put("penGlobe", getNewWindowUrl());
		return result;
	}
	
}
