package com.neso.action;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.neso.factory.CommonUtil;
import com.neso.pageobject.CustomerGroupMaintain;

public class CustomerGroupMaintainAction extends CommonUtil{

	private WebDriver driver = super.getDriver();
	private static CustomerGroupMaintain cp = new CustomerGroupMaintain();
	
	// load
	public static Map<String, String> getPageLoad() {
		actionStartLogger(CustomerGroupMaintainAction.class,"getPageLoad",0);
		Map<String, String> result = new HashMap<String, String>();
		w(5);
		result.put("customer", String.valueOf(cp.getCustomerGroupNumberText().isEnabled()));
		result.put("status", cp.getStatusValue().getText());
		result.put("reset", String.valueOf(cp.getResetButton().isEnabled()));
		result.put("search", String.valueOf(cp.getSearchButton().isEnabled()));
		result.put("new", String.valueOf(cp.getNewButton().isEnabled()));
		result.put("modify", String.valueOf(cp.getModifyButton().isEnabled()));
		result.put("deactive", String.valueOf(cp.getDeactiveButton().isEnabled()));
		result.put("active", String.valueOf(cp.getActiveButton().isEnabled()));
		result.put("assign", String.valueOf(cp.getAssignPriceTypesButton().isEnabled()));
		return result;
	}
	
	// new
	public static Map<String, String> getAddNewLoad() {
		actionStartLogger(CustomerGroupMaintainAction.class,"getAddNewLoad",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cp.getNewButton(),1);
		w(4);
		result.put("name", String.valueOf(cp.getNewGroupNameText().isEnabled()));
		result.put("description", String.valueOf(cp.getNewDescriptionText().isEnabled()));
		result.put("apply", String.valueOf(cp.getNewApplyBoxButton().isEnabled()));
		c(cp.getNewCancelButton(),1);
		return result;
	}
	
	public static Map<String, String> getAddNewRules() {
		actionStartLogger(CustomerGroupMaintainAction.class,"getAddNewRules",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cp.getNewButton(),1);
		w(4);
		c(cp.getNewOKButton(),1);
		result.put("red", cp.getNewGroupNameText().getAttribute("class"));
		c(cp.getNewApplyBoxButton(),1);
		c(cp.getNewApplyBox_1(),1);
		c(cp.getNewApplyBox_2(),1);
		c(cp.getNewApplyBoxButton(),1);
		c(cp.getNewCancelButton(),1);
		return result;
	}
	
	public static void getAddNewNoApply(Map<String, String> map) {
		actionStartLogger(CustomerGroupMaintainAction.class,"getAddNew",0);
		c(cp.getNewButton(),1);
		w(4);
		s(cp.getNewGroupNameText(), map.get("name"),1);
		s(cp.getNewDescriptionText(), map.get("name"),1);
		c(cp.getNewOKButton(),1);
		w(20);
	}
	
	public static void getAddNewApply(Map<String, String> map) {
		actionStartLogger(CustomerGroupMaintainAction.class,"getAddNew",0);
		c(cp.getNewButton(),1);
		w(4);
		s(cp.getNewGroupNameText(), map.get("name"),1);
		s(cp.getNewDescriptionText(), map.get("name"),1);
		c(cp.getNewApplyBoxButton(),1);
		c(cp.getNewOKButton(),1);
		w(20);
	}
	
	// search
	public static Map<String, String> getSearch(Map<String, String> map) {
		actionStartLogger(CustomerGroupMaintainAction.class,"getSearch",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cp.getSearchButton(),1);
		result.put("name", cp.getResultCustomerGroupName("[1]").getText());
		s(cp.getCustomerGroupNumberText(), map.get("group1"),1);
		result.put("error", cp.getCustomerGroupNumberText().getAttribute("class"));
		s(cp.getCustomerGroupNumberText(), map.get("group2"),1);
		c(cp.getSearchButton(),1);
		w(5);
		result.put("content", cp.getResultContent().getText());
		s(cp.getCustomerGroupNumberText(), map.get("group3"),1);
		c(cp.getSearchButton(),1);
		result.put("name", cp.getResultCustomerGroupName("").getText());
		c(cp.getResetButton(),1);
		return result;
	}
	
	// modify
	public static Map<String, String> getModifyRules(Map<String, String> map) {
		actionStartLogger(CustomerGroupMaintainAction.class,"getModifyRules",0);
		Map<String, String> result = new HashMap<String, String>();
		s(cp.getCustomerGroupNumberText(), map.get("group"),1);
		c(cp.getSearchButton(),1);
		w(5);
		result.put("modify", String.valueOf(cp.getModifyButton().isEnabled()));
		return result;
	}
	
