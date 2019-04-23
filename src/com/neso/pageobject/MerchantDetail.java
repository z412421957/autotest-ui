package com.neso.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neso.factory.CommonUtil;

public class MerchantDetail extends CommonUtil{
	private WebDriver driver = null;
	private WebDriverWait wait = null;
	
	private WebElement merchantIDText;
	private WebElement merchantIDButton;
	private WebElement merchantIDError;
	
	
	private WebElement selectFilesButton;
	private WebElement uploadButton;
	private WebElement shippingCarrierButton;
	private WebElement shippingCarrierText;
	private WebElement descriptionText;
	private WebElement descriptionTextError;
	private WebElement fileName;
	private WebElement fileAction;
	private WebElement customerType;
	private WebElement mailCustomerButton;
	private WebElement notePGButton;
	private WebElement contactNoteButton;
	private WebElement soProcessButton;
	private WebElement customerBalanceButton;
	private WebElement merchantBalanceButton;
	private WebElement customerReportButton;
	private WebElement merchantReportButton;
	private WebElement merchantDashboardButton;
	private WebElement penGlobeButton;
	private WebElement reminderButton;
	private WebElement newSOButton;
	private WebElement mailCustomerBox;
	private WebElement mailContactWith;
	private WebElement mailTemplateText;
	private WebElement mailOKButton;
	private WebElement mailCancelButton;
	private WebElement mailSuccess;
	private WebElement mainExitButton;
	private WebElement errorMessage;
	private WebElement errorOKButton;
	private WebElement errorOKButton2;
	
	
	
	public MerchantDetail(){
		driver = super.getDriver();
		wait = new WebDriverWait(driver,15);
	}
	
	public WebElement getMerchantIDText(){
		merchantIDText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nc-layout/div[2]/div/main/div/div[1]/div[2]/div[1]/div[1]/div/neso-input/input")));
		return merchantIDText; 										  //nc-layout/div[2]/div/main/div/div[1]/div[2]/div[1]/div[1]/div/neso-input/input							                          
	}
	public WebElement getMerchantIDButton(){
		merchantIDButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nc-layout/div[2]/div/main/div/div[1]/div[2]/div[1]/div[1]/div/neso-input/i")));
		return merchantIDButton; 																			
	}
	public WebElement getMerchantIDError(){
		merchantIDError= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nc-layout/div[2]/div/main/div/div[1]/div[2]/div[1]/div[1]/div/neso-input")));
		return merchantIDError; 																	
	}
	
