package com.neso.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neso.factory.CommonUtil;

public class OrderApproveCenter extends CommonUtil{

	private WebDriver driver = null;
	private WebDriverWait wait = null;
	
	private WebElement soNumberText;
	private WebElement pendingForApprovalButton;
	private WebElement pendingForApprovalValue;
	private WebElement approveTypeButton;
	private WebElement approveTypeValue;
	private WebElement resetButton;
	private WebElement searchButton;
	private WebElement exportCurrentPageButton;
	private WebElement srContent;
	private WebElement srDiv;
	private WebElement srViewButton;
	private WebElement viewSONumber;
	private WebElement viewCustomerNumber;
	private WebElement viewAmountInfoButton;
	private WebElement viewTotalAmount;
	private WebElement viewDetailButton;
	private WebElement viewShowDetailButton;
	private WebElement viewEIMSValue;
	private WebElement viewAmountExitButton;
	private WebElement viewAdditionalInfoButton;
	private WebElement viewMemoText;
	private WebElement viewApproveLogButton;
	private WebElement viewExitButton;
	private WebElement viewApproveButton;
	private WebElement viewDeclineButton;
	private WebElement srApproveType;
	private WebElement srSONumber;
	private WebElement srCustomerNumber;
	private WebElement processLogButton;
	private WebElement penGlobeButton;
	private WebElement kendoList;
	// process log
	private WebElement plSearchTypeButton;
	private WebElement plSearchTypeValue;
	private WebElement plKeywordText;
	private WebElement plResetButton;
	private WebElement plSearchButton;
	private WebElement plSrAgentID;
	private WebElement plErrorMessage;
	

	
	
	public OrderApproveCenter(){
		driver = super.getDriver();
		wait = new WebDriverWait(driver,15);
	}
	
