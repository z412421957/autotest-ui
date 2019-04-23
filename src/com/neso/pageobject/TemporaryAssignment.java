package com.neso.pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.neso.factory.CommonUtil;
public class TemporaryAssignment extends CommonUtil{
	private WebDriver driver = null;
	private WebDriverWait wait = null;
	// add
	private WebElement addButton;
	private WebElement adMerchantText;
	private WebElement adMerchantSearch;
	private WebElement adMerchantName;
	private WebElement adAgentText;
	private WebElement adAgentList_1;
	private WebElement adMemoText;
	private WebElement adSaveButton;
	private WebElement adCancelButton;
	private WebElement adErrorMessage;
	// query
	private WebElement qrLogQueryButton;
	private WebElement qrAgentText;
	private WebElement qrAgentList_1;
	private WebElement qrResetButton;
	private WebElement qrSearchButton;
	private WebElement qrUnassignButton;
	private WebElement qrCheckBoxAll;
	private WebElement qrChckeBox_2;
	private WebElement qrMerchant_1;
	private WebElement qrItemNumber;
	private WebElement qrLogMerchantText;
	private WebElement qrLogAgentText;
	private WebElement qrLogAgentList_1;
	private WebElement qrLogAgentClearButton;
	private WebElement qrLogSearchButton;
	private WebElement qrLogAssignmentMessage;
	private WebElement qrLogAssignmentMerchant_1;
	private WebElement qrLogAssignmentName_5;
	private WebElement qrUnassignButton_1;
	private WebElement qrUnassignOkButton;
	private WebElement qrUnassignCancelButton;
	private WebElement kendoList;
	
	public TemporaryAssignment(){
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
	// set
	public WebElement getAddButton(){
		addButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div[1]/div[2]/kendo-grid/kendo-grid-toolbar/button[1]")));
		return addButton; 	
	}
	public WebElement getAdMerchantText(){
		adMerchantText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//kendo-dialog/div[2]/div/div[1]/div/div/div/input")));
		return adMerchantText; 	
	}
	public WebElement getAdMerchantSearch(){
		adMerchantSearch= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//kendo-dialog/div[2]/div/div[1]/div/div/button")));
		return adMerchantSearch; 
	}
	public WebElement getAdMerchantName(){
		adMerchantName= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/maintain/div/form/kendo-dialog/div[2]/div/div[1]/div/div/label[3]")));
		return adMerchantName; 	
	}
	public WebElement getAdAgentText(){
		adAgentText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//kendo-dialog/div[2]/div/div[2]/div/div/div/kendo-combobox/span/kendo-searchbar/input")));
		return adAgentText; 
	}
	public WebElement getAdAgentList_1(){
		adAgentList_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/nk-app/kendo-popup/div/kendo-list/div/ul/li")));
		return adAgentList_1; 
	}
	public WebElement getAdMemoText(){
		adMemoText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//kendo-dialog/div[2]/div/div[3]/div/div/div/textarea")));
		return adMemoText; 
	}
	public WebElement getAdSaveButton(){
		adSaveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//kendo-dialog/div[2]/kendo-dialog-actions/button[1]")));
		return adSaveButton; 
	}
	public WebElement getAdCancelButton(){
		adCancelButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//kendo-dialog/div[2]/kendo-dialog-actions/button[2]")));
		return adCancelButton; 
	}
	public WebElement getAdErrorMessage(){
		adErrorMessage= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div/div[2]")));
		return adErrorMessage; 
	}
	// query
	public WebElement getQrLogQueryButton(){
		qrLogQueryButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div[2]/nk-function-panel/div/div/div[1]/div/div[2]/a")));
		return qrLogQueryButton; 										
	}
	public WebElement getQrAgentText(){
		qrAgentText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-form']/div/div/div/kendo-multiselect/div/kendo-searchbar/input")));
		return qrAgentText; 		
	}
	public WebElement getQrAgentList_1(){
		qrAgentList_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-form']/div/div/button[1]")));
		return qrAgentList_1; 
	}
	public WebElement getQrResetButton(){
		qrResetButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-form']/div/div/button[2]")));
		return qrResetButton; 
	}
	public WebElement getQrSearchButton(){
		qrSearchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search-form']/div/div/button[2]")));
		return qrSearchButton; 
	}
	public WebElement getQrUnassignButton(){
		qrUnassignButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div[1]/div[2]/kendo-grid/kendo-grid-toolbar/button[2]")));
		return qrUnassignButton; 			
	}
	public WebElement getQrCheckBoxAll(){
		qrCheckBoxAll= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.id("selectAllCheckboxId")));
		return qrCheckBoxAll; 
	}
	public WebElement getQrChckeBox_2(){
		qrChckeBox_2= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[2]/td[1]/input")));
		return qrChckeBox_2; 		
	}
	public WebElement getQrMerchant_1(){
		qrMerchant_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[5]/a")));
		return qrMerchant_1; 											
	}
	public WebElement getQrItemNumber(){
		qrItemNumber= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div[1]/div[2]/kendo-grid/kendo-pager/kendo-pager-info")));
		return qrItemNumber; 
	}
	public WebElement getQrLogMerchantText(){
		qrLogMerchantText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-log-criteria/form/div/div[1]/div/input")));
		return qrLogMerchantText; 				
	}
	public WebElement getQrLogAgentText(){
		qrLogAgentText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-log-criteria/form/div/div[2]/div/kendo-multiselect/div/kendo-searchbar/input")));
		return qrLogAgentText; 
	}
	public WebElement getQrLogAgentList_1(){
		qrLogAgentList_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/nk-app/kendo-popup/div")));
		return qrLogAgentList_1; 
	}
	public WebElement getQrLogAgentClearButton(){
		qrLogAgentClearButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-log-criteria/form/div/div[2]/button[1]")));
		return qrLogAgentClearButton; 
	}
	public WebElement getQrLogSearchButton(){
		qrLogSearchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-log-criteria/form/div/div[2]/button[2]")));
		return qrLogSearchButton; 		
	}
	public WebElement getQrLogAssignmentMessage(){
		qrLogAssignmentMessage= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-log-results/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td")));
		return qrLogAssignmentMessage; 
	}
	public WebElement getQrLogAssignmentMerchant_1(){
		qrLogAssignmentMerchant_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-log-results/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[3]/a")));
		return qrLogAssignmentMerchant_1; 
	}
	public WebElement getQrLogAssignmentName_5(){
		qrLogAssignmentName_5= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-log-results/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[5]/td[2]")));
		return qrLogAssignmentName_5; 
	}
	public WebElement getQrUnassignButton_1(){
		qrUnassignButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//search-results/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[2]/a")));
		return qrUnassignButton; 			
	}
	public WebElement getQrUnassignOkButton(){
		qrUnassignOkButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div/div[3]/button[1]")));
		return qrUnassignOkButton; 
	}
	public WebElement getQrUnassignCancelButton(){
		qrUnassignCancelButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div/div[3]/button[2]")));
		return qrUnassignCancelButton; 
	}
	public WebElement getKendoList(){
		kendoList= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/nk-app/kendo-popup/div/kendo-list/div/ul/li")));
		return kendoList; 								
	}
}
