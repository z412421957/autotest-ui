package com.neso.testcase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.neso.action.SubscriptionItemQueryAction;
import com.neso.factory.CommonUtil;
import com.sqlconnect.SqlFactory;

public class SubscriptionItemQueryCase extends CommonUtil{

	// load
	@Test
	public void checkPageLoad() {
		printLogger(SubscriptionItemQueryCase.class,"load");
		Map<String, String> result = SubscriptionItemQueryAction.getPageLoad();
		assert result.get("itemText").equals("true") : "1";
		assert result.get("search").equals("true") : "2";
		assert result.get("item").equals("Item#") : "3";
		assert result.get("bu").equals("All") : "4";
		assert result.get("program").equals("All") : "5";
	}
	
	// query
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkBuProgramRules(String username,String password) {
		printLogger(SubscriptionItemQueryCase.class,"query");
		Map<String, String> result = SubscriptionItemQueryAction.getBuProgramRules();
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT top 10 Description,ProgramID FROM imk.dbo.Newegg_Subscription_Programs WITH(NOLOCK) where CountryCode = 'USA'";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 2);
		assert result.get("program").equals(list.get(0).get("ProgramID") + "|" + list.get(0).get("Description")) : "";
	}
	
	@Test
	public void checkItemNumberRules() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("item", "123");
		Map<String, String> result = SubscriptionItemQueryAction.getItemNumberRules(map);
		assert result.get("item").contains("ng-invalid") : "";
		assert result.get("item2").contains("ng-invalid") : "";
	}
	
	@Test
	@Parameters({"url","sqlUsername","sqlPassword"})
	public void checkItemNumberSearch(String url,String username,String password) {
		Map<String, String> map = new HashMap<String, String>();
		openWindow(url);
		String url1 = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT TOP 10 A.ItemNumber,C.ProgramID,A.CountryCode,A.CompanyCode FROM inventory.dbo.ItemPriceSetting AS A WITH(NOLOCK) INNER JOIN abs.dbo.arinvt01 AS B WITH(NOLOCK) ON A.ItemNumber = B.Item AND A.Active = '1' INNER JOIN imk.dbo.Newegg_Subscription_Programs AS C WITH(NOLOCK) ON A.SubscriptionProgramID = C.ProgramID AND C.Status = '1' AND A.CountryCode = C.CountryCode AND A.CompanyCode = C.CompanyCode";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url1, username, password, sql, 4);
		map.put("item", "99-999-999");
		map.put("item2", list.get(0).get("ItemNumber"));
		Map<String, String> result = SubscriptionItemQueryAction.getItemNumberSearch(map);
		assert result.get("content").equals("No records available.") : result.get("content");
		assert result.get("program").equals(list.get(0).get("ProgramID")) : result.get("program");
		assert result.get("itemLink").equals("https://central3testing.newegg.org/neso-item-detail/main?itemnumber=" + map.get("item2") + "&countrycode=" + list.get(0).get("CountryCode") + "&companycode=" + list.get(0).get("CompanyCode")) : result.get("itemLink");
		assert result.get("iconLink").equals("https://www.newegg.com/Product/Product.aspx?Item=" + map.get("item2")) : result.get("iconLink");
	}
	
	@Test
	public void checkProgramDetailLoad() {
		Map<String, String> result = SubscriptionItemQueryAction.getProgramDetailLoad();
		for(String key : result.keySet()) {
			assert result.get(key).equals("true") : key;
		}
	}
	
	
	
}
