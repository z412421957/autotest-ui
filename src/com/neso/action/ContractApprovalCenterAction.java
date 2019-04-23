package com.neso.action;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.neso.factory.CommonUtil;
import com.neso.pageobject.ContractApprovalCenter;

public class ContractApprovalCenterAction extends CommonUtil{

	private WebDriver driver = super.getDriver();
	private static ContractApprovalCenter ca = new ContractApprovalCenter();
	
	// data load
	public static Map<String, String> getDataLoad() {
		actionStartLogger(ContractApprovalCenterAction.class,"getDataLoad",0);
		Map<String, String> result = new HashMap<String, String>();
		result.put("merchant", String.valueOf(ca.getMerchantNumberText().isEnabled()));
		result.put("shipping", ca.getShippingCarrierValue().getText());
		result.put("status", ca.getStatusValue().getText());
		result.put("search", String.valueOf(ca.getSearchButton().isEnabled()));
		result.put("approve", String.valueOf(ca.getApproveButton().isEnabled()));
		result.put("decline", String.valueOf(ca.getDeclineButton().isEnabled()));
		return result;
	}
	
	// search
	public static Map<String, String> getSearchRules(Map<String, String> map) {
		actionStartLogger(ContractApprovalCenterAction.class,"getSearchRules",0);
		Map<String, String> result = new HashMap<String, String>();
		s(ca.getMerchantNumberText(),map.get("merchant1"),1);
		result.put("merchant1", ca.getMerchantNumberText().getAttribute("class"));
		s(ca.getMerchantNumberText(),map.get("merchant2"),1);
		result.put("merchant2", ca.getMerchantNumberText().getAttribute("class"));
		s(ca.getMerchantNumberText(),map.get("merchant"),1);
		c(ca.getSearchButton(),1);
		w(4);
		result.put("content", ca.getSrContentValue().getText());
		return result;
	}
	
	public static Map<String, String> getSearch(Map<String, String> map) {
		actionStartLogger(ContractApprovalCenterAction.class,"getSearch",0);
		Map<String, String> result = new HashMap<String, String>();
		c(ca.getResetButton(),1);
		c(ca.getSearchButton(),1);
		w(4);
		result.put("merchant", ca.getSrMerchantNumberValue().getText());
		s(ca.getMerchantNumberText(),map.get("merchant"),1);
		c(ca.getSearchButton(),1);
		w(4);
		result.put("merchant2", ca.getSrMerchantNumberValue().getText());
		c(ca.getShippingCarrierButton(),1);
		c(ca.getKendoList(Integer.valueOf(map.get("carrier"))),1);
		c(ca.getStatusButton(),1);
		c(ca.getKendoList(Integer.valueOf(map.get("status"))),1);
		c(ca.getSearchButton(),1);
		w(6);
		result.put("carrier", ca.getShippingCarrierValue().getText());
		result.put("status", ca.getStatusValue().getText());
		result.put("carrier1", ca.getSrShippingCarrierValue().getText());
		result.put("status1", ca.getSrStatusValue().getText());
		return result;
	}
	
	public static Map<String, String> getSearchResults(Map<String, String> map) {
		actionStartLogger(ContractApprovalCenterAction.class,"getSearchResults",0);
		Map<String, String> result = new HashMap<String, String>();
		c(ca.getResetButton(),1);
		s(ca.getMerchantNumberText(),map.get("merchant"),1);
		c(ca.getStatusButton(),1);
		c(ca.getKendoList(Integer.valueOf(map.get("status1"))), 1);
		c(ca.getSearchButton(),1);
		w(6);
		ca.getSrStatusValue().click();
		w(4);
		result.put("approve1", String.valueOf(ca.getApproveButton().isEnabled()));
		result.put("decline1", String.valueOf(ca.getDeclineButton().isEnabled()));
		c(ca.getStatusButton(),1);
		c(ca.getKendoList(Integer.valueOf(map.get("status2"))),1);
		c(ca.getSearchButton(),1);
		w(6);
		ca.getSrStatusValue().click();
		w(4);
		result.put("approve2", String.valueOf(ca.getApproveButton().isEnabled()));
		result.put("decline2", String.valueOf(ca.getDeclineButton().isEnabled()));
		return result;
	}
	
	// approve 
	public static void getApprove(Map<String, String> map) {
		actionStartLogger(ContractApprovalCenterAction.class,"getApprove",0);
		c(ca.getStatusButton(),1);
		c(ca.getKendoList(Integer.valueOf(map.get("status"))),1);
		c(ca.getSearchButton(),1);
		w(6);
		ca.getSrStatusValue().click();
		w(4);
		c(ca.getApproveButton(),1);
		w(3);
	}
	
	// decline
	public static Map<String, String> getDecline(Map<String, String> map) {
		actionStartLogger(ContractApprovalCenterAction.class,"getDecline",0);
		Map<String, String> result = new HashMap<String, String>();
		c(ca.getShippingCarrierButton(),1);
		c(ca.getKendoList(Integer.valueOf(map.get("carrier"))),1);
		c(ca.getStatusButton(),1);
		c(ca.getKendoList(Integer.valueOf(map.get("status"))),1);
		c(ca.getSearchButton(),1);
		w(6);
		c(ca.getSrStatusValue(),1);
		w(4);
		c(ca.getDeclineButton(),1);
		w(3);
		result.put("content", ca.getSrContentValue().getText());
		return result;
	}
	
	// review contract
	public static Map<String, String> getReviewContract(Map<String, String> map) {
		actionStartLogger(ContractApprovalCenterAction.class,"getReviewContract",0);
		Map<String, String> result = new HashMap<String, String>();
		c(ca.getResetButton(),1);
		s(ca.getMerchantNumberText(),map.get("merchant"),1);
		c(ca.getStatusButton(),1);
		c(ca.getKendoList(Integer.valueOf(map.get("status"))),1);
		c(ca.getSearchButton(),1);
		w(6);
		ca.getSrStatusValue().click();
		w(4);
		result.put("file", ca.getRcContractFileName().getAttribute("href"));
		return result;
	}
	
	// link other page
	public static Map<String, String> getLinkOtherPage(Map<String, String> map) {
		actionStartLogger(ContractApprovalCenterAction.class,"getLinkOtherPage",0);
		Map<String, String> result = new HashMap<String, String>();
		c(ca.getResetButton(),1);
		s(ca.getMerchantNumberText(),map.get("merchant"),1);
		c(ca.getSearchButton(),1);
		w(6);
		c(ca.getSrMerchantNumberValue(),1);
		w(10);
		result.put("link", getNewWindowUrl());
		return result;
	}	
	
}
