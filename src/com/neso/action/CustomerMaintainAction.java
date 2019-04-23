package com.neso.action;

import java.util.HashMap;
import java.util.Map;

import com.neso.factory.CommonUtil;
import com.neso.pageobject.CustomerMaintain;

public class CustomerMaintainAction extends CommonUtil{
	private static CustomerMaintain cm = new CustomerMaintain();
	
	// page load
	public static Map<String, String> getPageLoad() {
		actionStartLogger(CustomerMaintainAction.class,"getPageLoad",0);
		Map<String,String> result = new HashMap<String,String>();
		result.put("customer", String.valueOf(cm.getCustomerNumberText().isEnabled()));
		result.put("type", String.valueOf(cm.getCustomerType().getAttribute("readonly")));
		result.put("new", String.valueOf(cm.getCreateNewButton().isEnabled()));
		result.put("edit", String.valueOf(cm.getEditButton().isEnabled()));
		return result;
	}
	
	// create new rules
	public static Map<String, String> getCreateNewRules() {
		actionStartLogger(CustomerMaintainAction.class,"getCreateNewRules",0);
		Map<String,String> result = new HashMap<String,String>();
		c(cm.getCreateNewButton(),1);
		w(2);
		result.put("customer", String.valueOf(cm.getCustomerNumberText().getAttribute("readonly")));
		result.put("new", String.valueOf(cm.getCreateNewButton().isEnabled()));
		result.put("save", String.valueOf(cm.getSaveButton().isEnabled()));
		result.put("cancel", String.valueOf(cm.getCancelButton().isEnabled()));
		result.put("emailBox", String.valueOf(cm.getOtherAllowEmailBox().isSelected()));
		c(cm.getMemoCustomerButton(),1);
		c(cm.getCancelButton(),1);
		w(2);
		result.put("new2", String.valueOf(cm.getCreateNewButton().isEnabled()));
		return result;
	}
	
	// create new USA
	public static Map<String, String> getCreateNewUSA(Map<String, String> map) {
		actionStartLogger(CustomerMaintainAction.class,"getCreateNewUSA",0);
		Map<String,String> result = new HashMap<String,String>();
		c(cm.getCreateNewButton(),1);
		s(cm.getCustomerNameText1(),map.get("cName1"),3);
		s(cm.getCustomerNameText3(),map.get("cName3"),1);
		s(cm.getCustomerLoginNameText(),map.get("cLoginName"),1);
		s(cm.getCustomerPasswordText(),map.get("cPassword"),1);
		s(cm.getBillingAddressText(),map.get("bAddress"),1);
		s(cm.getBillingCityText(),map.get("bCity"),1);
		c(cm.getBillingState(), 1);
		c(cm.getKendoList(Integer.valueOf(map.get("bState"))),1);
		s(cm.getBillingBiPhoneText(),map.get("bBiPhone"),1);
		s(cm.getBillingZipText(),map.get("bZip"),1);
		s(cm.getShippingNameText1(),map.get("sName1"),1);
		s(cm.getShippingNameText3(),map.get("sName3"),1);
		s(cm.getShippingAddressText(),map.get("sAddress"),1);
		s(cm.getShippingCityText(),map.get("sCity"),1);
		c(cm.getShippingState(),1);
		c(cm.getKendoList(Integer.valueOf(map.get("sState"))),1);
		s(cm.getShippingPhoneText(),map.get("sPhone"),1);
		s(cm.getShippingZipText(),map.get("sZip"),1);
		c(cm.getOtherTerm(),1);
		c(cm.getKendoList(Integer.valueOf(map.get("oTerm"))),1);
		s(cm.getOtherCardText1(),map.get("oCard1"),1);
		s(cm.getOtherCardText2(),map.get("oCard2"),1);
		s(cm.getOtherCardText3(),map.get("oCard3"),1);
		s(cm.getOtherCardText4(),map.get("oCard4"),1);
		s(cm.getOtherDateText(),map.get("oDate"),1);
		s(cm.getOtherBankText(),map.get("oBank"),1);
		s(cm.getOtherEmailText(),map.get("oEmail"),1);
		c(cm.getSaveButton(),1);
		c(cm.getWarningOKButton(),1);
		w(40);
		result.put("customer", cm.getCustomerNumberText().getAttribute("value"));
		return result;
	}
	
