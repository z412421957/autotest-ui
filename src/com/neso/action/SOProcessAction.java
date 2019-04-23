package com.neso.action;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.neso.factory.CommonUtil;
import com.neso.pageobject.SOProcess;

public class SOProcessAction extends CommonUtil{
	private WebDriver driver = super.getDriver();
	private static SOProcess sp = new SOProcess();
	Actions action = new Actions(driver);
	
	
	// basic search
	public static Map<String, String> getLoad() {
		actionStartLogger(SOProcessAction.class,"getLoad",0);
		Map<String, String> result = new HashMap<String, String>();
		result.put("recentButton", String.valueOf(sp.getRecentButton().isSelected()));
		result.put("recent", sp.getRecentText().getAttribute("value"));
		result.put("yearButton", String.valueOf(sp.getYearButton().isSelected()));
		result.put("fromButton", String.valueOf(sp.getFromButton().isSelected()));
		result.put("dateValue", sp.getFromValue().getAttribute("value") + "~" + sp.getToValue().getAttribute("value"));
		result.put("dateValue2", sp.getDateFilter().getText());
		result.put("bu", sp.getBuText().getAttribute("value"));
		result.put("reset", String.valueOf(sp.getResetButton().isEnabled()));
		result.put("search", String.valueOf(sp.getSearchButton().isEnabled()));
		return result;
	}
	
	public static Map<String, String> getSONumber(Map<String, String> map) {
		actionStartLogger(SOProcessAction.class,"getSONumber",0);
		Map<String, String> result = new HashMap<String, String>();
		s(sp.getSoNumberText(), map.get("so1"),1);
		result.put("error1", sp.getSoNumberError().getText());
		s(sp.getSoNumberText(), map.get("so2"),1);
		result.put("error2", sp.getSoNumberError().getText());
		s(sp.getSoNumberText(), map.get("so3"),1);
		c(sp.getSearchButton(),1);
		w(1);
		result.put("error3", sp.getErrorMessage().getText());
		s(sp.getSoNumberText(), map.get("so4"),1);
		c(sp.getSearchButton(),1);
		w(3);
		result.put("error4", sp.getSrContentText().getText());
		s(sp.getSoNumberText(), map.get("so5"),1);
		c(sp.getSearchButton(),1);
		w(20);
		result.put("error5", sp.getYearValue().getAttribute("value"));
		s(sp.getYearValue(),"2018",1);
		return result; 
	}
	
	public static Map<String, String> getCustomerNumber(Map<String, String> map) {
		actionStartLogger(SOProcessAction.class,"getCustomerNumber",0);
		Map<String, String> result = new HashMap<String, String>();
		c(sp.getResetButton(),1);
		s(sp.getCustomerNumberText(), map.get("customer1"),1);
		result.put("error1", sp.getCustomerNumberError().getText());
		s(sp.getCustomerNumberText(), map.get("customer2"),1);
		result.put("error2", sp.getCustomerNumberError().getText());
		s(sp.getCustomerNumberText(), map.get("customer3"),1);
		c(sp.getSearchButton(),1);
		w(1);
		result.put("error3", sp.getErrorMessage().getText());
		s(sp.getCustomerNumberText(), map.get("customer4"),1);
		c(sp.getSearchButton(),1);
		w(10);
		result.put("error4", sp.getSrContentText().getText());
		s(sp.getCustomerNumberText(), map.get("customer5"),1);
		c(sp.getSearchButton(),1);
		w(15);
		result.put("error5", sp.getSrSONumber(1).getText());
		return result; 
	}
	
