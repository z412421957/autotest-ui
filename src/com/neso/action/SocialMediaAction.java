package com.neso.action;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.neso.factory.CommonUtil;
import com.neso.pageobject.SocialMedia;

public class SocialMediaAction extends CommonUtil{
	private WebDriver driver = super.getDriver();
	private Actions action = new Actions(driver);
	private static SocialMedia sm = new SocialMedia();
	
	//data load
	public static Map<String,String> getDataLoad(){
		actionStartLogger(SocialMediaAction.class,"getDataLoad",0);
		Map<String,String> result = new HashMap<String, String>();
		result.put("customerNumber", sm.getCustomerNumber_5().getText());
		return result;
	}
	
	public static Map<String,String> getTextStatus(){
		actionStartLogger(SocialMediaAction.class,"getTextStatus",0);
		Map<String,String> result = new HashMap<String, String>();
		result.put("customerNumber", String.valueOf(sm.getCustomerNumberText().isEnabled()));
		result.put("account", String.valueOf(sm.getAccountText().isEnabled()));
		result.put("memo", String.valueOf(sm.getMemoText().isEnabled()));
		return result;
	}
	
	public static Map<String,String> getButtonStatus(){
		actionStartLogger(SocialMediaAction.class,"getButtonStatus",0);
		Map<String,String> result = new HashMap<String, String>();
		result.put("searchButton", String.valueOf(sm.getSearchButton().isEnabled()));
		result.put("addButton", String.valueOf(sm.getAddButton().isEnabled()));
		result.put("reset", String.valueOf(sm.getResetButton().isEnabled()));
		result.put("editButton", String.valueOf(sm.getEditButton().isEnabled()));
		result.put("deleteButton", String.valueOf(sm.getDeleteButton().isEnabled()));
		result.put("reportButton", String.valueOf(sm.getReportCardButton().isEnabled()));
		result.put("penButton", String.valueOf(sm.getPenGlobeButton().isEnabled()));
		return result;
	}
	
	// add new rules
	public static Map<String,String> getAddTextRules(){
		actionStartLogger(SocialMediaAction.class,"getAddSocialMediaRules",0);
		Map<String,String> result = new HashMap<String, String>();
		c(sm.getAddButton(),1);
		result.put("customerNumber", String.valueOf(sm.getAdCustomerNumberText().isEnabled()));
		result.put("account", String.valueOf(sm.getAdAccountText().isEnabled()));
		result.put("memo", String.valueOf(sm.getAdMemoText().isEnabled()));
		return result;
	}
	
	public static Map<String,String> getAddRequiredRules(){
		actionStartLogger(SocialMediaAction.class,"getAddRequiredRules",0);
		Map<String,String> result = new HashMap<String, String>();
		c(sm.getAdSaveButton(),1);
		w(1);
		result.put("customerNumber", sm.getAdCustomerNumberText().getAttribute("class"));
		result.put("account", sm.getAdAccountText().getAttribute("class"));
		result.put("socialMedia", sm.getAdSocialMediaClass().getAttribute("class"));
		c(sm.getAdCancelButton(),1);
		return result;
	}
	
	// add new
	public static void getAddSocialMedia(Map<String,String> map){
		actionStartLogger(SocialMediaAction.class,"getAddSocialMedia",0);
		c(sm.getAddButton(),1);
		s(sm.getAdCustomerNumberText(),map.get("customerNumber"),1);
		s(sm.getAdAccountText(),map.get("account"),1);
		c(sm.getAdSocialMediaButton(),1);
		c(sm.getKendoList(Integer.valueOf(map.get("socialMedia"))),1);
		s(sm.getAdMemoText(),map.get("memo"),1);
		c(sm.getAdSaveButton(),1);
	}
	
	// edit
	public static Map<String,String> getEditRules(Map<String,String> map){
		actionStartLogger(SocialMediaAction.class,"getEditRules",0);
		Map<String,String> result = new HashMap<String, String>();
		s(sm.getCustomerNumberText(),map.get("customer"),1);
		c(sm.getSearchButton(),1);
		w(2);
		c(sm.getEditButton_1(),1);
		result.put("customerNumber", sm.getAdCustomerNumberValue().getText());
		result.put("account", sm.getAdAccountText().getAttribute("value"));
		result.put("socialMedia", sm.getAdSocialMediaValue().getText());
		result.put("memo", sm.getAdMemoText().getAttribute("value"));
		c(sm.getAdCancelButton(),1);
		return result;
	}
	
	public static void getEditSocialMedia(Map<String,String> map){
		actionStartLogger(SocialMediaAction.class,"getEditSocialMedia",0);
		c(sm.getEditButton_1(),1);
		s(sm.getAdAccountText(),map.get("account"),1);
		c(sm.getAdSocialMediaButton(),1);
		c(sm.getKendoList(Integer.valueOf(map.get("socialMedia"))),1);
		s(sm.getAdMemoText(),map.get("memo"),1);
		c(sm.getAdSaveButton(),1);
		w(15);
	}
	
	// search
	public static Map<String,String> getSearchSocialMedia(Map<String,String> map){
		actionStartLogger(SocialMediaAction.class,"getSearchSocialMedia",0);
		Map<String,String> result = new HashMap<String, String>();
		s(sm.getCustomerNumberText(),map.get("customerNumber"),1);
		s(sm.getAccountText(),map.get("account"),1);
		s(sm.getMemoText(),map.get("memo"),1);
		c(sm.getSearchButton(),1);
		w(2);
		result.put("customer", sm.getCustomerNumber().getText());
		return result;
	}
	
	// delete
	public static void getDeleteSocialMedia(Map<String,String> map){
		actionStartLogger(SocialMediaAction.class,"getDeleteSocialMedia",0);
		s(sm.getCustomerNumberText(),map.get("customerNumber"),1);
		c(sm.getSearchButton(),1);
		w(2);
		c(sm.getDeleteButton(),1);
		c(sm.getDeleteCancelButton(),1);
		c(sm.getDeleteButton(),1);
		c(sm.getDeleteOkButton(),1);
		w(20);
	}
	
	// link to other
	public static Map<String,String> getLinkOtherPage(){
		actionStartLogger(SocialMediaAction.class,"getLinkOtherPage",0);
		Map<String,String> result = new HashMap<String, String>();
		c(sm.getResetButton(),1);
		c(sm.getSearchButton(),1);
		c(sm.getPenGlobeButton(),2);
		w(20);
		result.put("penUrl", getNewWindowUrl());
		result.put("customer", sm.getCustomerNumber_1().getText());
		c(sm.getCustomerNumber_1(),1);
		w(20);
		result.put("customerUrl", getNewWindowUrl());
		w(1);
		sm.getLastEditUser_1().click();
		c(sm.getReportCardButton(),1);
		w(20);
		result.put("reportUrl", getNewWindowUrl());
		w(1);
		return result;
	}
	
	
}
