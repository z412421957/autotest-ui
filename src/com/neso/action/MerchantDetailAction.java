package com.neso.action;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.neso.factory.CommonUtil;
import com.neso.pageobject.MerchantDetail;

public class MerchantDetailAction extends CommonUtil{
	private WebDriver driver = super.getDriver();
	private Actions action = new Actions(driver);
	private static MerchantDetail md = new MerchantDetail();
	
	
	// data load
	public static Map<String, String> getDataLoad(){
		actionStartLogger(MerchantDetailAction.class,"getDataLoad",0);
		Map<String, String> result = new HashMap<String, String>();
		result.put("merchant", String.valueOf(md.getMerchantIDText().isEnabled()));
		result.put("reminder", md.getReminderButton().getAttribute("class"));
		result.put("selectFile", String.valueOf(md.getSelectFilesButton().isEnabled()));
		result.put("upload", String.valueOf(md.getUploadButton().isEnabled()));
		result.put("description", String.valueOf(md.getDescriptionText().isEnabled()));
		return result;
	}
	
	// search 
	public static Map<String, String> getSearchRules(Map<String, String> map){
		actionStartLogger(MerchantDetailAction.class,"getSearchRules",0);
		Map<String, String> result = new HashMap<String, String>();
		c(md.getMerchantIDButton(),1);
		s(md.getMerchantIDText(),map.get("merchant"),1);
		result.put("merchantError", md.getMerchantIDError().getAttribute("class"));
		s(md.getMerchantIDText(),map.get("merchant2"),1);
		c(md.getMerchantIDButton(),1);
		result.put("notExists", md.getErrorMessage().getText());
		c(md.getErrorOKButton(),1);
		return result;
	}
	
	public static Map<String, String> getSearch(Map<String, String> map){
		actionStartLogger(MerchantDetailAction.class,"getSearch",0);
		Map<String, String> result = new HashMap<String, String>();
		s(md.getMerchantIDText(),map.get("merchant"),1);
		c(md.getMerchantIDButton(),1);
		w(6);
		result.put("reminderButton", String.valueOf(md.getReminderButton().isEnabled()));
		result.put("customerType", md.getCustomerType().getText());
//		c(md.getShippingAccountButton(),1);
//		s(md.getSelectFilesButton(),map.get("file"),1);
//		s(md.getDescriptionText(),map.get("description"),1);
//		c(md.getUploadButton(),1);
//		c(md.getFileName(),1);
//		result.put("picUrl", getNewWindowUrl());
//		c(md.getFileAction(),1);
//		c(md.getErrorOKButton2(),1);
//		w(10);
		return result;
	}
	
	// shipping account contract
	public static Map<String, String> getAccountContractRules(Map<String, String> map){
		actionStartLogger(MerchantDetailAction.class,"getAccountContractRules",0);
		Map<String, String> result = new HashMap<String, String>();
		result.put("noFile", String.valueOf(md.getUploadButton().isEnabled()));
		s(md.getSelectFilesButton(),map.get("file"),1);
		c(md.getUploadButton(),2);
		result.put("noDescription", md.getDescriptionText().getAttribute("class"));
		return result;
	}
	
	public static Map<String, String> getAccountContract(Map<String, String> map){
		actionStartLogger(MerchantDetailAction.class,"getAccountContract",0);
		Map<String, String> result = new HashMap<String, String>();
		s(md.getDescriptionText(),map.get("description"),1);
		c(md.getShippingCarrierButton(),1);
		c(md.getShippingCarrierText2(),1);
		result.put("shippingCarrier", md.getShippingCarrierText1().getText());
		c(md.getUploadButton(),1);
		c(md.getFileName(),1);
		result.put("picUrl", getNewWindowUrl());
		c(md.getFileAction(),1);
		c(md.getErrorOKButton2(),1);
		w(10);
		return result;
	}
	
