package com.neso.testcase;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.neso.action.LoginAction;
import com.neso.testcase.LoginCase;
import com.neso.factory.CommonUtil;

public class LoginCase extends CommonUtil{
	
	@BeforeSuite
	@Parameters({"browser","environment"})
	public static void init(String browser,String environment){
		initBrowser(browser,environment);
	}
	
	@Test
	@Parameters({"url","username","password"})
	public void checkLogin(String url,String username,String password){
		printLogger(LoginCase.class,"login");
		LoginAction.getLogin(url, username, password);
	}
	
	@AfterSuite
	public void close(){
		closeWindow(2);
	}
}
