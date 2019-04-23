package com.neso.testcase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.neso.action.CustomerFlagSetAction;
import com.neso.factory.CommonUtil;
import com.sqlconnect.SqlFactory;

public class CustomerFlagSetCase extends CommonUtil{

	// add new flag
	@Test
	public void checkCustomerNotInt(){
		printLogger(CustomerFlagSetCase.class,"addNewFlag");
		Map<String,String> map = new HashMap<String,String>();
		map.put("customer", "abc");
		Map<String,String> result = CustomerFlagSetAction.getCustomerNotInt(map);
		assert result.get("error").contains("ng-invalid") : "Customer Flag Set : The input is not type of 'int' check failed";
	}
	
	@Test
	public void checkCustomerNotFound(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("customer", "12345");
		Map<String,String> result = CustomerFlagSetAction.getCustomerNotFound(map);
		assert !result.get("error").equals("") : "Customer Flag Set : The customer not found check failed";
	}
	
	@Test
	public void checkCustomerSuccess(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("customer","7536962");
		Map<String,String> result = CustomerFlagSetAction.getCustomerSuccess(map);
		assert !result.get("email").equals("") : "Customer Flag Set : The email is empty now";
		assert result.get("addNew").equals("true") : "Customer Flag Set : The add new button should be enabled but not";
	}
	
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkAddNewFlag(String username,String password){
		Map<String,String> map = new HashMap<String,String>();
		map.put("memo","memo autotest");
		CustomerFlagSetAction.getAddNewFlag(map);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT TOP 1 Status FROM Newegg.dbo.NESO_CRMExtensionSetup WITH(NOLOCK) where CustomerNumber = 7536962 order by InDate DESC";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		while( !inforRepeat(list.get(0).get("Status"),"A",30,15)){
			list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		}
		assert list.get(0).get("Status").equals("A") : "Customer Flag Set : The new flag is not in db";
	}
	
	@Test
	public void checkRepeatAdd(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("memo","memo autotest");
		CustomerFlagSetAction.getRepeatAdd(map);
	}
	
	// search
	@Test
	public void checkCustomerFlagInvalid(){
		printLogger(CustomerFlagSetCase.class,"search");
		Map<String,String> map = new HashMap<String,String>();
		map.put("customer","2546853");
		Map<String,String> result = CustomerFlagSetAction.getCustomerFlagInvalid(map);
		assert !result.get("message").equals("") : "Customer Flag Set : The search invalid customer flag check failed";
	}
	
	@Test
	public void checkCustomerFlagValid(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("customer","7536962");
		Map<String,String> result = CustomerFlagSetAction.getCustomerFlagValid(map);
		assert !result.get("flag").equals("") : "Customer Flag Set : The search valid customer flag check failed";
	}
	
	// delete customer flag
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkDeleteCustomerFlag(String username,String password){
		printLogger(CustomerFlagSetCase.class,"deleteCustomerFlag");
		Map<String,String> map = new HashMap<String,String>();
		map.put("customer","7536962");
		CustomerFlagSetAction.getDeleteCustomerFlag(map);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT TOP 1 Status FROM Newegg.dbo.NESO_CRMExtensionSetup WITH(NOLOCK) where CustomerNumber = 7536962 order by InDate DESC";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		while( !inforRepeat(list.get(0).get("Status"),"D",30,15)){
			list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		}
		assert list.get(0).get("Status").equals("D") : "Customer Flag Set : The delete customer flag check failed";
	}
	
	
	@AfterTest
	@Parameters({"url"})
	public void loadPage(String url){
		openWindow(url);
		w(5);
	}

	
}
