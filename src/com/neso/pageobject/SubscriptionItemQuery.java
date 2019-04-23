package com.neso.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neso.factory.CommonUtil;

public class SubscriptionItemQuery extends CommonUtil{

	private WebDriver driver = null;
	private WebDriverWait wait = null;
	
	private WebElement itemNumberButton;
	private WebElement itemNumberValue;
	private WebElement itemNumberText;
	private WebElement buButton;
	private WebElement buValue;
	private WebElement programNumberButton;
	private WebElement programNumberValue;
	private WebElement searchButton;
	private WebElement resultContent;
	private WebElement resultItemNumber;
	private WebElement resultProgramNumber;
	private WebElement pdProgramNumberText;
	private WebElement pdDescriptionText;
	private WebElement pdItemTypeText;
	private WebElement pdMemoText;
	private WebElement pdExitButton;
	private WebElement kendoList;
	
	
	public SubscriptionItemQuery(){
		driver = super.getDriver();
		wait = new WebDriverWait(driver,15);
	}
	
	public WebElement getItemNumberButton(){
		itemNumberButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//itemquery-main/div/div[1]/div/div/div[2]/div/form/div[1]/div/kendo-dropdownlist/span")));
		return itemNumberButton; 								 
	}
	public WebElement getItemNumberValue(){
		itemNumberValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//itemquery-main/div/div[1]/div/div/div[2]/div/form/div[1]/div/kendo-dropdownlist/span/span[1]")));
		return itemNumberValue; 								 
	}
	public WebElement getItemNumberText(){
		itemNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//itemquery-main/div/div[1]/div/div/div[2]/div/form/div[1]/div/div/input")));
		return itemNumberText; 								 
	}
	public WebElement getBuButton(){
		buButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//itemquery-main/div/div[1]/div/div/div[2]/div/form/div[2]/div/kendo-dropdownlist/span")));
		return buButton; 								 
	}
	public WebElement getBuValue(){
		buValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//itemquery-main/div/div[1]/div/div/div[2]/div/form/div[2]/div/kendo-dropdownlist/span/span[1]")));
		return buValue; 								 
	}
	public WebElement getProgramNumberButton(){
		programNumberButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//itemquery-main/div/div[1]/div/div/div[2]/div/form/div[3]/div/kendo-dropdownlist/span")));
		return programNumberButton; 							 
	}
	public WebElement getProgramNumberValue(){
		programNumberValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//itemquery-main/div/div[1]/div/div/div[2]/div/form/div[3]/div/kendo-dropdownlist/span/span[1]")));
		return programNumberValue; 							 
	}
	public WebElement getSearchButton(){
		searchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//itemquery-main/div/div[1]/div/div/div[2]/div/form/div[4]/div/button")));
		return searchButton; 								 
	}
	public WebElement getResultContent(){
		resultContent= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//itemquery-searchresult/div/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td")));
		return resultContent; 								 
	}
	public WebElement getResultItemNumber(){
		resultItemNumber= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//itemquery-searchresult/div/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[1]/itemnumberlink/span[1]/a")));
		return resultItemNumber; 								 
	}
	public WebElement getResultItemNumberIcon(){
		resultItemNumber= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//itemquery-searchresult/div/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[1]/itemnumberlink/span[2]/a")));
		return resultItemNumber; 								 
	}
	public WebElement getResultProgramNumber(){
		resultProgramNumber= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//itemquery-searchresult/div/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[4]/a")));
		return resultProgramNumber; 								 
	}
	public WebElement getPdProgramNumberText(){
		pdProgramNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//program-detail/kendo-dialog/div[2]/div/form/div[1]/div[1]/div/input")));
		return pdProgramNumberText; 								 
	}
	public WebElement getPdDescriptionText(){
		pdDescriptionText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//program-detail/kendo-dialog/div[2]/div/form/div[1]/div[2]/div/input")));
		return pdDescriptionText; 								 
	}
	public WebElement getPdItemTypeText(){
		pdItemTypeText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//program-detail/kendo-dialog/div[2]/div/form/div[3]/div[2]/div/div[1]/input")));
		return pdItemTypeText; 								 
	}
	public WebElement getPdMemoText(){
		pdMemoText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//program-detail/kendo-dialog/div[2]/div/form/div[7]/div/textarea")));
		return pdMemoText; 								 
	}
	public WebElement getPdExitButton(){
		pdExitButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//kendo-dialog-titlebar/div[2]/a/span")));
		return pdExitButton; 							 
	}
	public WebElement getKendoList(int i){
		kendoList= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/nk-app/kendo-popup/div/kendo-list/div/ul/li[" + i + "]")));
		return kendoList; 								
	}
}
