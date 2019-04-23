package com.neso.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neso.factory.CommonUtil;

public class Login extends CommonUtil{
	private WebDriver driver = null;
	private WebDriverWait wait = null;
	
	
	private WebElement usernameText;
	private WebElement passwordText;
	private WebElement signInButton;
	
	
	
	public Login(){
		driver = super.getDriver();
		wait = new WebDriverWait(driver,15);
	}
	
	
	public WebElement getUsernameText(){
		usernameText= wait.until(new ExpectedCondition<WebElement>(){  
			@Override
			public WebElement apply(WebDriver d) {
				return d.findElement(By.id("UserName"));
			}});								
		return usernameText; 
	}
	public WebElement getPasswordText(){
		passwordText= wait.until(new ExpectedCondition<WebElement>(){  
			@Override
			public WebElement apply(WebDriver d) {
				return d.findElement(By.id("Password"));
			}});								
		return passwordText; 
	}
	public WebElement getSignInButton(){
		signInButton= wait.until(new ExpectedCondition<WebElement>(){  
			@Override
			public WebElement apply(WebDriver d) {
				return d.findElement(By.xpath("//form[@name='loginForm']/div[3]/div/button"));
			}});								
		return signInButton; 
	}
}
