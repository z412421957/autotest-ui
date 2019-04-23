package com.neso.testcase;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.neso.action.QuoteQueryAction;
import com.neso.factory.CommonUtil;

public class QuoteQueryCase extends CommonUtil{
	
	// page load
	@Test
	public void checkPageLoad() {
		printLogger(QuoteQueryCase.class,"pageLoad");
		Map<String, String> result = QuoteQueryAction.getPageLoad();
		assert result.get("quote").equals("true") : "";
		assert result.get("status").equals("All") : "";
		assert result.get("ae").equals("All") : "";
		assert result.get("bu").equals("Neweggbusiness.com") : "";
		assert result.get("search").equals("true") : "";
	}
	
	// quote query
	@Test
	public void checkQuoteQuery() {
		printLogger(QuoteQueryCase.class,"quoteQuery");
		Map<String, String> map = new HashMap<String, String>();
		map.put("from", "09192018");
		map.put("keyWord", "167000");
		map.put("customer", "26405061");
		map.put("createBy", "km11");
		map.put("status", "6");
		map.put("company", "Newegg");
		map.put("email", "nparealtest@gmail.com");
		Map<String, String> result = QuoteQueryAction.getQuoteQuery(map);
		assert result.get("quote").equals(map.get("keyWord")) : "";
	}
	
	// menu rules
	@Test
	public void checkAddNote() {
		printLogger(QuoteQueryCase.class,"menuRules");
		Map<String, String> map = new HashMap<String, String>();
		map.put("note","6");
		map.put("value", "garre auto test");
		QuoteQueryAction.getAddNote(map);
	}
	
	// button rules
	@Test
	@Parameters({"new"})
	public void checkButtonRules(String newn) {
		printLogger(QuoteQueryCase.class,"buttonRules");
		Map<String, String> result = QuoteQueryAction.getButtonRules();
		assert result.get("new").equals(newn) : "";
	}
	
	
}
