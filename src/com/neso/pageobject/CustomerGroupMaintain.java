package com.neso.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neso.factory.CommonUtil;

public class CustomerGroupMaintain extends CommonUtil{

	private WebDriver driver = null;
	private WebDriverWait wait = null;
	
	private WebElement customerGroupNumberText;
	private WebElement statusButton;
	private WebElement statusValue;
	private WebElement resetButton;
	private WebElement searchButton;
	private WebElement newButton;
	private WebElement newGroupNameText;
	private WebElement newDescriptionText;
	private WebElement newApplyBoxButton;
	private WebElement newApplyBox_1;
	private WebElement newApplyBox_2;
	private WebElement newOKButton;
	private WebElement newCancelButton;
	private WebElement modifyButton;
	    private WebElement modifyGroupNameText;
	    private WebElement modifyDescriptionText;
	    private WebElement modifySaveCustomerGroupButton;
	    private WebElement modifyBlackRemoveButton;
	    private WebElement modifyWhiteRemoveButton;
	private WebElement deactiveButton;
	private WebElement deactiveOKButton;
	private WebElement activeButton;
	private WebElement assignPriceTypesButton;
	    private WebElement priceAllTypeBox;
	    private WebElement priceTypeBox;
	    private WebElement priceOKButton;
	    private WebElement priceCancelButton;
	    private WebElement priceConfirmOKButton;
	private WebElement resultContent;
	private WebElement resultCustomerGroupName;
	private WebElement penGlobeButton;
	private WebElement searchCustomerGroupText;
	private WebElement associatePriceType;
	private WebElement associateContent;
	private WebElement associateCustomersRemoveButton;
	private WebElement errorMessage;
	private WebElement customerTotal;
	
	
	
	
	public CustomerGroupMaintain(){
		driver = super.getDriver();
		wait = new WebDriverWait(driver,15);
	}
	
	
	public WebElement getCustomerGroupNumberText(){
		customerGroupNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-maintain/div/div[1]/div[1]/div/div[2]/div/div[1]/div/input")));
		return customerGroupNumberText; 								 
	}
	public WebElement getStatusButton(){
		statusButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-maintain/div/div[1]/div[1]/div/div[2]/div/div[2]/div/kendo-dropdownlist/span")));
		return statusButton; 								 
	}
	public WebElement getStatusValue(){
		statusValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-maintain/div/div[1]/div[1]/div/div[2]/div/div[2]/div/kendo-dropdownlist/span/span[1]")));
		return statusValue; 								 
	}
	public WebElement getResetButton(){
		resetButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-maintain/div/div[1]/div[1]/div/div[2]/div/div[3]/button[1]")));
		return resetButton; 								 
	}
	public WebElement getSearchButton(){
		searchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-maintain/div/div[1]/div[1]/div/div[2]/div/div[3]/button[2]")));
		return searchButton; 								 
	}
	public WebElement getNewButton(){
		newButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-maintain/div/div[1]/div[1]/div/div[2]/kendo-grid/kendo-grid-toolbar/button[1]")));
		return newButton; 								 
	}
	public WebElement getNewGroupNameText(){
		newGroupNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-maintain/neso-customer-group-edit-modal/div/kendo-dialog/div[2]/div/div[1]/div/div/input")));
		return newGroupNameText; 								 
	}
	public WebElement getNewDescriptionText(){
		newDescriptionText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-maintain/neso-customer-group-edit-modal/div/kendo-dialog/div[2]/div/div[2]/div/div/input")));
		return newDescriptionText; 								 
	}
	public WebElement getNewApplyBoxButton(){
		newApplyBoxButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.id("isCheckedApplyByRule")));
		return newApplyBoxButton; 								 
	}
	public WebElement getNewApplyBox_1(){
		newApplyBox_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-merchant-type-list/div/kendo-treeview/ul/li[1]/div/kendo-checkbox/input")));
		return newApplyBox_1; 								 
	}
	public WebElement getNewApplyBox_2(){
		newApplyBox_2= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-merchant-type-list/div/kendo-treeview/ul/li[2]/div/kendo-checkbox/input")));
		return newApplyBox_2; 								 
	}
	public WebElement getNewOKButton(){
		newOKButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-maintain/neso-customer-group-edit-modal/div/kendo-dialog/div[2]/kendo-dialog-actions/button[1]")));
		return newOKButton; 								 
	}
	public WebElement getNewCancelButton(){
		newCancelButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-maintain/neso-customer-group-edit-modal/div/kendo-dialog/div[2]/kendo-dialog-actions/button[2]")));
		return newCancelButton; 								 
	}
	public WebElement getModifyButton(){
		modifyButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-maintain/div/div[1]/div[1]/div/div[2]/kendo-grid/kendo-grid-toolbar/button[2]")));
		return modifyButton; 								 
	}
	public WebElement getModifyGroupNameText(){
		modifyGroupNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-edit/div/div/div[2]/div/div[1]/div[1]/div[1]/div/div/input")));
		return modifyGroupNameText; 								 
	}
	public WebElement getModifyDescriptionText(){
		modifyDescriptionText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-edit/div/div/div[2]/div/div[1]/div[1]/div[2]/div/div/input")));
		return modifyDescriptionText; 								 
	}
	public WebElement getModifySaveCustomerGroupButton(){
		modifySaveCustomerGroupButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-edit/div/nk-function-panel/div/div/div[1]/div/div/button")));
		return modifySaveCustomerGroupButton; 								 
	}
	public WebElement getModifyBlackRemoveButton(){
		modifyBlackRemoveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-customer-list/div/kendo-grid/kendo-grid-toolbar/button")));
		return modifyBlackRemoveButton; 								 
	}
	public WebElement getModifyWhiteRemoveButton(){
		modifyWhiteRemoveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-customer-list/div/kendo-grid/kendo-grid-toolbar/button")));
		return modifyWhiteRemoveButton; 								 
	}
	public WebElement getDeactiveButton(){
		deactiveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-maintain/div/div[1]/div[1]/div/div[2]/kendo-grid/kendo-grid-toolbar/button[3]")));
		return deactiveButton; 								 
	}
	public WebElement getDeactiveOKButton(){
		deactiveOKButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div[1]/div[3]/button[1]")));
		return deactiveOKButton; 								 
	}
	public WebElement getActiveButton(){
		activeButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-maintain/div/div[1]/div[1]/div/div[2]/kendo-grid/kendo-grid-toolbar/button[4]")));
		return activeButton; 								 
	}
	public WebElement getAssignPriceTypesButton(){
		assignPriceTypesButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-maintain/div/div[1]/div[1]/div/div[2]/kendo-grid/kendo-grid-toolbar/button[5]")));
		return assignPriceTypesButton; 								 
	}
	public WebElement getPriceAllTypeBox(){
		priceAllTypeBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-assign-price-types/div/kendo-dialog/div[2]/div/div[2]/div/kendo-grid/div/div/div/table/thead/tr/th[1]/input")));
		return priceAllTypeBox; 								 
	}
	public WebElement getPriceTypeBox(String num){
		priceTypeBox= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-assign-price-types/div/kendo-dialog/div[2]/div/div[2]/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr" + num + "/td[1]/input")));
		return priceTypeBox; 								 
	}
	public WebElement getPriceOKButton(){
		priceOKButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-assign-price-types/div/kendo-dialog/div[2]/kendo-dialog-actions/button[1]")));
		return priceOKButton; 								 
	}
	public WebElement getPriceCancelButton(){
		priceCancelButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-assign-price-types/div/kendo-dialog/div[2]/kendo-dialog-actions/button[2]")));
		return priceCancelButton; 								 
	}
	public WebElement getPriceConfirmOKButton(){
		priceConfirmOKButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div[1]/div[3]/button[1]")));
		return priceConfirmOKButton; 								 
	}
	public WebElement getResultContent(){
		resultContent= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-maintain/div/div[1]/div[1]/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td")));
		return resultContent; 								 
	}
	public WebElement getResultCustomerGroupName(String num){
		resultCustomerGroupName= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-maintain/div/div[1]/div[1]/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr" + num + "/td[2]/span")));
		return resultCustomerGroupName; 								 
	}
	public WebElement getPenGlobeButton(){
		penGlobeButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-maintain/div/div[3]/nk-function-panel/div/div/div[1]/div/div/a")));
		return penGlobeButton; 								 
	}
	public WebElement getSearchCustomerGroupText(){
		searchCustomerGroupText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-maintain/div/div[1]/div[1]/div/div[2]/kendo-grid/div/div/div/table/thead/tr[2]/td[1]/kendo-grid-string-filter-cell/kendo-grid-filter-wrapper-cell/input")));
		return searchCustomerGroupText; 								 
	}
	public WebElement getAssociatePriceType(){
		associatePriceType= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//associate-price-types/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[1]")));
		return associatePriceType; 								 
	}
	public WebElement getAssociateContent(){
		associateContent= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//associate-price-types/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td")));
		return associateContent; 								 
	}
	public WebElement getAssociateCustomersRemoveButton(){
		associateCustomersRemoveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-maintain/div/div[2]/div[2]/associate-customers/kendo-grid/kendo-grid-toolbar/button")));
		return associateCustomersRemoveButton; 								 
	}
	public WebElement getErrorMessage(){
		errorMessage= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div[1]/div[2]")));
		return errorMessage; 								 
	}
	
	public WebElement getCustomerTotal(){
		customerTotal= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-customer-group-maintain/div/div[2]/div[2]/associate-customers/kendo-grid/kendo-pager/kendo-pager-info")));
		return customerTotal; 								 
	}
}
