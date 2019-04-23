package com.neso.pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.neso.factory.CommonUtil;

public class CustomerFlagSet extends CommonUtil{
	
	private WebDriver driver = null;
	private WebDriverWait wait = null;
	
	private WebElement customerNumberText;
	private WebElement customerNumberMessage;
	private WebElement customerNameText;
	private WebElement customerEmailText;
	private WebElement searchButton;
	private WebElement flagContent;
	private WebElement flag_1;
	private WebElement deleteFlag_1;
	private WebElement deleteOkButton;
	private WebElement addNewFlagButton;
	private WebElement addMemoText;
	private WebElement addCancelButton;
	private WebElement addSaveButton;
	private WebElement errorMessage;
	
	public CustomerFlagSet(){
		driver = super.getDriver();
		wait = new WebDriverWait(driver,15);
	}
	
//	public Select getSearchType(){
//	searchType= wait.until(new ExpectedCondition<Select>(){  
//		@Override
//		public Select apply(WebDriver d) {
//			return new Select(d.findElement(By.xpath("//*[@id='sellerportal']/div/div[1]/div/div[1]/div/form/table/tbody/tr/td[1]/select"))));
//										
//	return searchType; 
//}
	
	public WebElement getCustomerNumberText(){
		customerNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-form']/div/div[1]/div/input")));
		return customerNumberText; 					
	}
	public WebElement getCustomerNumberMessage(){
		customerNumberMessage= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/nk-app/div/ng-component/section/div/div[2]/ng-component/fieldset[1]/form/div[1]/div")));
		return customerNumberMessage; 
	}
	public WebElement getCustomerNameText(){
		customerNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-form']/div/div[2]/label[4]")));
		return customerNameText; 				
	}
	public WebElement getCustomerEmailText(){
		customerEmailText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-form']/div/div[2]/label[6]")));
		return customerEmailText; 
	}
	public WebElement getSearchButton(){
		searchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-form']/div/div[1]/button")));
		return searchButton; 
	}
	public WebElement getflagContent(){
		flagContent= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td")));
		return flagContent; 
	}
	public WebElement getFlag_1(){
		flag_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[1]")));
		return flag_1; 								
	}
	public WebElement getDeleteFlag_1(){
		deleteFlag_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[5]/a")));
		return deleteFlag_1; 			
	}
	public WebElement getDeleteOkButton(){
		deleteOkButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div/div[3]/button[1]")));
		return deleteOkButton; 			
	}
	public WebElement getAddNewFlagButton(){
		addNewFlagButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div/div[2]/kendo-grid/kendo-grid-toolbar/button")));
		return addNewFlagButton; 
	}
	public WebElement getAddMemoText(){
		addMemoText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//maintain/div/form/kendo-dialog/div[2]/div/div[2]/div/div/textarea")));
		return addMemoText; 
	}
	public WebElement getAddCancelButton(){
		addCancelButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//maintain/div/form/kendo-dialog/div[2]/kendo-dialog-actions/button[2]")));
		return addCancelButton; 
	}
	public WebElement getAddSaveButton(){
		addSaveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//maintain/div/form/kendo-dialog/div[2]/kendo-dialog-actions/button[1]")));
		return addSaveButton; 
	}
	public WebElement getErrorMessage(){
		errorMessage= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div/div[2]")));
		return errorMessage; 					
	}
}