	public static Map<String, String> getPhone(Map<String, String> map) {
		actionStartLogger(SOProcessAction.class,"getPhone",0);
		Map<String, String> result = new HashMap<String, String>();
		c(sp.getResetButton(),1);
		s(sp.getPhoneNumberText(), map.get("phone1"),1);
		c(sp.getSearchButton(),1);
		w(1);
		result.put("error1", sp.getErrorMessage().getText());
		s(sp.getBuText(),map.get("bu"),1);
		s(sp.getPhoneNumberText(), map.get("phone1"),3);
		c(sp.getSearchButton(), 1);
		w(5);
		result.put("error2", sp.getSrContentText().getText());
		s(sp.getPhoneNumberText(),map.get("phone2"),1);
		c(sp.getSearchButton(),1);
		c(sp.getCancelButton(),5);
		s(sp.getPhoneNumberText(), map.get("phone3"),1);
		c(sp.getSearchButton(),1);
		c(sp.getSelectAllButton(),5);
		c(sp.getOKButton(),1);
		w(15);
		result.put("so1", sp.getSrSONumber(1).getText());
		s(sp.getPhoneNumberText(), map.get("phone4"),1);
		s(sp.getRecentText(), map.get("recent"),1);
		c(sp.getSearchButton(),1);
		w(15);
		result.put("so2", sp.getSrSONumber(1).getText());
		return result; 
	}
	
	public static Map<String, String> getRMANumber(Map<String, String> map) {
		actionStartLogger(SOProcessAction.class,"getRMANumber",0);
		Map<String, String> result = new HashMap<String, String>();
		c(sp.getResetButton(),1);
		s(sp.getRmaNumberText(), map.get("rma1"),1);
		result.put("error1", sp.getRmaNumberError().getText());
		s(sp.getRmaNumberText(), map.get("rma2"),1);
		result.put("error2", sp.getRmaNumberError().getText());
		s(sp.getRmaNumberText(), map.get("rma3"),1);
		c(sp.getSearchButton(),1);
		w(1);
		result.put("error3", sp.getErrorMessage().getText());
		s(sp.getRmaNumberText(), map.get("rma4"),1);
		c(sp.getSearchButton(),1);
		w(3);
		result.put("error4", sp.getSrContentText().getText());
		s(sp.getRmaNumberText(), map.get("rma5"),1);
		c(sp.getSearchButton(),1);
		w(15);
		result.put("so", sp.getSrSONumber(1).getText());
		return result; 
	}
	
	public static Map<String, String> getEmailAddress(Map<String, String> map) {
		actionStartLogger(SOProcessAction.class,"getEmailAddress",0);
		Map<String, String> result = new HashMap<String, String>();
		c(sp.getResetButton(),1);
		s(sp.getEmailAddressText(), map.get("email1"),1);
		result.put("error1", sp.getEmailAddressError().getText());
		s(sp.getEmailAddressText(), map.get("email2"),1);
		c(sp.getSearchButton(),1);
		w(1);
		result.put("error2", sp.getErrorMessage().getText());
		s(sp.getBuText(), map.get("bu"),1);
		s(sp.getEmailAddressText(), map.get("email3"), 3);
		c(sp.getSearchButton(),1);
		w(5);
		c(sp.getCancelButton(),1);
		c(sp.getSearchButton(),1);
		w(5);
		c(sp.getSelectAllButton(),1);
		c(sp.getOKButton(),1);
		w(40);
		result.put("so1", sp.getSrSONumber(1).getText());
		s(sp.getEmailAddressText(), map.get("email4"),1);
		c(sp.getSearchButton(),1);
		w(25);
		result.put("so2", sp.getSrSONumber(1).getText());
		return result;
	}
	
	public static Map<String, String> getInvoiceNumber(Map<String, String> map) {
		actionStartLogger(SOProcessAction.class,"getInvoiceNumber",0);
		Map<String, String> result = new HashMap<String, String>();
		c(sp.getResetButton(),1);
		s(sp.getInvoiceNumberText(), map.get("invoice1"),1);
		result.put("error1", sp.getInvoiceNumberError().getText());
		s(sp.getInvoiceNumberText(), map.get("invoice2"),1);
		result.put("error2", sp.getInvoiceNumberError().getText());
		s(sp.getInvoiceNumberText(), map.get("invoice3"),1);
		c(sp.getSearchButton(),1);
		w(1);
		result.put("error3", sp.getErrorMessage().getText());
		s(sp.getInvoiceNumberText(), map.get("invoice4"),1);
		c(sp.getSearchButton(),1);
		w(3);
		result.put("error4", sp.getSrContentText().getText());
		s(sp.getInvoiceNumberText(), map.get("invoice5"),1);
		c(sp.getSearchButton(),1);
		w(15);
		result.put("so", sp.getSrSONumber(1).getText());
		return result;
	}
	
