package com.neso.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neso.factory.CommonUtil;

public class CustomerBalance extends CommonUtil{
	
	private WebDriver driver = null;
	private WebDriverWait wait = null;
	
	private WebElement customerNumberText;
	private WebElement customerSearchButton;
	private WebElement companyText;
	private WebElement nameText;
	private WebElement invoiceDateButton;
	private WebElement buButton;
	private WebElement buValue;
	private WebElement searchButton;
	private WebElement csViewButton;
	private WebElement csCurrencyCode;
	private WebElement discrepancyOnlyButton;
	private WebElement invoiceText;
	private WebElement soNumberText;
	private WebElement rmaNumberText;
	private WebElement invoiceValue;
	private WebElement soValue;
	private WebElement rmaValue;
	private WebElement invoiceLocalCurrencyList;
	private WebElement invoiceCount;
	private WebElement currencyCode;
	private WebElement paymentLocalCurrencyList;
	 
	
	private WebElement kendoList;
	private WebElement errorMessage;
	
	
	public CustomerBalance() {
		driver = super.getDriver();
		wait = new WebDriverWait(driver,15);
	}
	
	
	public WebElement getCustomerNumberText(){
		customerNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//customer-information/div/div[2]/form/div[1]/div[1]/div/div/nk-input/input")));
		return customerNumberText; 									  
	}
	public WebElement getCustomerSearchButton(){
		customerSearchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//customer-information/div/div[2]/form/div[1]/div[1]/div/div/nk-input/i")));
		return customerSearchButton; 								
	}
	public WebElement getCompanyText(){
		companyText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//customer-information/div/div[2]/form/div[1]/div[2]/div/input")));
		return companyText; 								
	}
	public WebElement getNameText(){
		nameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//customer-information/div/div[2]/form/div[1]/div[3]/div/contact-name/form/div[1]/div/input")));
		return nameText; 								
	}
	public WebElement getInvoiceDateButton(){
		invoiceDateButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.id("ckbInvoice")));
		return invoiceDateButton; 								
	}
	public WebElement getBuButton(){
		buButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-ddl-bu/kendo-dropdownlist/span")));
		return buButton; 								
	}
	public WebElement getBuValue(){
		buValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-ddl-bu/kendo-dropdownlist/span/span[1]")));
		return buValue; 												
	}
	public WebElement getSearchButton(){
		searchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//customer-information/div/div[2]/form/div[2]/div[2]/div[2]/div[2]/div/nk-button/button")));
		return searchButton; 								
	}
	public WebElement getCSViewButton(){
		csViewButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//customerbalance-main/div[1]/div[2]/kendo-tabstrip/ul/li[1]")));
		return csViewButton; 								
	}
	public WebElement getCSCurrencyCode(){
		csCurrencyCode= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//customer-cs/div/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[5]")));
		return csCurrencyCode; 								
	}
	public WebElement getDiscrepancyOnlyButton(){
		discrepancyOnlyButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.id("ckbDiscrepancyOnly2")));
		return discrepancyOnlyButton; 								
	}
	public WebElement getInvoiceText(){
		invoiceText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//customer-accounting/div[1]/div[1]/form/kendo-grid/div/div/div/table/thead/tr[2]/td[2]/kendo-grid-string-filter-cell/kendo-grid-filter-wrapper-cell/input")));
		return invoiceText; 								
	}
	public WebElement getSoNumberText(){
		soNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//customer-accounting/div[1]/div[1]/form/kendo-grid/div/div/div/table/thead/tr[2]/td[3]/kendo-grid-string-filter-cell/kendo-grid-filter-wrapper-cell/input")));
		return soNumberText; 								
	}
	public WebElement getRmaNumberText(){
		rmaNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//customer-accounting/div[1]/div[1]/form/kendo-grid/div/div/div/table/thead/tr[2]/td[14]/kendo-grid-string-filter-cell/kendo-grid-filter-wrapper-cell/input")));
		return rmaNumberText; 								
	}
	public WebElement getInvoiceValue(){
		invoiceValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//customer-accounting/div[1]/div[1]/form/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[2]/span")));
		return invoiceValue; 								
	}
	public WebElement getSoValue(){
		soValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//customer-accounting/div[1]/div[1]/form/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[3]/span")));
		return soValue; 								
	}
	public WebElement getRmaValue(){
		rmaValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//customer-accounting/div[1]/div[1]/form/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[14]/span")));
		return rmaValue; 								
	}
	public WebElement getInvoiceLocalCurrencyList(int i){
		invoiceLocalCurrencyList= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//customer-accounting/div[1]/div[1]/form/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[" + i + "]/td[7]")));
		return invoiceLocalCurrencyList; 								
	}
	public WebElement getInvoiceCount(){
		invoiceCount= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//customer-accounting/div[1]/div[1]/form/kendo-grid/kendo-pager/kendo-pager-info")));
		return invoiceCount; 								
	}
	public WebElement getCurrencyCode(){
		currencyCode= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//customer-accounting/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[1]")));
		return currencyCode; 										  
	}
	public WebElement getCurrencyCodeList(int i){
		currencyCode= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//customer-accounting/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[" + i + "]/td[1]")));
		return currencyCode; 										  
	}
	public WebElement getPaymentLocalCurrencyList(int i){
		paymentLocalCurrencyList= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//customer-accounting/div[2]/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[" + i + "]/td[7]")));
		return paymentLocalCurrencyList; 										  
	}
	
	
	public WebElement getKendoList(int i){
		kendoList= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/nk-app/kendo-popup/div/kendo-list/div/ul/li[" + i + "]")));
		return kendoList; 								
	}
	public WebElement getErrorMessage(){
		errorMessage= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div/div[2]")));
		return errorMessage; 								
	}
}