	public WebElement getSoNumberText(){
		soNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-margin-approve/div/div[1]/div[2]/form/div[1]/div[1]/div/input")));
		return soNumberText; 									  
	}
	public WebElement getPendingForApprovalButton(){
		pendingForApprovalButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-margin-approve/div/div[1]/div[2]/form/div[1]/div[2]/div[1]/div/kendo-dropdownlist/span")));
		return pendingForApprovalButton; 									  
	}
	public WebElement getPendingForApprovalValue(){
		pendingForApprovalValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-margin-approve/div/div[1]/div[2]/form/div[1]/div[2]/div[1]/div/kendo-dropdownlist/span/span[1]")));
		return pendingForApprovalValue; 									  
	}
	public WebElement getApproveTypeButton(){
		approveTypeButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-margin-approve/div/div[1]/div[2]/form/div[1]/div[2]/div[2]/div/kendo-dropdownlist/span")));
		return approveTypeButton; 									  
	}
	public WebElement getApproveTypeValue(){
		approveTypeValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-margin-approve/div/div[1]/div[2]/form/div[1]/div[2]/div[2]/div/kendo-dropdownlist/span/span[1]")));
		return approveTypeValue; 									  
	}
	public WebElement getResetButton(){
		resetButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-margin-approve/div/div[1]/div[2]/form/div[2]/button[1]")));
		return resetButton; 									  
	}
	public WebElement getSearchButton(){
		searchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-margin-approve/div/div[1]/div[2]/form/div[2]/button[2]")));
		return searchButton; 									  
	}
	public WebElement getExportCurrentPageButton(){
		exportCurrentPageButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-margin-approve/div/div[2]/div[2]/kendo-grid/kendo-grid-toolbar/button")));
		return exportCurrentPageButton; 									  
	}
	public WebElement getSrContent(){
		srContent= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-margin-approve/div/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td")));
		return srContent; 									  
	}
	public WebElement getSrDiv(){
		srDiv= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-margin-approve/div/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]")));
		return srDiv; 									  
	}
	public WebElement getSrViewButton(String num){
		srViewButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-margin-approve/div/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr"+ num + "/td[1]/a")));
		return srViewButton; 									  
	}
	public WebElement getViewSONumber(){
		viewSONumber= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='k-tabstrip-tabpanel-0']/div/div[1]/div[1]/label[2]")));
		return viewSONumber; 									  
	}
	public WebElement getViewCustomerNumber(){
		viewCustomerNumber= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='k-tabstrip-tabpanel-0']/div/div[1]/div[2]/label[2]")));
		return viewCustomerNumber; 									  
	}
	public WebElement getViewAmountInfoButton(){
		viewAmountInfoButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='k-tabstrip-tab-1']")));
		return viewAmountInfoButton; 									  
	}
	public WebElement getViewTotalAmount(){
		viewTotalAmount= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='k-tabstrip-tabpanel-1']/div/div[1]/div[1]/label[2]")));
		return viewTotalAmount; 									  
	}
	public WebElement getViewDetailButton(){
		viewDetailButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='k-tabstrip-tabpanel-1']/div/div[3]/div/div/button")));
		return viewDetailButton; 									  
	}
	public WebElement getViewShowDetailButton(){
		viewShowDetailButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-margin-approve-detail/complex-margin/kendo-dialog/div[2]/div/div/div[2]/div[1]/button")));
		return viewShowDetailButton; 									  
	}
	public WebElement getViewEIMSValue(){
		viewEIMSValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-margin-approve-detail/complex-margin/kendo-dialog/div[2]/div/div/div[2]/div[2]/label")));
		return viewEIMSValue; 									  
	}
	public WebElement getViewAmountExitButton(){
		viewAmountExitButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//complex-margin/kendo-dialog/div[2]/kendo-dialog-titlebar/div[2]/a")));
		return viewAmountExitButton; 									 
	}
	public WebElement getViewAdditionalInfoButton(){
		viewAdditionalInfoButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='k-tabstrip-tab-2']")));
		return viewAdditionalInfoButton; 									  
	}
	public WebElement getViewMemoText(){
		viewMemoText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-margin-approve-detail/kendo-dialog/div[2]/div/div/div/div/div[2]/textarea")));
		return viewMemoText; 									  
	}
	public WebElement getViewApproveLogButton(){
		viewApproveLogButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='k-tabstrip-tab-3']")));
		return viewApproveLogButton; 									  
	}
	public WebElement getViewExitButton(){
		viewExitButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-margin-approve-detail/kendo-dialog/div[2]/kendo-dialog-titlebar/div[2]/a")));
		return viewExitButton; 									  
	}
	public WebElement getViewApproveButton(){
		viewApproveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-margin-approve-detail/kendo-dialog/div[2]/kendo-dialog-actions/button[1]")));
		return viewApproveButton; 									  
	}
	public WebElement getViewDeclineButton(){
		viewDeclineButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-margin-approve-detail/kendo-dialog/div[2]/kendo-dialog-actions/button[2]")));
		return viewDeclineButton; 									  
	}
	public WebElement getSrApproveType(String num){
		srApproveType= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-margin-approve/div/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr"+ num + "/td[3]")));
		return srApproveType; 									  
	}
	public WebElement getSrSONumber(String num){
		srSONumber= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-margin-approve/div/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr"+ num + "/td[4]/a")));
		return srSONumber; 									  
	}
	public WebElement getSrCustomerNumber(String num){
		srCustomerNumber= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-margin-approve/div/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr"+ num + "/td[5]/a")));
		return srCustomerNumber; 									  
	}
	public WebElement getProcessLogButton(){
		processLogButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-margin-approve/div/nk-function-panel/div/div/div[1]/div/div[1]/a")));
		return processLogButton; 									  
	}
	public WebElement getPenGlobeButton(){
		penGlobeButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-margin-approve/div/nk-function-panel/div/div/div[1]/div/div[3]/a")));
		return penGlobeButton; 									  
	}
	public WebElement getKendoList(String i){
		kendoList= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/nk-app/kendo-popup/div/kendo-list/div/ul/li[" + i + "]")));
		return kendoList; 								
	}
	
	// process log
	public WebElement getPlSearchTypeButton(){
		plSearchTypeButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//process-log/div/div[1]/div[2]/form/div/div[1]/div/kendo-dropdownlist/span")));
		return plSearchTypeButton; 								
	}
	public WebElement getPlSearchTypeValue(){
		plSearchTypeValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//process-log/div/div[1]/div[2]/form/div/div[1]/div/kendo-dropdownlist/span/span[1]")));
		return plSearchTypeValue; 								
	}
	public WebElement getPlKeywordText(){
		plKeywordText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//process-log/div/div[1]/div[2]/form/div/div[2]/div/input")));
		return plKeywordText; 								
	}
	public WebElement getPlResetButton(){
		plResetButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//process-log/div/div[1]/div[2]/form/div/div[4]/button[1]")));
		return plResetButton; 								
	}
	public WebElement getPlSearchButton(){
		plSearchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//process-log/div/div[1]/div[2]/form/div/div[4]/button[2]")));
		return plSearchButton; 								
	}
	public WebElement getPlSrAgentID(){
		plSrAgentID= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//process-log/div/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[2]/span")));
		return plSrAgentID; 								
	}
	public WebElement getPlErrorMessage(){
		plErrorMessage= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div/div[2]")));
		return plErrorMessage; 								
	}
}
