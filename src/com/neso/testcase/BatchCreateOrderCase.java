package com.neso.testcase;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.neso.action.BatchCreateOrderAction;
import com.neso.factory.CommonUtil;

public class BatchCreateOrderCase extends CommonUtil{
	
	// data load
	@Test
	public void checkDataLoad() {
		printLogger(BatchCreateOrderCase.class,"load");
		Map<String, String> result = BatchCreateOrderAction.getLoad();
		for(String key : result.keySet()) {
			assert result.get(key).equals("true") : "key";
		}
	}
	
	// search original so
	@Test
	public void checkSearchSORules() {
		printLogger(BatchCreateOrderCase.class,"searchSORules");
		Map<String, String> map = new HashMap<String, String>();
		map.put("errorSO", "test");
		map.put("soExist", "654321");
		Map<String, String> result = BatchCreateOrderAction.getSearchSORules(map);
		assert result.get("so").contains("ng-invalid") : "";
		assert result.get("error").equals("The order is not supported batch create order.") : "";
	}
	
	@Test
	public void checkSearchSO() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("so", "117295340");
		Map<String, String> result = BatchCreateOrderAction.getSearchSO(map);
		assert result.get("bu").equals("Newegg.ca") : "";
	}
	
	// batch create order 
//	@Test
//	public void checkBatchCreateOrderRules() {
//		printLogger(BatchCreateOrderCase.class,"batchCreateOrder");
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("so", "117295340");
//		map.put("itemTotal1", "1");
//		map.put("itemTotal2", "6");
//		Map<String, String> result = BatchCreateOrderAction.getBatchCreateOrderRules(map);
//		assert result.get("orderCount1").equals("") : "";
//		assert result.get("orderCount2").equals("3") : "";
//	}
	
	// history data load
	@Test
	@Parameters({"url2"})
	public void checkHistoryDataLoad(String url) {
		printLogger(BatchCreateOrderCase.class,"historyDataLoad");
		openWindow(url);
		Map<String, String> result = BatchCreateOrderAction.getHistoryDataLoad();
		assert result.get("keyword").equals("true") : "";
		assert result.get("issue").equals("true") : "";
		assert result.get("reset").equals("true") : "";
		assert result.get("search").equals("true") : "";
	}
	
	// history search
	@Test
	public void checkHistorySearch() {
		printLogger(BatchCreateOrderCase.class,"historySearch");
		Map<String, String> map = new HashMap<String, String>();
		map.put("so", "117295340");
		Map<String, String> result = BatchCreateOrderAction.getHistorySearch(map);
		assert result.get("so").equals(map.get("so")) : "";
		assert !result.get("so2").equals("") : "";
		assert result.get("content").equals("No records available.") : "";
	}

}
