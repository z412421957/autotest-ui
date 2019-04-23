package com.neso.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neso.factory.CommonUtil;

public class BatchCreateOrder extends CommonUtil{

	private WebDriver driver = null;
	private WebDriverWait wait = null;
	
	private WebElement soNumberText;
	private WebElement resetButton;
	private WebElement searchButton;
	private WebElement orderCountText;
	private WebElement itemTotalQtyText;
	private WebElement batchCreateOrderButton;
	private WebElement bu;
	private WebElement taxAmountButton;
	private WebElement taxDetailCloseButton;
	private WebElement errorMessage;
	private WebElement errorOKButton;
	
	private WebElement keywordText;
	private WebElement issueBoxButton;
	private WebElement logResetButton;
	private WebElement logSearchButton;
	private WebElement logOriginalContent;
	private WebElement logOriginalSONumber;
	private WebElement logSONumber_1;
	
	
	
	public BatchCreateOrder(){
		driver = super.getDriver();
		wait = new WebDriverWait(driver,15);
	}
	
	public WebElement getSoNumberText(){
		soNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-batch-create/div/div[1]/div[1]/div/div[2]/div/div[1]/div/input")));
		return soNumberText; 
	}
	public WebElement getResetButton(){
		resetButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-batch-create/div/div[1]/div[1]/div/div[2]/div/div[2]/button[1]")));
		return resetButton; 										
	}
	public WebElement getSearchButton(){
		searchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-batch-create/div/div[1]/div[1]/div/div[2]/div/div[2]/button[2]")));
		return searchButton; 										
	}
	public WebElement getOrderCountText(){
		orderCountText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-batch-create/div/div[1]/div[2]/div/div[2]/div/div/div[2]/div/input")));
		return orderCountText; 										
	}
	public WebElement getItemTotalQtyText(){
		itemTotalQtyText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-batch-create/div/div[1]/div[2]/div/div[2]/div/div/div[3]/div/input")));
		return itemTotalQtyText; 										
	}
	public WebElement getBatchCreateOrderButton(){
		batchCreateOrderButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-batch-create/div/div[1]/div[2]/div/div[2]/div/div/div[4]/button")));
		return batchCreateOrderButton; 										
	}
	public WebElement getBu(){
		bu= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-batch-create/div/div[2]/div[2]/div/div[1]/div[2]/div/label")));
		return bu; 										
	}
	public WebElement getTaxAmountButton(){
		taxAmountButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-batch-create/div/div[2]/div[2]/div/div[2]/div[2]/div/label/button")));
		return taxAmountButton; 										
	}
	public WebElement getTaxDetailCloseButton(){
		taxDetailCloseButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//order-batch-create/div/kendo-dialog/div[2]/kendo-dialog-actions/button")));
		return taxDetailCloseButton; 										
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
	
	public WebElement getKeywordText(){
		keywordText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//batch-create-log-history/div/form/div/div[2]/div/div[2]/div/input")));
		return keywordText; 										
	}
	public WebElement getIssueBoxButton(){
		issueBoxButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//batch-create-log-history/div/form/div/div[2]/div/div[3]/div[1]/nk-checkbox/label/span[1]/input")));
		return issueBoxButton; 										
	}
	public WebElement getLogResetButton(){
		logResetButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//batch-create-log-history/div/form/div/div[2]/div/div[4]/button[1]")));
		return logResetButton; 										
	}
	public WebElement getLogSearchButton(){
		logSearchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//batch-create-log-history/div/form/div/div[2]/div/div[4]/button[2]")));
		return logSearchButton; 										
	}
	public WebElement getLogOriginalContent(){
		logOriginalContent= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//batch-create-log-history/div/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td")));
		return logOriginalContent; 										
	}
	public WebElement getLogOriginalSONumber(){
		logOriginalSONumber= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//batch-create-log-history/div/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[1]/a")));
		return logOriginalSONumber; 										
	}
	public WebElement getLogSONumber_1(){
		logSONumber_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//batch-create-log-history/div/div[2]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[1]/a")));
		return logSONumber_1; 										
	}
}