	public static Map<String, String> getPreOrderNumber(Map<String, String> map) {
		actionStartLogger(SOProcessAction.class,"getPreOrderNumber",0);
		Map<String, String> result = new HashMap<String, String>();
		c(sp.getResetButton(),1);
		s(sp.getPreOrderNumberText(), map.get("order1"),1);
		result.put("error1", sp.getPreOrderNumberError().getText());
		s(sp.getPreOrderNumberText(), map.get("order2"),1);
		result.put("error2", sp.getPreOrderNumberError().getText());
		s(sp.getPreOrderNumberText(), map.get("order3"),1);
		c(sp.getSearchButton(),1);
		w(1);
		result.put("error3", sp.getErrorMessage().getText());
		s(sp.getPreOrderNumberText(), map.get("order4"),1);
		c(sp.getSearchButton(),1);
		w(3);
		result.put("error4", sp.getSrContentText().getText());
		s(sp.getPreOrderNumberText(), map.get("order5"),1);
		c(sp.getSearchButton(),1);
		w(15);
		result.put("so", sp.getSrSONumberOnly().getText());
		return result;
	}
	
	public static Map<String, String> getCCNumber(Map<String, String> map) {
		actionStartLogger(SOProcessAction.class,"getCCNumber",0);
		Map<String, String> result = new HashMap<String, String>();
		c(sp.getResetButton(),1);
		s(sp.getCcNumberText(), map.get("number"),1);
		c(sp.getSearchButton(),1);
		w(10);
		c(sp.getCcCancelButton(),1);
		c(sp.getSearchButton(),1);
		w(15);
		c(sp.getCcAllButton(),1);
		c(sp.getCcOKButton(),2);
		w(25);
		result.put("so", sp.getSrSONumber(1).getText());
		return result;
	}
	
	public static Map<String, String> getTrackingNumber(Map<String, String> map) {
		actionStartLogger(SOProcessAction.class,"getTrackingNumber",0);
		Map<String, String> result = new HashMap<String, String>();
		c(sp.getResetButton(),1);
		s(sp.getTrackingNumberText(), map.get("number"),1);
		c(sp.getSearchButton(),1);
		c(sp.getTrackingCancelButton(),1);
		c(sp.getSearchButton(),1);
		w(12);
		c(sp.getTrackingSelectButton_1(),1);
		c(sp.getTrackingOKButton(),1);
		w(20);
		result.put("so", sp.getSrSONumber(1).getText());
		return result;
	}
	
