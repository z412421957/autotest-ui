package com.neso.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neso.factory.CommonUtil;

public class NETTermApplication extends CommonUtil{
	private WebDriver driver = null;
	private WebDriverWait wait = null;
	
	private WebElement applicationNumberWord;
	private WebElement applicationNumberText;
	private WebElement applicationSearchButton;
	private WebElement merchantNumberText;
	private WebElement merchantSearchButton;
	private WebElement changeContactYesButton;
	private WebElement changeContactNoButton;
	private WebElement billingFirstNameText;
	private WebElement changeMailYesButton;
	private WebElement changeMailNoButton;
	private WebElement mailAddressText;
	private WebElement limitAmountText;
	private WebElement limitButton_1;
	private WebElement limitButton_4;
	private WebElement bankNameText;
	private WebElement bankAddressText;
	private WebElement bankContactNameText;
	private WebElement bankContactPhoneText;
	private WebElement cityText;
	private WebElement zipCodeText;
	private WebElement stateText;
	private WebElement bankAccountTypeText;
	private WebElement bankAccountText;
	private WebElement companyNameText;
	private WebElement contactAddressText;
	private WebElement businessContactNameText;
	private WebElement businessContactPhoneText;
	private WebElement newButton;
	private WebElement submitButton;
	private WebElement approveButton;
	private WebElement declineButton;
	private WebElement errorOKButton;
	private WebElement approveMemoText;
	private WebElement approveApproveButton;
	private WebElement approveCancelButton;
	// query
	private WebElement qMerchantNumberText;
	private WebElement qStatusSelect;
	private WebElement qStatusValue;
	private WebElement qDateButton;
	private WebElement qSearchButton;
	private WebElement qSearchResultContent;
	private WebElement qResultStatus_3;
	private WebElement qDeclineButton;
	private WebElement kendoList;
	private WebElement qDeclineOKButton;
	
	
	
