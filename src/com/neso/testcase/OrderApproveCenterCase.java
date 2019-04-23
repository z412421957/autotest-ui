package com.neso.testcase;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.neso.action.OrderApproveCenterAction;
import com.neso.factory.CommonUtil;

public class OrderApproveCenterCase extends CommonUtil{

	// load
	@Test
	public void checkLoad() {
		printLogger(OrderApproveCenterCase.class,"load");
		Map<String, String> result = OrderApproveCenterAction.getLoad();
		assert result.get("so").equals("") : "so";
		assert result.get("pending").equals("Pending for my approval") : "pending";
		assert result.get("approveType").equals("All") : "approveType";
		assert result.get("reset").equals("true") : "reset";
		assert result.get("search").equals("true") : "search";
		assert result.get("export").equals("true") : "export";
		assert result.get("content").equals("No records available.") : "content";
		assert result.get("processLog") == null : "processLog";
		assert result.get("penGlobe") == null : "penGlobe";
	}
	
	// query
	@Test
	public void checkSearchApprove() {
		printLogger(OrderApproveCenterCase.class,"query");
		Map<String, String> map = new HashMap<String, String>();
		map.put("pending", "3");
		map.put("approve", "2");
		Map<String, String> result = OrderApproveCenterAction.getSearchApprove(map);
		assert result.get("approve1").equals(result.get("approve2")) : "";
	}
	
	@Test
	public void checkQuery() {
		Map<String, String> result = OrderApproveCenterAction.getQuery();
		assert result.get("so").equals(result.get("so2")) : "";
		assert result.get("so3").equals("") : "SO#";
		assert result.get("pending").equals("Pending for my approval") : "Pending for approval";
		assert result.get("approve").equals("All") : "Approve Type";
	}
	
	// View
	@Test
	public void checkCustomerInfo() {
		printLogger(OrderApproveCenterCase.class,"view");
		Map<String, String> result = OrderApproveCenterAction.getCustomerInfo();
		assert result.get("so1").equals(result.get("so2")) : "";
		assert result.get("customer1").equals(result.get("customer2")) : "";
	}
	
	@Test
	public void checkAmountInfo() {
		Map<String, String> result = OrderApproveCenterAction.getAmountInfo();
		assert !result.get("amount").equals("0.00") : "";
		if (result.get("show").contains("k-state-disabled"))
			assert result.get("eims").equals("N/A") : "";
		else
			assert !result.get("eims").equals("N/A") : "";
	}
	
	@Test
	public void checkAdditionalInfo() {
		Map<String, String> result = OrderApproveCenterAction.getAdditionalInfo();
		assert result.get("memo").equals("true") : "";
	}
	
	@Test
	public void checkApproveLog() {
		OrderApproveCenterAction.getApproveLog();
	}
	
	// approve
	@Test
	public void checkApproveAndDecline() {
		printLogger(OrderApproveCenterCase.class,"approve");
		Map<String, String> result = OrderApproveCenterAction.getApproveAndDecline();
		assert result.get("approve").contains("k-state-disabled") : "";
		assert result.get("decline").contains("k-state-disabled") : "";
	}
	
	// process log
	@Test
	public void checkProcessNoDataLoad() {
		printLogger(OrderApproveCenterCase.class,"processLog");
		Map<String, String> result = new OrderApproveCenterAction().getProcessNoDataLoad();
		assert result.get("type").equals("SO#") : "";
		assert result.get("reset").equals("true") : "";
		assert result.get("search").equals("true") : "";
	}
	
	@Test
	public void checkProcessSearch() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("type", "2");
		map.put("key", "km11");
		Map<String, String> result = new OrderApproveCenterAction().getProcessSearch(map);
		assert result.get("error").equals("Must have a condition") : "";
		assert result.get("agent").equals("Ken.L.Ma(km11)") : "";
	}
	
	@Test
	public void checkProcessData() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("pending", "3");
		Map<String, String> result = new OrderApproveCenterAction().getProcessData(map);
		assert result.get("key").equals(result.get("so")) : "";
	}
	
}
