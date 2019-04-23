package com.neso.action;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.neso.factory.CommonUtil;
import com.neso.pageobject.CustomerFlagSet;

public class CustomerFlagSetAction extends CommonUtil{
	private WebDriver driver = super.getDriver();
	private Actions action = new Actions(driver);
	private static CustomerFlagSet cf = new CustomerFlagSet();
	
	// add new flag
	public static Map<String,String> getCustomerNotInt(Map<String,String> map){
		actionStartLogger(CustomerFlagSetAction.class,"getCustomerNotInt",0);
		Map<String,String> result = new HashMap<String,String>();
		s(cf.getCustomerNumberText(),map.get("customer"),2);
		result.put("error",cf.getCustomerNumberText().getAttribute("class"));
		result.put("search", String.valueOf(cf.getSearchButton().isEnabled()));
		return result;
	}
	
	public static Map<String,String> getCustomerNotFound(Map<String, String> map){
		actionStartLogger(CustomerFlagSetAction.class,"getCustomerNotFound",0);
		Map<String,String> result = new HashMap<String,String>();
		s(cf.getCustomerNumberText(),map.get("customer"),1);
		c(cf.getSearchButton(),1);
		result.put("error", cf.getErrorMessage().getText());
		return result;
	}
	
	public static Map<String,String> getCustomerSuccess(Map<String, String> map){
		actionStartLogger(CustomerFlagSetAction.class,"getCustomerSuccess",0);
		Map<String,String> result = new HashMap<String,String>();
		s(cf.getCustomerNumberText(),map.get("customer"),2);
		c(cf.getSearchButton(),1);
		result.put("email", cf.getCustomerEmailText().getText());
		result.put("addNew", String.valueOf(cf.getAddNewFlagButton().isEnabled()));
		return result;
	}
	
	public static void getAddNewFlag(Map<String, String> map){
		actionStartLogger(CustomerFlagSetAction.class,"getAddNewFlag",0);
		c(cf.getAddNewFlagButton(),2);
		s(cf.getAddMemoText(),map.get("memo"),1);
		c(cf.getAddSaveButton(),1);
		w(5);
	}
	
	public static void getRepeatAdd(Map<String, String> map){
		actionStartLogger(CustomerFlagSetAction.class,"getRepeatAdd",0);
		c(cf.getAddNewFlagButton(),2);
		s(cf.getAddMemoText(),map.get("memo"),1);
		c(cf.getAddSaveButton(),1);
		c(cf.getAddCancelButton(),2);
	}
	
	// search
	public static Map<String,String> getCustomerFlagInvalid(Map<String, String> map){
		actionStartLogger(CustomerFlagSetAction.class,"getCustomerFlagInvalid",0);
		Map<String,String> result = new HashMap<String,String>();
		s(cf.getCustomerNumberText(),map.get("customer"),1);
		c(cf.getSearchButton(),2);
		result.put("message", cf.getflagContent().getText());
		return result;
	}
	
	public static Map<String, String> getCustomerFlagValid(Map<String, String> map){
		actionStartLogger(CustomerFlagSetAction.class,"getCustomerFlagValid",0);
		Map<String,String> result = new HashMap<String,String>();
		s(cf.getCustomerNumberText(),map.get("customer"),1);
		c(cf.getSearchButton(),2);
		result.put("flag", cf.getFlag_1().getText());
		return result;
	}
	
	// delete customer flag
	public static void getDeleteCustomerFlag(Map<String, String> map){
		actionStartLogger(CustomerFlagSetAction.class,"getDeleteCustomerFlag",0);
		s(cf.getCustomerNumberText(),map.get("customer"),2);
		c(cf.getSearchButton(),2);
		c(cf.getDeleteFlag_1(),4);
		c(cf.getDeleteOkButton(),1);
		w(30);
	}
}
