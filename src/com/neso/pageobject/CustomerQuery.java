package com.neso.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neso.factory.CommonUtil;

public class CustomerQuery extends CommonUtil{
	private WebDriver driver = null;
	private WebDriverWait wait = null;
	
	
	private WebElement searchByButton;
	private WebElement searchByValue;
	private WebElement searchText;
	private WebElement basicBox;
	private WebElement advancedBox;
	private WebElement resetButton;
	private WebElement searchButton;
	private WebElement ownershipTypeButton;
	private WebElement ownershipTypeValue;
	private WebElement buButton;
	private WebElement buValue;
	private WebElement searchResultContent;
	private WebElement srResultDiv_1;
	private WebElement srCustomerNumber;
	private WebElement srCompanyName;
	private WebElement srShippingCountry;
	private WebElement srOwnershipType;
	private WebElement soProcessButton;
	private WebElement customerDetailButton; 
	private WebElement batchNewButton;
	private WebElement taxRequestButton;
	private WebElement newSoButton;
	private WebElement crdQueryButton;
	private WebElement callHistoryButton;
	private WebElement reminderButton;
	private WebElement loginButton;
	private WebElement customerBalanceButton;
	private WebElement customerReportCardButton;
	private WebElement messageCenterButton;
	private WebElement rmaQueryButton;
	private WebElement claimQueryButton;
	private WebElement iccRequestButton;
	private WebElement contactHistoryButton;
	private WebElement penGlobeButton;
	private WebElement kendoList;
	
	
	
	public CustomerQuery() {
		driver = super.getDriver();
		wait = new WebDriverWait(driver,15);
	}
	
	
	
