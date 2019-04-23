package com.neso.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neso.factory.CommonUtil;

public class MerchantBalance extends CommonUtil{

	private WebDriver driver = null;
	private WebDriverWait wait = null;
	
	private WebElement merchantNumberText;
	private WebElement merchantSearchButton;
	private WebElement merchantName;
	private WebElement contactEmail;
	private WebElement invoiceDateBox;
	private WebElement buButton;
	private WebElement buValue;
	private WebElement searchButton;
	private WebElement resetButton;
	private WebElement balanceContent;
	private WebElement discrepancyOnlyBox;
	private WebElement invoiceListContent;
	private WebElement invoiceInvoiceText;
	private WebElement invoiceListDiv;
	private WebElement mailToCustomerButton;
	    private WebElement mailCustomersBox;
	    private WebElement mailCustomersType;
	    private WebElement mailTemplateText;
	    private WebElement mailOKButton;
	    private WebElement mailCancelButton;
	private WebElement latePayNotificationButton;
	private WebElement exportAccountStatementButton;
	private WebElement noteToPandgButton;
	    private WebElement noteActiveBox;
	    private WebElement noteDelinqBox;
	    private WebElement noteCustomerType;
	    private WebElement noteNoteText;
	    private WebElement noteOKButton;
	private WebElement completeExitButton;
	private WebElement errorMessage;
	private WebElement errorOKButton;
	private WebElement kendoList;

	
	
	public MerchantBalance() {
		driver = super.getDriver();
		wait = new WebDriverWait(driver,15);
	}
	
