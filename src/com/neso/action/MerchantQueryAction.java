package com.neso.action;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.neso.factory.CommonUtil;
import com.neso.pageobject.MerchantQuery;

public class MerchantQueryAction extends CommonUtil{

	private WebDriver driver = super.getDriver();
	private static MerchantQuery mq = new MerchantQuery();
	private Actions action = new Actions(driver);
	
	// add call plan
	public Map<String, String> getAddCallPlan(Map<String, String> map) {
		actionStartLogger(MerchantQueryAction.class,"getAddCallPlan",0);
		Map<String, String> result = new HashMap<String, String>();
		c(mq.getResetButton(),1);
		c(mq.getSearchConditionButton(),1);
		c(mq.getSearchedByTypeButton(),1);
		c(mq.getKendoList(map.get("searchedType")),1);
		s(mq.getSearchedByText(), map.get("searched"),1);
		c(mq.getOwnershipTypeButton(),1);
		c(mq.getKendoList(map.get("ownership")),1);
		c(mq.getSearchButton(),1);
		w(10);
		c(mq.getSearchResultBox(),1);
		c(mq.getAddToCallPlanButton(),1);
		if (String.valueOf(mq.getApCallPlanListBox().isSelected()).equals("false"))
			c(mq.getApCallPlanListBox(),3);
		s(mq.getApAssignToText(),map.get("assign"),1);
		w(2);
		action.sendKeys(Keys.ENTER).build().perform();
		c(mq.getApSaveAndDetailButton(),1);
		w(30);
		return result;
	}
	
	// load
	public static Map<String, String> getLoad() {
		actionStartLogger(MerchantQueryAction.class,"getLoad",0);
		Map<String, String> result = new HashMap<String, String>();
		w(3);
		result.put("type", mq.getSearchedByTypeValue().getText());
		result.put("searchPrev", String.valueOf(mq.getSearchPrevButton().isEnabled()));
		result.put("searchNext", String.valueOf(mq.getSearchNextButton().isEnabled()));
		result.put("add1", mq.getAddToCustomerGroupButton().getAttribute("class"));
		result.put("add2", mq.getAddToBlackWhiteButton().getAttribute("class"));
		result.put("add3", mq.getAddToCallPlanButton().getAttribute("class"));
		//result.put("add4", mq.getExportCurrentPageButton().getAttribute("class"));
		//result.put("content", mq.getSearchResultContent().getText());
		return result;
	}
	
	// search
	public static Map<String, String> getReset() {
		actionStartLogger(MerchantQueryAction.class,"getReset",0);
		Map<String, String> result = new HashMap<String, String>();
		c(mq.getSearchConditionButton(),1);
		c(mq.getResetButton(),1);
		w(1);
		result.put("merchant", mq.getMerchantStatusValue().getText());
		result.put("latePay", mq.getLatePayStatusValue().getText());
		result.put("bu", mq.getBuValue().getText());
		result.put("netTerm", mq.getNetTermUsageValue().getText());
		result.put("seat", mq.getSeatSizeValue().getText());
		result.put("b2b", mq.getB2bUnitValue().getText());
		result.put("ownership", mq.getOwnershipTypeValue().getText());
		return result;
	}
	
	public static Map<String, String> getSearch(Map<String, String> map) {
		actionStartLogger(MerchantQueryAction.class,"getSearch",0);
		Map<String, String> result = new HashMap<String, String>();
		c(mq.getResetButton(),1);
		c(mq.getSearchedByTypeButton(),1);
		c(mq.getKendoList(map.get("searchBy")),1);
		c(mq.getOwnershipTypeButton(),1);
		c(mq.getKendoList(map.get("ownership")),1);
		s(mq.getSearchedByText(), map.get("keyword"),1);
		c(mq.getMerchantStatusButton(),1);
		c(mq.getKendoList(map.get("merchant")),1);
		//c(mq.getLatePayStatusButton(),1);
		//c(mq.getKendoList(map.get("latePay")),1);
		c(mq.getSeatSizeButton(),1);
		c(mq.getKendoList(map.get("seat")),1);
		c(mq.getBuValue(),1);
		c(mq.getKendoList(map.get("bu")),1);
		c(mq.getSearchButton(),1);
		w(4);
		result.put("merchant", mq.getSrMerchantNumber("").getText());
		result.put("export", mq.getExportCurrentPageButton().getAttribute("class"));
		return result;
	}
	
	// add to customer group
	public static Map<String, String> getAddCustomerGroup() {
		actionStartLogger(MerchantQueryAction.class,"getAddCustomerGroup",0);
		Map<String, String> result = new HashMap<String, String>();
		if(!mq.getSearchResultBox().isSelected())
			c(mq.getSearchResultBox(),1);
		c(mq.getAddToCustomerGroupButton(),1);
		w(3);
		c(mq.getCgBox("[1]"),1);
		c(mq.getCgBox("[2]"),1);
		result.put("box", String.valueOf(mq.getCgBox("[1]").isSelected()));
		c(mq.getCgCancelButton(),1);
		return result;
	}
	
	// add black white
	public static void getAddBlack() {
		actionStartLogger(MerchantQueryAction.class,"getAddBlack",0);
		if(!mq.getSearchResultBox().isSelected())
			c(mq.getSearchResultBox(),1);
		c(mq.getAddToBlackWhiteButton(),1);
		w(3);
		c(mq.getBwBox(),1);
		c(mq.getBwBlackBox(),1);
		c(mq.getBwOKButton(),1);
		w(60);
	}
	
	public static void getAddWhite() {
		actionStartLogger(MerchantQueryAction.class,"getAddWhite",0);
		if(!mq.getSearchResultBox().isSelected())
			c(mq.getSearchResultBox(),1);
		c(mq.getAddToBlackWhiteButton(),1);
		w(3);
		c(mq.getBwBox(),1);
		c(mq.getBwWhiteBox(),1);
		c(mq.getBwOKButton(),1);
		w(60);
	}
	
	// button
	public Map<String, String> getButton1() {
		actionStartLogger(MerchantQueryAction.class,"getButton1",0);
		Map<String, String> result = new HashMap<String, String>();
		c(mq.getMerchantBalanceButton(),1);
		w(20);
		result.put("merchant", getNewWindowUrl());
		c(mq.getSoProcessButton(), 1);
		w(20);
		result.put("process", getNewWindowUrl());
		c(mq.getCallHistoryButton(),1);
		w(20);
		result.put("history", getNewWindowUrl());
		return result;
	}
	
	public static Map<String, String> getButton2(Map<String, String> map) {
		actionStartLogger(MerchantQueryAction.class,"getButton2",0);
		Map<String, String> result = new HashMap<String, String>();
		c(mq.getResetButton(),1);
		c(mq.getSearchedByTypeButton(),1);
		c(mq.getKendoList(map.get("searchBy")),1);
		c(mq.getOwnershipTypeButton(),1);
		c(mq.getKendoList(map.get("ownership")),1);
		s(mq.getSearchedByText(), map.get("keyword"),1);
		c(mq.getSearchButton(),1);
		w(15);
		c(mq.getSearchResultBox(),1);
		c(mq.getMerchantBalanceButton(),1);
		w(3);
		result.put("merchant", getNewWindowUrl());
		// ÓÐ bug£¬ÒÑ¼ÇÂ¼
		return result;
	}
	
}