	// create new CHN
	public static Map<String, String> getCreateNewCHN(Map<String, String> map) {
		actionStartLogger(CustomerMaintainAction.class,"getCreateNewCHN",0);
		Map<String,String> result = new HashMap<String,String>();
		c(cm.getCreateNewButton(),1);
		c(cm.getBillingCountry(),1);
		c(cm.getKendoList(Integer.valueOf(map.get("bCountry"))),1);
		c(cm.getShippingCountry(),3);
		c(cm.getKendoList(Integer.valueOf(map.get("sCountry"))),1);
		w(4);
		s(cm.getCustomerNameText(),map.get("cName"),3);
		s(cm.getCustomerLoginNameText(),map.get("cLoginName"),1);
		s(cm.getCustomerPasswordText(),map.get("cPassword"),1);
		c(cm.getShippingProvince(),1);
		c(cm.getKendoList(Integer.valueOf(map.get("sProvince"))),1);
		w(4);
		s(cm.getShippingAddressTextCHN(),map.get("sAddress"),1);
		s(cm.getShippingNameText(),map.get("sName"),1);
		s(cm.getShippingPhoneTextCHN(),map.get("sPhone"),1);
		s(cm.getOtherEmailText(),map.get("oEmail"),1);
		c(cm.getSaveButton(),1);
		w(40);
		result.put("customer", cm.getCustomerNumberText().getAttribute("value"));
		return result;
	}
	
	// create new Inl
	public static Map<String, String> getCreateNewInl(Map<String, String> map) {
		actionStartLogger(CustomerMaintainAction.class,"getCreateNewInl",0);
		Map<String,String> result = new HashMap<String,String>();
		c(cm.getCreateNewButton(),1);
		s(cm.getCustomerNameText1(),map.get("cName1"),3);
		s(cm.getCustomerNameText3(),map.get("cName3"),1);
		s(cm.getCustomerLoginNameText(),map.get("cLoginName"),1);
		s(cm.getCustomerPasswordText(),map.get("cPassword"),1);
		s(cm.getBillingAddressText(),map.get("bAddress"),1);
		s(cm.getBillingCityText(),map.get("bCity"),1);
		c(cm.getBillingCountry(),1);
		c(cm.getKendoList(Integer.valueOf(map.get("bCountry"))),1);
		w(3);
		c(cm.getBillingState(), 1);
		c(cm.getKendoList(Integer.valueOf(map.get("bState"))),1);
		s(cm.getBillingBiPhoneText(),map.get("bBiPhone"),1);
		s(cm.getBillingZipText(),map.get("bZip"),1);
		s(cm.getShippingNameText1(),map.get("sName1"),1);
		s(cm.getShippingNameText3(),map.get("sName3"),1);
		s(cm.getShippingAddressText(),map.get("sAddress"),1);
		s(cm.getShippingCityText(),map.get("sCity"),1);
		c(cm.getShippingCountry(),1);
		c(cm.getKendoList(Integer.valueOf(map.get("sCountry"))),1);
		w(3);
		c(cm.getShippingState(),1);
		c(cm.getKendoList(Integer.valueOf(map.get("sState"))),1);
		s(cm.getShippingPhoneText(),map.get("sPhone"),1);
		s(cm.getShippingZipText(),map.get("sZip"),1);
		c(cm.getOtherTerm(),1);
		c(cm.getKendoList(Integer.valueOf(map.get("oTerm"))),1);
		s(cm.getOtherCardText1(),map.get("oCard1"),1);
		s(cm.getOtherCardText2(),map.get("oCard2"),1);
		s(cm.getOtherCardText3(),map.get("oCard3"),1);
		s(cm.getOtherCardText4(),map.get("oCard4"),1);
		s(cm.getOtherDateText(),map.get("oDate"),1);
		s(cm.getOtherBankText(),map.get("oBank"),1);
		s(cm.getOtherEmailText(),map.get("oEmail"),1);
		c(cm.getSaveButton(),1);
		c(cm.getWarningOKButton(),1);
		w(40);
		result.put("customer", cm.getCustomerNumberText().getAttribute("value"));
		return result;
	}
	
