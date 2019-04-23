package com.neso.testcase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.neso.action.RewardsBlockedListAction;
import com.neso.factory.CommonUtil;
import com.sqlconnect.SqlFactory;

public class RewardsBlockedListCase extends CommonUtil{
	
	// load
	@Test
	public void checkPageLoad() {
		printLogger(RewardsBlockedListCase.class,"load");
		Map<String, String> result = RewardsBlockedListAction.getPageLoad();
		for(String key : result.keySet()) {
			if (key.equals("type"))
				assert result.get(key).equals("Merchant ID") : "";
			else if (key.equals("export"))
				assert result.get(key).equals("false") : "";
			else
				assert result.get(key).equals("true") : "";	
		}
	}
	
	// add
	@Test
	public void checkAddRules() {
		printLogger(RewardsBlockedListCase.class,"add");
		Map<String, String> result = RewardsBlockedListAction.getAddRules();
		assert result.get("name").equals("") : "";
		assert result.get("primary").equals("") : "";
		assert result.get("contact").equals("") : "";
		assert result.get("memo").equals("") : "";
		assert result.get("merchant").contains("ng-invalid") : "";
	}
	
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkAdd(String username,String password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("merchant", "1052168");
		Map<String, String> result = RewardsBlockedListAction.getAdd(map);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT MerchantID FROM NEWEGG.dbo.NESO_B2BRewards_BlackList WITH(NOLOCK) WHERE MerchantID = 1052168 AND Status = 'O'";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		assert map.get("merchant").equals(list.get(0).get("MerchantID")) : "";
		assert result.get("error").equals("The merchant does not exists or has already in rewards blocked list!") : "";
	}
	
	// query
	@Test
	public void checkSearch() {
		printLogger(RewardsBlockedListCase.class,"query");
		Map<String, String> map = new HashMap<String, String>();
		map.put("merchant", "1052168");
		map.put("name", "Mer123");
		map.put("primary", "47234274");
		map.put("block", "km11");
		Map<String, String> result = RewardsBlockedListAction.getSearch(map);
		for(String key : result.keySet()) {
			if(key.equals("export"))
				assert result.get(key).equals("true") : "";
			else
				assert result.get(key).equals(map.get("merchant")) : "";
		}
	}
	
	@Test
	public void checkLink() {
		Map<String, String> result = RewardsBlockedListAction.getLink();
		assert result.get("merchant").equals("https://central3testing.newegg.org/neso-crm-merchant-detail/main?merchantid=1052168") : "";
		assert result.get("primary").equals("https://central3testing.newegg.org/neso-customermaintain/customermaintain?customerNumber=47234274") : "";
	}
	
	// remove
	@Test
	public void checkRemove() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("merchant", "1052168");
		Map<String, String> result = RewardsBlockedListAction.getRemove(map);
		assert result.get("result").equals("No records available.") : "";
	}

}
