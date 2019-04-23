package com.neso.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neso.factory.CommonUtil;

public class SOProcess extends CommonUtil{

	private WebDriver driver = null;
	private WebDriverWait wait = null;
	
	private WebElement basicButton;
	private WebElement soNumberText;
	private WebElement soNumberError;
	private WebElement rmaNumberText;
	private WebElement rmaNumberError;
	private WebElement preOrderNumberText;
	private WebElement preOrderNumberError;
	private WebElement recentButton;
	private WebElement recentText;
	private WebElement yearButton;
	private WebElement yearValue;
	private WebElement customerNumberText;
	private WebElement customerNumberError;
	private WebElement emailAddressText;
	private WebElement emailAddressError;
	private WebElement ccNumberText;
	private WebElement ccCustomerNumber;
	private WebElement fromButton;
	private WebElement fromValue;
	private WebElement toValue;
	private WebElement phoneNumberText;
	private WebElement selectAllButton;
	private WebElement selectButton_1;
	private WebElement selectCustomerNumber;
	private WebElement oKButton;
	private WebElement cancelButton;
	private WebElement invoiceNumberText;
	private WebElement invoiceNumberError;
	private WebElement trackingNumberText;
	private WebElement buText;
	
	private WebElement advButton;
	private WebElement createUserText;
	private WebElement itemNumberText;
	private WebElement serialNumberText;
	private WebElement customerPONumberText;
	private WebElement payTermText;
	private WebElement payTermButton;
	private WebElement contactPersText;
	private WebElement itemDescText;
	private WebElement eBayNumberText;
	private WebElement statusText;
	private WebElement shippingText;
	private WebElement shippingButton;
	private WebElement shoppingCartNumberText;
	private WebElement merchantNumberText;
	private WebElement merchantError;
	private WebElement dateFilter;
	private WebElement resetButton;
	private WebElement searchButton;
	
	private WebElement srContentText;
	private WebElement srSONumber;
	private WebElement srCustomerNumber;
	private WebElement errorMessage;
	private WebElement selectButtonValue;
	
	
	
	
	public SOProcess(){
		driver = super.getDriver();
		wait = new WebDriverWait(driver,15);
	}
	
