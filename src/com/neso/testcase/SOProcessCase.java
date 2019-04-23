package com.neso.testcase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.neso.action.SOProcessAction;
import com.neso.factory.CommonUtil;
import com.sqlconnect.SqlFactory;

public class SOProcessCase extends CommonUtil{
	
	// basic search
	@Test
	public void checkLoad() {
		printLogger(SOProcessCase.class,"basicSearch");
		Map<String, String> result = SOProcessAction.getLoad();
		assert result.get("recentButton").equals("true") : "1";
		assert result.get("recent").equals("6 Month") : "2";
		assert result.get("yearButton").equals("false") : "3";
		assert result.get("fromButton").equals("false") : "4";
		//assert result.get("dateValue").equals(result.get("dateValue2")) : "5";
		assert result.get("bu").equals("All") : "6";
		assert result.get("reset").equals("true") : "7";
		assert result.get("search").equals("true") : "8";
	}
	
	@Test
	public void checkSONumber() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("so1", "test");
		map.put("so2", " ");
		map.put("so3", "2147483648");
		map.put("so4", "2147483647");
		map.put("so5", "122659444");
		Map<String, String> result = SOProcessAction.getSONumber(map);
		assert result.get("error1").trim().equals("Should be number.") : "";
		assert result.get("error2").trim().equals("Should be number.") : "";
		assert result.get("error3").equals("SONumber should be valid number.") : "";
		assert result.get("error4").equals("No records available.") : "";
		assert result.get("error5").equals("2011") : "";
	}
	
	@Test
	public void checkCustomerNumber() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("customer1", "test");
		map.put("customer2", " ");
		map.put("customer3", "2147483648");
		map.put("customer4", "2147483647");
		map.put("customer5", "7402162");
		Map<String, String> result = SOProcessAction.getCustomerNumber(map);
		assert result.get("error1").trim().equals("Should be number.") : "";
		assert result.get("error2").trim().equals("Should be number.") : "";
		assert result.get("error3").equals("CustomerNumber should be valid number.") : "";
		assert result.get("error4").equals("No records available.") : "";
		assert !result.get("error5").equals("") : "";
	}
	
	@Test
	public void checkPhone() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("phone1", "123456");
		map.put("bu", "Newegg.com");
		map.put("phone2", "412-656-8888");
		map.put("phone3", "626-347-5618");
		map.put("phone4", "617-501-6199");
		map.put("recent", "2 Year");
		Map<String, String> result = SOProcessAction.getPhone(map);
		assert result.get("error1").equals("Because you input customer info, you should select BU.") : "";
		assert result.get("error2").equals("No records available.") : "";
		assert !result.get("so1").equals("") : "";
		assert !result.get("so2").equals("") : "";
	}
	
	@Test
	public void checkRMANumber() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("rma1", "test");
		map.put("rma2", " ");
		map.put("rma3", "2147483648");
		map.put("rma4", "2147483647");
		map.put("rma5", "81956460");
		Map<String, String> result = SOProcessAction.getRMANumber(map);
		assert result.get("error1").trim().equals("Should be number.") : "";
		assert result.get("error2").trim().equals("Should be number.") : "";
		assert result.get("error3").equals("RMANumber should be valid number.") : "";
		assert result.get("error4").equals("No records available.") : "";
		assert !result.get("so").equals("") : "";
	}
	
	@Test
	public void checkEmailAddress() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("email1", "test");
		map.put("email2", "test@qq.com");
		map.put("email3", "nparealtest@gmail.com");
		map.put("bu", "Newegg.com");
		map.put("email4", "jasonlin930202@gmail.com");
		Map<String, String> result = SOProcessAction.getEmailAddress(map);
		assert result.get("error1").equals("Should be email.") : "";
		assert result.get("error2").equals("Because you input customer info, you should select BU.") : "";
		assert !result.get("so1").equals("") : "";
		assert !result.get("so2").equals("") : "";
	}
	
	@Test
	public void checkInvoiceNumber() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("invoice1", "test");
		map.put("invoice2", " ");
		map.put("invoice3", "2147483648");
		map.put("invoice4", "2147483647");
		map.put("invoice5", "160252105");
		Map<String, String> result = SOProcessAction.getInvoiceNumber(map);
		assert result.get("error1").trim().equals("Should be number.") : "";
		assert result.get("error2").trim().equals("Should be number.") : "";
		assert result.get("error3").equals("InvoiceNumber should be valid number.") : "";
		assert result.get("error4").equals("No records available.") : "";
		assert !result.get("so").equals("") : "";
	}
	
	@Test
	public void checkPreOrderNumber() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("order1", "test");
		map.put("order2", " ");
		map.put("order3", "2147483648");
		map.put("order4", "2147483647");
		map.put("order5", "10159095");
		Map<String, String> result = SOProcessAction.getPreOrderNumber(map);
		assert result.get("error1").trim().equals("Should be number.") : "";
		assert result.get("error2").trim().equals("Should be number.") : "";
		assert result.get("error3").equals("PreSONumber should be valid number.") : "";
		assert result.get("error4").equals("No records available.") : "";
		assert !result.get("so").equals("") : "";
	}
	
	@Test
	public void checkCCNumber() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("number", "5472160195168422");
		Map<String, String> result = SOProcessAction.getCCNumber(map);
		assert !result.get("so").equals("") : "";
	}
	
	@Test
	public void checkTrackingNumber() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("number", "010303501");
		Map<String, String> result = SOProcessAction.getTrackingNumber(map);
		assert !result.get("so").equals("") : "";
	}
	
	@Test
	public void checkPriority() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("so", "116761820");
		map.put("invoice", "160147317");
		map.put("rma", "81919680");
		map.put("tracking", "010292150");
		map.put("preOrder", "10159095");
		map.put("customer", "7395822");
		map.put("eBay", "office-info1");
		map.put("email", "toy.f.xie@newegg.net");
		map.put("phone", "626-347-5618");
		map.put("cc", "5472160195168422");
		map.put("merchant", "180101");
		map.put("bu", "Newegg.ca");
		map.put("bu2", "Newegg.com");
		map.put("bu2", "All");
		// 优先级有问题
		Map<String, String> result = new SOProcessAction().getPriority(map);
		assert result.get("customer1").equals("7402162") : "";
		assert result.get("customer2").equals("7402162") : "";
		assert result.get("customer3").equals("14455211") : "";
		assert result.get("customer4").equals(result.get("customer5")) : "";
		assert result.get("customer6").equals("14358427") : "";
		assert result.get("customer7").equals("7395822") : "";
		assert result.get("customer8").equals("43202799") : "";
		assert result.get("customer9").equals("7085340") : "";
		assert result.get("customer10").equals(result.get("customer11")) : "";
		assert result.get("customer12").equals("26405061") : "";
	}
	
	// advance search
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkCreateUser(String username,String password) {
		printLogger(SOProcessCase.class,"advanceSearch");
		Map<String, String> map = new HashMap<String, String>();
		map.put("createUser", "yy69");
		map.put("customer", "7402162");
		Map<String, String> result = SOProcessAction.getCreateUser(map);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT top 1 SONumber from NHISSLS.dbo.View3YN_SOMaster WITH(NOLOCK) WHERE SalesPerson ='" + map.get("createUser") + "' AND CustomerNumber =" + map.get("customer") + " AND SODate > '2018-01-01' AND SODate < '2019-01-01' order by SODate desc";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		assert result.get("soNumber").equals(list.get(0).get("SONumber")) : "";
	}

	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkContactPers(String username,String password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("contact", "yeva");
		map.put("so", "1228212360");
		Map<String, String> result = SOProcessAction.getContactPers(map);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT CustomerNumber FROM NHISSLS.dbo.View3YN_SOMaster WITH(NOLOCK) WHERE bBillingContactWith = '" + map.get("contact") + "'  AND CustomerNumber IN ( SELECT CustomerNumber FROM NHISSLS.dbo.View3YN_SOMaster WITH(NOLOCK) WHERE SONumber = " + map.get("so") + " ) AND SODate > '2018-01-01' AND SODate < '2019-01-01' ORDER BY SODate DESC";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		assert result.get("customer").equals(list.get(0).get("CustomerNumber")) : "";
	}
	
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkShoppingCartNumber(String username,String password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("shoppingCart", "PO3VNXO1VVSJY5S");
		map.put("invoice", "160252105");
		Map<String, String> result = SOProcessAction.getShoppingCartNumber(map);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT SONumber FROM NHISSLS.dbo.View3YN_SOMaster WITH(NOLOCK) WHERE ShoppingCartID ='" + map.get("shoppingCart") + "' AND InvoiceNumber =" + map.get("invoice");
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		assert result.get("so").equals(list.get(0).get("SONumber")) : "";
	}
	
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkItemNumber(String username,String password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("item", "34-850-470");
		map.put("rma", "81956460");
		Map<String, String> result = SOProcessAction.getItemNumber(map);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT top 10 A.SONumber FROM NHissls..View3YN_SOMaster A WITH(NOLOCK) INNER JOIN NHissls..View3YN_SOTransaction B WITH(NOLOCK) ON A.SONumber = B.SONumber INNER JOIN NSVC2005..RMAMaster C WITH(NOLOCK) ON A.SONumber = C.SourceSONumber WHERE B.ItemNumber ='" + map.get("item") + "' AND C.RMANumber =" + map.get("rma");
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		assert result.get("so").equals(list.get(0).get("SONumber")) : "";
	}
	
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkItemDesc(String username,String password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("order", "10159095");
		map.put("desc", "SSD 250G|WD WDS250G2X0C R");
		Map<String, String> result = SOProcessAction.getItemDesc(map);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT top 10 A.SONumber FROM NHissls..View3YN_SOMaster A WITH(NOLOCK) INNER JOIN NHissls..View3YN_SOTransaction B WITH(NOLOCK) ON A.SONumber = B.SONumber INNER JOIN Nsls..NewEgg_PRESOMaster C WITH(NOLOCK) ON A.SONumber = C.SONumber WHERE B.Description LIKE '%' + Rtrim('" + map.get("desc") + "') + '%' AND C.PreSONumber =" + map.get("order");
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		assert result.get("so").equals(list.get(0).get("SONumber")) : "";
	}
	
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkMerchantNumber(String username,String password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("merchant1", "test");
		map.put("merchant2", " ");
		map.put("merchant3", "2147483648");
		map.put("merchant4", "2147483647");
		map.put("merchant5", "180101");
		Map<String, String> result = SOProcessAction.getMerchantNumber(map);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT top 10 A.CustomerNumber FROM NHissls..View3YN_SOMaster A WITH(NOLOCK) INNER JOIN Customer..MerchantContact B WITH(NOLOCK) ON A.CustomerNumber = B.CustomerNumber WHERE B.MerchantID =" + map.get("merchant5") + " AND SODate > '2018-01-01' AND SODate < '2019-01-01' order by SODate desc";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		assert result.get("error1").equals(result.get("error2")) : "111"; 
		assert result.get("error3").trim().equals("MerchantID should be valid number.") : "222";
		assert result.get("error4").equals("No records available.") : "333";
		assert result.get("customer").equals(list.get(0).get("CustomerNumber")) : "444";
	}
	
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkEBayNumber(String username,String password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("eBay", "office-info1");
		Map<String, String> result = SOProcessAction.getEBayNumber(map);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT SONumber FROM NHissls..View3YN_SOMaster WITH(NOLOCK) WHERE CustomerNumber IN ( SELECT CustomerNumber FROM Customer.dbo.EC_ebayCustomer WITH(NOLOCK) WHERE BuyerUserID ='" + map.get("eBay") + "' ) AND SODate > '2018-01-01' AND SODate < '2019-01-01'";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		assert result.get("so").equals(list.get(0).get("SONumber")) : "";
	}
	
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkCustomerPONumber(String username,String password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("customer", "4N84GXTP");
		Map<String, String> result = SOProcessAction.getCustomerPONumber(map);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT TOP 10 SONumber FROM NHISSLS.dbo.View3YN_SOMaster with(nolock) WHERE CustomerPONumber = '" + map.get("customer") + "'";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		assert result.get("so").equals(list.get(0).get("SONumber")) : "";
	}
	
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkStatus(String username,String password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("recent", "10 day");
		map.put("bu", "Newegg.com/AUS");
		map.put("status", "ShipOut");
		Map<String, String> result = SOProcessAction.getStatus(map);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT top 10 SONumber FROM NHISSLS.dbo.View3YN_SOMaster with(nolock) WHERE Status = 'C' AND SODate > CONVERT(VARCHAR(10),GETDATE()-10,120) AND ShippingCountry = 'AUS' ORDER BY SODate DESC, SOAmount ASC";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		assert result.get("so").equals(list.get(0).get("SONumber")) : "";
	}
	
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkPayTermShipping(String username,String password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("recent", "10 day");
		map.put("bu", "Newegg.com/AUS");
		map.put("payTerm", "2");
		map.put("shipping", "4");
		Map<String, String> result = SOProcessAction.getPayTermShipping(map);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT TOP 10 SONumber FROM NHissls..View3YN_SOMaster WITH(NOLOCK) WHERE ShippingCountry = 'AUS' AND ShipViaCode = '134' AND SODate > '2018-01-01' AND PayTermsCode = '001' ORDER BY SODate DESC";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		assert result.get("so").equals(list.get(0).get("SONumber")) : "";
	}
	

}
