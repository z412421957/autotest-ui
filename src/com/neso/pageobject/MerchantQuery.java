package com.neso.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neso.factory.CommonUtil;

public class MerchantQuery extends CommonUtil{
	private WebDriver driver = null;
	private WebDriverWait wait = null;
	
	private WebElement searchConditionButton;
	private WebElement searchedByTypeButton;
	private WebElement searchedByTypeValue;
	private WebElement searchedByText;
	private WebElement resetButton;
	private WebElement searchPrevButton;
	private WebElement searchButton;
	private WebElement searchNextButton;
	private WebElement merchantStatusButton;
	private WebElement merchantStatusValue;
	private WebElement latePayStatusButton;
	private WebElement latePayStatusValue;
	private WebElement buValue;
	private WebElement netTermUsageValue;
	private WebElement seatSizeButton;
	private WebElement seatSizeValue;
	private WebElement b2bUnitValue;
	private WebElement ownershipTypeButton;
	private WebElement addToCustomerGroupButton;
	private WebElement cgBox;
	private WebElement cgOKButton;
	private WebElement cgCancelButton;
	private WebElement addToBlackWhiteButton;
	private WebElement bwBox;
	private WebElement bwBlackBox;
	private WebElement bwWhiteBox;
	private WebElement bwOKButton;
	private WebElement addToCallPlanButton;
	private WebElement apCallPlanListBox;
	private WebElement apAssignToText;
	private WebElement apSaveAndDetailButton;
	private WebElement exportCurrentPageButton;
	private WebElement searchResultContent;
	private WebElement searchResultBox;
	private WebElement searchResultBoxs;
	private WebElement srMerchantNumber;
	private WebElement soProcessButton;
	private WebElement merchantBalanceButton;
	private WebElement noteToPGButton;
	private WebElement mailToCustomerButton;
	private WebElement callHistoryButton;
	private WebElement reminderButton;
	private WebElement kendoList;
	
	
	
