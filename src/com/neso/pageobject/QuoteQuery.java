package com.neso.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neso.factory.CommonUtil;

public class QuoteQuery extends CommonUtil{

	private WebDriver driver = null;
	private WebDriverWait wait = null;
	
	private WebElement quoteButton;
	private WebElement draftButton;
	private WebElement quoteRequestButton;
	private WebElement keyWordText;
	private WebElement customerNumberText;
	private WebElement createByText;
	private WebElement statusValue;
	private WebElement rfqText;
	private WebElement companyText;
	private WebElement createDateButton;
	private WebElement fromDateText;
	private WebElement buValue;
	private WebElement aeValue;
	private WebElement emailAddressText;
	private WebElement searchButton;
	private WebElement menuButton;
	private WebElement menuList;
	private WebElement quoteNumber;
	private WebElement privateBox;
	private WebElement noteText;
	private WebElement saveButton;
	private WebElement closeButton;
	private WebElement newButton;
	private WebElement editButton;
	private WebElement previewButton;
	private WebElement reminderButton;
	
	private WebElement kendoList;
	
	
	
	public QuoteQuery() {
		driver = super.getDriver();
		wait = new WebDriverWait(driver,15);
	}
	
	
	public WebElement getQuoteButton(){
		quoteButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.id("r1")));
		return quoteButton; 								
	}
	public WebElement getDraftButton(){
		draftButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.id("r2")));
		return draftButton; 								
	}
	public WebElement getQuoteRequestButton(){
		quoteRequestButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.id("r3")));
		return quoteRequestButton; 								
	}
	public WebElement getKeyWordText(){
		keyWordText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-quote-query/div[1]/div[2]/div[2]/form/div[1]/div[1]/div/input")));
		return keyWordText; 								
	}
	public WebElement getCustomerNumberText(){
		customerNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-quote-query/div[1]/div[2]/div[2]/form/div[1]/div[2]/div/input")));
		return customerNumberText; 								
	}
	public WebElement getCreateByText(){
		createByText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-quote-query/div[1]/div[2]/div[2]/form/div[1]/div[3]/div/input")));
		return createByText; 							
	}
	public WebElement getStatusValue(){
		statusValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-quote-query/div[1]/div[2]/div[2]/form/div[1]/div[4]/div/kendo-dropdownlist/span/span[1]")));
		return statusValue; 								
	}
	public WebElement getStatusButton(){
		statusValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-quote-query/div[1]/div[2]/div[2]/form/div[1]/div[4]/div/kendo-dropdownlist/span")));
		return statusValue; 								
	}
	public WebElement getRfqText(){
		rfqText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-quote-query/div[1]/div[2]/div[2]/form/div[2]/div[1]/div/input")));
		return rfqText; 							
	}
	public WebElement getCompanyText(){
		companyText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-quote-query/div[1]/div[2]/div[2]/form/div[2]/div[2]/div/input")));
		return companyText; 								
	}
	public WebElement getCreateDateButton(){
		createDateButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.id("operate-date")));
		return createDateButton; 								
	}
	public WebElement getFromDateText(){
		fromDateText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-quote-query/div[1]/div[2]/div[2]/form/div[3]/div[3]/div/kendo-daterange/kendo-dateinput[1]/span/input")));
		return fromDateText; 																							  
	}
	public WebElement getBuValue(){
		buValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-quote-query/div[1]/div[2]/div[2]/form/div[2]/div[4]/div/kendo-dropdownlist/span/span[1]")));
		return buValue; 								
	}
	public WebElement getAeValue(){
		aeValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-quote-query/div[1]/div[2]/div[2]/form/div[3]/div[1]/div/kendo-dropdownlist/span/span[1]")));
		return aeValue; 								
	}
	public WebElement getEmailAddressText(){
		emailAddressText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-quote-query/div[1]/div[2]/div[2]/form/div[3]/div[2]/div/input")));
		return emailAddressText; 								
	}
	public WebElement getSearchButton(){
		searchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-active-do']")));
		return searchButton; 								
	}
	public WebElement getMenuButton(String num){
		menuButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-quote-query/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr"+num+"/td[1]")));
		return menuButton; 								
	}
	public WebElement getMenuList(String i){
		menuList= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-grid-context-menu/div/kendo-popup/div/ul/li["+i+"]")));
		return menuList; 											  
	}
	public WebElement getQuoteNumber(String num){
		quoteNumber= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-quote-query/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr"+num+"/td[2]")));
		return quoteNumber; 								
	}
	public WebElement getPrivateBox(){
		privateBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-note/kendo-dialog/div[2]/div/div/div[1]/div[2]/div[1]/div[3]/input[2]")));
		return privateBox; 											  
	}
	public WebElement getNoteText(){
		noteText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-note/kendo-dialog/div[2]/div/div/div[1]/div[2]/div[2]/div/div/textarea")));
		return noteText; 											  
	}
	public WebElement getSaveButton(){
		saveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-note/kendo-dialog/div[2]/div/div/div[1]/div[2]/div[3]/div/button")));
		return saveButton; 											  
	}
	public WebElement getCloseButton(){
		closeButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-note/kendo-dialog/div[2]/kendo-dialog-actions/button")));
		return closeButton; 										  
	}
	public WebElement getNewButton(){
		newButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-quote-query/nk-function-panel/div/div/div[1]/div[1]/div[1]/a")));
		return newButton; 																
	}
	public WebElement getEditButton(){
		editButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='quotation-main']/div/nk-function-panel/div/div/div[1]/div[2]/div[3]/a")));
		return editButton; 								
	}
	public WebElement getPreviewButton(){
		previewButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='quotation-main']/div/nk-function-panel/div/div/div[1]/div[2]/div[5]/a")));
		return previewButton; 								
	}
	public WebElement getReminderButton(){
		reminderButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='quotation-main']/div/nk-function-panel/div/div/div[1]/div[2]/div[7]/a")));
		return reminderButton; 								
	}
	
	public WebElement getKendoList(int i){
		kendoList= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/nk-app/kendo-popup/div/kendo-list/div/ul/li[" + i + "]")));
		return kendoList; 								
	}
}		
