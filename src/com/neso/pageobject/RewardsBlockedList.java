package com.neso.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neso.factory.CommonUtil;

public class RewardsBlockedList extends CommonUtil{
	
	private WebDriver driver = null;
	private WebDriverWait wait = null;
	
	private WebElement searchTypeButton;
	private WebElement searchTypeValue;
	private WebElement keywordsText;
	private WebElement blockDateButton;
	private WebElement resetButton;
	private WebElement searchButton;
	private WebElement exportCurrentPageButton;
	private WebElement addButton;
	private WebElement adMerchantIDTextng;
	private WebElement adMerchantIDText;
	private WebElement adMerchantSearchButton;
	private WebElement adMerchantNameValue;
	private WebElement adPrimaryCustomerValue;
	private WebElement adContactWithValue;
	private WebElement adMemoText;
	private WebElement adSaveButton;
	private WebElement adCancelButton;
	private WebElement merchantIDText;
	private WebElement removeButton;
	private WebElement removeOKButton;
	private WebElement removeCancelButton;
	private WebElement merchantID;
	private WebElement primaryCustomer;
	private WebElement resultContent;
	private WebElement errorMessage;
	private WebElement kendoList;
	
	
	
	public RewardsBlockedList(){
		driver = super.getDriver();
		wait = new WebDriverWait(driver,15);
	}
	
	
	
	public WebElement getSearchTypeButton(){
		searchTypeButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//rewards-blocklist-maintain/div/form/div/div[2]/div/div[1]/kendo-dropdownlist/span")));
		return searchTypeButton; 								 
	}
	public WebElement getSearchTypeValue(){
		searchTypeValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//rewards-blocklist-maintain/div/form/div/div[2]/div/div[1]/kendo-dropdownlist/span/span[1]")));
		return searchTypeValue; 								 
	}
	public WebElement getKeywordsText(){
		keywordsText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//rewards-blocklist-maintain/div/form/div/div[2]/div/div[2]/div/input")));
		return keywordsText; 								 
	}
	public WebElement getBlockDateButton(){
		blockDateButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//rewards-blocklist-maintain/div/form/div/div[2]/div/div[3]/div[1]/nk-checkbox/label/span[1]/input")));
		return blockDateButton; 								 
	}
	public WebElement getResetButton(){
		resetButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//rewards-blocklist-maintain/div/form/div/div[2]/div/div[4]/button[1]")));
		return resetButton; 								 
	}
	public WebElement getSearchButton(){
		searchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//rewards-blocklist-maintain/div/form/div/div[2]/div/div[4]/button[2]")));
		return searchButton; 								 
	}
	public WebElement getExportCurrentPageButton(){
		exportCurrentPageButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//rewards-blocklist-maintain/div/div/div[2]/kendo-grid/kendo-grid-toolbar/button[1]")));
		return exportCurrentPageButton; 								 
	}
	public WebElement getAddButton(){
		addButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//rewards-blocklist-maintain/div/div/div[2]/kendo-grid/kendo-grid-toolbar/button[2]")));
		return addButton; 								 
	}
	public WebElement getAdMerchantIDTextng(){
		adMerchantIDTextng= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//rewards-blocklist-edit/kendo-dialog/div[2]/div/div/div[1]/div[1]/div/nk-input")));
		return adMerchantIDTextng; 								 
	}
	public WebElement getRemoveButton(){
		removeButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//rewards-blocklist-maintain/div/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[1]/div/a")));
		return removeButton; 								 
	}
	public WebElement getRemoveOKButton(){
		removeOKButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/div[3]/button[1]")));
		return removeOKButton; 								 
	}
	public WebElement getRemoveCancelButton(){
		removeCancelButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/div[3]/button[2]")));
		return removeCancelButton; 								 
	}
	public WebElement getAdMerchantIDText(){
		adMerchantIDText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//rewards-blocklist-edit/kendo-dialog/div[2]/div/div/div[1]/div[1]/div/nk-input/input")));
		return adMerchantIDText; 								 
	}
	public WebElement getPrimaryCustomer(){
		primaryCustomer= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//rewards-blocklist-maintain/div/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[4]/a")));
		return primaryCustomer; 								 
	}
	public WebElement getAdMerchantSearchButton(){
		adMerchantSearchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//rewards-blocklist-edit/kendo-dialog/div[2]/div/div/div[1]/div[1]/div/nk-input/i")));
		return adMerchantSearchButton; 								 
	}
	public WebElement getAdMerchantNameValue(){
		adMerchantNameValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//rewards-blocklist-edit/kendo-dialog/div[2]/div/div/div[1]/div[2]/div/label")));
		return adMerchantNameValue; 								 
	}
	public WebElement getAdPrimaryCustomerValue(){
		adPrimaryCustomerValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//rewards-blocklist-edit/kendo-dialog/div[2]/div/div/div[2]/div[1]/div/label")));
		return adPrimaryCustomerValue; 								 
	}
	public WebElement getAdContactWithValue(){
		adContactWithValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//rewards-blocklist-edit/kendo-dialog/div[2]/div/div/div[2]/div[2]/div/label")));
		return adContactWithValue; 								 
	}
	public WebElement getAdMemoText(){
		adMemoText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//rewards-blocklist-edit/kendo-dialog/div[2]/div/div/div[3]/div/textarea")));
		return adMemoText; 								 
	}
	public WebElement getAdSaveButton(){
		adSaveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//rewards-blocklist-edit/kendo-dialog/div[2]/kendo-dialog-actions/button[1]")));
		return adSaveButton; 								 
	}
	public WebElement getAdCancelButton(){
		adCancelButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//rewards-blocklist-edit/kendo-dialog/div[2]/kendo-dialog-actions/button[2]")));
		return adCancelButton; 								 
	}
	public WebElement getMerchantIDText(){
		merchantIDText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//rewards-blocklist-maintain/div/div/div[2]/kendo-grid/div/div/div/table/thead/tr[2]/td[2]/kendo-grid-string-filter-cell/kendo-grid-filter-wrapper-cell/input")));
		return merchantIDText; 								
	}
	public WebElement getMerchantID(){
		merchantID= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//rewards-blocklist-maintain/div/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[2]/a")));
		return merchantID; 								
	}
	public WebElement getResultContent(){
		resultContent= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//rewards-blocklist-maintain/div/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td")));
		return resultContent; 								
	}
	public WebElement getErrorMessage(){
		errorMessage= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/div[2]")));
		return errorMessage; 								
	}	
	public WebElement getKendoList(int i){
		kendoList= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/nk-app/kendo-popup/div/kendo-list/div/ul/li[" + i + "]")));
		return kendoList; 								
	}
}