	public Map<String, String> getPriority(Map<String, String> map) {
		actionStartLogger(SOProcessAction.class,"getPriority",0);
		Map<String, String> result = new HashMap<String, String>();
		c(sp.getResetButton(),1);
		s(sp.getSoNumberText(), map.get("so"),1);
		s(sp.getRmaNumberText(), map.get("rma"),1);
		s(sp.getPreOrderNumberText(), map.get("preOrder"),1);
		s(sp.getCustomerNumberText(), map.get("customer"),1);
		s(sp.getEmailAddressText(), map.get("email"),1);
		s(sp.getCcNumberText(), map.get("cc"),1);
		s(sp.getPhoneNumberText(), map.get("phone"),1);
		s(sp.getInvoiceNumberText(), map.get("invoice"),1);
		s(sp.getTrackingNumberText(), map.get("tracking"),1);
		c(sp.getAdvButton(),1);
		s(sp.getEBayNumberText(), map.get("eBay"),1);
		s(sp.getMerchantNumberText(), map.get("merchant"),1);
		c(sp.getSearchButton(),1);
		w(10);
		result.put("customer1", sp.getSrCustomerNumber(1).getText());
		c(sp.getBasicButton(),1);
		sp.getSoNumberText().click();
		action.sendKeys(Keys.CONTROL+"a").perform();
		action.sendKeys(Keys.DELETE).perform();
		c(sp.getSearchButton(),1);
		w(10);
		result.put("customer2", sp.getSrCustomerNumber(1).getText());
		sp.getInvoiceNumberText().click();
		w(1);
		action.sendKeys(Keys.CONTROL+"a").perform();
		action.sendKeys(Keys.DELETE).perform();
		c(sp.getSearchButton(),1);
		w(10);
		result.put("customer3", sp.getSrCustomerNumber(1).getText());
		sp.getRmaNumberText().click();
		action.sendKeys(Keys.CONTROL+"a").perform();
		action.sendKeys(Keys.DELETE).perform();
		c(sp.getSearchButton(),1);
		w(10);
		c(sp.getTrackingSelectButton_1(),1);
		result.put("customer4", sp.getSelectCustomerNumber().getText());
		c(sp.getTrackingOKButton(),1);
		w(8);
		result.put("customer5", sp.getSrCustomerNumber(1).getText());
		sp.getSoNumberText().click();
		action.sendKeys(Keys.CONTROL+"a").perform();
		action.sendKeys(Keys.DELETE).perform();
		sp.getTrackingNumberText().click();
		action.sendKeys(Keys.CONTROL+"a").perform();
		action.sendKeys(Keys.DELETE).perform();
		c(sp.getSearchButton(),1);
		w(8);
		result.put("customer6",  sp.getSrCustomerNumberOnly().getText());
		sp.getPreOrderNumberText().click();
		action.sendKeys(Keys.CONTROL+"a").perform();
		action.sendKeys(Keys.DELETE).perform();
		c(sp.getSearchButton(),1);
		w(8);
		result.put("customer7", sp.getSrCustomerNumber(1).getText());
		sp.getCustomerNumberText().click();
		action.sendKeys(Keys.CONTROL+"a").perform();
		action.sendKeys(Keys.DELETE).perform();
		c(sp.getSearchButton(),1);
		w(8);
		result.put("customer8",  sp.getSrCustomerNumberOnly().getText());
		c(sp.getAdvButton(), 1);
		sp.getEBayNumberText().click();
		action.sendKeys(Keys.CONTROL+"a").perform();
		action.sendKeys(Keys.DELETE).perform();
		c(sp.getBasicButton(),1);
		s(sp.getBuText(), map.get("bu"),1);
		c(sp.getSearchButton(),3);
		w(8);
		result.put("customer9", sp.getSrCustomerNumber(1).getText());
		sp.getCustomerNumberText().click();
		action.sendKeys(Keys.CONTROL+"a").perform();
		action.sendKeys(Keys.DELETE).perform();
		sp.getEmailAddressText().click();
		action.sendKeys(Keys.CONTROL+"a").perform();
		action.sendKeys(Keys.DELETE).perform();
		s(sp.getBuText(), map.get("bu2"),1);
		c(sp.getSearchButton(),3);
		c(sp.getSelectAllButton(),4);
		c(sp.getOKButton(),1);
		w(5);
		
		
		sp.getPhoneNumberText().click();
		action.sendKeys(Keys.CONTROL+"a").perform();
		action.sendKeys(Keys.DELETE).perform();
		s(sp.getBuText(), map.get("bu3"),1);
		c(sp.getSearchButton(),1);
		c(sp.getCCSelectButton_1(),4);
		result.put("customer10", sp.getCcCustomerNumber().getText());
		c(sp.getCcOKButton(),1);
		w(10);
		result.put("customer11", sp.getSrCustomerNumber(1).getText());
		sp.getCcNumberText().click();
		action.sendKeys(Keys.CONTROL+"a").perform();
		action.sendKeys(Keys.DELETE).perform();
		sp.getCustomerNumberText().click();
		action.sendKeys(Keys.CONTROL+"a").perform();
		action.sendKeys(Keys.DELETE).perform();
		c(sp.getSearchButton(),1);
		w(6);
		result.put("customer12", sp.getSrCustomerNumber(1).getText());
		return result;
	}
	
	
	
	
	
