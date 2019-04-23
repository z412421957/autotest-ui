package com.neso.factory;

import java.text.SimpleDateFormat;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Parameters;



public class TestListener implements ITestListener{
	@Override
	public void onTestFailure(ITestResult tr) {
		CommonUtil cu = (CommonUtil)tr.getInstance();
		WebDriver driver = cu.getDriver();
		System.out.println(tr.getTestContext().getSuite().getParameter("environment"));
		String path = ScreenPrint.printScreen(driver,tr.getTestContext().getSuite().getParameter("environment"));
		if(!path.isEmpty() && path!=""){
			tr.setAttribute("ImagePath", path);
		}
		if(tr.getName()!=null){
			CommonUtil.printLogger(this.getClass(),"onTestFailure TestName: "+ tr.getName().toString());
		}
		if(tr.getMethod()!=null){
			CommonUtil.printLogger(this.getClass(),"onTestFailure TestMethod: "+ tr.getMethod().toString());
		}
	}
	@Override
	public void onTestSkipped(ITestResult tr) {
		if(tr.getName()!=null){
			CommonUtil.printLogger(this.getClass(),"onTestSkipped TestName: "+ tr.getName().toString());
		}
		if(tr.getMethod()!=null){
			CommonUtil.printLogger(this.getClass(),"onTestSkipped TestMethod: "+ tr.getMethod().toString());
		}
	}

	@Override
	public void onTestSuccess(ITestResult tr) {

	}

	@Override
	public void onTestStart(ITestResult tr) {

	}

	@Override
	public void onFinish(ITestContext context) {
		Iterator<ITestResult> listOfFailedTests = context.getFailedTests().getAllResults().iterator();
		while (listOfFailedTests.hasNext()) {
			ITestResult failedTest = listOfFailedTests.next();
			ITestNGMethod method = failedTest.getMethod();
			if (context.getFailedTests().getResults(method).size() > 1) {
				listOfFailedTests.remove();
				return;
			} else {
				if (context.getPassedTests().getResults(method).size() > 0) {
					listOfFailedTests.remove();
				}
			}
		}
		SimpleDateFormat dateformat1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String startDate = dateformat1.format(context.getStartDate());
		String endDate = dateformat1.format(context.getEndDate());
		CommonUtil.insertLogToDB(context.getSuite().getName(), context.getName(), context.getFailedTests().size()==0?"Passed":"Failed", ""+(context.getEndDate().getTime()-context.getStartDate().getTime())/60000.00,startDate,endDate);
	}
	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
