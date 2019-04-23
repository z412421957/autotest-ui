package com.neso.testcase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.neso.action.CustomerMaintainAction;
import com.neso.factory.CommonUtil;
import com.sqlconnect.SqlFactory;

public class CustomerMaintainCase extends CommonUtil{
	
	// page load
	@Test
	public void checkPageLoad() {
		printLogger(CustomerMaintainCase.class,"pageLoad");
		Map<String,String> result = CustomerMaintainAction.getPageLoad();
		for(String key : result.keySet()) {
			if (key.equals("edit"))
				assert result.get(key).equals("false") : "Failed : " + key;
			else
				assert result.get(key).equals("true") : "Failed : " + key;
		}
	}
	
	// create new rules
	@Test
	public void checkCreateNewRules() {
		printLogger(CustomerMaintainCase.class,"createNewRules");
		Map<String,String> result = CustomerMaintainAction.getCreateNewRules();
		for(String key : result.keySet()) {
			if (key.equals("new")) 
				assert result.get(key).equals("false") : "Failed : " + key;
			else
				assert result.get(key).equals("true") : "Failed : " + key;
		}
		
	}
	
	// create new USA
	@Test
	public void checkCreateNewUSA() {
		printLogger(CustomerMaintainCase.class,"createNewUSA");
		Map<String,String> map = new HashMap<String,String>();
		String rand = getRandom(89999,10000);
		map.put("cName1","garre");
		map.put("cName3","autotest");
		map.put("cLoginName","NESOAutoTestingUSA" + rand + "@newegg.com");
		map.put("cPassword","Newegg@123");
		map.put("bAddress","garre autotest");
		map.put("bCity","garre autotest");
		map.put("bState", "9");
		map.put("bBiPhone","345-343-1420");
		map.put("bZip","91745");
		map.put("sName1","garre");
		map.put("sName3","autotest");
		map.put("sAddress","17708 Rowland St");
		map.put("sCity","Rowland Heights");
		map.put("sState","9");
		map.put("sPhone","123-456-7890");
		map.put("sZip","91748-1119");
		map.put("oTerm", "2");
		map.put("oCard1","5472");
		map.put("oCard2","1601");
		map.put("oCard3","9516");
		map.put("oCard4","8422");
		map.put("oDate","01/19");
		map.put("oBank","8888888888");
		map.put("oEmail","Garre.Y.Gou@newegg.com");
		Map<String,String> result = CustomerMaintainAction.getCreateNewUSA(map);
		assert result.get("customer").length() > 0 : "Failed : create new USA failed, dont return the customer number.";
	}
	
	// create new CHN
	@Test
	@Parameters({"url"})
	public void checkCreateNewCHN(String url) {
		printLogger(CustomerMaintainCase.class,"createNewCHN");
		Map<String,String> map = new HashMap<String,String>();
		String rand = getRandom(89999,10000);
		openWindow(url);
		map.put("cName","garre autotest");
		map.put("cLoginName","NESOAutoTestingtthigo" + rand + "@newegg.com");
		map.put("cPassword","Newegg@123");
		map.put("bCountry", "4");
		map.put("sCountry","4");
		map.put("sProvince","9");
		map.put("sAddress","ruanjianyuan A");
		map.put("sName","newegg testing");
		map.put("sPhone","12345678911");
		map.put("oEmail","Garre.Y.Gou@newegg.com");
		Map<String,String> result = CustomerMaintainAction.getCreateNewCHN(map);
		assert result.get("customer").length() > 0 : "Failed : create new CHN failed, dont return the customer number.";
	}
	
	// create new Inl
	@Test
	@Parameters({"url"})
	public void checkCreateNewInl(String url) {
		printLogger(CustomerMaintainCase.class,"createNewInl");
		Map<String,String> map = new HashMap<String,String>();
		String rand = getRandom(89999,10000);
		openWindow(url);
		map.put("cName1","garre");
		map.put("cName3","autotest");
		map.put("cLoginName","NESOAutoTestingGBR" + rand + "@newegg.com");
		map.put("cPassword","Newegg@123");
		map.put("bAddress","garre autotest");
		map.put("bCity","garre autotest");
		map.put("bState", "75");
		map.put("bCountry", "5");
		map.put("bBiPhone","345-343-1420");
		map.put("bZip","UB3 2RY");
		map.put("sName1","garre");
		map.put("sName3","autotest");
		map.put("sAddress","17708 Rowland St");
		map.put("sCity","Rowland Heights");
		map.put("sState","75");
		map.put("sCountry", "5");
		map.put("sPhone","123-456-7890");
		map.put("sZip","UB3 2RY");
		map.put("oTerm", "2");
		map.put("oCard1","5472");
		map.put("oCard2","1601");
		map.put("oCard3","9516");
		map.put("oCard4","8422");
		map.put("oDate","01/19");
		map.put("oBank","8888888888");
		map.put("oEmail","Garre.Y.Gou@newegg.com");
		Map<String,String> result = CustomerMaintainAction.getCreateNewInl(map);
		assert result.get("customer").length() > 0 : "Failed : create new International failed, dont return the customer number.";
	}
	
