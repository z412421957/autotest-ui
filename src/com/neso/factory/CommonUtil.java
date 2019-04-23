package com.neso.factory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.sqlconnect.SqlFactory;
import com.neso.factory.CommonUtil;

public class CommonUtil {
	public static WebDriver driver;
	public static Logger logger = Logger.getLogger(CommonUtil.class);
	public static int count = 0;
	public static int logCount = 0;
	
	public static WebDriver getDriver(){
		return driver;
	}
	
	public static void initBrowser(String browser,String environment){
		switch(browser){
		case "firefox":
			try {
				driver = new RemoteWebDriver(new URL("http://10.1.49.12:8001/wd/hub"), DesiredCapabilities.firefox());
				driver.manage().window().maximize();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "chrome":
			if(environment.equals("windows")){
				System.setProperty("webdriver.chrome.driver", getPath("\\build") + "\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}
			else if(environment.equals("selenoid")){
				try {
					DesiredCapabilities capabilities = new DesiredCapabilities();
					capabilities.setBrowserName("chrome");
					capabilities.setCapability("enableVNC", true);
					driver = new RemoteWebDriver(new URL("http://test:123456@10.1.49.12:8083/wd/hub"), capabilities);
					SessionId sessionId = ((RemoteWebDriver)driver).getSessionId();
					System.out.println(sessionId);
					driver.manage().window().setSize(new Dimension(1280,1024));
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				try {
					driver = new RemoteWebDriver(new URL("http://test:123456@10.1.49.12:8083/wd/hub"), DesiredCapabilities.chrome());
					driver.manage().window().maximize();
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			break;
		case "phantomjs":
			if(environment.equals("windows")){
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setJavascriptEnabled(true);  
				caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, getPath("\\build") + "\\Driver\\phantomjs.exe");
				driver = new PhantomJSDriver(caps);
				driver.manage().window().maximize();
			}
			else{
				try {
					driver = new RemoteWebDriver(new URL("http://10.1.49.12:8001/wd/hub"), DesiredCapabilities.phantomjs());
					driver.manage().window().maximize();
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			break;
		default: break;
		}
		//System.out.println(driver.manage().window().getSize());
		//driver.manage().window().setSize(new Dimension(1050,876));
	}
	
	public static void openWindow(String url){
		driver.get(url);	
	}
	
	public static void closeWindow(int i){
		if(i==1)
			driver.close();
		else
			driver.quit();
	}
	
	public static void w(int num){
		try {
			Thread.sleep(num*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//延时点击
	public static void c(WebElement ele,int time){
		w(time);
		String str = "      ";
		logger.info(str + "click : " + ele.getTagName() + "   " + ele.getAttribute("value") + "   " + ele.getText());
		Reporter.log(str + "click : " + ele.getTagName() + "   " + ele.getAttribute("value") + "   " + ele.getText());
		System.out.println(str + "click : " + ele.getTagName() + "   " + ele.getAttribute("value") + "   " + ele.getText());
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",ele);
		//ele.click();
	}
	//延时输入
	public static void s(WebElement ele,String str,int time){
		w(time);
		ele.clear();
		ele.sendKeys(str);
		String space = "      ";
		logger.info(space + "send : " + ele.getTagName() + "   " + str);
		Reporter.log(space + "send : " + ele.getTagName() + "   " + str);
		System.out.println(space + "send : " + str);
	}
	//延时选择
	public static void s(Select se,String str,int time){
		w(time);
		se.selectByVisibleText(str);
		String space = "      ";
		logger.info(space + "send : " + str);
		Reporter.log(space + "send : " + str);
		System.out.println(space + "send : " + str);
	}
	//清空元素
	public static void elementClear(WebElement ele) {
		String space = "      ";
		ele.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		ele.sendKeys(Keys.DELETE);
		System.out.println(space + "clear : " + ele.getTagName());
	}
	//随机数
	public static String getRandom(int range,int start){
		Random rand = new Random();
		return String.valueOf(rand.nextInt(range) + start);
	}
	
	//获取当前路径，且删除某字符串
	public static String getPath(String str){
		String path = System.getProperty("user.dir");
		if(path.contains(str))
			path = path.substring(0, path.lastIndexOf(str));
		return path;
	}
	
	public static void printLogger(Class<?> c , String s){
		logger = Logger.getLogger(c);
		logger.info("~~~~~~~~~~~~~~~~~~~~~" + s + "~~~~~~~~~~~~~~~~~~~~~");
		Reporter.log("~~~~~~~~~~~~~~~~~~~~~" + s + "~~~~~~~~~~~~~~~~~~~~~");
		logCount = 0;
		System.out.println("~~~~~~~~~~~~~~~~~~~~~" + s + "~~~~~~~~~~~~~~~~~~~~~");
	}
	
	public static void actionStartLogger(Class<?> c , String s , int num){
		if(num != 0)
			logCount = num;
		else if(num == 0 && logCount != 0){
			logCount --;
			return;
		}
		logger = Logger.getLogger(c);
		String str = "  ";
		logger.info(str + s + " <<");
		Reporter.log(str + s + " <<");
		System.out.println(str + s + " <<");
	}
	
	public static boolean inforRepeat(String input,String result,int time,int frequency){
		count++;
		if(input.equals(result) || count >= frequency){
			count = 0;
			return true;
		}
		else
			w(time);
			return false;
	}
	
	public static String getNewWindowUrl(){
		String handle = driver.getWindowHandle();
		String result = "";
		for(String str : driver.getWindowHandles()){
			if(!str.equals(handle)){
				driver.switchTo().window(str);
				result = driver.getCurrentUrl();
				driver.close();
			}
		}
		driver.switchTo().window(handle);
		return result;
	}
	
	public static void insertLogToDB(String suiteName,String testName,String result,String runTime,String startDate,String endDate){
		String sql="Insert into TestPortal.dbo.MKPAutoFromJenkins(SuiteName,TestName,Result,RunTime,InDate,StartDate,EndDate) values('"+suiteName+"','"+testName+"','"+result+"',ROUND('"+runTime+"',4),getdate(),'"+startDate+"','"+endDate+"')";
        	String url = "jdbc:sqlserver://s7ncdb01:1433";
        	String username = "NCDBo";
		String password = "QC@4NCDbo";
		try
	       { 
				List<Map<String,String>> list = SqlFactory.getSqlOfListMap(url, username, password, sql, 1);    
	       }
		catch(Exception e)
	       {
             e.printStackTrace();
	       }
	}
}