	// advance search
	public static Map<String, String> getCreateUser(Map<String, String> map) {
		actionStartLogger(SOProcessAction.class,"getCreateUser",0);
		Map<String, String> result = new HashMap<String, String>();
		c(sp.getResetButton(),1);
		c(sp.getBasicButton(),1);
		s(sp.getCustomerNumberText(),map.get("customer"),1);
		c(sp.getYearButton(),1);
		c(sp.getAdvButton(),1);
		s(sp.getCreateUserText(), map.get("createUser"),1);
		c(sp.getSearchButton(),1);
		w(10);
		result.put("soNumber", sp.getSrSONumber(1).getText());
		c(sp.getResetButton(),1);
		return result;
	}
	
	public static Map<String, String> getContactPers(Map<String, String> map) {
		actionStartLogger(SOProcessAction.class,"getContactPers",0);
		Map<String, String> result = new HashMap<String, String>();
		c(sp.getBasicButton(),1);
		s(sp.getSoNumberText(), map.get("so"),1);
		c(sp.getYearButton(),1);
		c(sp.getAdvButton(),1);
		s(sp.getContactPersText(), map.get("contact"),1);
		c(sp.getSearchButton(),1);
		w(10);
		result.put("customer", sp.getSrCustomerNumber(1).getText());
		c(sp.getResetButton(),1);
		return result;
	}
	
	public static Map<String, String> getShoppingCartNumber(Map<String, String> map) {
		actionStartLogger(SOProcessAction.class,"getShoppingCartNumber",0);
		Map<String, String> result = new HashMap<String, String>();
		c(sp.getBasicButton(),1);
		s(sp.getInvoiceNumberText(), map.get("invoice"),1);
		c(sp.getYearButton(),1);
		c(sp.getAdvButton(),1);
		s(sp.getShoppingCartNumberText(), map.get("shoppingCart"),1);
		c(sp.getSearchButton(),1);
		w(10);
		result.put("so", sp.getSrSONumberOnly().getText());
		c(sp.getResetButton(),1);
		return result;
	}
	
	public static Map<String, String> getItemNumber(Map<String, String> map) {
		actionStartLogger(SOProcessAction.class,"getShoppingCartNumber",0);
		Map<String, String> result = new HashMap<String, String>();
		c(sp.getBasicButton(),1);
		s(sp.getRmaNumberText(),map.get("rma"),1);
		c(sp.getYearButton(),1);
		c(sp.getAdvButton(),1);
		s(sp.getItemNumberText(),map.get("item"),1);
		c(sp.getSearchButton(),1);
		w(10);
		result.put("so", sp.getSrSONumberOnly().getText());
		c(sp.getResetButton(),1);
		return result;
	}
	
	public static Map<String, String> getItemDesc(Map<String, String> map) {
		actionStartLogger(SOProcessAction.class,"getItemDesc",0);
		Map<String, String> result = new HashMap<String, String>();
		c(sp.getBasicButton(),1);
		s(sp.getPreOrderNumberText(),map.get("order"),1);
		c(sp.getYearButton(),1);
		c(sp.getAdvButton(),1);
		s(sp.getItemDescText(),map.get("desc"),1);
		c(sp.getSearchButton(),1);
		w(10);
		result.put("so", sp.getSrSONumberOnly().getText());
		c(sp.getResetButton(),1);
		return result;
	}
	