	// edit customer USA
	@Test
	@Parameters({"url","sqlUsername","sqlPassword"})
	public void checkEditCustomerUSA(String url,String username,String password) {
		printLogger(CustomerMaintainCase.class,"editCustomerUSA");
		Map<String,String> map = new HashMap<String,String>();
		String rand = getRandom(9999,1);
		openWindow(url);
		String url1 = "jdbc:sqlserver://newsql:1433";
		String sql1 = "SELECT TOP 1 CustomerNumber FROM NCustomer.dbo.NewEgg_Customer WITH(NOLOCK) where LastEditUser = 'km11' and Country = 'USA' order by LastEditDate desc";
		List<Map<String,String>> result = SqlFactory.getSqlOfListMap(url1, username, password, sql1, 1);
		map.put("customer", result.get(0).get("CustomerNumber"));
		map.put("cName1", "garre" + rand);
		map.put("cName3", "autotest" + rand);
		map.put("bAddress", "garre autotest" + rand);
		map.put("bCity", "garre autotest" + rand);
		map.put("oBank", "bank" + rand);
		map.put("oEmail", "412421957@qq.com");
		CustomerMaintainAction.getEditCustomerUSA(map);
		String sql2 = "SELECT TOP 10 ContactWith,BillingAddress1,BillingCity,EmailAddress,BankPhoneNumber FROM NCustomer.dbo.NewEgg_Customer WITH(NOLOCK) where CustomerNumber = '" + map.get("customer") + "'";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url1, username, password, sql2, 5);
		assert list.get(0).get("ContactWith").equals(map.get("cName1") + "  " + map.get("cName3")) : "Edit failed : customer name.";
		assert list.get(0).get("BillingAddress1").equals(map.get("bAddress")) : "Edit failed : billing address.";
		assert list.get(0).get("BillingCity").equals(map.get("bCity")) : "Edit failed : billing city.";
		assert list.get(0).get("EmailAddress").equals(map.get("oEmail")) : "Edit failed : other email.";
		assert list.get(0).get("BankPhoneNumber").equals(map.get("oBank")) : "Edit failed : other bank.";
	}
	
	// edit customer CHN
	@Test
	@Parameters({"url","sqlUsername","sqlPassword"})
	public void checkEditCustomerCHN(String url,String username,String password) {
		printLogger(CustomerMaintainCase.class,"editCustomerCHN");
		Map<String,String> map = new HashMap<String,String>();
		String rand = getRandom(9999,1);
		openWindow(url);
		String url1 = "jdbc:sqlserver://newsql:1433";
		String sql1 = "SELECT TOP 1 CustomerNumber FROM NCustomer.dbo.NewEgg_Customer WITH(NOLOCK) where LastEditUser = 'km11' and Country = 'CHN' order by LastEditDate desc";
		List<Map<String,String>> result = SqlFactory.getSqlOfListMap(url1, username, password, sql1, 1);
		map.put("customer", result.get(0).get("CustomerNumber"));
		map.put("cName", "garre autotest" + rand);
		map.put("oEmail", "412421957@qq.com");
		CustomerMaintainAction.getEditCustomerCHN(map);
		String sql2 = "SELECT TOP 10 ContactWith,EmailAddress FROM NCustomer.dbo.NewEgg_Customer WITH(NOLOCK) where CustomerNumber = '" + map.get("customer") + "'";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url1, username, password, sql2, 2);
		assert list.get(0).get("ContactWith").equals(map.get("cName")) : "Edit failed : customer name.";
		assert list.get(0).get("EmailAddress").equals(map.get("oEmail")) : "Edit failed : other email.";
	}
	
	// edit customer Inl
	@Test
	@Parameters({"url","sqlUsername","sqlPassword"})
	public void checkEditCustomerInl(String url,String username,String password) {
		printLogger(CustomerMaintainCase.class,"editCustomerInl");
		Map<String,String> map = new HashMap<String,String>();
		String rand = getRandom(9999,1);
		openWindow(url);
		String url1 = "jdbc:sqlserver://newsql:1433";
		String sql1 = "SELECT TOP 1 CustomerNumber FROM NCustomer.dbo.NewEgg_Customer WITH(NOLOCK) where LastEditUser = 'km11' and Country = 'GBR' order by LastEditDate desc";
		List<Map<String,String>> result = SqlFactory.getSqlOfListMap(url1, username, password, sql1, 1);
		map.put("customer", result.get(0).get("CustomerNumber"));
		map.put("cName1", "garre" + rand);
		map.put("cName3", "autotest" + rand);
		map.put("bAddress", "garre autotest" + rand);
		map.put("bCity", "garre autotest" + rand);
		map.put("oBank", "bank" + rand);
		map.put("oEmail", "412421957@qq.com");
		CustomerMaintainAction.getEditCustomerInl(map);
		String sql2 = "SELECT TOP 10 ContactWith,BillingAddress1,BillingCity,EmailAddress,BankPhoneNumber FROM NCustomer.dbo.NewEgg_Customer WITH(NOLOCK) where CustomerNumber = '" + map.get("customer") + "'";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url1, username, password, sql2, 5);
		assert list.get(0).get("ContactWith").equals(map.get("cName1") + "  " + map.get("cName3")) : "Edit failed : customer name.";
		assert list.get(0).get("BillingAddress1").equals(map.get("bAddress")) : "Edit failed : billing address.";
		assert list.get(0).get("BillingCity").equals(map.get("bCity")) : "Edit failed : billing city.";
		assert list.get(0).get("EmailAddress").equals(map.get("oEmail")) : "Edit failed : other email.";
		assert list.get(0).get("BankPhoneNumber").equals(map.get("oBank")) : "Edit failed : other bank.";
	}
	
	// edit customer USB
	@Test
	@Parameters({"url"})
	public void checkEditCustomerUSB(String url) {
		printLogger(CustomerMaintainCase.class,"editCustomerUSB");
		Map<String,String> map = new HashMap<String,String>();
		openWindow(url);
		map.put("customer", "7395822");
		Map<String,String> result = CustomerMaintainAction.getEditCustomerUSB(map);
		assert result.get("editButton").equals("false") : "Edit failed : usb customer should not edit.";
	}
	
	// load Invalid Customer
	@Test
	public void checkLoadInvalidCustomer() {
		printLogger(CustomerMaintainCase.class,"loadInvalidCustomer");
		Map<String,String> map = new HashMap<String,String>();
		map.put("customer", "9897557");
		Map<String,String> result = CustomerMaintainAction.getLoadInvalidCustomer(map);
		assert result.get("error").equals("Customer " + map.get("customer") + " has been deactivated.") : "Load failed : load deactivated customer failed.";
	}
	
	// change password
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkChangePassword(String username,String password) {
		printLogger(CustomerMaintainCase.class,"changePassword");
		Map<String,String> map = new HashMap<String,String>();
		String url = "jdbc:sqlserver://newsql:1433";
		String sql1 = "SELECT TOP 1 CustomerNumber FROM NCustomer.dbo.NewEgg_Customer WITH(NOLOCK) where LastEditUser = 'km11' and Country = 'USA' order by LastEditDate desc";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql1, 1);
		map.put("customer", list.get(0).get("CustomerNumber"));
		map.put("password", "newpassword");
		Map<String,String> result = CustomerMaintainAction.getChangePassword(map);
		assert result.get("password").equals("true") : "Change failed : dont find the tip.";
	}
	
	// customer Memo
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkCustomerMemo(String username,String password) {
		printLogger(CustomerMaintainCase.class,"customerMemo");
		Map<String,String> map = new HashMap<String,String>();
		String rand = getRandom(9999,1);
		map.put("value", "garre autotest" + rand);
		Map<String,String> result = CustomerMaintainAction.getCustomerMemo(map);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT TOP 1 Note FROM [mis].[dbo].[NESO_CallReasonList] WITH(NOLOCK) WHERE CustomerNumber =" + result.get("customer") + " order by InDate desc";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		assert list.get(0).get("Note").equals(map.get("value")) : "Create memo failed : the note is not same as the value in sql.";
	}
}
