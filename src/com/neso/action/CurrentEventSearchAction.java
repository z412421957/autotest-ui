package com.neso.action;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.neso.factory.CommonUtil;
import com.neso.pageobject.CurrentEventSearch;

public class CurrentEventSearchAction extends CommonUtil{
	private WebDriver driver = super.getDriver();
	private Actions action = new Actions(driver);
	private static CurrentEventSearch ce = new CurrentEventSearch();
	private String handle = "";
	
	
	// load
	public static Map<String, String> getLoad() {
		actionStartLogger(CustomerQueryAction.class,"getLoad",0);
		Map<String, String> result = new HashMap<String, String>();
		w(3);
		result.put("type",ce.getTypeValue().getText());
		result.put("solution", ce.getSolutionValue().getText());
		result.put("bu", ce.getBuValue().getText());
		return result;
	}
	
	// add new
	public Map<String, String> getAddNewLoad() {
		actionStartLogger(CustomerQueryAction.class,"getAddNewLoad",0);
		Map<String, String> result = new HashMap<String, String>();
		c(ce.getNewButton(),1);
		w(20);
		handle = driver.getWindowHandle();
		for(String str : driver.getWindowHandles()){
			if(!str.equals(handle)){
				driver.switchTo().window(str);
			}
		}
		result.put("event", ce.getEmEventNumberText().getAttribute("readonly"));
		result.put("bu", ce.getEmBuValue().getText());
		result.put("type", ce.getEmTypeValue().getText());
		result.put("solution", ce.getEmSolutionValue().getText());
		result.put("save", String.valueOf(ce.getEmSaveButton().isEnabled()));
		result.put("cancel", String.valueOf(ce.getEmCancelButton().isEnabled()));
		result.put("new", String.valueOf(ce.getEmNewButton().isEnabled()));
		return result;
	}
	
	public static Map<String, String> getAddNewRules() {
		actionStartLogger(CustomerQueryAction.class,"getAddNewRules",0);
		Map<String, String> result = new HashMap<String, String>();
		c(ce.getEmSaveButton(),1);
		result.put("item", ce.getEmItemNumberText().getAttribute("class"));
		result.put("manufacturer", ce.getEmManufacturerText().getAttribute("class"));
		result.put("category", ce.getEmCategoryText().getAttribute("class"));
		result.put("subject", ce.getEmSubjectText().getAttribute("class"));
		result.put("period", ce.getEmPeriodClass().getAttribute("class"));
		result.put("to", ce.getEmToClass().getAttribute("class"));
		return result;
	}
	
	public static Map<String, String> getAddNew(Map<String, String> map) {
		actionStartLogger(CustomerQueryAction.class,"getAddNew",0);
		Map<String, String> result = new HashMap<String, String>();
		s(ce.getEmItemNumberText(), map.get("item"),1);
		s(ce.getEmManufacturerText(), map.get("manufacturer"),1);
		s(ce.getEmCategoryText(), map.get("category"),1);
		s(ce.getEmSubjectText(), map.get("subject"),1);
		s(ce.getEmPeriodText(), map.get("period"),1);
		s(ce.getEmToText(), map.get("to"),1);
		c(ce.getEmDetailSourceButton(),1);
		s(ce.getEmDetail(), map.get("detail"),1);
		c(ce.getEmDetailSourceButton(),1);
		c(ce.getEmSaveButton(),1);
		w(4);
		s(ce.getEmCategoryText(), map.get("category2"),1);
		c(ce.getEmSaveButton(),1);
		w(4);
		c(ce.getEmCancelButton(),1);
		result.put("item", ce.getEmItemNumberText().getAttribute("value"));
		return result;
	}
	
	public void closeWindows() {
		driver.close();
		driver.switchTo().window(handle);
	}
	
	// search
	public static Map<String, String> getSearchAndVoid(Map<String, String> map) {
		actionStartLogger(CustomerQueryAction.class,"getSearchAndVoid",0);
		Map<String, String> result = new HashMap<String, String>();
		s(ce.getItemNumberText(), map.get("item"),1);
		s(ce.getManufacturerText(), map.get("manufacturer"),1);
		s(ce.getCategoryText(), map.get("category"),1);
		c(ce.getSearchButton(),1);
		w(4);
		c(ce.getSrVoidButton(),1);
		c(ce.getErrorOKButton(),1);
		w(5);
		result.put("category", ce.getSrCategory().getText());
		result.put("status", ce.getSrStatus().getText());
		return result;
	}
	
}