	public MerchantQuery(){
		driver = super.getDriver();
		wait = new WebDriverWait(driver,15);
	}
	
	
	public WebElement getSearchConditionButton(){
		searchConditionButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='collapseP']")));
		return searchConditionButton; 								 
	}
	public WebElement getSearchedByTypeButton(){
		searchedByTypeButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='tab-merchant']/div[1]/div[2]/div[1]/div[1]/div/kendo-dropdownlist/span")));
		return searchedByTypeButton; 								 
	}
	public WebElement getSearchedByTypeValue(){
		searchedByTypeValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='tab-merchant']/div[1]/div[2]/div[1]/div[1]/div/kendo-dropdownlist/span/span[1]")));
		return searchedByTypeValue; 								 
	}
	public WebElement getSearchedByText(){
		searchedByText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='tab-merchant']/div[1]/div[2]/div[1]/div[2]/input")));
		return searchedByText; 								 
	}
	public WebElement getResetButton(){
		resetButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='tab-merchant']/div[1]/div[2]/div[1]/div[4]/button")));
		return resetButton; 								 		 							 
	}
	public WebElement getSearchPrevButton(){
		searchPrevButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-active-prev']")));
		return searchPrevButton; 								 		
	}
	public WebElement getSearchButton(){
		searchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-active-do']")));
		return searchButton; 								 
	}
	public WebElement getSearchNextButton(){
		searchNextButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-active-next']")));
		return searchNextButton; 								 
	}
	public WebElement getMerchantStatusButton(){
		merchantStatusButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='searchAdvanced']/div/div[1]/div[1]/div/kendo-dropdownlist/span")));
		return merchantStatusButton; 								 
	}
	public WebElement getMerchantStatusValue(){
		merchantStatusValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='searchAdvanced']/div/div[1]/div[1]/div/kendo-dropdownlist/span/span[1]")));
		return merchantStatusValue; 								 
	}
	public WebElement getLatePayStatusButton(){
		latePayStatusButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='searchAdvanced']/div/div[1]/div[2]/div/kendo-dropdownlist/span")));
		return latePayStatusButton; 								 
	}
	public WebElement getLatePayStatusValue(){
		latePayStatusValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='searchAdvanced']/div/div[1]/div[2]/div/kendo-dropdownlist/span/span[1]")));
		return latePayStatusValue; 								 
	}
	public WebElement getBuButton(){
		buValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='searchAdvanced']/div/div[1]/div[4]/div/neso-ddl-bu/kendo-dropdownlist/span")));
		return buValue; 								 			  
	}
	public WebElement getBuValue(){
		buValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='searchAdvanced']/div/div[1]/div[4]/div/neso-ddl-bu/kendo-dropdownlist/span/span[1]")));
		return buValue; 								 			  
	}
	public WebElement getNetTermUsageValue(){
		netTermUsageValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='searchAdvanced']/div/div[2]/div[1]/div/kendo-dropdownlist/span/span[1]")));
		return netTermUsageValue; 								 
	}
	public WebElement getSeatSizeButton(){
		seatSizeButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='searchAdvanced']/div/div[2]/div[2]/div/kendo-dropdownlist/span")));
		return seatSizeButton; 								 
	}
	public WebElement getSeatSizeValue(){
		seatSizeValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='searchAdvanced']/div/div[2]/div[2]/div/kendo-dropdownlist/span/span[1]")));
		return seatSizeValue; 								 
	}
	public WebElement getB2bUnitValue(){
		b2bUnitValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='searchAdvanced']/div/div[2]/div[3]/div/kendo-dropdownlist/span/span[1]")));
		return b2bUnitValue; 								 
	}
	public WebElement getOwnershipTypeButton(){
		ownershipTypeButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='searchAdvanced']/div/div[2]/div[4]/div/kendo-dropdownlist/span")));
		return ownershipTypeButton; 								 
	}
	public WebElement getOwnershipTypeValue(){
		ownershipTypeButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='searchAdvanced']/div/div[2]/div[4]/div/kendo-dropdownlist/span/span[1]")));
		return ownershipTypeButton; 								 
	}
	public WebElement getAddToCustomerGroupButton(){
		addToCustomerGroupButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-link-add-customer-group/a[1]")));
		return addToCustomerGroupButton; 								
	}
	public WebElement getCgBox(String num){
		cgBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-add-customer-group/kendo-dialog/div[2]/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr"+num+"/td[1]/input")));
		return cgBox; 								 				  
	}
	public WebElement getCgOKButton(){
		cgOKButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-add-customer-group/kendo-dialog/div[2]/kendo-dialog-actions/button[1]")));
		return cgOKButton; 								 			  
	}
	public WebElement getCgCancelButton(){
		cgCancelButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-add-customer-group/kendo-dialog/div[2]/kendo-dialog-actions/button[2]")));
		return cgCancelButton; 								 
	}
	public WebElement getAddToBlackWhiteButton(){
		addToBlackWhiteButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-link-add-customer-group/a[2]")));
		return addToBlackWhiteButton; 								 
	}
	public WebElement getBwBox(){
		bwBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-add-customer-group/kendo-dialog/div[2]/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[1]/input")));
		return bwBox; 								 				  
	}
	public WebElement getBwBlackBox(){
		bwBlackBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-add-customer-group/kendo-dialog/div[2]/kendo-dialog-actions/div/input[1]")));
		return bwBlackBox; 								 			  
	}
	public WebElement getBwWhiteBox(){
		bwWhiteBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-add-customer-group/kendo-dialog/div[2]/kendo-dialog-actions/div/input[2]")));
		return bwWhiteBox; 								 			  
	}
	public WebElement getBwOKButton(){
		bwOKButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-add-customer-group/kendo-dialog/div[2]/kendo-dialog-actions/button[1]")));
		return bwOKButton; 								 			  
	}
	public WebElement getAddToCallPlanButton(){
		addToCallPlanButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='tab-merchant']/div[2]/div[1]/div[2]/a[1]")));
		return addToCallPlanButton; 								 
	}
	public WebElement getApCallPlanListBox(){
		apCallPlanListBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='k-tabstrip-tabpanel-0']/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[1]/input")));
		return apCallPlanListBox; 								 
	}
	public WebElement getApAssignToText(){
		apAssignToText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='k-tabstrip-tabpanel-0']/div[3]/div/div/kendo-combobox/span/kendo-searchbar/input")));
		return apAssignToText; 								 
	}
	public WebElement getApSaveAndDetailButton(){
		apSaveAndDetailButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//add-to-call-plan/nk-modal/div/div[1]/div/div/div[3]/div/nk-button[1]/button")));
		return apSaveAndDetailButton; 								 
	}
	public WebElement getExportCurrentPageButton(){
		exportCurrentPageButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='tab-merchant']/div[2]/div[1]/div[2]/a[2]")));
		return exportCurrentPageButton; 								 
	}
	public WebElement getSearchResultContent(){
		searchResultContent= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='tab-merchant']/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td")));
		return searchResultContent; 								 
	}
	public WebElement getSearchResultBox(){
		searchResultBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='tab-merchant']/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[1]/input")));
		return searchResultBox; 								 	  							 
	}
	public WebElement getSrMerchantNumber(String num){
		srMerchantNumber= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='tab-merchant']/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr"+num+"/td[2]/a")));
		return srMerchantNumber; 								 
	}
	public WebElement getSoProcessButton(){
		soProcessButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nk-function-panel/div/div/div[1]/div/div[1]/button")));
		return soProcessButton; 								 
	}
	public WebElement getMerchantBalanceButton(){
		merchantBalanceButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nk-function-panel/div/div/div[1]/div/div[2]/button")));
		return merchantBalanceButton; 								 
	}
	public WebElement getNoteToPGButton(){
		noteToPGButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nk-function-panel/div/div/div[1]/div/div[3]/button")));
		return noteToPGButton; 								 
	}
	public WebElement getMailToCustomerButton(){
		mailToCustomerButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nk-function-panel/div/div/div[1]/div/div[4]/button")));
		return mailToCustomerButton; 								 
	}
	public WebElement getCallHistoryButton(){
		callHistoryButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nk-function-panel/div/div/div[1]/div/div[5]/button")));
		return callHistoryButton; 								 
	}
	public WebElement getReminderButton(){
		reminderButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nk-function-panel/div/div/div[1]/div/div[6]/button")));
		return reminderButton; 								 
	}
	
	public WebElement getKendoList(String i){
		kendoList= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/nk-app/kendo-popup/div/kendo-list/div/ul/li[" + i + "]")));
		return kendoList; 								
	}
	
}
