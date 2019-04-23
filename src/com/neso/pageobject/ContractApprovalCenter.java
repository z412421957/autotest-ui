package com.neso.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neso.factory.CommonUtil;

public class ContractApprovalCenter extends CommonUtil{
	
	private WebDriver driver = null;
	private WebDriverWait wait = null;
	
	private WebElement merchantNumberText;
	private WebElement shippingCarrierButton;
	private WebElement shippingCarrierValue;
	private WebElement statusButton;
	private WebElement statusValue;
	private WebElement resetButton;
	private WebElement searchButton;
	
	private WebElement srContentValue;
	private WebElement srContentDiv;
	private WebElement srMerchantNumberValue;
	private WebElement srShippingCarrierValue;
	private WebElement srStatusValue;
	private WebElement rcContractFileName;
	
	private WebElement approveButton;
	private WebElement declineButton;
	private WebElement kendoList;
	
	
	public ContractApprovalCenter() {
		driver = super.getDriver();
		wait = new WebDriverWait(driver,15);
	}
	
	public WebElement getMerchantNumberText(){
		merchantNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='contract-approval-center']/form/div/div[2]/div/div[1]/div/input")));
		return merchantNumberText; 																			  						  
	}
	public WebElement getShippingCarrierButton(){
		shippingCarrierButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='contract-approval-center']/form/div/div[2]/div/div[2]/div/kendo-dropdownlist/span")));
		return shippingCarrierButton; 																  
	}
	public WebElement getShippingCarrierValue(){
		shippingCarrierValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='contract-approval-center']/form/div/div[2]/div/div[2]/div/kendo-dropdownlist/span/span[1]")));
		return shippingCarrierValue; 																							  
	}
	public WebElement getStatusButton(){
		statusButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='contract-approval-center']/form/div/div[2]/div/div[3]/div/kendo-dropdownlist/span")));
		return statusButton; 																  
	}
	public WebElement getStatusValue(){
		statusValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='contract-approval-center']/form/div/div[2]/div/div[3]/div/kendo-dropdownlist/span/span[1]")));
		return statusValue; 																  
	}
	public WebElement getResetButton(){
		resetButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='contract-approval-center']/form/div/div[2]/div/div[4]/button[1]")));
		return resetButton; 																  
	}
	public WebElement getSearchButton(){
		searchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='contract-approval-center']/form/div/div[2]/div/div[4]/button[2]")));
		return searchButton; 																  
	}

	public WebElement getSrContentValue(){
		srContentValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='contract-approval-center']/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td")));
		return srContentValue; 																  
	}
	public WebElement getSrContentDiv(){
		srContentDiv= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("")));
		return srContentDiv; 																  
	}
	public WebElement getSrMerchantNumberValue(){
		srMerchantNumberValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='contract-approval-center']/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[1]/a")));
		return srMerchantNumberValue; 																  
	}
	public WebElement getSrShippingCarrierValue(){
		srShippingCarrierValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='contract-approval-center']/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[2]")));
		return srShippingCarrierValue; 																  
	}
	public WebElement getSrStatusValue(){
		srStatusValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='contract-approval-center']/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[3]")));
		return srStatusValue; 																  
	}
	public WebElement getRcContractFileName(){
		rcContractFileName= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='contract-approval-center']/div[2]/div[1]/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[1]/a")));
		return rcContractFileName; 																  
	}
	
	public WebElement getApproveButton(){
		approveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='contract-approval-center']/nk-function-panel/div/div/div[1]/div/div[1]/button")));
		return approveButton; 																  
	}
	public WebElement getDeclineButton(){
		declineButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='contract-approval-center']/nk-function-panel/div/div/div[1]/div/div[2]/button")));
		return declineButton; 																  
	}
	public WebElement getKendoList(int i){
		kendoList= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/nk-app/kendo-popup/div/kendo-list/div/ul/li[" + i + "]")));
		return kendoList; 								
	}
}