	public WebElement getSearchByButton(){
		searchByButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/div[1]/div[2]/div[1]/div[1]/div[2]/kendo-dropdownlist/span")));
		return searchByButton; 										  
	}
	public WebElement getSearchByValue(){
		searchByValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/div[1]/div[2]/div[1]/div[1]/div[2]/kendo-dropdownlist/span/span[1]")));
		return searchByValue; 										 
	}
	public WebElement getSearchText(){
		searchText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/div[1]/div[2]/div[1]/div[1]/div[3]/input")));
		return searchText; 											  
	}
	public WebElement getBasicBox(){
		basicBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.id("Basic")));
		return basicBox; 										  
	}
	public WebElement getAdvancedBox(){
		advancedBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.id("Advanced")));
		return advancedBox; 										  
	}
	public WebElement getResetButton(){
		resetButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/div[1]/div[2]/div[1]/div[4]/button")));
		return resetButton; 										  
	}
	public WebElement getSearchButton(){
		searchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-active-do']")));
		return searchButton; 							
	}
	public WebElement getOwnershipTypeButton(){
		ownershipTypeButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/div[1]/div[2]/div[2]/div[2]/div/kendo-dropdownlist/span")));
		return ownershipTypeButton; 							
	}
	public WebElement getOwnershipTypeValue(){
		ownershipTypeValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/div[1]/div[2]/div[2]/div[2]/div/kendo-dropdownlist/span/span[1]")));
		return ownershipTypeValue; 							
	}
	public WebElement getBuButton(){
		buButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/div[1]/div[2]/div[3]/div[4]/div/neso-ddl-bu/kendo-dropdownlist/span")));
		return buButton; 											 
	}
	public WebElement getBuValue(){
		buValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/div[1]/div[2]/div[3]/div[4]/div/neso-ddl-bu/kendo-dropdownlist/span/span[1]")));
		return buValue; 											  
	}
	public WebElement getSearchResultContent(){
		searchResultContent= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td")));
		return searchResultContent; 								  
	}
	public WebElement getSrResultDiv_1(){
		srResultDiv_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]")));
		return srResultDiv_1; 							
	}
	public WebElement getSrResultDiv_2(){
		srResultDiv_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[2]")));
		return srResultDiv_1; 							
	}
	public WebElement getSrCustomerNumber(String num){
		srCustomerNumber= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr"+num+"/td[1]/a")));
		return srCustomerNumber; 									  
	}
	public WebElement getSrCompanyName(String num){
		srCompanyName= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr"+num+"/td[3]")));
		return srCompanyName; 							
	}
	public WebElement getSrShippingCountry(String num){
		srShippingCountry= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr"+num+"/td[9]")));
		return srShippingCountry; 									  
	}
	public WebElement getSrOwnershipType(String num){
		srOwnershipType= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr"+num+"/td[26]")));
		return srOwnershipType; 							
	}
	public WebElement getDeactiveAccountButton(){
		soProcessButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/nk-function-panel/div/div/div[1]/div[1]/div[1]/button")));
		return soProcessButton; 									  
	}
	public WebElement getSoProcessButton(){
		soProcessButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/nk-function-panel/div/div/div[1]/div[1]/div[2]/button")));
		return soProcessButton; 									  
	}
	public WebElement getCustomerDetailButton(){
		customerDetailButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/nk-function-panel/div/div/div[1]/div[1]/div[3]/button")));
		return customerDetailButton; 							
	}
	public WebElement getBatchNewButton(){
		batchNewButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/nk-function-panel/div/div/div[1]/div[1]/div[4]/button")));
		return batchNewButton; 							
	}
	public WebElement getTaxRequestButton(){
		taxRequestButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/nk-function-panel/div/div/div[1]/div[1]/div[5]/button")));
		return taxRequestButton; 							
	}
	public WebElement getNewSoButton(){
		newSoButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/nk-function-panel/div/div/div[1]/div[1]/div[6]/button")));
		return newSoButton; 							
	}
	public WebElement getCrdQueryButton(){
		crdQueryButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/nk-function-panel/div/div/div[1]/div[1]/div[7]/button")));
		return crdQueryButton; 							
	}
	public WebElement getCallHistoryButton(){
		callHistoryButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/nk-function-panel/div/div/div[1]/div[1]/div[8]/button")));
		return callHistoryButton; 							
	}
	public WebElement getReminderButton(){
		reminderButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/nk-function-panel/div/div/div[1]/div[1]/div[9]/button")));
		return reminderButton; 							
	}
	public WebElement getLoginButton(){
		loginButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-btn-login/a")));
		return loginButton; 										  
	}
	public WebElement getCustomerBalanceButton(){
		customerBalanceButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/nk-function-panel/div/div/div[1]/div[2]/div[3]//a")));
		return customerBalanceButton; 							      
	}
	public WebElement getCustomerReportCardButton(){
		customerReportCardButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/nk-function-panel/div/div/div[1]/div[2]/div[5]/a")));
		return customerReportCardButton; 							
	}
	public WebElement getMessageCenterButton(){
		messageCenterButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/nk-function-panel/div/div/div[1]/div[2]/div[7]/a")));
		return messageCenterButton; 							
	}
	public WebElement getRmaQueryButton(){
		rmaQueryButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/nk-function-panel/div/div/div[1]/div[2]/div[9]/a")));
		return rmaQueryButton; 							
	}
	public WebElement getClaimQueryButton(){
		claimQueryButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/nk-function-panel/div/div/div[1]/div[2]/div[11]/a")));
		return claimQueryButton; 							
	}
	public WebElement getIccRequestButton(){
		iccRequestButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-btn-icc-request/a")));
		return iccRequestButton; 									  
	}
	public WebElement getContactHistoryButton(){
		contactHistoryButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-btn-contact-history/a")));
		return contactHistoryButton; 								  
	}
	public WebElement getPenGlobeButton(){
		penGlobeButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//crm-customer/div/nk-function-panel/div/div/div[1]/div[2]/div[17]/a")));
		return penGlobeButton; 								  
	}
	public WebElement getKendoList(int i){
		kendoList= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/nk-app/kendo-popup/div/kendo-list/div/ul/li[" + i + "]")));
		return kendoList; 								
	}
}