	// Mail To Customer
	public static Map<String, String> getMailCustomer(Map<String, String> map){
		actionStartLogger(MerchantDetailAction.class,"getMailCustomer",0);
		Map<String, String> result = new HashMap<String, String>();
		w(3);
		c(md.getMailCustomerButton(),3);
		result.put("noMail",md.getErrorMessage().getText());
		c(md.getErrorOKButton(),1);
		s(md.getMerchantIDText(),map.get("merchant"),1);
		c(md.getMerchantIDButton(),1);
		w(12);
		c(md.getMailCustomerButton(),1);
		c(md.getMailCancelButton(),1);
		c(md.getMailCustomerButton(),1);
		s(md.getMailTemplateText(),map.get("template"),1);
		c(md.getMailCustomerBox(),1);
		md.getMailContactWith().click();
		w(2);
		c(md.getMailOKButton(),1);
		result.put("noCustomer", md.getErrorMessage().getText());
		c(md.getErrorOKButton(),1);
		c(md.getMailCustomerBox(),1);
		c(md.getMailOKButton(),1);
		w(3);
		result.put("success",md.getMailSuccess().getText());
		c(md.getMailExitButton(),1);
		c(md.getMailCancelButton(),1);
		return result;
	}
	
	// Note To P&G
	public static Map<String, String> getNotePG(Map<String, String> map){
		actionStartLogger(MerchantDetailAction.class,"getNotePG",0);
		Map<String, String> result = new HashMap<String, String>();
		w(3);
		c(md.getNotePGButton(),1);
		result.put("noNote", md.getErrorMessage().getText());
		c(md.getErrorOKButton(),1);
		s(md.getMerchantIDText(),map.get("merchant"),1);
		c(md.getMerchantIDButton(),1);
		w(12);
		c(md.getNotePGButton(),1);
		result.put("error", md.getErrorMessage().getText());
		c(md.getErrorOKButton(),1);
		return result;
	}
	
	// link to other page
	public static Map<String, String> getLinkOtherPage1(){
		actionStartLogger(MerchantDetailAction.class,"getLinkOtherPage1",0);
		Map<String, String> result = new HashMap<String, String>();
		c(md.getSoProcessButton(), 1);
		w(20);
		result.put("soProcess",getNewWindowUrl());
		c(md.getCustomerBalanceButton(), 1);
		result.put("customerBalance", getNewWindowUrl());
		c(md.getMerchantBalanceButton(), 1);
		w(20);
		result.put("merchantBalance", getNewWindowUrl());
		c(md.getCustomerReportButton(), 1);
		w(20);
		result.put("customerReport", getNewWindowUrl());
		c(md.getMerchantDashboardButton(), 1);
		w(20);
		result.put("merchantDashboard", getNewWindowUrl());
		c(md.getPenGlobeButton(), 1);
		w(20);
		result.put("penGlobe", getNewWindowUrl());
		c(md.getReminderButton(), 1);
		result.put("reminder", getNewWindowUrl());
		c(md.getNewSOButton(), 1);
		result.put("newSO", getNewWindowUrl());
		return result;
	}
	
	public static Map<String, String> getLinkOtherPage2(){
		actionStartLogger(MerchantDetailAction.class,"getLinkOtherPage2",0);
		Map<String, String> result = new HashMap<String, String>();
		w(3);
		c(md.getSoProcessButton(), 1);
		w(20);
		result.put("soProcess",getNewWindowUrl());
		c(md.getCustomerBalanceButton(), 1);
		result.put("customerBalance", getNewWindowUrl());
		c(md.getMerchantBalanceButton(), 1);
		w(20);
		result.put("merchantBalance", getNewWindowUrl());
		c(md.getCustomerReportButton(), 1);
		result.put("customerReport", getNewWindowUrl());
		//click no result
		//c(md.getPenGlobeButton(), 1);
		//w(20);
		//result.put("penGlobe", getNewWindowUrl());
		c(md.getNewSOButton(), 1);
		result.put("newSO", getNewWindowUrl());
		return result;
	}
}