	// edit customer USA
	public static void getEditCustomerUSA(Map<String, String> map) {
		actionStartLogger(CustomerMaintainAction.class,"getEditCustomerUSA",0);
		s(cm.getCustomerNumberText(),map.get("customer"),1);
		c(cm.getCustomerNumberButton(),1);
		w(10);
		c(cm.getEditButton(),1);
		s(cm.getCustomerNameText1(),map.get("cName1"),2);
		s(cm.getCustomerNameText3(),map.get("cName3"),1);
		s(cm.getBillingAddressText(),map.get("bAddress"),1);
		s(cm.getBillingCityText(),map.get("bCity"),1);
		s(cm.getOtherBankText(),map.get("oBank"),1);
		s(cm.getOtherEmailText(),map.get("oEmail"),1);
		c(cm.getSaveButton(),1);
		c(cm.getWarningOKButton(),1);
		w(30);
	}
	
	// edit customer CHN
	public static void getEditCustomerCHN(Map<String, String> map) {
		actionStartLogger(CustomerMaintainAction.class,"getEditCustomerCHN",0);
		s(cm.getCustomerNumberText(),map.get("customer"),1);
		c(cm.getCustomerNumberButton(),1);
		w(10);
		c(cm.getEditButton(),1);
		s(cm.getCustomerNameText(),map.get("cName"),1);
		s(cm.getOtherEmailText(),map.get("oEmail"),1);
		c(cm.getSaveButton(),1);
		//c(cm.getWarningOKButton(),1);
		w(30);
	}
	
	// edit customer Inl
	public static void getEditCustomerInl(Map<String, String> map) {
		actionStartLogger(CustomerMaintainAction.class,"getEditCustomerInl",0);
		s(cm.getCustomerNumberText(),map.get("customer"),1);
		c(cm.getCustomerNumberButton(),1);
		w(10);
		c(cm.getEditButton(),1);
		s(cm.getCustomerNameText1(),map.get("cName1"),2);
		s(cm.getCustomerNameText3(),map.get("cName3"),1);
		s(cm.getBillingAddressText(),map.get("bAddress"),1);
		s(cm.getBillingCityText(),map.get("bCity"),1);
		s(cm.getOtherBankText(),map.get("oBank"),1);
		s(cm.getOtherEmailText(),map.get("oEmail"),1);
		c(cm.getSaveButton(),1);
		c(cm.getWarningOKButton(),1);
		w(30);
	}
	
	// edit customer USB
	public static Map<String, String> getEditCustomerUSB(Map<String, String> map) {
		actionStartLogger(CustomerMaintainAction.class,"getEditCustomerUSB",0);
		Map<String,String> result = new HashMap<String,String>();
		s(cm.getCustomerNumberText(),map.get("customer"),1);
		c(cm.getCustomerNumberButton(),1);
		w(15);
		result.put("editButton", String.valueOf(cm.getEditButton().isEnabled()));
		return result;
	}
	
	// load Invalid Customer
	public static Map<String, String> getLoadInvalidCustomer(Map<String, String> map) {
		actionStartLogger(CustomerMaintainAction.class,"getLoadInvalidCustomer",0);
		Map<String,String> result = new HashMap<String,String>();
		s(cm.getCustomerNumberText(),map.get("customer"),1);
		c(cm.getCustomerNumberButton(),1);
		w(2);
		result.put("error", cm.getErrorMessage().getText());
		return result;
	}
	
	// change password
	public static Map<String, String> getChangePassword(Map<String, String> map) {
		actionStartLogger(CustomerMaintainAction.class,"getChangePassword",0);
		Map<String,String> result = new HashMap<String,String>();
		s(cm.getCustomerNumberText(),map.get("customer"),1);
		c(cm.getCustomerNumberButton(),1);
		w(10);
		c(cm.getEditButton(),1);
		c(cm.getCustomerModifyPassButton(),1);
		s(cm.getCustomerPasswordText(),map.get("password"),2);
		c(cm.getCustomerSavePassButton(),1);
		w(5);
		result.put("password", String.valueOf(cm.getCustomerPasswordText().getAttribute("readonly")));
		return result;
	}
	
	// customer Memo
	public static Map<String, String> getCustomerMemo(Map<String, String> map) {
		actionStartLogger(CustomerMaintainAction.class,"getCustomerMemo",0);
		Map<String,String> result = new HashMap<String,String>();
		c(cm.getMemoCustomerButton(),1);
		s(cm.getMemoNoteText(),map.get("value"),1);
		c(cm.getMemoSaveButton(),1);
		w(5);
		result.put("customer",cm.getCustomerNumberText().getAttribute("value"));
		return result;
	}
	
}
