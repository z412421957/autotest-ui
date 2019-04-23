package com.neso.testcase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.neso.action.SocialMediaAction;
import com.neso.factory.CommonUtil;
import com.sqlconnect.SqlFactory;
import com.neso.pageobject.SocialMedia;

public class SocialMediaCase extends CommonUtil{
	
	// data load
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkDataLoad(String username,String password){
		printLogger(SocialMediaCase.class,"dataLoad");
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT top 5 csm.CustomerNumber FROM newegg.dbo.NESO_CustomerSocialMedia csm WITH(NOLOCK) LEFT JOIN CodeCenter.dbo.SocialMedia sm WITH(NOLOCK) ON sm.SocialMediaID=csm.SocialMediaID WHERE csm.Status='1' ORDER BY csm.InDate DESC";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		Map<String,String> result = SocialMediaAction.getDataLoad();
		assert result.get("customerNumber").equals(list.get(4).get("CustomerNumber")) : "";
	}
	
	@Test
	public void checkTextStatus(){
		Map<String,String> result = SocialMediaAction.getTextStatus();
		assert result.get("customerNumber").equals("true") : "";
		assert result.get("account").equals("true") : "";
		assert result.get("memo").equals("true") : "";
	}
	
	@Test
	public void checkButtonStatus(){
		Map<String,String> result = SocialMediaAction.getButtonStatus();
		for(String key : result.keySet())
		{
			assert result.get(key).equals("true") : "";
		}
	}
	
	// add new rules
	@Test
	public void checkAddTextRules(){
		printLogger(SocialMediaCase.class,"addSocialMediaRules");
		Map<String,String> result = SocialMediaAction.getAddTextRules();
		for(String key : result.keySet()){
			assert result.get(key).equals("true") : "";
		}
	}
	
	@Test
	public void checkAddRequiredRules(){
		Map<String,String> result = SocialMediaAction.getAddRequiredRules();
		for(String key : result.keySet()){
			assert result.get(key).contains("ng-invalid") : "";
		}
	}
	
	// add new
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkAddSocialMedia(String username,String password){
		printLogger(SocialMediaCase.class,"addSocialMedia");
		Map<String,String> map = new HashMap<String,String>();
		String rand = getRandom(9000,1000);
		map.put("customerNumber","28740045");
		map.put("account","account" + rand);
		map.put("socialMedia","4");
		map.put("memo","test memo " + rand);
		SocialMediaAction.getAddSocialMedia(map);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT top 5 csm.CustomerNumber FROM newegg.dbo.NESO_CustomerSocialMedia csm WITH(NOLOCK) LEFT JOIN CodeCenter.dbo.SocialMedia sm WITH(NOLOCK) ON sm.SocialMediaID=csm.SocialMediaID WHERE csm.Status='1' and csm.InUser = 'km11' ORDER BY csm.InDate DESC";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		int i = 0;
		while(list.size() < 1 && i < 15){
			w(15);
			list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
			i ++;
		}
		assert list.size() > 0 : "";
	}
	
	// edit
	@Test
	public void checkEditRules(){
		printLogger(SocialMediaCase.class,"editSocialMedia");
		Map<String,String> map = new HashMap<String,String>();
		map.put("customer", "28740045");
		Map<String,String> result = SocialMediaAction.getEditRules(map);
		assert result.get("customerNumber").length() > 0 : "";
		assert result.get("account").length() > 0 : "";
		assert result.get("socialMedia").length() > 0 : "";
		assert result.get("memo").length() > 0 : "";
	}
	
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkEditSocialMedia(String username,String password){
		Map<String,String> map = new HashMap<String,String>();
		String rand = getRandom(9000,1000);
		map.put("account", "account" + rand);
		map.put("socialMedia", "24");
		map.put("memo", "memo test " + rand);
		SocialMediaAction.getEditSocialMedia(map);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT top 1 csm.Account,sm.Name,csm.Memo FROM newegg.dbo.NESO_CustomerSocialMedia csm WITH(NOLOCK) LEFT JOIN CodeCenter.dbo.SocialMedia sm WITH(NOLOCK) ON sm.SocialMediaID=csm.SocialMediaID WHERE csm.Status='1' and csm.InUser = 'km11' ORDER BY csm.InDate DESC";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 3);
		while(!inforRepeat(list.get(0).get("Account"),map.get("account"),15,15)){
			list = SqlFactory.getSqlOfListMap(url, username, password, sql, 3);
		}
		assert list.get(0).get("Account").equals(map.get("account")) : "";
		assert list.get(0).get("Name").equals("YouTube") : "";
		assert list.get(0).get("Memo").equals(map.get("memo")) : "";
	}
	
	// search
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkSearchSocialMedia(String username,String password){
		printLogger(SocialMediaCase.class,"searchSocialMedia");
		Map<String,String> map = new HashMap<String,String>();
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT top 1 csm.Account,csm.CustomerNumber,csm.Memo FROM newegg.dbo.NESO_CustomerSocialMedia csm WITH(NOLOCK) LEFT JOIN CodeCenter.dbo.SocialMedia sm WITH(NOLOCK) ON sm.SocialMediaID=csm.SocialMediaID WHERE csm.Status='1' and csm.InUser = 'km11' ORDER BY csm.InDate DESC";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 3);
		map.put("customerNumber", list.get(0).get("CustomerNumber"));
		map.put("account", list.get(0).get("Account"));
		map.put("memo", list.get(0).get("Memo"));
		Map<String,String> result = SocialMediaAction.getSearchSocialMedia(map);
		assert result.get("customer").equals("28740045");
	}
	
	// delete
	@Test
	@Parameters({"sqlUsername","sqlPassword"})
	public void checkDeleteSocialMedia(String username,String password){
		printLogger(SocialMediaCase.class,"deleteSocialMedia");
		Map<String,String> map = new HashMap<String,String>();
		map.put("customerNumber", "28740045");
		SocialMediaAction.getDeleteSocialMedia(map);
		String url = "jdbc:sqlserver://newsql:1433";
		String sql = "SELECT top 1 csm.CustomerNumber FROM newegg.dbo.NESO_CustomerSocialMedia csm WITH(NOLOCK) LEFT JOIN CodeCenter.dbo.SocialMedia sm WITH(NOLOCK) ON sm.SocialMediaID=csm.SocialMediaID WHERE csm.Status='1' and csm.InUser = 'km11' ORDER BY csm.InDate DESC";
		List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
		int i = 0;
		while(list.size() > 0 && i < 10){
			w(15);
			list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);
			i++;
		}
		assert list.size() < 1 : "";
	}
	
	// link to other page
	@Test
	@Parameters({"penUrl","customerUrl","reportUrl"})
	public void checkLinkOtherPage(String penUrl,String customerUrl,String reportUrl){
		printLogger(SocialMediaCase.class,"linkOtherPage");
		Map<String,String> result = SocialMediaAction.getLinkOtherPage();
		assert result.get("penUrl").equals(penUrl) : "";
		assert result.get("customerUrl").equals(String.format(customerUrl, result.get("customer"))) : "";
		assert result.get("reportUrl").equals(String.format(reportUrl, result.get("customer"))) : "";
	}
	
	
//	@AfterTest
//	@Parameters({"url"})
//	public void loadPage(String url){
//		openWindow(url);
//		w(10);
//		new SocialMedia().getIframe();
//	}
	
}