	public static Map<String, String> getMerchantNumber(Map<String, String> map) {
		actionStartLogger(SOProcessAction.class,"getMerchantNumber",0);
		Map<String, String> result = new HashMap<String, String>();
		c(sp.getAdvButton(),1);
		s(sp.getMerchantNumberText(), map.get("merchant1"),1);
		result.put("error1", sp.getMerchantError().getText());
		s(sp.getMerchantNumberText(), map.get("merchant2"),1);
		result.put("error2", sp.getMerchantError().getText());
		s(sp.getMerchantNumberText(), map.get("merchant3"),1);
		c(sp.getSearchButton(),1);
		w(1);
		result.put("error3", sp.getErrorMessage().getText());
		s(sp.getMerchantNumberText(), map.get("merchant4"),1);
		c(sp.getSearchButton(),1);
		w(3);
		result.put("error4", sp.getSrContentText().getText());
		s(sp.getMerchantNumberText(), map.get("merchant5"),1);
		c(sp.getBasicButton(),1);
		c(sp.getYearButton(),1);
		c(sp.getSearchButton(),1);
		w(10);
		result.put("customer", sp.getSrCustomerNumber(1).getText());
		c(sp.getResetButton(),1);
		return result;
	}
	
	public static Map<String, String> getEBayNumber(Map<String, String> map) {
		actionStartLogger(SOProcessAction.class,"getEBayNumber",0);
		Map<String, String> result = new HashMap<String, String>();
		c(sp.getBasicButton(),1);
		c(sp.getYearButton(),1);
		c(sp.getAdvButton(),1);
		s(sp.getEBayNumberText(), map.get("eBay"),1);
		c(sp.getSearchButton(),1);
		w(12);
		result.put("so", sp.getSrSONumberOnly().getText());
		c(sp.getResetButton(),1);
		return result;
	}
	
	public static Map<String, String> getCustomerPONumber(Map<String, String> map) {
		actionStartLogger(SOProcessAction.class,"getCustomerPONumber",0);
		Map<String, String> result = new HashMap<String, String>();
		c(sp.getBasicButton(),1);
		c(sp.getYearButton(),1);
		c(sp.getAdvButton(),1);
		s(sp.getCustomerPONumberText(),map.get("customer"),1);
		c(sp.getSearchButton(),1);
		w(15);
		result.put("so", sp.getSrSONumberOnly().getText());
		c(sp.getResetButton(),1);
		return result;
	}
	
	public static Map<String, String> getStatus(Map<String, String> map) {
		actionStartLogger(SOProcessAction.class,"getStatus",0);
		Map<String, String> result = new HashMap<String, String>();
		c(sp.getBasicButton(),1);
		c(sp.getRecentButton(),1);
		s(sp.getRecentText(), map.get("recent"),2);
		s(sp.getBuText(), map.get("bu"),1);
		c(sp.getAdvButton(),1);
		s(sp.getStatusText(),map.get("status"),1);
		c(sp.getSearchButton(),1);
		w(40);
		result.put("so", sp.getSrSONumber(1).getText());
		c(sp.getResetButton(),1);
		return result;
	}
	
	public static Map<String, String> getPayTermShipping(Map<String, String> map) {
		actionStartLogger(SOProcessAction.class,"getPayTermShipping",0);
		Map<String, String> result = new HashMap<String, String>();
		c(sp.getBasicButton(),1);
		s(sp.getRecentText(), map.get("recent"),1);
		s(sp.getBuText(), map.get("bu"),1);
		c(sp.getAdvButton(),3);
		w(3);
		sp.getPayTermButton().click();
		c(sp.getSelectButtonValue(map.get("payTerm")),1);
		w(1);
		sp.getShippingButton().click();
		c(sp.getSelectButtonValue(map.get("shipping")),1);
		c(sp.getSearchButton(),1);
		w(10);
		result.put("so", sp.getSrSONumber(1).getText());
		c(sp.getResetButton(),1);
		return result;
	}
	
}
