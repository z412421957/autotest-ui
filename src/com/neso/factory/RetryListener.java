package com.neso.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.IAnnotationTransformer;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.ITestAnnotation;


public class RetryListener implements IRetryAnalyzer,IAnnotationTransformer {
	private static int maxRetryCount = 3;
	private int retryCount = 1;
	
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(retryCount<maxRetryCount){
			String message = "Running retry for '" + result.getName()
            + "' on class " + this.getClass().getName() + " Retrying "
            + retryCount + " times";
		    CommonUtil.printLogger(this.getClass(),message);
		    Reporter.setCurrentTestResult(result);
		    Reporter.log("RunCount=" + (retryCount + 1));
		    retryCount++;
		    return true;
		}
		
		return false;
	}
	
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		IRetryAnalyzer retry = annotation.getRetryAnalyzer();
        if (retry == null) {
            annotation.setRetryAnalyzer(RetryListener.class);
        }
	}
}
