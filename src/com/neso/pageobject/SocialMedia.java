package com.neso.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neso.factory.CommonUtil;

public class SocialMedia extends CommonUtil{
	
	private WebDriver driver = null;
	private WebDriverWait wait = null;
	
	private WebElement customerNumberText;
	private WebElement accountText;
	private WebElement memoText;
	private WebElement resetButton;
	private WebElement searchButton;
	private WebElement customerNumber;
	private WebElement customerNumber_1;
	private WebElement account_1;
	private WebElement lastEditUser_1;
	private WebElement customerNumber_5;
	private WebElement addButton;
	private WebElement adCustomerNumberText;
	private WebElement adAccountText;
	private WebElement adSocialMediaClass;
	private WebElement adSocialMediaButton;
	private WebElement adMemoText;
	private WebElement adSaveButton;
	private WebElement adCancelButton;
	private WebElement editButton;
	private WebElement deleteButton;
	private WebElement deleteOkButton;
	private WebElement deleteCancelButton;
	private WebElement reportCardButton;
	private WebElement penGlobeButton;
	
	private WebElement kendoList;
	
	
	public SocialMedia(){
		driver = super.getDriver();
		wait = new WebDriverWait(driver,15);
	}
	
	public void getIframe(){
		driver.switchTo().frame("iframe-for-ng1-page");
	}
	
	public WebElement getCustomerNumberText(){
		customerNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-form']/div/div[1]/div/input ")));
		return customerNumberText; 									  
	}
	public WebElement getAccountText(){
		accountText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-form']/div/div[2]/div/input")));
		return accountText; 
	}
	public WebElement getMemoText(){
		memoText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-form']/div/div[3]/div/input")));
		return memoText; 
	}
	public WebElement getResetButton(){
		resetButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-form']/div/div[4]/button[1]")));
		return resetButton; 
	}
	public WebElement getSearchButton(){
		searchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-form']/div/div[4]/button[2]")));
		return searchButton; 							
	}
	public WebElement getCustomerNumber(){
		customerNumber= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[2]/a")));
		return customerNumber; 											
	}
	public WebElement getCustomerNumber_1(){
		customerNumber_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[2]/a")));
		return customerNumber_1; 							
	}
	public WebElement getAccount_1(){
		account_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='searchResult']/div[2]/table/tbody/tr[1]/td[3]/span")));
		return account_1; 
	}
	public WebElement getLastEditUser_1(){
		lastEditUser_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[6]")));
		return lastEditUser_1; 											
	}
	public WebElement getCustomerNumber_5(){
		customerNumber_5= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[5]/td[2]/a")));
		return customerNumber_5; 										
	}
//	public WebElement getAddButton(){
//		addButton= wait.until(new ExpectedCondition<WebElement>(){  
//			@Override
//			public WebElement apply(WebDriver d) {
//				return d.findElement(By.xpath("//*[@id='NESORootPanel']/div[2]/div/button[1]"));
//			}});							
//		return addButton; 
//	}
	public WebElement getAddButton(){
		addButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div[1]/div[2]/kendo-grid/kendo-grid-toolbar/button")));
		return addButton; 											
	}
	public WebElement getAdCustomerNumberValue(){
		adCustomerNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div[1]/div[2]/maintain/div/form/kendo-dialog/div[2]/div/div[1]/div/div/label")));
		return adCustomerNumberText; 								  
	}
	public WebElement getAdCustomerNumberText(){
		adCustomerNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div[1]/div[2]/maintain/div/form/kendo-dialog/div[2]/div/div[1]/div/div/input")));
		return adCustomerNumberText; 								  
	}
	public WebElement getAdAccountText(){
		adAccountText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div[1]/div[2]/maintain/div/form/kendo-dialog/div[2]/div/div[2]/div/div/input")));
		return adAccountText; 																				
	}
	public WebElement getAdSocialMediaClass(){
		adSocialMediaClass= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div[1]/div[2]/maintain/div/form/kendo-dialog/div[2]/div/div[3]/div/div/kendo-dropdownlist")));
		return adSocialMediaClass; 
	}
	public WebElement getAdSocialMediaButton(){
		adSocialMediaButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div[1]/div[2]/maintain/div/form/kendo-dialog/div[2]/div/div[3]/div/div/kendo-dropdownlist/span")));
		return adSocialMediaButton; 
	}
	public WebElement getAdSocialMediaValue(){
		adSocialMediaButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div[1]/div[2]/maintain/div/form/kendo-dialog/div[2]/div/div[3]/div/div/kendo-dropdownlist/span/span[1]")));
		return adSocialMediaButton; 
	}
	public WebElement getAdMemoText(){
		adMemoText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div[1]/div[2]/maintain/div/form/kendo-dialog/div[2]/div/div[4]/div/div/input")));
		return adMemoText; 
	}
	public WebElement getAdSaveButton(){
		adSaveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div[1]/div[2]/maintain/div/form/kendo-dialog/div[2]/kendo-dialog-actions/button[1]")));
		return adSaveButton; 										                                        
	}
	public WebElement getAdCancelButton(){
		adCancelButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div[1]/div[2]/maintain/div/form/kendo-dialog/div[2]/kendo-dialog-actions/button[2]")));
		return adCancelButton; 										
	}
	public WebElement getEditButton(){
		editButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[7]/a[1]")));
		return editButton; 											  
	}
	public WebElement getEditButton_1(){
		editButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[7]/a[1]")));
		return editButton; 											  
	}
	public WebElement getDeleteButton(){
		deleteButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[7]/a[2]")));
		return deleteButton; 
	}
	public WebElement getDeleteOkButton(){
		deleteOkButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div[1]/div[3]/button[1]")));
		return deleteOkButton; 
	}
	public WebElement getDeleteCancelButton(){
		deleteCancelButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div[1]/div[3]/button[2]")));
		return deleteCancelButton; 								
	}
	public WebElement getReportCardButton(){
		reportCardButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nk-function-panel/div/div/div[1]/div/div[1]/a")));
		return reportCardButton; 
	}
	public WebElement getPenGlobeButton(){
		penGlobeButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nk-function-panel/div/div/div[1]/div/div[3]/a")));
		return penGlobeButton; 
	}
	
	public WebElement getKendoList(int i){
		kendoList= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/nk-app/kendo-popup/div/kendo-list/div/ul/li[" + i + "]")));
		return kendoList; 								
	}
}