	public WebElement getBasicButton(){
		basicButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//process-main/div/form/div/div[2]/div/div/div/ul/li[1]")));
		return basicButton; 								 
	}
	public WebElement getSoNumberText(){
		soNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-basic']/tbody/tr[1]/td[2]/input")));
		return soNumberText; 									  
	}
	public WebElement getSoNumberError(){
		soNumberError= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-basic']/tbody/tr[1]/td[2]/div")));
		return soNumberError; 									  
	}
	public WebElement getRmaNumberText(){
		rmaNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-basic']/tbody/tr[1]/td[4]/input")));
		return rmaNumberText; 									  
	}
	public WebElement getRmaNumberError(){
		rmaNumberError= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-basic']/tbody/tr[1]/td[4]/div")));
		return rmaNumberError; 									  
	}
	public WebElement getPreOrderNumberText(){
		preOrderNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-basic']/tbody/tr[1]/td[6]/input")));
		return preOrderNumberText; 									  
	}
	public WebElement getPreOrderNumberError(){
		preOrderNumberError= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-basic']/tbody/tr[1]/td[6]/div")));
		return preOrderNumberError; 									  
	}
	public WebElement getRecentButton(){
		recentButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-basic']/tbody/tr[1]/td[7]/label/input")));
		return recentButton; 									  
	}
	public WebElement getRecentText(){
		recentText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-basic']/tbody/tr[1]/td[8]/wj-combo-box/div[1]/div/div/input")));
		return recentText; 									  
	}
	public WebElement getYearButton(){
		yearButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-basic']/tbody/tr[1]/td[9]/label/input")));
		return yearButton; 									  
	}
	public WebElement getYearValue(){
		yearValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-basic']/tbody/tr[1]/td[10]/wj-combo-box/div[1]/div/div/input")));
		return yearValue; 									  
	}
	public WebElement getCustomerNumberText(){
		customerNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-basic']/tbody/tr[2]/td[2]/input")));
		return customerNumberText; 									  
	}
	public WebElement getCustomerNumberError(){
		customerNumberError= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-basic']/tbody/tr[2]/td[2]/div")));
		return customerNumberError; 									  
	}
	public WebElement getEmailAddressText(){
		emailAddressText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-basic']/tbody/tr[2]/td[4]/input")));
		return emailAddressText; 									  
	}
	public WebElement getEmailAddressError(){
		emailAddressError= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-basic']/tbody/tr[2]/td[4]/div")));
		return emailAddressError; 									  
	}
	public WebElement getCcNumberText(){
		ccNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-basic']/tbody/tr[2]/td[6]/input")));
		return ccNumberText; 									  
	}
	public WebElement getCcAllButton(){
		ccNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-card-number-multiple-selection/nk-modal/div/div[1]/div/div/div[2]/div/kendo-grid/div/div/div/table/thead/tr/th[1]/input")));
		return ccNumberText; 									  
	}
	public WebElement getCcCustomerNumber(){
		ccCustomerNumber= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-card-number-multiple-selection/nk-modal/div/div[1]/div/div/div[2]/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[2]/a")));
		return ccCustomerNumber; 									  
	}
	public WebElement getCcOKButton(){
		ccNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-card-number-multiple-selection/nk-modal/div/div[1]/div/div/div[3]/div/nk-button[1]/button")));
		return ccNumberText; 									  
	}
	public WebElement getCcCancelButton(){
		ccNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-card-number-multiple-selection/nk-modal/div/div[1]/div/div/div[3]/div/nk-button[2]/button")));
		return ccNumberText; 									  
	}
	public WebElement getFromButton(){
		fromButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-basic']/tbody/tr[2]/td[7]/label/input")));
		return fromButton; 									  
	}
	public WebElement getFromValue(){
		fromValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-basic']/tbody/tr[2]/td[8]/wj-input-date/div/div/div/input")));
		return fromValue; 									  
	}
	public WebElement getToValue(){
		toValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-basic']/tbody/tr[2]/td[10]/wj-input-date/div/div/div/input")));
		return toValue; 									  
	}
	public WebElement getPhoneNumberText(){
		phoneNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-basic']/tbody/tr[3]/td[2]/input")));
		return phoneNumberText; 									  
	}
	public WebElement getSelectAllButton(){
		selectAllButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-login-name-multiple-selection/nk-modal/div/div[1]/div/div/div[2]/div/kendo-grid/div/div/div/table/thead/tr/th[1]/input")));
		return selectAllButton; 									  
	}
	public WebElement getOKButton(){
		oKButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-login-name-multiple-selection/nk-modal/div/div[1]/div/div/div[3]/div/nk-button[1]/button")));
		return oKButton; 									  
	}
	public WebElement getCancelButton(){
		cancelButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-login-name-multiple-selection/nk-modal/div/div[1]/div/div/div[3]/div/nk-button[2]/button")));
		return cancelButton; 									  
	}
	public WebElement getInvoiceNumberText(){
		invoiceNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-basic']/tbody/tr[3]/td[4]/input")));
		return invoiceNumberText; 									  
	}
	public WebElement getInvoiceNumberError(){
		invoiceNumberError= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-basic']/tbody/tr[3]/td[4]/div")));
		return invoiceNumberError; 									  
	}
	public WebElement getTrackingNumberText(){
		trackingNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-basic']/tbody/tr[3]/td[6]/input")));
		return trackingNumberText; 									  
	}
	public WebElement getTrackingSelectButton_1(){
		selectButton_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-tracking-number-multiple-selection/nk-modal/div/div[1]/div/div/div[2]/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[1]/input")));
		return selectButton_1; 									  	
	}
	public WebElement getCCSelectButton_1(){
		selectButton_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-card-number-multiple-selection/nk-modal/div/div[1]/div/div/div[2]/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[1]/input")));
		return selectButton_1; 									  	  
	}
	public WebElement getSelectCustomerNumber(){
		selectCustomerNumber= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-tracking-number-multiple-selection/nk-modal/div/div[1]/div/div/div[2]/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[3]/a")));
		return selectCustomerNumber; 									  
	}
	public WebElement getTrackingOKButton(){
		oKButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-tracking-number-multiple-selection/nk-modal/div/div[1]/div/div/div[3]/div/nk-button[1]/button")));
		return oKButton; 									  		
	}
	public WebElement getTrackingCancelButton(){
		cancelButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-tracking-number-multiple-selection/nk-modal/div/div[1]/div/div/div[3]/div/nk-button[2]/button")));
		return cancelButton; 									  
	}
	public WebElement getBuText(){
		buText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-basic']/tbody/tr[3]/td[8]/wj-combo-box/div[1]/div/div/input")));
		return buText; 									  
	}
	
