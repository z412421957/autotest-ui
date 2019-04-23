package com.neso.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neso.factory.CommonUtil;

public class ContactProcess extends CommonUtil{

	private WebDriver driver = null;
	private WebDriverWait wait = null;
	
	private WebElement merchantNameText;
	private WebElement merchantIDText;
	private WebElement rewardTypeButton;
	private WebElement rewardTypeValue;
	private WebElement optInForEmailButton;
	private WebElement optInForEmailValue;
	private WebElement createDateBox;
	private WebElement customerNameText;
	private WebElement customerNumberText;
	private WebElement customerStatusButton;
	private WebElement customerStatusValue;
	private WebElement acctPayableContactButton;
	private WebElement acctPayableContactValue;
	private WebElement contactIDText;
	private WebElement resetButton;
	private WebElement searchButton;
	private WebElement addNewButton;
	private WebElement anMerchantIDBox;
	private WebElement anMerchantIDText;
	private WebElement anMerchantIDButton;
	private WebElement anMerchantNameText;
	private WebElement anMerchantNameButton;
	private WebElement anMerchantQueryDiv;
	private WebElement anMerchantQuerySelectButton;
	private WebElement anCustomerBox;
	private WebElement anCustomerNumberText;
	private WebElement anCustomerNameText;
	private WebElement anWorkPhoneText;
	private WebElement anAcctPayableBox;
	private WebElement anOptInBox;
	private WebElement anSaveButton;
	private WebElement anCancelButton;
	
	private WebElement joinToOneMerchantButton;
	private WebElement deleteButton;
	private WebElement exportCurrentPageButton;
	private WebElement srDivBox;
	private WebElement srEditButton;
	private WebElement srContactID;
	private WebElement srMerchantButton;
	private WebElement srCurrentID;
	private WebElement srCurrentCancelButton;
	private WebElement srMerchantIDValue;
	private WebElement srCustomerName;
	private WebElement merchantDetailButton;
	private WebElement salesOpportunityButton;
	private WebElement contactNoteButton;
	private WebElement cnNoteText;
	private WebElement cnSaveButton;
	private WebElement cnCloseButton;
	private WebElement penGlobeButton;
	private WebElement messageOKButton;
	private WebElement kendoList;
	
	
	public ContactProcess(){
		driver = super.getDriver();
		wait = new WebDriverWait(driver,15);
	}
	