	public NETTermApplication(){
		driver = super.getDriver();
		wait = new WebDriverWait(driver,15);
	}
	
	
	public WebElement getApplicationNumberWord(){
		applicationNumberWord= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/div[1]/div[2]/form/div/div[1]/div/label")));
		return applicationNumberWord; 							
	}
	public WebElement getApplicationNumberText(){
		applicationNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/div[1]/div[2]/form/div/div[1]/div/div/nk-input/input")));
		return applicationNumberText; 							
	}
	public WebElement getApplicationSearchButton(){
		applicationSearchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/div[1]/div[2]/form/div/div[1]/div/div/nk-input/i")));
		return applicationSearchButton; 							
	}
	public WebElement getMerchantNumberText(){
		merchantNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/div[1]/div[2]/form/div/div[2]/div/div/nk-input/input")));
		return merchantNumberText; 							
	}
	public WebElement getMerchantSearchButton(){
		merchantSearchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/div[1]/div[2]/form/div/div[2]/div/div/nk-input/i")));
		return merchantSearchButton; 							    
	}
	public WebElement getChangeContactYesButton(){
		changeContactYesButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/form/div[2]/div[2]/div[2]/div/div/span/nk-radio[1]")));
		return changeContactYesButton; 																	
	}
	public WebElement getChangeContactNoButton(){
		changeContactNoButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div/ng-component/div/form/div[2]/div[2]/div[2]/div/div/span/nk-radio[2]")));
		return changeContactNoButton; 							
	}
	public WebElement getBillingFirstNameText(){
		billingFirstNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/form/div[2]/div[2]/div[3]/div/div[1]/div/div/input")));
		return billingFirstNameText; 								
	}
	public WebElement getChangeMailYesButton(){
		changeMailYesButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/form/div[2]/div[2]/div[5]/div/div/span/nk-radio[1]")));
		return changeMailYesButton; 							
	}
	public WebElement getChangeMailNoButton(){
		changeMailNoButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/form/div[2]/div[2]/div[5]/div/div/span/nk-radio[2]")));
		return changeMailNoButton; 							
	}
	public WebElement getMailAddressText(){
		mailAddressText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/form/div[2]/div[2]/div[6]/div/div[1]/div/div/input")));
		return mailAddressText; 										
	}
	public WebElement getLimitAmountText(){
		limitAmountText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/form/div[3]/div[2]/div/div/div/div/div/input")));
		return limitAmountText; 									
	}
	public WebElement getLimitButton_1(){
		limitButton_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/form/div[3]/div[2]/div/div/div/nk-radio[1]")));
		return limitButton_1; 										
	}
	public WebElement getLimitButton_4(){
		limitButton_4= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/form/div[3]/div[2]/div/div/div/nk-radio[4]")));
		return limitButton_4; 										
	}
	public WebElement getBankNameText(){
		bankNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/form/div[4]/div[2]/div[1]/div[1]/div/div/input")));
		return bankNameText; 							
	}
	public WebElement getBankAddressText(){
		bankAddressText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/form/div[4]/div[2]/div[1]/div[2]/div/div/input")));
		return bankAddressText; 							
	}
	public WebElement getBankContactNameText(){
		bankContactNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/form/div[4]/div[2]/div[3]/div[1]/div/div/input")));
		return bankContactNameText; 							
	}
	public WebElement getBankContactPhoneText(){
		bankContactPhoneText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/form/div[4]/div[2]/div[2]/div[1]/div/div/input")));
		return bankContactPhoneText; 							
	}
	public WebElement getCityText(){
		cityText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/form/div[4]/div[2]/div[2]/div[3]/div/div/input")));
		return cityText; 							
	}
	public WebElement getZipCodeText(){
		zipCodeText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/form/div[4]/div[2]/div[1]/div[3]/div/div/div/input")));
		return zipCodeText; 							
	}
	public WebElement getStateText(){
		stateText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/form/div[4]/div[2]/div[3]/div[3]/div/div/div/kendo-combobox/span/kendo-searchbar/input")));
		return stateText; 							
	}
	public WebElement getBankAccountTypeText(){
		bankAccountTypeText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/form/div[4]/div[2]/div[1]/div[4]/div/div/input")));
		return bankAccountTypeText; 							
	}
	public WebElement getBankAccountText(){
		bankAccountText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/form/div[4]/div[2]/div[3]/div[2]/div/div/input")));
		return bankAccountText; 							
	}
	public WebElement getCompanyNameText(){
		companyNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/form/div[5]/div[2]/div[2]/div[1]/div/div/input")));
		return companyNameText; 							
	}
	public WebElement getContactAddressText(){
		contactAddressText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/form/div[5]/div[2]/div[2]/div[2]/div/div/input")));
		return contactAddressText; 							
	}
	public WebElement getBusinessContactNameText(){
		businessContactNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/form/div[5]/div[2]/div[2]/div[3]/div/div/input")));
		return businessContactNameText; 														   				
	}
	public WebElement getBusinessContactPhoneText(){
		businessContactPhoneText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/form/div[5]/div[2]/div[2]/div[4]/div/div/input")));
		return businessContactPhoneText; 							
	}
	public WebElement getNewButton(){
		newButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/div[2]/nk-function-panel/div/div/div[1]/div/button[1]")));
		return newButton; 							
	}
	public WebElement getSubmitButton(){
		submitButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/div[2]/nk-function-panel/div/div/div[1]/div/button[2]")));
		return submitButton; 							
	}
	public WebElement getApproveButton(){
		approveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/div[2]/nk-function-panel/div/div/div[1]/div/button[3]")));
		return approveButton; 							
	}
	public WebElement getDeclineButton(){
		declineButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div/div[2]/nk-function-panel/div/div/div[1]/div/button[4]")));
		return declineButton; 							
	}
	public WebElement getErrorOKButton(){
		errorOKButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div/div[3]/button")));
		return errorOKButton; 										
	}
	public WebElement getApproveMemoText(){
		approveMemoText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='memo']")));
		return approveMemoText; 										
	}
	public WebElement getApproveApproveButton(){
		approveApproveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//net-term-application-action-form/kendo-dialog/div[2]/div/form/div[5]/div/button[2]")));
		return approveApproveButton; 									                
	}
	public WebElement getApproveCancelButton(){
		approveCancelButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//net-term-application-action-form/kendo-dialog/div[2]/div/form/div[5]/div/button[1]")));
		return approveCancelButton; 									                
	}
	
	// query
	public WebElement getQMerchantNumberText(){
		qMerchantNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div[1]/div[2]/form/div/div[1]/div/div/nk-input/input")));
		return qMerchantNumberText; 									
	}
	public WebElement getQStatusButton(){
		qStatusSelect= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div[1]/div[2]/form/div/div[2]/div/kendo-dropdownlist/span")));
		return qStatusSelect; 							
	}
	public WebElement getQStatusValue(){
		qStatusValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div[1]/div[2]/form/div/div[2]/div/kendo-dropdownlist/span/span[1]")));
		return qStatusValue; 							
	}
	public WebElement getQDateButton(){
		qDateButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div[1]/div[2]/form/div/div[3]/div/input")));
		return qDateButton; 										
	}
	public WebElement getQSearchButton(){
		qSearchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div[1]/div[2]/form/div/button")));
		return qSearchButton; 									
	}
	public WebElement getQSearchResultContent(){
		qSearchResultContent= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div[2]/div[1]/table/tbody/tr/td	")));
		return qSearchResultContent; 															 						 
	}
	public WebElement getQResultStatus_3(){
		qResultStatus_3= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div[2]/div[1]/table/tbody/tr[3]/td[5]")));
		return qResultStatus_3; 									
	}
	public WebElement getQDeclineButton(){
		qDeclineButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div[1]/div[1]/table/tbody/tr/td/div/a[2]")));
		return qDeclineButton; 									
	}
	public WebElement getKendoList(int i){
		kendoList= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/nk-app/kendo-popup/div/kendo-list/div/ul/li[" + i + "]")));
		return kendoList;
	}
	public WebElement getQDeclineOKButton(){
		qDeclineOKButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ng-component/div[2]/div[2]/net-term-application-action-form/kendo-dialog/div[2]/div/form/div[5]/div/button[2]")));
		return qDeclineOKButton; 									
	}
}
