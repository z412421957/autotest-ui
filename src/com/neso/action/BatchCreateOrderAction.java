package com.neso.action;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.neso.factory.CommonUtil;
import com.neso.pageobject.BatchCreateOrder;

public class BatchCreateOrderAction extends CommonUtil{
	private WebDriver driver = super.getDriver();
	private Actions action = new Actions(driver);
	private static BatchCreateOrder co = new BatchCreateOrder();
	
	// data load
	public static Map<String, String> getLoad() {
		actionStartLogger(BatchCreateOrderAction.class,"getLoad",0);
		Map<String, String> result = new HashMap<String, String>();
		w(3);
		result.put("so", String.valueOf(co.getSoNumberText().isEnabled()));
		result.put("reset", String.valueOf(co.getResetButton().isEnabled()));
		result.put("search", String.valueOf(co.getSearchButton().isEnabled()));
		result.put("orderCount", co.getOrderCountText().getAttribute("readonly"));
		result.put("totalQty", co.getItemTotalQtyText().getAttribute("readonly"));
		result.put("createOrder", String.valueOf(co.getBatchCreateOrderButton().isEnabled()));
		return result;
	}
	
	// search original so
	public static Map<String, String> getSearchSORules(Map<String, String> map) {
		actionStartLogger(BatchCreateOrderAction.class,"getSearchSORules",0);
		Map<String, String> result = new HashMap<String, String>();
		s(co.getSoNumberText(), map.get("errorSO"),1);
		result.put("so", co.getSoNumberText().getAttribute("class"));
		s(co.getSoNumberText(), map.get("soExist"),1);
		c(co.getSearchButton(),1);
		result.put("error", co.getErrorMessage().getText());
		c(co.getErrorOKButton(),1);
		return result;
	}
	
	public static Map<String, String> getSearchSO(Map<String, String> map) {
		actionStartLogger(BatchCreateOrderAction.class,"getSearchSO",0);
		Map<String, String> result = new HashMap<String, String>();
		s(co.getSoNumberText(), map.get("so"),1);
		c(co.getSearchButton(),1);
		w(6);
		result.put("bu", co.getBu().getText());
		c(co.getTaxAmountButton(),1);
		c(co.getTaxDetailCloseButton(),3);
		c(co.getResetButton(),1);
		return result;
	}
	
//	// batch create order 
//	public static Map<String, String> getBatchCreateOrderRules(Map<String, String> map) {
//		actionStartLogger(BatchCreateOrderAction.class,"getBatchCreateOrderRules",0);
//		Map<String, String> result = new HashMap<String, String>();
//		s(co.getCoSONumberText(),map.get("so"),1);
//		c(co.getCoSOSearchButton(),1);
//		w(5);
//		s(co.getCoItemTotalQtyText(),map.get("itemTotal1"),1);
//		co.getCoOrderCountText().click();
//		result.put("orderCount1", co.getCoOrderCountText().getAttribute("value"));
//		s(co.getCoItemTotalQtyText(),map.get("itemTotal2"),1);
//		co.getCoOrderCountText().click();
//		result.put("orderCount2", co.getCoOrderCountText().getAttribute("value"));
//		c(co.getCoBatchCreateOrderButton(),1);
//		c(co.getCoBatchCancelButton(),1);
//		return result;
//	}
	
	// history data load
	public static Map<String, String> getHistoryDataLoad() {
		actionStartLogger(BatchCreateOrderAction.class,"getHistoryDataLoad",0);
		Map<String, String> result = new HashMap<String, String>();
		w(10);
		result.put("keyword", String.valueOf(co.getKeywordText().isEnabled()));
		result.put("issue", String.valueOf(co.getIssueBoxButton().isEnabled()));
		result.put("reset", String.valueOf(co.getLogResetButton().isEnabled()));
		result.put("search", String.valueOf(co.getLogSearchButton().isEnabled()));
		return result;
	}
	
	// history search
	public static Map<String, String> getHistorySearch(Map<String, String> map) {
		actionStartLogger(BatchCreateOrderAction.class,"getHistorySearch",0);
		Map<String, String> result = new HashMap<String, String>();
		s(co.getKeywordText(), map.get("so"), 1);
		c(co.getLogSearchButton(),1);
		w(25);
		result.put("so", co.getLogOriginalSONumber().getText());
		result.put("so2", co.getLogSONumber_1().getText());
		c(co.getIssueBoxButton(), 1);
		c(co.getLogSearchButton(),1);
		w(5);
		result.put("content", co.getLogOriginalContent().getText());
		c(co.getLogResetButton(),1);
		return result;
	}
	
	
}
