package com.neso.action;

import com.neso.factory.CommonUtil;
import com.neso.pageobject.Login;

public class LoginAction extends CommonUtil{
	
	private static Login lo = new Login();
	
	public static void getLogin(String url,String username,String password){
		actionStartLogger(CtiCallDashboardAction.class,"getLogin",0);
		openWindow(url);
		s(lo.getUsernameText(),username,1);
		s(lo.getPasswordText(),password,1);
		c(lo.getSignInButton(),2);
		w(5);
	}
}
