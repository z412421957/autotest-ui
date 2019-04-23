package com.neso.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neso.factory.CommonUtil;

public class CustomerMaintain extends CommonUtil{
	private WebDriver driver = null;
	private WebDriverWait wait = null;
	
	private WebElement customerNumberText;
	private WebElement customerNumberButton;
	private WebElement customerNameText;
	private WebElement customerLoginNameText;
	private WebElement customerPasswordText;
	private WebElement customerModifyPassButton;
	private WebElement customerSavePassButton;
	private WebElement customerType;
	
	private WebElement billingAddressText;
	private WebElement billingCityText;
	private WebElement billingState;
	private WebElement billingCountry;
	private WebElement billingZipText;
	private WebElement billingBiPhoneText;

	private WebElement shippingNameText;
	private WebElement shippingAddressText;
	private WebElement shippingCityText;
	private WebElement shippingState;
	private WebElement shippingCountry;
	private WebElement shippingZipText;
	private WebElement shippingPhoneText;
	private WebElement shippingProvince;
	private WebElement shippingAddressTextCHN;
	
	private WebElement otherTerm;
	private WebElement otherCardText;
	private WebElement otherDateText;
	private WebElement otherBankText;
	private WebElement otherEmailText;
	private WebElement otherAllowEmailBox;
	
	private WebElement memoCustomerButton;
	private WebElement memoNoteText;
	private WebElement memoSaveButton;
	private WebElement memoExitButton;
	
	private WebElement createNewButton;
	private WebElement editButton;
	private WebElement saveButton;
	private WebElement cancelButton;
	
	private WebElement errorMessage;
	private WebElement warningOKButton;
	private WebElement kendoList;
	
