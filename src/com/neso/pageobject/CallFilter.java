package com.neso.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neso.factory.CommonUtil;

public class CallFilter extends CommonUtil{
	
	private WebDriver driver = null;
	private WebDriverWait wait = null;
	
	private WebElement filterNameText;
	private WebElement createByText;
	private WebElement merchantStatusButton;
	private WebElement merchantStatusValue;
	private WebElement latePayStatusButton;
	private WebElement latePayStatusValue;
	private WebElement buButton;
	private WebElement buValue;
	private WebElement netTermUsageButton;
	private WebElement netTermUsageValue;
	private WebElement seatSizeButton;
	private WebElement seatSizeValue;
	private WebElement b2bUnitButton;
	private WebElement b2bUnitValue;
	private WebElement ownershipTypeButton;
	private WebElement ownershipTypeValue;
	private WebElement managedAgentText;
	private WebElement managedAgentValue;
	private WebElement resetButton;
	private WebElement searchButton;
	private WebElement addNewButton;
	private WebElement anFilterNameText;
	private WebElement anPriorityButton;
	private WebElement anPriorityError;
	private WebElement anSaveButton;
	private WebElement anCancelButton;
	private WebElement srFilterIDText;
	private WebElement srFilterNameText;
	private WebElement srMerchantStatusText;
	private WebElement srSeatSizeText;
	private WebElement srLatePayStatusText;
	private WebElement srCreateByText;
	private WebElement srManagedAgentText;
	private WebElement searchResultBody;
	private WebElement srEditButton;
	private WebElement srDeleteButton;
	private WebElement srCreateBy;
	private WebElement okButton;
	private WebElement kendoList;
	
	
	
	
	public CallFilter(){
		driver = super.getDriver();
		wait = new WebDriverWait(driver,15);
	}

	
	public WebElement getFilterNameText(){
		filterNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/form/div/div[2]/div[1]/div[1]/div/input")));
		return filterNameText; 									  	  
	}
	public WebElement getCreateByText(){
		createByText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/form/div/div[2]/div[1]/div[2]/div/input")));
		return createByText; 									  	
	}
	public WebElement getMerchantStatusButton(){
		merchantStatusButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/form/div/div[2]/div[2]/div[1]/div/kendo-dropdownlist/span")));
		return merchantStatusButton; 									  
	}
	public WebElement getMerchantStatusValue(){
		merchantStatusValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/form/div/div[2]/div[2]/div[1]/div/kendo-dropdownlist/span/span[1]")));
		return merchantStatusValue; 									  
	}
	public WebElement getLatePayStatusButton(){
		latePayStatusButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/form/div/div[2]/div[2]/div[2]/div/kendo-dropdownlist/span")));
		return latePayStatusButton; 									  
	}
	public WebElement getLatePayStatusValue(){
		latePayStatusValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/form/div/div[2]/div[2]/div[2]/div/kendo-dropdownlist/span/span[1]")));
		return latePayStatusValue; 									  
	}
	public WebElement getBuButton(){
		buButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/form/div/div[2]/div[1]/div[4]/div/neso-ddl-bu/kendo-dropdownlist/span")));
		return buButton; 									  
	}
	public WebElement getBuValue(){
		buValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/form/div/div[2]/div[1]/div[4]/div/neso-ddl-bu/kendo-dropdownlist/span/span[1]")));
		return buValue; 									  
	}
	public WebElement getNetTermUsageButton(){
		netTermUsageButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/form/div/div[2]/div[3]/div[1]/div/kendo-dropdownlist/span")));
		return netTermUsageButton; 									  
	}
	public WebElement getNetTermUsageValue(){
		netTermUsageValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/form/div/div[2]/div[3]/div[1]/div/kendo-dropdownlist/span/span[1]")));
		return netTermUsageValue; 									  
	}
	public WebElement getSeatSizeButton(){
		seatSizeButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/form/div/div[2]/div[3]/div[2]/div/kendo-dropdownlist/span")));
		return seatSizeButton; 									  
	}
	public WebElement getSeatSizeValue(){
		seatSizeValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/form/div/div[2]/div[3]/div[2]/div/kendo-dropdownlist/span/span[1]")));
		return seatSizeValue; 									  
	}
	public WebElement getB2bUnitButton(){
		b2bUnitButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/form/div/div[2]/div[2]/div[3]/div/kendo-dropdownlist/span")));
		return b2bUnitButton; 									  
	}
	public WebElement getB2bUnitValue(){
		b2bUnitValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/form/div/div[2]/div[2]/div[3]/div/kendo-dropdownlist/span/span[1]")));
		return b2bUnitValue; 									  
	}
	public WebElement getOwnershipTypeButton(){
		ownershipTypeButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/form/div/div[2]/div[2]/div[4]/div/kendo-dropdownlist/span")));
		return ownershipTypeButton; 									  
	}
	public WebElement getOwnershipTypeValue(){
		ownershipTypeValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/form/div/div[2]/div[2]/div[4]/div/kendo-dropdownlist/span/span[1]")));
		return ownershipTypeValue; 									  
	}
	public WebElement getManagedAgentText(){
		managedAgentText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/form/div/div[2]/div[3]/div[3]/div/kendo-multiselect/div/kendo-searchbar/input")));
		return managedAgentText; 										  
	}
	public WebElement getManagedAgentValue(){
		managedAgentValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/form/div/div[2]/div[3]/div[3]/div/kendo-multiselect/div/kendo-taglist/ul/li/span[1]")));
		return managedAgentValue; 													  
	}
	public WebElement getResetButton(){
		resetButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/form/div/div[3]/button[1]")));
		return resetButton; 									
	}
	public WebElement getSearchButton(){
		searchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/form/div/div[3]/button[2]")));
		return searchButton; 									  
	}
	public WebElement getAddNewButton(){
		addNewButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/div/div[1]/div[2]/neso-link-crm-filter-edit/a")));
		return addNewButton; 									  
	}
	public WebElement getAnFilterNameText(){
		anFilterNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter-edit/kendo-dialog/div[2]/div/div/div[1]/div/div/input")));
		return anFilterNameText; 									  
	}
	public WebElement getAnPriorityButton(){
		anPriorityButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter-edit/kendo-dialog/div[2]/div/div/div[11]/div/div/kendo-dropdownlist/span")));
		return anPriorityButton; 									  
	}
	public WebElement getAnPriorityError(){
		anPriorityError= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter-edit/kendo-dialog/div[2]/div/div/div[11]/div/div/kendo-dropdownlist")));
		return anPriorityError; 									  
	}
	public WebElement getAnSaveButton(){
		anSaveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter-edit/kendo-dialog/div[2]/kendo-dialog-actions/button[1]")));
		return anSaveButton; 									  	 
	}
	public WebElement getAnCancelButton(){
		anCancelButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter-edit/kendo-dialog/div[2]/kendo-dialog-actions/button[2]")));
		return anCancelButton; 									  
	}
	public WebElement getSrFilterIDText(){
		srFilterIDText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/div/div[2]/kendo-grid/div/div/div/table/thead/tr[2]/td[2]/kendo-grid-string-filter-cell/kendo-grid-filter-wrapper-cell/input ")));
		return srFilterIDText; 										  
	}
	public WebElement getSrFilterNameText(){
		srFilterNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/div/div[2]/kendo-grid/div/div/div/table/thead/tr[2]/td[3]/kendo-grid-string-filter-cell/kendo-grid-filter-wrapper-cell/input ")));
		return srFilterNameText; 									  
	}
	public WebElement getSrMerchantStatusText(){
		srMerchantStatusText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/div/div[2]/kendo-grid/div/div/div/table/thead/tr[2]/td[4]/kendo-grid-string-filter-cell/kendo-grid-filter-wrapper-cell/input ")));
		return srMerchantStatusText; 									  
	}
	public WebElement getSrSeatSizeText(){
		srSeatSizeText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/div/div[2]/kendo-grid/div/div/div/table/thead/tr[2]/td[5]/kendo-grid-string-filter-cell/kendo-grid-filter-wrapper-cell/input ")));
		return srSeatSizeText; 									  
	}
	public WebElement getSrLatePayStatusText(){
		srLatePayStatusText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/div/div[2]/kendo-grid/div/div/div/table/thead/tr[2]/td[6]/kendo-grid-string-filter-cell/kendo-grid-filter-wrapper-cell/input ")));
		return srLatePayStatusText; 									  
	}
	public WebElement getSrCreateByText(){
		srCreateByText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/div/div[2]/kendo-grid/div/div/div/table/thead/tr[2]/td[7]/kendo-grid-string-filter-cell/kendo-grid-filter-wrapper-cell/input ")));
		return srCreateByText; 									  
	}
	public WebElement getSrManagedAgentText(){
		srManagedAgentText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/div/div[2]/kendo-grid/div/div/div/table/thead/tr[2]/td[9]/kendo-grid-string-filter-cell/kendo-grid-filter-wrapper-cell/input ")));
		return srManagedAgentText; 									  
	}
	public WebElement getSearchResultBody(){
		searchResultBody= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td")));
		return searchResultBody; 									  
	}
	public WebElement getSrEditButton(){
		srEditButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[1]/div/a[1]")));
		return srEditButton; 									  	  
	}
	public WebElement getSrDeleteButton(){
		srDeleteButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[1]/div/a[2]")));
		return srDeleteButton; 									  	  
	}
	public WebElement getSrCreateBy_1(){
		srCreateBy= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[7]")));
		return srCreateBy; 									  		  	  
	}
	public WebElement getSrCreateBy(){
		srCreateBy= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//neso-crm-filter/div/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[7]")));
		return srCreateBy; 									  		  
	}
	public WebElement getOkButton(){
		okButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div/div[3]/button[1]")));
		return okButton; 									  		  
	}
	public WebElement getKendoList(int i){
		kendoList= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/nk-app/kendo-popup/div/kendo-list/div/ul/li[" + i + "]")));
		return kendoList;
	}
}
