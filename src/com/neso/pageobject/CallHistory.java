package com.neso.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neso.factory.CommonUtil;

public class CallHistory extends CommonUtil{
	private WebDriver driver = null;
	private WebDriverWait wait = null;
	

	private WebElement merchantNumberText;
	private WebElement merchantNumberError;
	private WebElement customerNumberText;
	private WebElement customerNumberError;
	private WebElement phoneNumberText;
	private WebElement agentIDText;
	private WebElement agentExtensionText;
	private WebElement dateText_1;
	private WebElement searchButton;
	private WebElement searchResultsDiv_1;
	private WebElement editButton_1;
	private WebElement customer_1;
	private WebElement merchantID_1;
	private WebElement followUpID_1;
	private WebElement followUpType_1;
	private WebElement editCustomerNumberText;
	private WebElement editCustomerError;
	private WebElement editMerchantNumberText;
	private WebElement editMerchantError;
	private WebElement editCancelButton;
	private WebElement editSaveButton;
	private WebElement orderMaintainButton;
	private WebElement orderDetailButton;
	private WebElement reminderButton;
	private WebElement errorMessage;
	
	
	public CallHistory(){
		driver = super.getDriver();
		wait = new WebDriverWait(driver,15);
	}
	
	public WebElement getMerchantNumberText(){
		merchantNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-history-maintain/div/form/div/div[2]/div[1]/div[1]/div/input")));
		return merchantNumberText; 								 							  
	}
	public WebElement getMerchantNumberError(){
		merchantNumberError= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//html/body/div[2]")));
		return merchantNumberError; 						
	}
	public WebElement getCustomerNumberText(){
		customerNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-history-maintain/div/form/div/div[2]/div[1]/div[2]/div/input")));
		return customerNumberText; 									                            
	}
	public WebElement getCustomerNumberError(){
		customerNumberError= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//html/body/div[3]")));
		return customerNumberError; 									
	}
	public WebElement getPhoneNumberText(){
		phoneNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-history-maintain/div/form/div/div[2]/div[1]/div[3]/div/input")));
		return phoneNumberText; 									                              
	}
	public WebElement getAgentIDText(){
		agentIDText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-history-maintain/div/form/div/div[2]/div[2]/div[2]/div/input")));
		return agentIDText; 										
	}
	public WebElement getAgentExtensionText(){
		agentExtensionText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-history-maintain/div/form/div/div[2]/div[2]/div[1]/div/input")));
		return agentExtensionText; 
	}
	public WebElement getDateText_1(){
		dateText_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-history-maintain/div/form/div/div[2]/div[2]/div[3]/div/kendo-daterange/kendo-dateinput[1]/span/input")));
		return dateText_1; 											 
	}
	public WebElement getSearchButton(){
		searchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-history-maintain/div/form/div/div[2]/div[2]/div[4]/button[2]")));
		return searchButton; 									
	}
	public WebElement getSearchResultsDiv_1(){
		searchResultsDiv_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-history-maintain/div/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[2]")));
		return searchResultsDiv_1; 					                  						  
	}
	public WebElement getEditButton_1(){
		editButton_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-history-maintain/div/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[1]/div/a")));
		return editButton_1; 					                                              
	}
	public WebElement getCustomer_1(){
		customer_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-history-maintain/div/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[5]/a")));
		return customer_1; 
	}
	public WebElement getMerchantID_1(){
		merchantID_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-history-maintain/div/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[7]/a")));
		return merchantID_1; 											
	}																	
	public WebElement getFollowUpID_1(){
		followUpID_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='call-history-maintain']/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[1]/a")));
		return followUpID_1; 										
	}
	public WebElement getFollowUpType_1(){
		followUpType_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='call-history-maintain']/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[2]")));
		return followUpType_1; 										 
	}
	public WebElement getEditCustomerNumberText(){
		editCustomerNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-history-maintain/div/call-history-edit/nk-modal/div/div[1]/div/div/div[2]/div/div[1]/div/div/input")));
		return editCustomerNumberText; 
	}
	public WebElement getEditCustomerError(){
		editCustomerError= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='call-history']/call-history-edit/nk-modal/div/div/div/div/div[2]/nk-row[1]/div/nk-col[2]/div")));
		return editCustomerError; 
	}
	public WebElement getEditMerchantNumberText(){
		editMerchantNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-history-maintain/div/call-history-edit/nk-modal/div/div[1]/div/div/div[2]/div/div[2]/div/div/input")));
		return editMerchantNumberText; 
	}
	public WebElement getEditMerchantError(){
		editMerchantError= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='call-history']/call-history-edit/nk-modal/div/div/div/div/div[2]/nk-row[2]/div/nk-col[2]/div")));
		return editMerchantError; 
	}
	public WebElement getEditCancelButton(){
		editCancelButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-history-maintain/div/call-history-edit/nk-modal/div/div[1]/div/div/div[3]/div/nk-button[2]/button")));
		return editCancelButton; 
	}
	public WebElement getEditSaveButton(){
		editSaveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-history-maintain/div/call-history-edit/nk-modal/div/div[1]/div/div/div[3]/div/nk-button[1]/button")));
		return editSaveButton; 						
	}
	public WebElement getOrderMaintainButton(){
		orderMaintainButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-history-maintain/div/nk-function-panel/div/div/div[1]/div/div[1]/a")));
		return orderMaintainButton; 
	}
	public WebElement getOrderDetailButton(){
		orderDetailButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-history-maintain/div/nk-function-panel/div/div/div[1]/div/div[3]/a")));
		return orderDetailButton; 
	}
	public WebElement getReminderButton(){
		reminderButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-history-maintain/div/nk-function-panel/div/div/div[1]/div/div[5]/a")));
		return reminderButton; 										  						
	}
	public WebElement getErrorMessage(){
		errorMessage= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/ul/li/div/div[1]")));
		return errorMessage; 
	}
}