	public WebElement getAdvButton(){
		advButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//process-main/div/form/div/div[2]/div/div/div/ul/li[2]")));
		return advButton; 									  
	}
	public WebElement getCreateUserText(){
		createUserText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-adv']/tbody/tr[1]/td[2]/input")));
		return createUserText; 									  
	}
	public WebElement getItemNumberText(){
		itemNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-adv']/tbody/tr[1]/td[4]/input")));
		return itemNumberText; 									  
	}
	public WebElement getSerialNumberText(){
		serialNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-adv']/tbody/tr[1]/td[6]/input")));
		return serialNumberText; 									  
	}
	public WebElement getCustomerPONumberText(){
		customerPONumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-adv']/tbody/tr[1]/td[8]/input")));
		return customerPONumberText; 									  
	}
	public WebElement getPayTermText(){
		payTermText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-adv']/tbody/tr[1]/td[10]/wj-combo-box/div[1]/div/div/input")));
		return payTermText; 									  
	}
	public WebElement getPayTermButton(){
		payTermButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-adv']/tbody/tr[1]/td[10]/wj-combo-box/div[1]/div/div/span/button")));
		return payTermButton; 									  
	}
	public WebElement getContactPersText(){
		contactPersText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-adv']/tbody/tr[2]/td[2]/input")));
		return contactPersText; 									  
	}
	public WebElement getItemDescText(){
		itemDescText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-adv']/tbody/tr[2]/td[4]/input")));
		return itemDescText; 									  
	}
	public WebElement getEBayNumberText(){
		eBayNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-adv']/tbody/tr[2]/td[6]/input")));
		return eBayNumberText; 									  
	}
	public WebElement getStatusText(){
		statusText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-adv']/tbody/tr[2]/td[8]/wj-combo-box/div[1]/div/div/input")));
		return statusText; 									  
	}
	public WebElement getShippingText(){
		shippingText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-adv']/tbody/tr[2]/td[10]/wj-combo-box/div[1]/div/div/input")));
		return shippingText; 									  
	}
	public WebElement getShippingButton(){
		shippingButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-adv']/tbody/tr[2]/td[10]/wj-combo-box/div[1]/div/div/span")));
		return shippingButton; 									  
	}
	public WebElement getShoppingCartNumberText(){
		shoppingCartNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-adv']/tbody/tr[3]/td[2]/input")));
		return shoppingCartNumberText; 									  
	}
	public WebElement getMerchantNumberText(){
		merchantNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-adv']/tbody/tr[3]/td[4]/input")));
		return merchantNumberText; 									  
	}
	public WebElement getMerchantError(){
		merchantError= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-adv']/tbody/tr[3]/td[4]/input")));
		return merchantError; 									  
	}
	public WebElement getDateFilter(){
		dateFilter= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-condition-result']/li[1]/em")));
		return dateFilter; 									  
	}
	
	public WebElement getResetButton(){
		resetButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='clear']/button")));
		return resetButton; 									  
	}
	public WebElement getSearchButton(){
		searchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-active-do']/button")));
		return searchButton; 									  
	}
	
	public WebElement getSrContentText(){
		srContentText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-result']/div/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td")));
		return srContentText; 									  
	}
	public WebElement getSrSONumber(int num){
		srSONumber= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-result']/div/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[" + num + "]/td[3]/a")));
		return srSONumber; 									  
	}
	public WebElement getSrCustomerNumber(int num){
		srCustomerNumber= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-result']/div/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[" + num + "]/td[4]/a")));
		return srCustomerNumber; 									  
	}
	public WebElement getSrCustomerNumberOnly(){
		srCustomerNumber= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-result']/div/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[4]/a")));
		return srCustomerNumber; 									  
	}
	public WebElement getSrSONumberOnly(){
		srSONumber= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-result']/div/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[3]/a")));
		return srSONumber; 									  
	}
	public WebElement getErrorMessage(){
		errorMessage= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div/div[2]")));
		return errorMessage; 									  
	}
	public WebElement getSelectButtonValue(String num){
		selectButtonValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='_dropdown']/div[" + num + "]")));
		return selectButtonValue; 									  
	}
}