	public WebElement getMerchantNumberText(){
		merchantNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-merchant-balance/div/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div/neso-input/input")));
		return merchantNumberText; 							
	}
	public WebElement getMerchantSearchButton(){
		merchantSearchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-merchant-balance/div/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div/neso-input/i")));
		return merchantSearchButton; 								  
	}
	public WebElement getMerchantName(){
		merchantName= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-merchant-balance/div/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/label[2]")));
		return merchantName; 								
	}
	public WebElement getContactEmail(){
		contactEmail= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-merchant-balance/div/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/label[2]")));
		return contactEmail; 								
	}
	public WebElement getInvoiceDateBox(){
		invoiceDateBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-date-range/div/div[1]/kendo-switch")));
		return invoiceDateBox; 								
	}
	public WebElement getInvoiceDateBoxButton(){
		invoiceDateBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-date-range/div/div[1]/kendo-switch/span")));
		return invoiceDateBox; 								
	}
	public WebElement getBuButton(){
		buButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-merchant-balance/div/div[1]/div[1]/div[1]/div[2]/div[6]/div[2]/div[1]/div/kendo-dropdownlist/span")));
		return buButton; 								
	}
	public WebElement getBuValue(){
		buValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-merchant-balance/div/div[1]/div[1]/div[1]/div[2]/div[6]/div[2]/div[1]/div/kendo-dropdownlist/span/span[1]")));
		return buValue; 									 
	}
	public WebElement getSearchButton(){
		searchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-merchant-balance/div/div[1]/div[1]/div[1]/div[2]/div[6]/div[2]/button[1]")));
		return searchButton; 										  
	}
	public WebElement getResetButton(){
		resetButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-merchant-balance/div/div[1]/div[1]/div[1]/div[2]/div[6]/div[2]/button[2]")));
		return resetButton; 								
	}
	public WebElement getBalanceContent(){
		balanceContent= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-merchant-balance/div/div[1]/div[1]/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td")));
		return balanceContent; 								
	}
	public WebElement getDiscrepancyOnlyBox(){
		discrepancyOnlyBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.id("discrepancy-only")));
		return discrepancyOnlyBox; 								
	}
	public WebElement getInvoiceListContent(){
		invoiceListContent= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-merchant-balance/div/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td")));
		return invoiceListContent; 								
	}
	public WebElement getInvoiceInvoiceText(){
		invoiceInvoiceText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-merchant-balance/div/div[2]/div[2]/kendo-grid/div/div/div/table/thead/tr[2]/td[1]/kendo-grid-string-filter-cell/kendo-grid-filter-wrapper-cell/input")));
		return invoiceInvoiceText; 								
	}
	public WebElement getInvoiceListDiv(String num){
		invoiceListDiv= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-merchant-balance/div/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr"+num)));
		return invoiceListDiv; 								
	}
	public WebElement getMailToCustomerButton(){
		mailToCustomerButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//btn-email-to-customer/button")));
		return mailToCustomerButton; 								  
	}
	public WebElement getMailCustomersBox(String num){
		mailCustomersBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//email-to-customer/kendo-dialog/div[2]/div/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr"+num+"/td[1]/input")));
		return mailCustomersBox; 									      
	}
	public WebElement getMailCustomersType(String num){
		mailCustomersType= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//email-to-customer/kendo-dialog/div[2]/div/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr"+num+"/td[5]")));
		return mailCustomersType; 								
	}
	public WebElement getMailTemplateText(){
		mailTemplateText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//email-to-customer/kendo-dialog/div[2]/div/div/div/div[1]/div/kendo-combobox/span/kendo-searchbar/input")));
		return mailTemplateText; 									  
	}
	public WebElement getMailOKButton(){
		mailOKButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//email-to-customer/kendo-dialog/div[2]/kendo-dialog-actions/button[1]")));
		return mailOKButton; 								
	}
	public WebElement getMailCancelButton(){
		mailCancelButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//email-to-customer/kendo-dialog/div[2]/kendo-dialog-actions/button[2]")));
		return mailCancelButton; 								
	}
	public WebElement getLatePayNotificationButton(){
		latePayNotificationButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-merchant-balance/div/nk-function-panel/div/div/div[1]/div[1]/div[2]/button")));
		return latePayNotificationButton; 							  
	}
	public WebElement getExportAccountStatementButton(){
		exportAccountStatementButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-merchant-balance/div/nk-function-panel/div/div/div[1]/div/div[3]/button")));
		return exportAccountStatementButton; 								
	}
	public WebElement getNoteToPandgButton(){
		noteToPandgButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//btn-note-to-pen-globe/button")));
		return noteToPandgButton; 									  
	}
	public WebElement getNoteActiveBox(){
		noteActiveBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//note-to-pen-globe/kendo-dialog/div[2]/div/div/div[1]/div/input[1]")));
		return noteActiveBox; 								
	}
	public WebElement getNoteDelinqBox(){
		noteDelinqBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//note-to-pen-globe/kendo-dialog/div[2]/div/div/div[1]/div/input[2]")));
		return noteDelinqBox; 								
	}
	public WebElement getNoteCustomerType(String num){
		noteCustomerType= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//note-to-pen-globe/kendo-dialog/div[2]/div/div/div[2]/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr"+num+"/td[4]")));
		return noteCustomerType; 								
	}
	public WebElement getNoteNoteText(){
		noteNoteText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//note-to-pen-globe/kendo-dialog/div[2]/div/div/div[3]/div[2]/textarea")));
		return noteNoteText; 								
	}
	public WebElement getNoteOKButton(){
		noteOKButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//note-to-pen-globe/kendo-dialog/div[2]/kendo-dialog-actions/div/button[1]")));
		return noteOKButton; 								
	}
	public WebElement getCompleteExitButton(){
		completeExitButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//email-to-customer/kendo-dialog[2]/div[2]/kendo-dialog-titlebar/div[2]/a")));
		return completeExitButton; 							
	}
	public WebElement getErrorMessage(){
		errorMessage= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div[1]/div[2]")));
		return errorMessage; 								
	}
	public WebElement getErrorOKButton(){
		errorOKButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div[1]/div[3]/button")));
		return errorOKButton; 								
	}
	public WebElement getKendoList(String i){
		kendoList= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/nk-app/kendo-popup/div/kendo-list/div/ul/li[" + i + "]")));
		return kendoList; 								
	}
}
