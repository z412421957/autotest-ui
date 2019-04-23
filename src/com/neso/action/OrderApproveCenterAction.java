package com.neso.action;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.neso.factory.CommonUtil;
import com.neso.pageobject.OrderApproveCenter;

public class OrderApproveCenterAction extends CommonUtil{
	private WebDriver driver = super.getDriver();
	private static OrderApproveCenter oa = new OrderApproveCenter();
	private static String handle = "";
	
	// load
	public static Map<String, String> getLoad() {
		actionStartLogger(OrderApproveCenterAction.class,"getLoad",0);
		Map<String, String> result = new HashMap<String, String>();
		w(5);
		result.put("so", oa.getSoNumberText().getAttribute("value"));
		result.put("pending", oa.getPendingForApprovalValue().getText());
		result.put("approveType", oa.getApproveTypeValue().getText());
		result.put("reset", String.valueOf(oa.getResetButton().isEnabled()));
		result.put("search", String.valueOf(oa.getSearchButton().isEnabled()));
		result.put("export", String.valueOf(oa.getExportCurrentPageButton().isEnabled()));
		result.put("content", oa.getSrContent().getText());
		result.put("processLog", oa.getProcessLogButton().getAttribute("readonly"));
		result.put("penGlobe", oa.getPenGlobeButton().getAttribute("readonly"));
		return result;
	}
	
	// query
	public static Map<String, String> getSearchApprove(Map<String, String> map) {
		actionStartLogger(OrderApproveCenterAction.class,"getSearchApprove",0);
		Map<String, String> result = new HashMap<String, String>();
		c(oa.getPendingForApprovalButton(),1);
		c(oa.getKendoList(map.get("pending")),1);
		c(oa.getApproveTypeButton(),1);
		c(oa.getKendoList(map.get("approve")),1);
		c(oa.getSearchButton(),1);
		w(5);
		result.put("approve1", oa.getApproveTypeValue().getText());
		result.put("approve2", oa.getSrApproveType("[1]").getText());
		return result;
	}
	
	public static Map<String, String> getQuery() {
		actionStartLogger(OrderApproveCenterAction.class,"getQuery",0);
		Map<String, String> result = new HashMap<String, String>();
		result.put("so", oa.getSrSONumber("[1]").getText());
		s(oa.getSoNumberText(), result.get("so"),1);
		c(oa.getSearchButton(),1);
		w(5);
		result.put("so2", oa.getSrSONumber("").getText());
		c(oa.getResetButton(),1);
		w(1);
		result.put("so3", oa.getSoNumberText().getAttribute("value"));
		result.put("pending", oa.getPendingForApprovalValue().getText());
		result.put("approve", oa.getApproveTypeValue().getText());
		return result;
	}
	
	// View
	public static Map<String, String> getCustomerInfo() {
		actionStartLogger(OrderApproveCenterAction.class,"getCustomerInfo",0);
		Map<String, String> result = new HashMap<String, String>();
		result.put("so1", oa.getSrSONumber("").getText());
		result.put("customer1", oa.getSrCustomerNumber("").getText());
		c(oa.getSrViewButton(""),1);
		w(15);
		result.put("so2", oa.getViewSONumber().getText());
		result.put("customer2", oa.getViewCustomerNumber().getText());
		return result;
	}
	
	public static Map<String, String> getAmountInfo() {
		actionStartLogger(OrderApproveCenterAction.class,"getAmountInfo",0);
		Map<String, String> result = new HashMap<String, String>();
		c(oa.getViewAmountInfoButton(),1);
		w(3);
		result.put("amount", oa.getViewTotalAmount().getText());
		c(oa.getViewDetailButton(),1);
		w(7);
		result.put("show", oa.getViewShowDetailButton().getAttribute("class"));
		result.put("eims", oa.getViewEIMSValue().getText());
		c(oa.getViewAmountExitButton(),1);
		return result;
	}
	
	public static Map<String, String> getAdditionalInfo() {
		actionStartLogger(OrderApproveCenterAction.class,"getAdditionalInfo",0);
		Map<String, String> result = new HashMap<String, String>();
		c(oa.getViewAdditionalInfoButton(),1);
		w(2);
		result.put("memo", String.valueOf(oa.getViewMemoText().isEnabled()));
		return result;
	}
	
	public static void getApproveLog() {
		actionStartLogger(OrderApproveCenterAction.class,"getApproveLog",0);
		c(oa.getViewApproveLogButton(),1);
		w(2);
		c(oa.getViewExitButton(),1);	
	}
	
	// approve
	public static Map<String, String> getApproveAndDecline() {
		actionStartLogger(OrderApproveCenterAction.class,"getApproveAndDecline",0);
		Map<String, String> result = new HashMap<String, String>();
		c(oa.getSrViewButton(""),1);
		w(15);
		result.put("approve", oa.getViewApproveButton().getAttribute("class"));
		result.put("decline", oa.getViewDeclineButton().getAttribute("class"));
		c(oa.getViewExitButton(),1);
		return result;
	}
	
	// process log
	public Map<String, String> getProcessNoDataLoad() {
		actionStartLogger(OrderApproveCenterAction.class,"getProcessNoDataLoad",0);
		Map<String, String> result = new HashMap<String, String>();
		c(oa.getResetButton(),1);
		c(oa.getSearchButton(),1);
		w(3);
		c(oa.getProcessLogButton(),1);
		w(15);
		handle = driver.getWindowHandle();
		for(String str : driver.getWindowHandles()){
			if(!str.equals(handle)){
				driver.switchTo().window(str);
			}
		}
		result.put("type", oa.getPlSearchTypeValue().getText());
		result.put("reset", String.valueOf(oa.getPlResetButton().isEnabled()));
		result.put("search", String.valueOf(oa.getPlSearchButton().isEnabled()));
		return result;
	}
	
	public Map<String, String> getProcessSearch(Map<String, String> map) {
		actionStartLogger(OrderApproveCenterAction.class,"getProcessSearch",0);
		Map<String, String> result = new HashMap<String, String>();
		c(oa.getPlResetButton(),1);
		c(oa.getPlSearchButton(),1);
		w(1);
		result.put("error", oa.getPlErrorMessage().getText());
		w(2);
		c(oa.getPlSearchTypeButton(),1);
		c(oa.getKendoList(map.get("type")),1);
		s(oa.getPlKeywordText(), map.get("key"),1);
		c(oa.getPlSearchButton(),1);
		w(60);
		result.put("agent", oa.getPlSrAgentID().getText());
		driver.close();
		driver.switchTo().window(handle);
		return result;
	}
	
	public Map<String, String> getProcessData(Map<String, String> map) {
		actionStartLogger(OrderApproveCenterAction.class,"getProcessData",0);
		Map<String, String> result = new HashMap<String, String>();
		c(oa.getPendingForApprovalButton(),1);
		c(oa.getKendoList(map.get("pending")),1);
		c(oa.getSearchButton(),1);
		w(10);
		result.put("so", oa.getSrSONumber("[1]").getText());
		oa.getSrDiv().click();
		c(oa.getProcessLogButton(),1);
		w(15);
		handle = driver.getWindowHandle();
		for(String str : driver.getWindowHandles()){
			if(!str.equals(handle)){
				driver.switchTo().window(str);
			}
		}
		result.put("key", oa.getPlKeywordText().getAttribute("value"));
		driver.close();
		driver.switchTo().window(handle);
		return result;
	}
	
}
