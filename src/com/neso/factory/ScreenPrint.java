package com.neso.factory;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class ScreenPrint {
	
	public static String printScreen(WebDriver driver,String environment){
		String destFile=null;
		String fixName = null;
		String showpath=null;
		String userdir = null;
		String user = null;
		try {
			if(environment.equals("windows")){
				user = CommonUtil.getPath("\\build");
				userdir = user +"\\test-output\\Screen\\";
			}
			else{
				user = CommonUtil.getPath("/build");
				userdir = user +"/test-output/Screen/";
			}
			Date date=new Date();
			DateFormat format= new SimpleDateFormat("yyyyMMddHHmmss");
			fixName=format.format(date);
			destFile = userdir+fixName+".jpg";
			userdir = userdir.replace("\\", "/");
			if(driver==null){
				return "";
			}
			File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			if(screen==null){
			return "";
		}
		FileUtils.copyFile(screen, new File(destFile));
		StringBuffer tempstr = new StringBuffer();
		tempstr.append("<div><a href=\"#\" onclick=\"document.getElementById('divImage_%s').style.display='';document.getElementById('mask').className='mask opacity';\">ErrorImage</a></div>");
		tempstr.append("<div id='divImage_%s' style='display:none;' class=\"content\" onclick=\"this.style.display='none';document.getElementById('mask').className='';\"><img style=\" width:792px; height:592px; \" src=\"../Screen/%s\"/></div> ");
		String t = tempstr.toString();
		showpath = String.format(t, fixName,fixName,fixName+".jpg");
		//System.out.println(t);
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return showpath;

	}
}