	public CustomerMaintain(){
		driver = super.getDriver();
		wait = new WebDriverWait(driver,15);
	}
	
	
	public WebElement getCustomerNumberText(){
		customerNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='customer-information']/form/nk-row/div/nk-col[1]/nk-row[1]/div/nk-col[1]/div/nk-input/input")));
		return customerNumberText; 								
	}
	public WebElement getCustomerNumberButton(){
		customerNumberButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='customer-information']/form/nk-row/div/nk-col[1]/nk-row[1]/div/nk-col[1]/div/nk-input/i")));
		return customerNumberButton; 
	}
	public WebElement getCustomerNameText(){
		customerNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='customer-information']/form/nk-row/div/nk-col[1]/nk-row[1]/div/nk-col[2]/div/div/input")));
		return customerNameText; 									
	}
	public WebElement getCustomerNameText1(){
		customerNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='customer-information']/form/nk-row/div/nk-col[1]/nk-row[1]/div/nk-col[2]/div/contact-name/form/div[1]/div/input")));
		return customerNameText; 									
	}
	public WebElement getCustomerNameText3(){
		customerNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='customer-information']/form/nk-row/div/nk-col[1]/nk-row[1]/div/nk-col[2]/div/contact-name/form/div[3]/div/input")));
		return customerNameText; 
	}
	public WebElement getCustomerLoginNameText(){
		customerLoginNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='customer-information']/form/nk-row/div/nk-col[2]/nk-row[1]/div/nk-col/div/div/input")));
		return customerLoginNameText; 								
	}
	public WebElement getCustomerPasswordText(){
		customerPasswordText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='customer-information']/form/nk-row/div/nk-col[2]/nk-row[2]/div/nk-col/div/div/input")));
		return customerPasswordText; 								
	}
	public WebElement getCustomerModifyPassButton(){
		customerModifyPassButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='customer-information']/form/nk-row/div/nk-col[2]/nk-row[2]/div/span/nk-button/button")));
		return customerModifyPassButton; 												
	}
	public WebElement getCustomerSavePassButton(){
		customerSavePassButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='customer-information']/form/nk-row/div/nk-col[2]/nk-row[2]/div/span/nk-button[1]/button")));
		return customerSavePassButton; 												
	}
	public WebElement getCustomerType(){
		customerType= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='customer-information']/form/nk-row/div/nk-col[1]/nk-row[2]/div/nk-col[2]/div/kendo-dropdownlist/span")));
		return customerType; 
	}
	
	public WebElement getBillingAddressText(){
		billingAddressText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//billing-information/div/div[2]/form/nk-row[1]/div/nk-col/div/div/input")));
		return billingAddressText; 								
	}
	public WebElement getBillingCityText(){
		billingCityText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//billing-information/div/div[2]/form/nk-row[3]/div/nk-col[1]/div/div/input")));
		return billingCityText; 
	}
	public WebElement getBillingState(){
		billingState= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//billing-information/div/div[2]/form/nk-row[3]/div/nk-col[2]/div/div/kendo-dropdownlist/span")));
		return billingState; 
	}
	public WebElement getBillingCountry(){
		billingCountry= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//billing-information/div/div[2]/form/nk-row[4]/div/nk-col[1]/div/div/kendo-dropdownlist/span")));
		return billingCountry; 										   
	}
	public WebElement getBillingZipText(){
		billingZipText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//billing-information/div/div[2]/form/nk-row[5]/div/nk-col[1]/div/div/input")));
		return billingZipText; 
	}
	public WebElement getBillingBiPhoneText(){
		billingBiPhoneText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//billing-information/div/div[2]/form/nk-row[4]/div/nk-col[2]/div/div/input")));
		return billingBiPhoneText; 
	}
	
	public WebElement getShippingNameText1(){
		shippingNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//shipping-information/div/div[2]/form[1]/div/nk-row[1]/div/nk-col[2]/div/contact-name/form/div[1]/div/input")));
		return shippingNameText; 
	}
	public WebElement getShippingNameText3(){
		shippingNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//shipping-information/div/div[2]/form[1]/div/nk-row[1]/div/nk-col[2]/div/contact-name/form/div[3]/div/input")));
		return shippingNameText; 
	}
	public WebElement getShippingAddressText(){
		shippingAddressText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//shipping-information/div/div[2]/form[1]/div/nk-row[2]/div/nk-col/div/div/nk-input/input")));
		return shippingAddressText; 								  
	}
	public WebElement getShippingCityText(){
		shippingCityText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//shipping-information/div/div[2]/form[1]/div/nk-row[4]/div/nk-col[1]/div/div/input")));
		return shippingCityText; 
	}
	public WebElement getShippingState(){
		shippingState= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//shipping-information/div/div[2]/form[1]/div/nk-row[4]/div/nk-col[2]/div/div/kendo-dropdownlist/span")));
		return shippingState; 
	}
	public WebElement getShippingCountry(){
		shippingCountry= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//shipping-information/div/div[2]/form[1]/div/nk-row[5]/div/nk-col[1]/div/div/kendo-dropdownlist/span")));
		return shippingCountry; 									   
	}
	public WebElement getShippingZipText(){
		shippingZipText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//shipping-information/div/div[2]/form[1]/div/nk-row[6]/div/nk-col/div/div/input")));
		return shippingZipText; 
	}
	public WebElement getShippingPhoneText(){
		shippingPhoneText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//shipping-information/div/div[2]/form[1]/div/nk-row[5]/div/nk-col[2]/div/div/input")));
		return shippingPhoneText; 
	}
	public WebElement getShippingProvince(){
		shippingProvince= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//shipping-information/div/div[2]/form[2]/div/nk-row[1]/div/nk-col[2]/div/div/kendo-dropdownlist/span")));
		return shippingProvince; 										
	}
	public WebElement getShippingAddressTextCHN(){
		shippingAddressTextCHN= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//shipping-information/div/div[2]/form[2]/div/nk-row[3]/div/nk-col/div/div/nk-input/input")));
		return shippingAddressTextCHN; 										
	}
	public WebElement getShippingNameText(){
		shippingNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//shipping-information/div/div[2]/form[2]/div/nk-row[6]/div/nk-col[2]/div/div/input")));
		return shippingNameText; 										
	}
	public WebElement getShippingPhoneTextCHN(){
		shippingPhoneText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//shipping-information/div/div[2]/form[2]/div/nk-row[7]/div/nk-col[1]/div/div/input")));
		return shippingPhoneText; 										
	}
	
	public WebElement getOtherTerm(){
		otherTerm= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//other-information/div/div[2]/form/nk-row/div/nk-col[1]/nk-row[1]/div/nk-col[1]/div/div/kendo-dropdownlist/span")));
		return otherTerm; 						
	}
	public WebElement getOtherCardText1(){
		otherCardText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//other-information/div/div[2]/form/nk-row/div/nk-col[1]/nk-row[1]/div/nk-col[2]/div/credit-card/form/nk-row/div/nk-col/nk-col[1]/div/input[1]")));
		return otherCardText; 
	}
	public WebElement getOtherCardText2(){
		otherCardText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//other-information/div/div[2]/form/nk-row/div/nk-col[1]/nk-row[1]/div/nk-col[2]/div/credit-card/form/nk-row/div/nk-col/nk-col[2]/div/input[1]")));
		return otherCardText; 
	}
	public WebElement getOtherCardText3(){
		otherCardText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//other-information/div/div[2]/form/nk-row/div/nk-col[1]/nk-row[1]/div/nk-col[2]/div/credit-card/form/nk-row/div/nk-col/nk-col[3]/div/input[1]")));
		return otherCardText; 
	}
	public WebElement getOtherCardText4(){
		otherCardText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//other-information/div/div[2]/form/nk-row/div/nk-col[1]/nk-row[1]/div/nk-col[2]/div/credit-card/form/nk-row/div/nk-col/nk-col[4]/div/input[1]")));
		return otherCardText; 
	}
	public WebElement getOtherDateText(){
		otherDateText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//other-information/div/div[2]/form/nk-row/div/nk-col[1]/nk-row[2]/div/nk-col[1]/div/div/input")));
		return otherDateText; 
	}
	public WebElement getOtherBankText(){
		otherBankText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//other-information/div/div[2]/form/nk-row/div/nk-col[1]/nk-row[3]/div/nk-col[1]/div/div/input")));
		return otherBankText; 
	}
	public WebElement getOtherEmailText(){
		otherEmailText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//other-information/div/div[2]/form/nk-row/div/nk-col[1]/nk-row[3]/div/nk-col[2]/div/div/input")));
		return otherEmailText; 										  
	}
	public WebElement getOtherAllowEmailBox(){
		otherAllowEmailBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.id("cbAllowEmail")));
		return otherAllowEmailBox; 
	}
	
	public WebElement getMemoCustomerButton(){
		memoCustomerButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//memo/div/div[2]/div/div[2]/img")));
		return memoCustomerButton; 
	}
	public WebElement getMemoNoteText(){
		memoNoteText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//customer-memo-mamage/kendo-dialog/div[2]/div/form/div[3]/div/textarea")));
		return memoNoteText; 
	}
	public WebElement getMemoSaveButton(){
		memoSaveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//customer-memo-mamage/kendo-dialog/div[2]/div/form/div[4]/div/nk-button/button")));
		return memoSaveButton;     
	}
	public WebElement getMemoExitButton(){
		memoExitButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//customer-memo-mamage/kendo-dialog/div[2]/div/form/div[7]/div/nk-button/button")));
		return memoExitButton; 								
	}
	
	public WebElement getCreateNewButton(){
		createNewButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-bottom-navbar ng-trigger ng-trigger-sysFuncPanelState']/div/div[1]/menu-bar/div[1]/div[1]/nk-button/button")));
		return createNewButton; 								
	}
	public WebElement getEditButton(){
		editButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-bottom-navbar ng-trigger ng-trigger-sysFuncPanelState']/div/div[1]/menu-bar/div[1]/div[2]/nk-button/button")));
		return editButton; 								
	}
	public WebElement getSaveButton(){
		saveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-bottom-navbar ng-trigger ng-trigger-sysFuncPanelState']/div/div[1]/menu-bar/div[1]/div[3]/nk-button/button")));
		return saveButton; 								
	}
	public WebElement getCancelButton(){
		cancelButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-bottom-navbar ng-trigger ng-trigger-sysFuncPanelState']/div/div[1]/menu-bar/div[1]/div[4]/nk-button/button")));
		return cancelButton; 								
	}
	
	public WebElement getErrorMessage(){
		errorMessage= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div/div[2]")));
		return errorMessage; 							
	}
	public WebElement getWarningOKButton(){
		warningOKButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div/div[3]/button[1]")));
		return warningOKButton; 								
	}
	public WebElement getKendoList(int i){
		kendoList= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/nk-app/kendo-popup/div/kendo-list/div/ul/li[" + i + "]")));
		return kendoList; 								
	}
}
