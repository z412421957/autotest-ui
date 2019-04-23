package com.neso.action;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.neso.factory.CommonUtil;
import com.neso.pageobject.NETTermApplication;

public class NETTermApplicationAction extends CommonUtil{
	private WebDriver driver = super.getDriver();
	private Actions action = new Actions(driver);
	private static NETTermApplication ta = new NETTermApplication();
	
	// data load
	public static Map<String, String> getDataLoad(){
		actionStartLogger(NETTermApplicationAction.class,"getDataLoad",0);
		Map<String,String> result = new HashMap<String,String>();
		result.put("application", ta.getApplicationNumberWord().getText());
		return result;
	}
	
	public static Map<String, String> getTextLoad(){
		actionStartLogger(NETTermApplicationAction.class,"getTextRules",0);
		Map<String,String> result = new HashMap<String,String>();
		result.put("application", String.valueOf(ta.getApplicationNumberText().isEnabled()));
		result.put("merchant", String.valueOf(ta.getMerchantNumberText().isEnabled()));
		return result;
	}
	
	public static Map<String, String> getButtonLoad(){
		actionStartLogger(NETTermApplicationAction.class,"getButtonLoad",0);
		Map<String,String> result = new HashMap<String,String>();
		result.put("new", String.valueOf(ta.getNewButton().isEnabled()));
		result.put("submit", String.valueOf(ta.getSubmitButton().isEnabled()));
		result.put("approve", String.valueOf(ta.getApproveButton().isEnabled()));
		result.put("decline", String.valueOf(ta.getDeclineButton().isEnabled()));
		return result;
	}
	
	// add new
	public static Map<String, String> getAddNewRules(Map<String, String> map){
		actionStartLogger(NETTermApplicationAction.class,"getAddNewRules",0);
		Map<String,String> result = new HashMap<String,String>();
		s(ta.getMerchantNumberText(),map.get("merchant"),4);
		c(ta.getMerchantSearchButton(),1);
//		c(ta.getErrorOKButton(),2);
		w(10);
		c(ta.getChangeContactYesButton(),1);
		result.put("contact", String.valueOf(ta.getBillingFirstNameText().isEnabled()));
		c(ta.getChangeContactNoButton(),1);
		c(ta.getChangeMailYesButton(),1);
		result.put("mail", String.valueOf(ta.getMailAddressText().isEnabled()));
		c(ta.getChangeMailNoButton(),1);
		c(ta.getLimitButton_1(),1);
		result.put("limitAmount", ta.getLimitAmountText().getAttribute("readonly"));
		c(ta.getLimitButton_4(),1);
		return result;
	}
	
	public static void getAddNew(Map<String, String> map){
		actionStartLogger(NETTermApplicationAction.class,"getAddNew",0);
		Map<String,String> result = new HashMap<String,String>();
		s(ta.getLimitAmountText(),map.get("limitAmount"),1);
		s(ta.getBankNameText(),map.get("bankName"),1);
		s(ta.getBankAddressText(),map.get("bankAddress"),1);
		s(ta.getBankContactNameText(),map.get("contactName"),1);
		s(ta.getBankContactPhoneText(),map.get("contactPhone"),1);
		s(ta.getCityText(),map.get("city"),1);
		s(ta.getZipCodeText(),map.get("zipCode"),1);
		s(ta.getStateText(),map.get("state"),1);
		s(ta.getBankAccountTypeText(),map.get("accountType"),1);
		s(ta.getBankAccountText(),map.get("bankAccount"),1);
		s(ta.getCompanyNameText(),map.get("companyName"),1);
		s(ta.getContactAddressText(),map.get("emailAddress"),1);
		s(ta.getBusinessContactNameText(),map.get("bContactName"),1);
		s(ta.getBusinessContactPhoneText(),map.get("bContactPhone"),1);
		c(ta.getSubmitButton(),1);
		w(15);
	}
	
	// edit 
	public static void getEdit(Map<String ,String> map){
		actionStartLogger(NETTermApplicationAction.class,"getEdit",0);
		s(ta.getApplicationNumberText(),map.get("application"),4);
		c(ta.getApplicationSearchButton(),1);
		w(15);
		c(ta.getSubmitButton(),1);
		w(5);
		s(ta.getBankNameText(),map.get("bankName"),1);
		s(ta.getCompanyNameText(),map.get("companyName"),1);
		c(ta.getSubmitButton(),1);
		w(20);
	}
	
	// approve
	public static void getApprove(Map<String, String> map) {
		actionStartLogger(NETTermApplicationAction.class,"getApprove",0);
		s(ta.getApplicationNumberText(),map.get("application"),4);
		c(ta.getApplicationSearchButton(),1);
		w(20);
		c(ta.getApproveButton(),1);
		c(ta.getApproveCancelButton(),1);
//		s(ta.getApproveMemoText(),map.get("memo"),1);
//		c(ta.getApproveApproveButton(),1);
//		w(10);
	}
	
	// copy new
	public static void getCopyNew(Map<String, String> map) {
		actionStartLogger(NETTermApplicationAction.class,"getCopyNew",0);
		s(ta.getApplicationNumberText(),map.get("application"),4);
		c(ta.getApplicationSearchButton(),1);
		w(20);
		c(ta.getSubmitButton(),1);
		c(ta.getSubmitButton(),2);
		w(15);
	}
	
	// decline
	public static void getDecline(Map<String, String> map) {
		actionStartLogger(NETTermApplicationAction.class,"getDecline",0);
		s(ta.getApplicationNumberText(),map.get("application"),4);
		c(ta.getApplicationSearchButton(),1);
		w(20);
		c(ta.getDeclineButton(),1);
		s(ta.getApproveMemoText(),map.get("memo"),1);
		c(ta.getApproveApproveButton(),1);
		w(10);
	}
	
	// query data load
	public static Map<String, String> getQueryDataLoad() {
		actionStartLogger(NETTermApplicationAction.class,"getQueryDataLoad",0);
		Map<String, String> result = new HashMap<String, String>();
		result.put("merchant", String.valueOf(ta.getQMerchantNumberText().isEnabled()));
		result.put("status", ta.getQStatusValue().getText());
		result.put("dateButton", String.valueOf(ta.getQDateButton().isSelected()));
		result.put("search", String.valueOf(ta.getQSearchButton().isEnabled()));
		return result;
	}
	
	// query search
	public static Map<String, String> getQuerySearch(Map<String, String> map) {
		actionStartLogger(NETTermApplicationAction.class,"getQuerySearch",0);
		Map<String, String> result = new HashMap<String, String>();
		c(ta.getQSearchButton(),2);
		result.put("status", ta.getQResultStatus_3().getText());
		s(ta.getQMerchantNumberText(),map.get("merchant"),1);
		c(ta.getQStatusButton(),1);
		c(ta.getKendoList(Integer.valueOf(map.get("status"))),1);
		c(ta.getQSearchButton(),1);
		w(2);
		result.put("content", ta.getQSearchResultContent().getText());
		return result;
	}
	
	// query decline
	public static void getQueryDecline(Map<String, String> map) {
		actionStartLogger(NETTermApplicationAction.class,"getQueryDecline",0);
		s(ta.getQMerchantNumberText(),map.get("merchant"),1);
		c(ta.getQSearchButton(),1);
		c(ta.getQDeclineButton(),1);
		c(ta.getQDeclineOKButton(),1);
		w(20);
	}
	
}
