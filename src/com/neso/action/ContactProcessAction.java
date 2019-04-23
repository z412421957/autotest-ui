package com.neso.action;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.neso.factory.CommonUtil;
import com.neso.pageobject.ContactProcess;

public class ContactProcessAction extends CommonUtil{

	private WebDriver driver = super.getDriver();
	private static ContactProcess cp = new ContactProcess();
	
	// load
	public static Map<String, String> getLoad() {
		actionStartLogger(ContactProcessAction.class,"getLoad",0);
		Map<String, String> result = new HashMap<String, String>();
		w(4);
		result.put("reward", cp.getRewardTypeValue().getText());
		result.put("opt", cp.getOptInForEmailValue().getText());
		result.put("customer", cp.getCustomerStatusValue().getText());
		result.put("acct", cp.getAcctPayableContactValue().getText());
		result.put("join", cp.getJoinToOneMerchantButton().getAttribute("class"));
		result.put("delete", cp.getDeleteButton().getAttribute("class"));
		result.put("merchant", cp.getMerchantDetailButton().getAttribute("class"));
		result.put("sales", cp.getSalesOpportunityButton().getAttribute("class"));
		result.put("contact", cp.getContactNoteButton().getAttribute("class"));
		result.put("pen", cp.getPenGlobeButton().getAttribute("class"));
		return result;
	}
	
	// add new
	public static Map<String, String> getAddNewLoad() {
		actionStartLogger(ContactProcessAction.class,"getAddNewLoad",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cp.getAddNewButton(),1);
		w(4);
		result.put("merchantBox", cp.getAnMerchantIDBox().getAttribute("disabled"));
		result.put("customerBox", cp.getAnCustomerBox().getAttribute("disabled"));
		result.put("acctBox", cp.getAnAcctPayableBox().getAttribute("disabled"));
		result.put("optBox", cp.getAnOptInBox().getAttribute("disabled"));
		result.put("merchantIDText", cp.getAnMerchantIDText().getAttribute("class"));
		result.put("customerNumberText", cp.getAnCustomerNumberText().getAttribute("class"));
		result.put("save", cp.getAnSaveButton().getAttribute("class"));
		c(cp.getAnCancelButton(),1);
		return result;
	}
	
	public static Map<String, String> getAddNewRules(Map<String, String> map) {
		actionStartLogger(ContactProcessAction.class,"getAddNewRules",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cp.getAddNewButton(),1);
		w(4);
		c(cp.getAnMerchantIDBox(),1);
		result.put("merchantName", cp.getAnMerchantNameText().getAttribute("class"));
		s(cp.getAnMerchantIDText(),map.get("merchantID"),1);
		c(cp.getAnMerchantIDButton(),1);
		w(5);
		result.put("merchantName1", cp.getAnMerchantNameText().getAttribute("value"));
		s(cp.getAnMerchantIDText(), map.get("merchantID2"),1);
		c(cp.getAnMerchantIDButton(),1);
		w(5);
		result.put("merchantName2", cp.getAnMerchantNameText().getAttribute("value"));
		c(cp.getAnMerchantIDBox(),1);
		result.put("merchantName3", cp.getAnMerchantNameText().getAttribute("value"));
		result.put("merchantText", cp.getAnMerchantNameText().getAttribute("class"));
		c(cp.getAnCancelButton(),1);
		return result;
	}
	
	public static void getAddNew(Map<String, String> map) {
		actionStartLogger(ContactProcessAction.class,"getAddNew",0);
		c(cp.getAddNewButton(),1);
		w(4);
		s(cp.getAnMerchantNameText(), map.get("name"),1);
		c(cp.getAnMerchantNameButton(),1);
		w(5);
		cp.getAnMerchantQueryDiv().click();
		c(cp.getAnMerchantQuerySelectButton(),1);
		s(cp.getAnCustomerNameText(), map.get("name2"),1);
		s(cp.getAnWorkPhoneText(), map.get("phone"),1);
		c(cp.getAnAcctPayableBox(),1);
		c(cp.getAnOptInBox(),1);
		c(cp.getAnSaveButton(),1);
		w(20);
	}
	
	// search
	public static Map<String, String> getSearch(Map<String, String> map) {
		actionStartLogger(ContactProcessAction.class,"getSearch",0);
		Map<String, String> result = new HashMap<String, String>();
		s(cp.getMerchantNameText(), map.get("merchantName"),1);
		s(cp.getMerchantIDText(), map.get("merchantID"),1);
		c(cp.getRewardTypeButton(),1);
		c(cp.getKendoList(map.get("rewardType")),1);
//		c(cp.getOptInForEmailButton(),1);
//		c(cp.getKendoList(map.get("opt")),1);
		c(cp.getCustomerStatusButton(),1);
		c(cp.getKendoList(map.get("customerStatus")),1);
		c(cp.getAcctPayableContactButton(),1);
		c(cp.getKendoList(map.get("acct")),1);
		s(cp.getCustomerNameText(),map.get("customerName"),1);
		c(cp.getSearchButton(),1);
		w(5);
		result.put("merchantID", cp.getSrMerchantIDValue().getText());
		return result;
	}
	
	// edit
	public static Map<String, String> getEdit(Map<String, String> map) {
		actionStartLogger(ContactProcessAction.class,"getEdit",0);
		Map<String, String> result = new HashMap<String, String>();
		result.put("id", cp.getSrContactID().getText());
		s(cp.getCustomerNameText(), map.get("customerName"),1);
		c(cp.getSrEditButton(), 1);
		w(4);
		s(cp.getAnCustomerNameText(), map.get("customerName"),1);
		s(cp.getAnWorkPhoneText(), map.get("workPhone"),1);
		c(cp.getAnSaveButton(),1);
		w(20);
		c(cp.getSearchButton(),1);
		w(3);
		return result;
	}
	
	// link to current
	public static Map<String, String> getLinkToCurrent() {
		actionStartLogger(ContactProcessAction.class,"getLinkToCurrent",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cp.getSrMerchantButton(),1);
		w(5);
		result.put("id", cp.getSrCurrentID().getAttribute("value"));
		c(cp.getSrCurrentCancelButton(),1);
		w(2);
		return result;
	}
	
	// contact note
	public static void getContactNote(Map<String, String> map) {
		actionStartLogger(ContactProcessAction.class,"getContactNote",0);
		cp.getSrDiv().click();
		c(cp.getContactNoteButton(),1);
		w(5);
		s(cp.getCnNoteText(), map.get("customerName"),1);
		c(cp.getCnSaveButton(),1);
		w(3);
		c(cp.getCnCloseButton(),1);
	}
	
	// delete
	public static void getDelete(Map<String, String> map) {
		actionStartLogger(ContactProcessAction.class,"getDelete",0);
		c(cp.getResetButton(),1);
		s(cp.getContactIDText(), map.get("id"),1);
		c(cp.getSearchButton(),1);
		w(5);
		c(cp.getSrDivBox(),1);
		c(cp.getDeleteButton(),1);
		c(cp.getMessageOKButton(),1);
		w(3);
	}
	
}
