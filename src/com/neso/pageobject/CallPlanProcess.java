package com.neso.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neso.factory.CommonUtil;

public class CallPlanProcess extends CommonUtil{
	
	private WebDriver driver = null;
	private WebDriverWait wait = null;
	
	private WebElement planIDText;
	private WebElement planIDError;
	private WebElement planStatusButton;
	private WebElement planStatusValue;
	private WebElement planNameText;
	private WebElement createDateBox;
	private WebElement createDateStartText;
	private WebElement createDateEndText;
	private	WebElement merchantIDText;
	private WebElement callStatusButton;
	private WebElement callStatusValue;
	private WebElement createByText;
	private WebElement planDateBox;
	private WebElement planDateStartText;
	private WebElement planDateEndText;
	private WebElement assignToText;	
	private WebElement resetButton;
	private WebElement searchButton;
	private WebElement addNewButton;
	private WebElement anPlanNameText;
	private WebElement anPlanNameError;
	private WebElement anPriorityButton;
	private WebElement anPriorityError;
	private WebElement anSaveButton;
	private WebElement anCancelButton;
	private WebElement srContent;
	private WebElement srEditButton;
	private WebElement srDeleteButton;
	private WebElement srDeleteOKButton;
	private WebElement epStatusButton;
	private WebElement srPlanID;
	private WebElement srPlanNameValue;
	private WebElement mmUpdateStatusButton;
	private WebElement mmUpdateCallStatusButton;
	private WebElement mmUpdateSaveButton;
	private WebElement mmAssignButton;
	private WebElement mmAssignAssignToText;
	private WebElement mmAssignSaveButton;
	private WebElement mmAssignCancelButton;
	private WebElement mmDeleteButton;
	private WebElement mmDeleteOKButton;
	private WebElement mmDeleteCancelButton;
	private WebElement mmContent;
	private WebElement mmBox;
	private WebElement mmMerchantID;
	private WebElement mmAddNoteButton;
	private WebElement mmNoteSaveButton;
	private WebElement mmNoteCloseButton;
	private WebElement mmAddContactButton;
	private WebElement mmContactMerchantBox;
	private WebElement mmContactMerchantIDText;
	private WebElement mmContactMerchantNameText;
	private WebElement mmContactSaveDetailButton;
	private WebElement mmContactSaveButton;
	private WebElement mmContactCloseButton;
	private WebElement mmAddOpportunityButton;
	private WebElement mmOpportunityMerchantBox;
	private WebElement mmOpportunityMerchantIDText;
	private WebElement mmOpportunityMerchantNameText;
	private WebElement mmOpportunitySaveDetailButton;
	private WebElement mmOpportunitySaveButton;
	private WebElement mmOpportunityCloseButton;
	private WebElement mmAssignTo;
	private WebElement mmCallStatus;
	
	private WebElement callHistoryLogButton;
	private WebElement customerFlagButton;
	private WebElement penGlobeButton;
	private WebElement merchantQueryButton;
	
