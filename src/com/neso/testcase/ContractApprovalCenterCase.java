package com.neso.testcase;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.neso.action.ContractApprovalCenterAction;
import com.neso.factory.CommonUtil;

public class ContractApprovalCenterCase extends CommonUtil{

	// data load
	@Test
	public void checkDataLoad() {
		printLogger(ContractApprovalCenterCase.class,"dataLoad");
		Map<String, String> result = ContractApprovalCenterAction.getDataLoad();
		assert result.get("merchant").equals("true") : "";
		assert result.get("shipping").equals("All") : "";
		assert result.get("status").equals("All") : "";
		assert result.get("search").equals("true") : "";
		assert result.get("approve").equals("false") : "";
		assert result.get("decline").equals("false") : "";
	}
	
	// search
	@Test
	public void checkSearchRules() {
		printLogger(ContractApprovalCenterCase.class,"search");
		Map<String, String> map = new HashMap<String, String>();
		map.put("merchant1", "test");
		map.put("merchant2", "22222222222");
		map.put("merchant", "2147483647");
		Map<String, String> result = ContractApprovalCenterAction.getSearchRules(map);
		assert result.get("merchant1").contains("ng-invalid") : "";
		assert result.get("merchant2").contains("ng-invalid") : "";
		assert result.get("content").equals("No records available.") : "";
	}
	
	@Test
	public void checkSearch() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("merchant", "100429");
		map.put("carrier", "2");
		map.put("status", "2");
		Map<String, String> result = ContractApprovalCenterAction.getSearch(map);
		assert !result.get("merchant").equals("") : "";
		assert result.get("merchant2").equals(map.get("merchant")) : "";
		assert result.get("carrier").equals(result.get("carrier1")) : "";
		assert result.get("status").equals(result.get("status1")) : "";
	}
	
	@Test
	public void checkSearchResult() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("merchant", "100429");
		map.put("status1", "3");
		map.put("status2", "4");
		Map<String, String> result = ContractApprovalCenterAction.getSearchResults(map);
		assert result.get("approve1").equals("false") : "";
		assert result.get("decline1").equals("true") : "";
		assert result.get("approve2").equals("true") : "";
		assert result.get("decline2").equals("false") : "";
	}
	
	// approve 
	@Test
	public void checkApprove() {
		printLogger(ContractApprovalCenterCase.class,"approve");
		Map<String, String> map = new HashMap<String, String>();
		map.put("status", "4");
		ContractApprovalCenterAction.getApprove(map);
	}
	
	// decline
	@Test
	public void checkDecline() {
		printLogger(ContractApprovalCenterCase.class,"decline");
		Map<String, String> map = new HashMap<String, String>();
		map.put("carrier", "3");
		map.put("status", "3");
		Map<String, String> result = ContractApprovalCenterAction.getDecline(map);
		assert result.get("content").equals("No records available.") : "";
	}
	
	// review contracts
	@Test
	@Parameters({"link"})
	public void checkReviewContract(String link) {
		printLogger(ContractApprovalCenterCase.class,"reviewContract");
		Map<String, String> map = new HashMap<String, String>();
		map.put("merchant", "100429");
		map.put("status", "3");
		Map<String, String> result = ContractApprovalCenterAction.getReviewContract(map);
		assert result.get("file").contains(link) : "";
	}
	
	// link other page
	@Test
	@Parameters({"link"})
	public void checkLinkOtherPage(String link) {
		printLogger(ContractApprovalCenterCase.class,"linkOtherPage");
		Map<String, String> map = new HashMap<String, String>();
		map.put("merchant", "100429");
		Map<String, String> result = ContractApprovalCenterAction.getLinkOtherPage(map);
		assert result.get("link").equals(link + map.get("merchant")) : "";
	}
	
}