	public WebElement getMerchantNameText(){
		merchantNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/form/div/div[2]/div[1]/div[1]/div/input")));
		return merchantNameText; 									  
	}
	public WebElement getMerchantIDText(){
		merchantIDText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/form/div/div[2]/div[1]/div[2]/div/input")));
		return merchantIDText; 									  
	}
	public WebElement getRewardTypeButton(){
		rewardTypeButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/form/div/div[2]/div[1]/div[3]/div/kendo-dropdownlist/span")));
		return rewardTypeButton; 									  
	}
	public WebElement getRewardTypeValue(){
		rewardTypeValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/form/div/div[2]/div[1]/div[3]/div/kendo-dropdownlist/span/span[1]")));
		return rewardTypeValue; 									  
	}
	public WebElement getOptInForEmailButton(){
		optInForEmailButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/form/div/div[2]/div[1]/div[4]/div/kendo-dropdownlist/span")));
		return optInForEmailButton; 									  
	}
	public WebElement getOptInForEmailValue(){
		optInForEmailValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/form/div/div[2]/div[1]/div[4]/div/kendo-dropdownlist/span/span[1]")));
		return optInForEmailValue; 									  
	}
	public WebElement getCreateDateBox(){
		createDateBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/form/div/div[2]/div[1]/div[5]/div[1]/nk-checkbox/label/span[1]/input")));
		return createDateBox; 									  
	}
	public WebElement getCustomerNameText(){
		customerNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/form/div/div[2]/div[2]/div[1]/div/input")));
		return customerNameText; 									  
	}
	public WebElement getCustomerNumberText(){
		customerNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/form/div/div[2]/div[2]/div[2]/div/input")));
		return customerNumberText; 									  
	}
	public WebElement getCustomerStatusButton(){
		customerStatusButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/form/div/div[2]/div[2]/div[3]/div/kendo-dropdownlist/span")));
		return customerStatusButton; 									  
	}
	public WebElement getCustomerStatusValue(){
		customerStatusValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/form/div/div[2]/div[2]/div[3]/div/kendo-dropdownlist/span/span[1]")));
		return customerStatusValue; 									  
	}
	public WebElement getAcctPayableContactButton(){
		acctPayableContactButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/form/div/div[2]/div[2]/div[4]/div/kendo-dropdownlist/span")));
		return acctPayableContactButton; 									  
	}
	public WebElement getAcctPayableContactValue(){
		acctPayableContactValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/form/div/div[2]/div[2]/div[4]/div/kendo-dropdownlist/span/span[1]")));
		return acctPayableContactValue; 									  
	}
	public WebElement getContactIDText(){
		contactIDText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/form/div/div[2]/div[2]/div[5]/div/input")));
		return contactIDText; 									  
	}
	public WebElement getResetButton(){
		resetButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/form/div/div[3]/nk-button[1]/button")));
		return resetButton; 									  
	}
	public WebElement getSearchButton(){
		searchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/form/div/div[3]/nk-button[2]/button")));
		return searchButton; 									  
	}
	public WebElement getAddNewButton(){
		addNewButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/div[1]/div[1]/div[2]/a[1]")));
		return addNewButton; 									  
	}
	public WebElement getAnMerchantIDBox(){
		anMerchantIDBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain-edit/nk-modal/div/div[1]/div/div/div[2]/div/form/div[1]/div[1]/nk-checkbox/label/span[1]/input")));
		return anMerchantIDBox; 									  
	}
	public WebElement getAnMerchantIDText(){
		anMerchantIDText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain-edit/nk-modal/div/div[1]/div/div/div[2]/div/form/div[1]/div[1]/div/nk-input/input")));
		return anMerchantIDText; 									  
	}
	public WebElement getAnMerchantIDButton(){
		anMerchantIDButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain-edit/nk-modal/div/div[1]/div/div/div[2]/div/form/div[1]/div[1]/div/nk-input/i")));
		return anMerchantIDButton; 									  
	}
	public WebElement getAnMerchantNameText(){
		anMerchantNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain-edit/nk-modal/div/div[1]/div/div/div[2]/div/form/div[1]/div[2]/div/nk-input/input")));
		return anMerchantNameText; 									  
	}
	public WebElement getAnMerchantNameButton(){
		anMerchantNameButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain-edit/nk-modal/div/div[1]/div/div/div[2]/div/form/div[1]/div[2]/div/nk-input/i")));
		return anMerchantNameButton; 									  
	}
	public WebElement getAnMerchantQueryDiv(){
		anMerchantQueryDiv= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//sale-opportunity-modal-merchant-query/nk-modal/div/div[1]/div/div/div[2]/form/div[3]/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr")));
		return anMerchantQueryDiv; 									  
	}
	public WebElement getAnMerchantQuerySelectButton(){
		anMerchantQuerySelectButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//sale-opportunity-modal-merchant-query/nk-modal/div/div[1]/div/div/div[3]/div/nk-button[1]/button")));
		return anMerchantQuerySelectButton; 									  
	}
	public WebElement getAnCustomerBox(){
		anCustomerBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain-edit/nk-modal/div/div[1]/div/div/div[2]/div/form/div[2]/div[1]/nk-checkbox/label/span[1]/input")));
		return anCustomerBox; 									  
	}
	public WebElement getAnCustomerNumberText(){
		anCustomerNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/contact-maintain-edit/nk-modal/div/div[1]/div/div/div[2]/div/form/div[2]/div[1]/div/kendo-combobox/span")));
		return anCustomerNumberText; 								  
	}
	public WebElement getAnCustomerNameText(){
		anCustomerNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain-edit/nk-modal/div/div[1]/div/div/div[2]/div/form/div[2]/div[2]/div/nk-input/input")));
		return anCustomerNameText; 									  
	}
	public WebElement getAnWorkPhoneText(){
		anWorkPhoneText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain-edit/nk-modal/div/div[1]/div/div/div[2]/div/form/div[5]/div/div/nk-input/input")));
		return anWorkPhoneText; 									  
	}
	public WebElement getAnAcctPayableBox(){
		anAcctPayableBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain-edit/nk-modal/div/div[1]/div/div/div[2]/div/form/div[7]/div/nk-checkbox[1]/label/span[1]/input")));
		return anAcctPayableBox; 									  
	}
	public WebElement getAnOptInBox(){
		anOptInBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain-edit/nk-modal/div/div[1]/div/div/div[2]/div/form/div[7]/div/nk-checkbox[2]/label/span[1]/input")));
		return anOptInBox; 									  
	}
	public WebElement getAnSaveButton(){
		anSaveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain-edit/nk-modal/div/div[1]/div/div/div[3]/div/nk-button[1]/button")));
		return anSaveButton; 									  
	}
	public WebElement getAnCancelButton(){
		anCancelButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain-edit/nk-modal/div/div[1]/div/div/div[3]/div/nk-button[2]/button")));
		return anCancelButton; 									  
	}
	public WebElement getJoinToOneMerchantButton(){
		joinToOneMerchantButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/div[1]/div[1]/div[2]/a[2]")));
		return joinToOneMerchantButton; 									  
	}
	public WebElement getDeleteButton(){
		deleteButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/div[1]/div[1]/div[2]/a[3]")));
		return deleteButton; 									  
	}
	public WebElement getExportCurrentPageButton(){
		exportCurrentPageButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/div[1]/div[1]/div[2]/a[4]")));
		return exportCurrentPageButton; 									  
	}
	public WebElement getSrDiv(){
		srDivBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr")));
		return srDivBox; 									  
	}
	public WebElement getSrDivBox(){
		srDivBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[1]/nk-checkbox/label/span[1]/input")));
		return srDivBox; 									  
	}
	public WebElement getSrEditButton(){
		srEditButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[2]/a")));
		return srEditButton; 									  
	}
	public WebElement getSrContactID(){
		srContactID= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[2]")));
		return srContactID; 									  
	}
	public WebElement getSrMerchantButton(){
		srMerchantButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[3]/a[1]")));
		return srMerchantButton; 									  
	}
	public WebElement getSrCurrentID(){
		srCurrentID= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/nk-modal/div/div[1]/div/div/div[2]/div/div/form/div[1]/div/div/input")));
		return srCurrentID; 									  
	}
	public WebElement getSrCurrentCancelButton(){
		srCurrentCancelButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/nk-modal/div/div[1]/div/div/div[3]/div/nk-button[2]/button")));
		return srCurrentCancelButton; 									  
	}
	public WebElement getSrMerchantIDValue(){
		srMerchantIDValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[3]/a[2]")));
		return srMerchantIDValue; 									  
	}
	public WebElement getSrCustomerName(){
		srCustomerName= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[7]/span")));
		return srCustomerName; 									  
	}
	public WebElement getMerchantDetailButton(){
		merchantDetailButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/div[2]/nk-function-panel/div/div/div[1]/nk-row/div/nk-button[1]/button")));
		return merchantDetailButton; 									  
	}
	public WebElement getSalesOpportunityButton(){
		salesOpportunityButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/div[2]/nk-function-panel/div/div/div[1]/nk-row/div/nk-button[2]/button")));
		return salesOpportunityButton; 									  
	}
	public WebElement getContactNoteButton(){
		contactNoteButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/div[2]/nk-function-panel/div/div/div[1]/nk-row/div/nk-button[3]/button")));
		return contactNoteButton; 									  
	}
	public WebElement getCnNoteText(){
		cnNoteText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-note/nk-modal/div/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/nk-input/textarea")));
		return cnNoteText; 									  
	}
	public WebElement getCnSaveButton(){
		cnSaveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-note/nk-modal/div/div[1]/div/div/div[2]/div/div[1]/div[2]/div[3]/div/nk-button/button")));
		return cnSaveButton; 									  
	}
	public WebElement getCnCloseButton(){
		cnCloseButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-note/nk-modal/div/div[1]/div/div/div[3]/div/nk-button/button")));
		return cnCloseButton; 									  
	}
	public WebElement getPenGlobeButton(){
		penGlobeButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain/div/div[2]/nk-function-panel/div/div/div[1]/nk-row/div/nk-button[4]/button")));
		return penGlobeButton; 									  
	}
	public WebElement getMessageOKButton(){
		messageOKButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div/div[3]/button[1]")));
		return messageOKButton; 									  
	}
	public WebElement getKendoList(String i){
		kendoList= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/nk-app/kendo-popup/div/kendo-list/div/ul/li[" + i + "]")));
		return kendoList; 								
	}
}