	private WebElement errorMessage;
	private WebElement kendoList;
	
	
	
	
	public CallPlanProcess(){
		driver = super.getDriver();
		wait = new WebDriverWait(driver,15);
	}
	
	
	public WebElement getPlanIDText(){
		planIDText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/form/div/div[2]/div[1]/div[1]/div/input")));
		return planIDText; 								 
	}
	public WebElement getPlanIDError(){
		planIDError= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/form/div/div[2]/div[1]/div[1]/div/div")));
		return planIDError; 								 
	}
	public WebElement getPlanStatusButton(){
		planStatusButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/form/div/div[2]/div[1]/div[2]/div/kendo-dropdownlist/span")));
		return planStatusButton; 								 
	}
	public WebElement getPlanStatusValue(){
		planStatusValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/form/div/div[2]/div[1]/div[2]/div/kendo-dropdownlist/span/span[1]")));
		return planStatusValue; 								 
	}
	public WebElement getPlanNameText(){
		planNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/form/div/div[2]/div[1]/div[3]/div/input")));
		return planNameText; 								 
	}
	public WebElement getCreateDateBox(){
		createDateBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/form/div/div[2]/div[1]/div[4]/div[1]/nk-checkbox/label/span[1]/input")));
		return createDateBox; 								 
	}
	public WebElement getCreateDateStartText(){
		createDateStartText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/form/div/div[2]/div[1]/div[4]/div[2]/kendo-datepicker/span/kendo-dateinput/span/input")));
		return createDateStartText; 							 
	}
	public WebElement getCreateDateEndText(){
		createDateEndText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/form/div/div[2]/div[1]/div[4]/div[3]/kendo-datepicker/span/kendo-dateinput/span/input")));
		return createDateEndText; 								 
	}
	public WebElement getMerchantIDText(){
		merchantIDText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/form/div/div[2]/div[2]/div[1]/div/input")));
		return merchantIDText; 								 
	}
	public WebElement getCallStatusButton(){
		callStatusButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/form/div/div[2]/div[2]/div[2]/div/wj-multi-select")));
		return callStatusButton; 								 
	}
	public WebElement getCallStatusValue(String num){
		callStatusValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='_dropdown']/div[2]/div[" + num + "]/label/input")));
		return callStatusValue; 								 
	}
	public WebElement getCreateByText(){
		createByText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/form/div/div[2]/div[2]/div[3]/div/input")));
		return createByText; 								 
	}
	public WebElement getPlanDateBox(){
		planDateBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/form/div/div[2]/div[2]/div[4]/div[1]/nk-checkbox/label/span[1]/input")));
		return planDateBox; 								 
	}
	public WebElement getPlanDateStartText(){
		planDateStartText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/form/div/div[2]/div[2]/div[4]/div[2]/kendo-datepicker/span/kendo-dateinput/span/input")));
		return planDateStartText; 								 
	}
	public WebElement getPlanDateEndText(){
		planDateEndText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/form/div/div[2]/div[2]/div[4]/div[3]/kendo-datepicker/span/kendo-dateinput/span/input")));
		return planDateEndText; 								 
	}
	public WebElement getAssignToText(){
		assignToText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/form/div/div[2]/div[3]/div/div/kendo-multiselect/div/kendo-searchbar/input")));
		return assignToText; 								 
	}
	public WebElement getResetButton(){
		resetButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/form/div/div[3]/nk-button[1]/button")));
		return resetButton; 								 
	}
	public WebElement getSearchButton(){
		searchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/form/div/div[3]/nk-button[2]/button")));
		return searchButton; 								 
	}
	public WebElement getAddNewButton(){
		addNewButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/div[1]/div[1]/div[2]/a")));
		return addNewButton; 								 
	}
	public WebElement getAnPlanNameText(){
		anPlanNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='call-plan-list-edit']/form/div[1]/div/div/nk-input/input")));
		return anPlanNameText; 								 
	}
	public WebElement getAnPlanNameError(){
		anPlanNameError= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='call-plan-list-edit']/form/div[1]/div/div/div")));
		return anPlanNameError; 								 
	}
	public WebElement getAnPriorityButton(){
		anPriorityButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='call-plan-list-edit']/form/div[4]/div/div/kendo-dropdownlist/span")));
		return anPriorityButton; 								 
	}
	public WebElement getAnPriorityError(){
		anPriorityError= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='call-plan-list-edit']/form/div[4]/div/div/div")));
		return anPriorityError; 								 
	}
	public WebElement getAnSaveButton(){
		anSaveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-edit/nk-modal/div/div[1]/div/div/div[3]/nk-button[1]/button")));
		return anSaveButton; 								 
	}
	public WebElement getAnCancelButton(){
		anCancelButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-edit/nk-modal/div/div[1]/div/div/div[3]/nk-button[2]/button")));
		return anCancelButton; 								 
	}
	public WebElement getSrContent(){
		srContent= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td")));
		return srContent; 								 
	}
	public WebElement getSrEditButton(){
		srEditButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[1]/a[1]")));
		return srEditButton; 								 
	}
	public WebElement getSrDeleteButton(){
		srDeleteButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[1]/a[2]")));
		return srDeleteButton; 								 
	}
	public WebElement getSrDeleteOKButton(){
		srDeleteOKButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div/div[3]/button[1]")));
		return srDeleteOKButton; 								 
	}
	public WebElement getEpPlanNameText(){
		anPlanNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='call-plan-list-edit']/form/div[1]/div/div/nk-input/input")));
		return anPlanNameText; 								 
	}
	public WebElement getEpStatusButton(){
		epStatusButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='call-plan-list-edit']/form/div[4]/div/div/kendo-dropdownlist/span")));
		return epStatusButton; 								 
	}
	public WebElement getEpPriorityButton(){
		anPriorityButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='call-plan-list-edit']/form/div[5]/div/div/kendo-dropdownlist/span")));
		return anPriorityButton; 								 
	}
	public WebElement getEpSaveButton(){
		anSaveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-edit/nk-modal/div/div[1]/div/div/div[3]/nk-button[1]/button")));
		return anSaveButton; 								 
	}
	public WebElement getEpCancelButton(){
		anCancelButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-edit/nk-modal/div/div[1]/div/div/div[3]/nk-button[2]/button")));
		return anCancelButton; 								 
	}
	public WebElement getSrPlanID(String num){
		srPlanID= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr"+ num +"/td[2]")));
		return srPlanID; 								 
	}
	public WebElement getSrPlanNameValue(String num){
		srPlanNameValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr"+ num +"/td[3]")));
		return srPlanNameValue; 							 
	}
	public WebElement getMmUpdateStatusButton(){
		mmUpdateStatusButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/div[2]/div[1]/div[2]/a[1]")));
		return mmUpdateStatusButton; 								 
	}
	public WebElement getMmUpdateCallStatusValue(){
		mmUpdateCallStatusButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//merchant-batch-edit/nk-modal/div/div[1]/div/div/div[2]/div/div/div/div/kendo-dropdownlist/span/span[1]")));
		return mmUpdateCallStatusButton; 								 
	}
	public WebElement getMmUpdateSaveButton(){
		mmUpdateSaveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//merchant-batch-edit/nk-modal/div/div[1]/div/div/div[3]/nk-button[1]/button")));
		return mmUpdateSaveButton; 								 
	}
	public WebElement getMmAssignButton(){
		mmAssignButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/div[2]/div[1]/div[2]/a[2]")));
		return mmAssignButton; 								 
	}
	public WebElement getMmAssignAssignToText(){
		mmAssignAssignToText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//merchant-batch-edit/nk-modal/div/div[1]/div/div/div[2]/div/div[2]/div/div/kendo-combobox/span/kendo-searchbar/input")));
		return mmAssignAssignToText; 								 
	}
	public WebElement getMmAssignSaveButton(){
		mmAssignSaveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//merchant-batch-edit/nk-modal/div/div[1]/div/div/div[3]/nk-button[1]/button")));
		return mmAssignSaveButton; 								 
	}
	public WebElement getMmAssignCancelButton(){
		mmAssignCancelButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//merchant-batch-edit/nk-modal/div/div[1]/div/div/div[3]/nk-button[2]/button")));
		return mmAssignCancelButton; 								 
	}
	public WebElement getMmDeleteButton(){
		mmDeleteButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/div[2]/div[1]/div[2]/a[3]")));
		return mmDeleteButton; 								 
	}
	public WebElement getMmDeleteOKButton(){
		mmDeleteOKButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div/div[3]/button[1]")));
		return mmDeleteOKButton; 							 
	}
	public WebElement getMmDeleteCancelButton(){
		mmDeleteCancelButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div/div[3]/button[2]")));
		return mmDeleteCancelButton; 								 
	}
	public WebElement getMmContent(){
		mmContent= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td")));
		return mmContent; 								 
	}
	public WebElement getMmBox(){
		mmBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[1]/nk-checkbox/label/span[1]/input")));
		return mmBox; 								 
	}
	public WebElement getMmMerchantID(){
		mmMerchantID= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[3]/a[1]")));
		return mmMerchantID; 								 
	}
	public WebElement getMmAddNoteButton(){
		mmAddNoteButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[3]/a[2]")));
		return mmAddNoteButton; 								 
	}
	public WebElement getMmNoteSaveButton(){
		mmNoteSaveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/contact-note/nk-modal/div/div[1]/div/div/div[2]/div/div[1]/div[2]/div[3]/div/nk-button/button")));
		return mmNoteSaveButton; 								 
	}
	public WebElement getMmNoteCloseButton(){
		mmNoteCloseButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/contact-note/nk-modal/div/div[1]/div/div/div[3]/div/nk-button/button")));
		return mmNoteCloseButton; 								 
	}
	public WebElement getMmAddContactButton(){
		mmAddContactButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[3]/a[3]")));
		return mmAddContactButton; 								 
	}
	public WebElement getMmContactMerchantBox(){
		mmContactMerchantBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain-edit/nk-modal/div/div[1]/div/div/div[2]/div/form/div[1]/div[1]/nk-checkbox/label/span[1]/input")));
		return mmContactMerchantBox; 								 
	}
	public WebElement getMmContactMerchantIDText(){
		mmContactMerchantIDText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain-edit/nk-modal/div/div[1]/div/div/div[2]/div/form/div[1]/div[1]/div/nk-input/input")));
		return mmContactMerchantIDText; 								 
	}
	public WebElement getMmContactMerchantNameText(){
		mmContactMerchantNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain-edit/nk-modal/div/div[1]/div/div/div[2]/div/form/div[1]/div[2]/div/nk-input/input")));
		return mmContactMerchantNameText; 								 
	}
	public WebElement getMmContactSaveDetailButton(){
		mmContactSaveDetailButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain-edit/nk-modal/div/div[1]/div/div/div[3]/div/nk-button[1]/button")));
		return mmContactSaveDetailButton; 								 
	}
	public WebElement getMmContactSaveButton(){
		mmContactSaveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain-edit/nk-modal/div/div[1]/div/div/div[3]/div/nk-button[2]/button")));
		return mmContactSaveButton; 								 
	}
	public WebElement getMmContactCloseButton(){
		mmContactCloseButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//contact-maintain-edit/nk-modal/div/div[1]/div/div/div[3]/div/nk-button[3]/button")));
		return mmContactCloseButton; 								 
	}
	public WebElement getMmAddOpportunityButton(){
		mmAddOpportunityButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[3]/a[4]")));
		return mmAddOpportunityButton; 								 
	}
	public WebElement getMmOpportunityMerchantBox(){
		mmOpportunityMerchantBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='k-tabstrip-tabpanel-0']/div[1]/div[1]/nk-checkbox/label/span[1]/input")));
		return mmOpportunityMerchantBox; 								 
	}
	public WebElement getMmOpportunityMerchantIDText(){
		mmOpportunityMerchantIDText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='k-tabstrip-tabpanel-0']/div[1]/div[1]/div/nk-input/input")));
		return mmOpportunityMerchantIDText; 								 
	}
	public WebElement getMmOpportunityMerchantNameText(){
		mmOpportunityMerchantNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='k-tabstrip-tabpanel-0']/div[1]/div[2]/div/nk-input/input")));
		return mmOpportunityMerchantNameText; 								 
	}
	public WebElement getMmOpportunitySaveDetailButton(){
		mmOpportunitySaveDetailButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//sale-opportunity-edit/nk-modal/div/div[1]/div/div/div[3]/div/nk-button[1]/button")));
		return mmOpportunitySaveDetailButton; 								 
	}
	public WebElement getMmOpportunitySaveButton(){
		mmOpportunitySaveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//sale-opportunity-edit/nk-modal/div/div[1]/div/div/div[3]/div/nk-button[2]/button")));
		return mmOpportunitySaveButton; 								 
	}
	public WebElement getMmOpportunityCloseButton(){
		mmOpportunityCloseButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//sale-opportunity-edit/nk-modal/div/div[1]/div/div/div[3]/div/nk-button[3]/button")));
		return mmOpportunityCloseButton; 								 
	}
	public WebElement getMmAssignTo(String num){
		mmAssignTo= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr"+num+"/td[5]")));
		return mmAssignTo; 								 
	}
	public WebElement getMmCallStatus(String num){
		mmCallStatus= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr"+num+"/td[12]")));
		return mmCallStatus; 							
	}
	public WebElement getCallHistoryLogButton(){
		callHistoryLogButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/div[3]/nk-function-panel/div/div/div[1]/div/nk-button[1]/button")));
		return callHistoryLogButton; 								 
	}
	public WebElement getCustomerFlagButton(){
		customerFlagButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/div[3]/nk-function-panel/div/div/div[1]/div/nk-button[2]/button")));
		return customerFlagButton; 								 
	}
	public WebElement getPenGlobeButton(){
		penGlobeButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/div[3]/nk-function-panel/div/div/div[1]/div/nk-button[3]/button")));
		return penGlobeButton; 								 
	}
	public WebElement getMerchantQueryButton(){
		merchantQueryButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//call-plan-list-maintain/div/div[3]/nk-function-panel/div/div/div[1]/div/nk-button[4]/button")));
		return merchantQueryButton; 								 
	}
	
	public WebElement getErrorMessage(){
		errorMessage= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div/div[2]")));
		return errorMessage; 								 
	}
	public WebElement getKendoList(String i){
		kendoList= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/nk-app/kendo-popup/div/kendo-list/div/ul/li[" + i + "]")));
		return kendoList; 								
	}
}
