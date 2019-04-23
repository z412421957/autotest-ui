package com.neso.action;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.neso.factory.CommonUtil;
import com.neso.pageobject.MerchantBalance;

public class MerchantBalanceAction extends CommonUtil{
	private WebDriver driver = super.getDriver();
	private Actions action = new Actions(driver);
	private static MerchantBalance mb = new MerchantBalance();
	
	// load
	public static Map<String, String> getLoad() {
		actionStartLogger(MerchantBalanceAction.class,"getLoad",0);
		Map<String, String> result = new HashMap<String, String>();
		w(4);
		result.put("invoice", mb.getInvoiceDateBox().getAttribute("class"));
		result.put("balance", mb.getBalanceContent().getText());
		result.put("invoiceList", mb.getInvoiceListContent().getText());
		return result;
	}
	
	// search
	public static Map<String, String> getSearchMerchantID(Map<String, String> map) {
		actionStartLogger(MerchantBalanceAction.class,"getSearchMerchantID",0);
		Map<String, String> result = new HashMap<String, String>();
		c(mb.getMerchantSearchButton(),1);
		result.put("requied", mb.getMerchantNumberText().getAttribute("class"));
		s(mb.getMerchantNumberText(), map.get("merchant"),1);
		result.put("max", mb.getMerchantNumberText().getAttribute("class"));
		s(mb.getMerchantNumberText(), map.get("merchant2"),1);
		c(mb.getMerchantSearchButton(),1);
		s(mb.getMerchantNumberText(), map.get("merchant3"),1);
		c(mb.getMerchantSearchButton(),1);
		w(10);
		result.put("name", mb.getMerchantName().getText());
		result.put("contact", mb.getContactEmail().getText());
		return result;
	}
	
	public static Map<String, String> getSearchInvoiceDate(Map<String, String> map) {
		actionStartLogger(MerchantBalanceAction.class,"getSearchInvoiceDate",0);
		Map<String, String> result = new HashMap<String, String>();
		s(mb.getMerchantNumberText(), map.get("merchant"),1);
		c(mb.getInvoiceDateBoxButton(),1);
		c(mb.getSearchButton(),1);
		w(10);
		result.put("name", mb.getMerchantName().getText());
		c(mb.getMerchantSearchButton(),1);
		w(10);
		result.put("name2", mb.getMerchantName().getText());
		c(mb.getResetButton(),1);
		result.put("merchant", mb.getMerchantNumberText().getAttribute("value"));
		return result;
	}
	
	public static Map<String, String> getSearchBu(Map<String, String> map) {
		actionStartLogger(MerchantBalanceAction.class,"getSearchBu",0);
		Map<String, String> result = new HashMap<String, String>();
		s(mb.getMerchantNumberText(), map.get("merchant"),1);
		c(mb.getInvoiceDateBox(),1);
		c(mb.getBuButton(),1);
		c(mb.getKendoList("4"),1);
		c(mb.getMerchantSearchButton(),1);
		w(10);
		result.put("name", mb.getMerchantName().getText());
		c(mb.getResetButton(),1);
		result.put("bu", mb.getBuValue().getText());
		return result;
	}
	
	public static Map<String, String> getSearchDiscrepancyOnly(Map<String, String> map) {
		actionStartLogger(MerchantBalanceAction.class,"getSearchDiscrepancyOnly",0);
		Map<String, String> result = new HashMap<String, String>();
		s(mb.getMerchantNumberText(), map.get("merchant"),1);
		c(mb.getDiscrepancyOnlyBox(),1);
		c(mb.getMerchantSearchButton(),1);
		w(10);
		result.put("name", mb.getMerchantName().getText());
		return result;
	}
	
	// mail to customer
	public static Map<String, String> getMailToCustomerRules(Map<String, String> map) {
		actionStartLogger(MerchantBalanceAction.class,"getMailToCustomerRules",0);
		Map<String, String> result = new HashMap<String, String>();
		c(mb.getMailToCustomerButton(),1);
		result.put("error",mb.getErrorMessage().getText());
		c(mb.getErrorOKButton(),1);
		s(mb.getMerchantNumberText(), map.get("merchant"),1);
		c(mb.getMerchantSearchButton(),1);
		w(10);
		c(mb.getMailToCustomerButton(),1);
		result.put("box", String.valueOf(mb.getMailCustomersBox("[1]").isSelected()));
		result.put("type", mb.getMailCustomersType("[1]").getText());
		c(mb.getMailCancelButton(),1);
		return result;
	}
	
	public Map<String, String> getMailToCustomer(Map<String, String> map) {
		actionStartLogger(MerchantBalanceAction.class,"getMailToCustomer",0);
		Map<String, String> result = new HashMap<String, String>();
		c(mb.getMailToCustomerButton(),1);
		c(mb.getMailCustomersBox("[1]"),1);
		s(mb.getMailTemplateText(),map.get("template"),1);
		w(1);
		action.sendKeys(Keys.ENTER).build().perform();
		c(mb.getMailOKButton(),2);
		result.put("error", mb.getErrorMessage().getText());
		c(mb.getErrorOKButton(),1);
		c(mb.getMailCustomersBox("[1]"),1);
		c(mb.getMailOKButton(),1);
		w(5);
		c(mb.getCompleteExitButton(),1);
		c(mb.getMailCancelButton(),1);
		return result;
	}
	
	// late pay notification
	public static Map<String, String> getLatePayNotification(Map<String, String> map) {
		actionStartLogger(MerchantBalanceAction.class,"getLatePayNotification",0);
		Map<String, String> result = new HashMap<String, String>();
		c(mb.getLatePayNotificationButton(),1);
		result.put("error", mb.getErrorMessage().getText());
		c(mb.getErrorOKButton(),1);
		s(mb.getMerchantNumberText(), map.get("merchant"),1);
		c(mb.getMerchantSearchButton(),1);
		w(10);
		s(mb.getInvoiceInvoiceText(),map.get("invoice"),1);
		w(3);
		mb.getInvoiceListDiv("").click();
		c(mb.getLatePayNotificationButton(),2);
		result.put("error2", mb.getErrorMessage().getText());
		c(mb.getErrorOKButton(),1);
		return result;
	}
	
	// note to PG
	public static Map<String, String> getNoteToPG(Map<String, String> map) {
		actionStartLogger(MerchantBalanceAction.class,"getNoteToPG",0);
		Map<String, String> result = new HashMap<String, String>();
		c(mb.getNoteToPandgButton(),1);
		result.put("error", mb.getErrorMessage().getText());
		c(mb.getErrorOKButton(),1);
		s(mb.getMerchantNumberText(), map.get("merchant"),1);
		c(mb.getMerchantSearchButton(),1);
		w(8);
		c(mb.getNoteToPandgButton(),1);
		w(5);
		result.put("error2", mb.getErrorMessage().getText());
		c(mb.getErrorOKButton(),1);
//		result.put("box1", String.valueOf(mb.getNoteActiveBox().isSelected()));
//		result.put("box2", String.valueOf(mb.getNoteDelinqBox().isSelected()));
//		result.put("type", mb.getNoteCustomerType("[1]").getText());
//		c(mb.getNoteOKButton(),1);
//		w(1);
//		result.put("error2", mb.getErrorMessage().getText());
//		c(mb.getNoteActiveBox(),1);
//		s(mb.getNoteNoteText(), map.get("note"),1);
//		c(mb.getNoteOKButton(),1);
		return result;
	}
	
}
