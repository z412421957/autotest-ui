package com.neso.action;

import java.util.HashMap;
import java.util.Map;

import com.neso.factory.CommonUtil;
import com.neso.pageobject.CustomerBalance;

public class CustomerBalanceAction extends CommonUtil{

	private static CustomerBalance cb = new CustomerBalance();
	
	// page load
	public static Map<String, String> getPageLoad() {
		actionStartLogger(CustomerBalanceAction.class,"getPageLoad",0);
		Map<String, String> result = new HashMap<String, String>();
		result.put("customer", String.valueOf(cb.getCustomerNumberText().isEnabled()));
		result.put("invoice", String.valueOf(cb.getInvoiceDateButton().isSelected()));
		result.put("bu", cb.getBuValue().getText());
		result.put("search", String.valueOf(cb.getSearchButton().isEnabled()));
		result.put("discrepancy", String.valueOf(cb.getDiscrepancyOnlyButton().isSelected()));
		return result;
	}
	
	//search
	public static Map<String, String> getNoCustomer(Map<String, String> map) {
		actionStartLogger(CustomerBalanceAction.class,"getNoCustomer",0);
		Map<String, String> result = new HashMap<String, String>();
		s(cb.getCustomerNumberText(),map.get("customer"),1);
		c(cb.getSearchButton(),1);
		w(1);
		result.put("error", cb.getErrorMessage().getText());
		return result;
	}
	
	public static Map<String, String> getDeactivatedCustomer(Map<String, String> map) {
		actionStartLogger(CustomerBalanceAction.class,"getDeactivatedCustomer",0);
		Map<String, String> result = new HashMap<String, String>();
		s(cb.getCustomerNumberText(),map.get("customer"),1);
		c(cb.getSearchButton(),1);
		w(1);
		result.put("error", cb.getErrorMessage().getText());
		return result;
	}
	
	public static Map<String, String> getCustomerLoad(Map<String, String> map) {
		actionStartLogger(CustomerBalanceAction.class,"getCustomerLoad",0);
		Map<String, String> result = new HashMap<String, String>();
		s(cb.getCustomerNumberText(),map.get("customer"),1);
		c(cb.getSearchButton(),1);
		w(40);
		result.put("company", cb.getNameText().getAttribute("value"));
		return result;
	}
	
	public static Map<String, String> getUSDCurrency(Map<String, String> map) {
		actionStartLogger(CustomerBalanceAction.class,"getUSDCurrency",0);
		Map<String, String> result = new HashMap<String, String>();
		s(cb.getCustomerNumberText(),map.get("customer"),1);
		c(cb.getInvoiceDateButton(),1);
		c(cb.getBuButton(),1);
		c(cb.getKendoList(Integer.valueOf(map.get("bu"))),1);
		c(cb.getSearchButton(),1);
		w(50);
		result.put("currency", cb.getCurrencyCode().getText());
		return result;
	}
	
	public static Map<String, String> getRevertLoad(Map<String, String> map) {
		actionStartLogger(CustomerBalanceAction.class,"getRevertLoad",0);
		Map<String, String> result = new HashMap<String, String>();
		s(cb.getCustomerNumberText(),map.get("customer"),1);
		if (cb.getInvoiceDateButton().isSelected())
			c(cb.getInvoiceDateButton(),1);
		if (cb.getBuValue().getText().equals("Newegg.com")) {
			c(cb.getBuButton(),1);
			c(cb.getKendoList(Integer.valueOf(map.get("bu"))),1);
		}
		c(cb.getSearchButton(),1);
		w(50);
		result.put("currency", cb.getCurrencyCodeList(Integer.valueOf(map.get("currency"))).getText());
		return result;
	}
	
	public static Map<String, String> getDiscrepancyOnly() {
		actionStartLogger(CustomerBalanceAction.class,"getDiscrepancyOnly",0);
		Map<String, String> result = new HashMap<String, String>();
		if (cb.getDiscrepancyOnlyButton().isSelected()) {
			c(cb.getDiscrepancyOnlyButton(),1);
			w(10);
		}
		result.put("count1", cb.getInvoiceCount().getText());
		c(cb.getDiscrepancyOnlyButton(),1);
		w(10);
		result.put("count2", cb.getInvoiceCount().getText());
		return result;
	}
	
	public static Map<String, String> getPaymentHistory() {
		actionStartLogger(CustomerBalanceAction.class,"getPaymentHistory",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cb.getInvoiceLocalCurrencyList(2),1);
		w(6);
		result.put("invoice", cb.getInvoiceLocalCurrencyList(2).getText());
		result.put("payment", cb.getPaymentLocalCurrencyList(1).getText());
		return result;
	}
	
	public static Map<String, String> getCSView() {
		actionStartLogger(CustomerBalanceAction.class,"getCSView",0);
		Map<String, String> result = new HashMap<String, String>();
		c(cb.getCSViewButton(),1);
		w(10);
		result.put("currency", cb.getCSCurrencyCode().getText());
		return result;
	}
	
	// link
	public static Map<String, String> getLink(Map<String, String> map) {
		actionStartLogger(CustomerBalanceAction.class,"getLink",0);
		Map<String, String> result = new HashMap<String, String>();
		s(cb.getCustomerNumberText(),map.get("customer"),1);
		c(cb.getSearchButton(),1);
		w(50);
		s(cb.getInvoiceText(),map.get("invoice"),1);
		s(cb.getSoNumberText(),map.get("so"),1);
		c(cb.getInvoiceValue(),1);
		result.put("invoice", getNewWindowUrl());
		c(cb.getSoValue(),1);
		result.put("so", getNewWindowUrl());
		cb.getInvoiceText().clear();
		cb.getSoNumberText().clear();
		s(cb.getRmaNumberText(),map.get("rma"),1);
		c(cb.getRmaValue(),1);
		result.put("rma", getNewWindowUrl());
		return result;
	}
	
}