	public static void getModifyNoApply(Map<String, String> map) {
		actionStartLogger(CustomerGroupMaintainAction.class,"getModifyNoApply",0);
		s(cp.getCustomerGroupNumberText(),map.get("group"),1);
		c(cp.getSearchButton(),1);
		w(4);
		c(cp.getModifyButton(),1);
		s(cp.getNewGroupNameText(), map.get("name"),1);
		s(cp.getNewDescriptionText(), map.get("description"),1);
		c(cp.getNewOKButton(),1);
		w(30);
	}
	
	public Map<String, String> getModifyApply(Map<String, String> map) {
		actionStartLogger(CustomerGroupMaintainAction.class,"getModifyApply",0);
		Map<String, String> result = new HashMap<String, String>();
		s(cp.getCustomerGroupNumberText(),map.get("group"),1);
		c(cp.getSearchButton(),1);
		w(4);
		c(cp.getModifyButton(),1);
		String handle = driver.getWindowHandle();
		for(String str : driver.getWindowHandles()){
			if(!str.equals(handle)){
				driver.switchTo().window(str);
			}
		}
		result.put("url", driver.getCurrentUrl());
		result.put("black", String.valueOf(cp.getModifyBlackRemoveButton().isEnabled()));
		result.put("white", String.valueOf(cp.getModifyWhiteRemoveButton().isEnabled()));
		s(cp.getModifyGroupNameText(), map.get("name"),1);
		s(cp.getModifyDescriptionText(), map.get("description"),1);
		c(cp.getModifySaveCustomerGroupButton(),1);
		w(30);
		driver.close();
		driver.switchTo().window(handle);
		return result;
	}
	
	// assign price types
	public static Map<String, String> getAssignPriceTypesRules(Map<String, String> map) {
		actionStartLogger(CustomerGroupMaintainAction.class,"getAssignPriceTypesRules",0);
		Map<String, String> result = new HashMap<String, String>();
		s(cp.getCustomerGroupNumberText(), map.get("group"),1);
		c(cp.getSearchButton(),1);
		w(4);
		c(cp.getAssignPriceTypesButton(),1);
		w(10);
		c(cp.getPriceAllTypeBox(),1);
		c(cp.getPriceTypeBox("[2]"),1);
		c(cp.getPriceTypeBox("[3]"),1);
		result.put("type1", String.valueOf(cp.getPriceTypeBox("[1]").isSelected()));
		result.put("type2", String.valueOf(cp.getPriceTypeBox("[4]").isSelected()));
		c(cp.getPriceCancelButton(),1);
		return result;
	}
	
	public static Map<String, String> getAssignPriceTypes() {
		actionStartLogger(CustomerGroupMaintainAction.class,"getAssignPriceTypes",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cp.getAssignPriceTypesButton(),1);
		w(10);
		c(cp.getPriceTypeBox("[1]"),1);
		c(cp.getPriceOKButton(),1);
		w(5);
		result.put("type", cp.getAssociatePriceType().getText());
		return result;
	}
	
	public static Map<String, String> getAssignRemoveTypes() {
		actionStartLogger(CustomerGroupMaintainAction.class,"getAssignRemoveTypes",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cp.getAssignPriceTypesButton(),1);
		w(10);
		//c(cp.getPriceTypeBox("[1]"),1);
		c(cp.getPriceOKButton(),1);
		c(cp.getPriceConfirmOKButton(),1);
		w(3);
		result.put("content", cp.getAssociateContent().getText());
		return result;
	}
	
	// associate customers
	public static Map<String, String> getRemoveCustomer(Map<String, String> map) {
		actionStartLogger(CustomerGroupMaintainAction.class,"getRemoveCustomer",0);
		Map<String, String> result = new HashMap<String, String>();
		s(cp.getCustomerGroupNumberText(), map.get("group"),1);
		c(cp.getSearchButton(),1);
		w(5);
		result.put("remove", String.valueOf(cp.getAssociateCustomersRemoveButton().isEnabled()));
		s(cp.getCustomerGroupNumberText(), map.get("group2"),1);
		c(cp.getSearchButton(),1);
		w(5);
		c(cp.getAssociateCustomersRemoveButton(),1);
		w(1);
		result.put("error", cp.getErrorMessage().getText());
		return result;
	}
	
	// deactive
	public static void getDeactive(Map<String, String> map) {
		actionStartLogger(CustomerGroupMaintainAction.class,"getDeactive",0);
		s(cp.getCustomerGroupNumberText(), map.get("group"),1);
		c(cp.getSearchButton(),1);
		w(5);
		c(cp.getDeactiveButton(),1);
		c(cp.getDeactiveOKButton(),1);
		w(5);
	}
	
}