	public WebElement getSelectFilesButton(){
		selectFilesButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nc-layout/div[2]/div/main/div/div[5]/div[2]/div/form/div[1]/div/kendo-upload/div/div/input")));
		return selectFilesButton; 										
	}
	public WebElement getUploadButton(){
		uploadButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nc-layout/div[2]/div/main/div/div[5]/div[2]/div/form/div[4]/button")));
		return uploadButton; 											
	}
	public WebElement getShippingCarrierButton(){
		shippingCarrierButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nc-layout/div[2]/div/main/div/div[5]/div[2]/div/form/div[2]/div/kendo-dropdownlist/span")));
		return shippingCarrierButton; 							
	}
	public WebElement getShippingCarrierText1(){
		shippingCarrierText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nc-layout/div[2]/div/main/div/div[5]/div[2]/div/form/div[2]/div/kendo-dropdownlist/span/span[1]")));
		return shippingCarrierText; 							
	}
	public WebElement getShippingCarrierText2(){
		shippingCarrierText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/nk-app/kendo-popup/div/kendo-list/div/ul/li[2]")));
		return shippingCarrierText; 							
	}
	public WebElement getDescriptionText(){
		descriptionText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nc-layout/div[2]/div/main/div/div[5]/div[2]/div/form/div[3]/div/input")));
		return descriptionText; 									  
	}
	public WebElement getDescriptionTextError(){
		descriptionTextError= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nc-layout/div[2]/div/main/div/div[5]/div[2]/div/form/div[3]/nk-validator/div/span[1]")));
		return descriptionTextError; 						
	}
	public WebElement getFileName(){
		fileName= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nc-layout/div[2]/div/main/div/div[5]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[1]/a")));
		return fileName; 											
	}
	public WebElement getFileAction(){
		fileAction= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nc-layout/div[2]/div/main/div/div[5]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[4]/a")));
		return fileAction; 							
	}
	public WebElement getCustomerType(){
		customerType= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nc-layout/div[2]/div/main/div/div[4]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[2]")));
		return customerType; 																		 
	}
	public WebElement getMailCustomerButton(){
		mailCustomerButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//btn-email-to-customer/button")));
		return mailCustomerButton; 									  
	}
	public WebElement getNotePGButton(){
		notePGButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//btn-note-to-pen-globe/button")));
		return notePGButton; 							
	}
	public WebElement getContactNoteButton(){
		contactNoteButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//btn-contact-note/button")));
		return contactNoteButton; 							
	}
	public WebElement getSoProcessButton(){
		soProcessButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nc-layout/div[2]/div/main/div/nk-function-panel/div/div/div[1]/div[2]/div[1]/a")));
		return soProcessButton; 							
	}
	public WebElement getCustomerBalanceButton(){
		customerBalanceButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nc-layout/div[2]/div/main/div/nk-function-panel/div/div/div[1]/div[2]/div[3]/a")));
		return customerBalanceButton; 							
	}
	public WebElement getMerchantBalanceButton(){
		merchantBalanceButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nc-layout/div[2]/div/main/div/nk-function-panel/div/div/div[1]/div[2]/div[5]/a")));
		return merchantBalanceButton; 							
	}
	public WebElement getCustomerReportButton(){
		customerReportButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nc-layout/div[2]/div/main/div/nk-function-panel/div/div/div[1]/div[2]/div[7]/a")));
		return customerReportButton; 							
	}						
	public WebElement getMerchantDashboardButton(){
		merchantDashboardButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nc-layout/div[2]/div/main/div/nk-function-panel/div/div/div[1]/div[2]/div[9]/a")));
		return merchantDashboardButton; 							
	}
	public WebElement getPenGlobeButton(){
		penGlobeButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nc-layout/div[2]/div/main/div/nk-function-panel/div/div/div[1]/div[2]/div[11]/a")));
		return penGlobeButton; 							
	}
	public WebElement getReminderButton(){
		reminderButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nc-layout/div[2]/div/main/div/nk-function-panel/div/div/div[1]/div[2]/div[13]/a")));
		return reminderButton; 							
	}
	public WebElement getNewSOButton(){
		newSOButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nc-layout/div[2]/div/main/div/nk-function-panel/div/div/div[1]/div[2]/div[15]/a")));
		return newSOButton; 							
	}
	public WebElement getMailCustomerBox(){
		mailCustomerBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//email-to-customer/kendo-dialog/div[2]/div/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[1]/input")));
		return mailCustomerBox; 									  
	}
	public WebElement getMailContactWith(){
		mailContactWith= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//email-to-customer/kendo-dialog/div[2]/div/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[3]")));
		return mailContactWith; 							
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
	public WebElement getMailSuccess(){
		mailSuccess= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//email-to-customer/kendo-dialog[2]/div[2]/div/textarea")));
		return mailSuccess; 							
	}
	public WebElement getMailExitButton(){
		mainExitButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//email-to-customer/kendo-dialog[2]/div[2]/kendo-dialog-titlebar/div[2]/a")));
		return mainExitButton; 						
	}
	public WebElement getErrorMessage(){
		errorMessage= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div/div[2]")));
		return errorMessage; 										  
	}
	public WebElement getErrorOKButton(){
		errorOKButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div/div[3]/button")));
		return errorOKButton; 							
	}
	public WebElement getErrorOKButton2(){
		errorOKButton2= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div/div[3]/button[1]")));
		return errorOKButton2; 							
	}
}
