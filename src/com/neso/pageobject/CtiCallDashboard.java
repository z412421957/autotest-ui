package com.neso.pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.neso.factory.CommonUtil;
public class CtiCallDashboard extends CommonUtil{
	private WebDriver driver = null;
	private WebDriverWait wait = null;
	private WebElement startTimeText;
	private WebElement endTimeText;
	private WebElement recentWeekButton;
	private WebElement recentMonthButton;
	private WebElement recentYearButton;
	private WebElement agentButton;
	private WebElement agentNumber;
	private WebElement agentValueButton_1;
	private WebElement agentValueButton_2;
	private WebElement agentValueButton_3;
	private WebElement typeButton_1;
	private WebElement typeNumber_1;
	private WebElement typeNumber_2;
	private WebElement typeNumber_3;
	private WebElement workedMonthsNumber_1;
	private WebElement workedMonthsButton_2;
	private WebElement workedMonthsNumber_2;
	private WebElement workedMonthsNumber_3;
	private WebElement workedMonthsButton_4;
	private WebElement workedMonthsText_1;
	private WebElement workedMonthsText_2;
	private WebElement callDurationNumber_1;
	private WebElement callDurationButton_2;
	private WebElement callDurationNumber_2;
	private WebElement callDurationNumber_3;
	private WebElement callDurationButton_4;
	private WebElement callDurationText_1;
	private WebElement callDurationText_2;
	private WebElement searchText;
	private WebElement resetButton;
	private WebElement searchButton;
	private WebElement reportButton;
	private WebElement detailButton;
	private WebElement agentExtensionText;
	private WebElement agentNameText;
	private WebElement phoneNumberText;
	private WebElement detailInfoExtension_1;
	private WebElement detailInfoExtension_2;
	private WebElement detailInfoName_2;
	private WebElement detailInfoPhone_2;
	private WebElement totalCallsNumber;
	public CtiCallDashboard(){
		driver = super.getDriver();
		wait = new WebDriverWait(driver,15);
	}
//	public Select getSearchType(){
//		searchType= wait.until(new ExpectedCondition<Select>(){  
//
//			public Select apply(WebDriver d) {
//				return new Select(d.findElement(By.xpath("//*[@id='sellerportal']/div/div[1]/div/div[1]/div/form/table/tbody/tr/td[1]/select"))));
//											
//		return searchType; 
//	}
	public WebElement getStartTimeText(){
		startTimeText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[1]/div/div[1]/div[1]/div[1]/wj-input-date/div/div/div/input")));
		return startTimeText; 
	}
//	public WebElement getF1(){
//		testEle= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='u1']/a[1]"))));								
//		return testEle; 
//	}
	public WebElement getEndTimeText(){
		endTimeText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[1]/div/div[1]/div[1]/div[3]/wj-input-date/div/div/div/input")));
		return endTimeText; 
	}
	public WebElement getRecentWeekButton(){
//		recentWeekButton= wait.until(  
//
//			
//				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[1]/div/div[1]/div[2]/div/nk-radio[1]/label/span[1]/input")));
//																	
//		return recentWeekButton;
		recentWeekButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[1]/div/div[1]/div[2]/div/nk-radio[1]/label/span[1]/input")));
		return recentWeekButton;
	}
	public WebElement getRecentMonthButton(){
		recentMonthButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[1]/div/div[1]/div[2]/div/nk-radio[2]/label/span[1]/input")));
		return recentMonthButton; 
	}
	public WebElement getRecentYearButton(){
		recentYearButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[1]/div/div[1]/div[2]/div/nk-radio[3]/label/span[1]/input")));
		return recentYearButton; 
	}
	public WebElement getAgentButton(){
		agentButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-tabs']/ul/li[2]")));
		return agentButton; 
	}
	public WebElement getAgentNumber(){
		agentNumber= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-tabs']/ul/li[2]/div[2]/span")));
		return agentNumber; 
	}
	public WebElement getAgentValueButton_1(){
		agentValueButton_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[2]/z-multi-select-panel/div/div/div/div/div/ul/li[1]/div/nk-checkbox/label/span[1]/input")));
		return agentValueButton_1; 
	}
	public WebElement getAgentValueButton_2(){
		agentValueButton_2= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[2]/z-multi-select-panel/div/div/div/div/div/ul/li[2]/div/nk-checkbox/label/span[1]/input")));
		return agentValueButton_2; 
	}
	public WebElement getAgentValueButton_3(){
		agentValueButton_3= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[2]/z-multi-select-panel/div/div/div/div/div/ul/li[3]/div/nk-checkbox/label/span[1]/input")));
		return agentValueButton_3; 
	}
	public WebElement getTypeButton_1(){
		typeButton_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[1]/div/div[2]/z-multi-select-panel/div/div/div/div/div/ul/li[1]/div/nk-checkbox/label/span[1]/input")));
		return typeButton_1; 
	}
	public WebElement getTypeNumber_1(){
		typeNumber_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[1]/div/div[2]/z-multi-select-panel/div/div/div/div/div/ul/li[1]/div/nk-checkbox/label/span[2]/span/span")));
		return typeNumber_1; 
	}
	public WebElement getTypeNumber_2(){
		typeNumber_2= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[1]/div/div[2]/z-multi-select-panel/div/div/div/div/div/ul/li[2]/div/nk-checkbox/label/span[2]/span/span")));
		return typeNumber_2; 
	}
	public WebElement getTypeNumber_3(){
		typeNumber_3= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[1]/div/div[2]/z-multi-select-panel/div/div/div/div/div/ul/li[3]/div/nk-checkbox/label/span[2]/span/span")));
		return typeNumber_3; 
	}
	public WebElement getWorkedMonthsNumber_1(){
		workedMonthsNumber_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[1]/div/div[3]/z-multi-select-panel/div/div/div/div/div/ul/li[1]/div/nk-checkbox/label/span[2]/span/span")));
		return workedMonthsNumber_1; 
	}
	public WebElement getWorkedMonthsButton_2(){
		workedMonthsButton_2= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[1]/div/div[3]/z-multi-select-panel/div/div/div/div/div/ul/li[2]/div/nk-checkbox/label/span[1]/input")));
		return workedMonthsButton_2; 
	}
	public WebElement getWorkedMonthsNumber_2(){
		workedMonthsNumber_2= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[1]/div/div[3]/z-multi-select-panel/div/div/div/div/div/ul/li[2]/div/nk-checkbox/label/span[2]/span/span")));
		return workedMonthsNumber_2; 
	}
	public WebElement getWorkedMonthsNumber_3(){
		workedMonthsNumber_3= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[1]/div/div[3]/z-multi-select-panel/div/div/div/div/div/ul/li[3]/div/nk-checkbox/label/span[2]/span/span")));
		return workedMonthsNumber_3; 
	}
	public WebElement getWorkedMonthsButton_4(){
		workedMonthsButton_4= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[1]/div/div[3]/nk-checkbox/label/span[1]/input")));
		return workedMonthsButton_4; 
	}
	public WebElement getWorkedMonthsText_1(){
		workedMonthsText_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[1]/div/div[3]/div/input[1]")));
		return workedMonthsText_1; 
	}
	public WebElement getWorkedMonthsText_2(){
		workedMonthsText_2= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[1]/div/div[3]/div/input[2]")));
		return workedMonthsText_2; 
	}
	public WebElement getCallDurationNumber_1(){
		callDurationNumber_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[1]/div/div[4]/z-multi-select-panel/div/div/div/div/div/ul/li[1]/div/nk-checkbox/label/span[2]/span/span")));
		return callDurationNumber_1; 
	}
	public WebElement getCallDurationButton_2(){
		callDurationButton_2= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[1]/div/div[4]/z-multi-select-panel/div/div/div/div/div/ul/li[2]/div/nk-checkbox/label/span[1]/input")));
		return callDurationButton_2; 
	}
	public WebElement getCallDurationNumber_2(){
		callDurationNumber_2= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[1]/div/div[4]/z-multi-select-panel/div/div/div/div/div/ul/li[2]/div/nk-checkbox/label/span[2]/span/span")));
		return callDurationNumber_2; 
	}
	public WebElement getCallDurationNumber_3(){
		callDurationNumber_3= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[1]/div/div[4]/z-multi-select-panel/div/div/div/div/div/ul/li[3]/div/nk-checkbox/label/span[2]/span/span")));
		return callDurationNumber_3; 
	}
	public WebElement getCallDurationButton_4(){
		callDurationButton_4= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[1]/div/div[4]/nk-checkbox/label/span[1]/input")));
		return callDurationButton_4; 
	}
	public WebElement getCallDurationText_1(){
		callDurationText_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[1]/div/div[4]/div/input[1]")));
		return callDurationText_1; 
	}
	public WebElement getCallDurationText_2(){
		callDurationText_2= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='z-content']/div[1]/div/div[4]/div/input[2]")));
		return callDurationText_2; 
	}
	public WebElement getSearchText(){
		searchText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-comp nk-widget']/div[2]/div/div/div[3]/div[1]/div/input")));
		return searchText; 
	}
	public WebElement getResetButton(){
		resetButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-comp nk-widget']/div[2]/div/div/div[3]/div[2]/button")));
		return resetButton; 
	}
	public WebElement getSearchButton(){
		searchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-comp nk-widget']/div[2]/div/div/div[3]/div[3]/button")));
		return searchButton; 
	}
	public WebElement getReportButton(){
		reportButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-comp nk-tabset']/ul/li[1]/a")));
		return reportButton; 
	}
	public WebElement getDetailButton(){
		detailButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-comp nk-tabset']/ul/li[2]/a")));
		return detailButton; 
	}
	public WebElement getAgentExtensionText(){
		agentExtensionText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-tab-content']/nk-tab-item[2]/kendo-grid/div/div/div/table/thead/tr[2]/td[1]/input")));
		return agentExtensionText; 					
	}
	public WebElement getAgentNameText(){
		agentNameText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-tab-content']/nk-tab-item[2]/kendo-grid/div/div/div/table/thead/tr[2]/td[2]/input")));
		return agentNameText; 
	}
	public WebElement getPhoneNumberText(){
		phoneNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-tab-content']/nk-tab-item[2]/kendo-grid/div/div/div/table/thead/tr[2]/td[3]/input")));
		return phoneNumberText; 
	}
	public WebElement getDetailInfoExtension_1(){
		detailInfoExtension_1= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-tab-content']/nk-tab-item[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[1]")));
		return detailInfoExtension_1; 
	}
	public WebElement getDetailInfoExtension_2(){
		detailInfoExtension_2= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-tab-content']/nk-tab-item[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[2]/td[1]")));
		return detailInfoExtension_2; 
	}
	public WebElement getDetailInfoName_2(){
		detailInfoName_2= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-tab-content']/nk-tab-item[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[2]/td[2]")));
		return detailInfoName_2; 
	}
	public WebElement getDetailInfoPhone_2(){
		detailInfoPhone_2= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-tab-content']/nk-tab-item[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[2]/td[3]")));
		return detailInfoPhone_2; 
	}
	public WebElement getTotalCallsNumber(){
		totalCallsNumber= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-tab-content']/nk-tab-item[1]/call-center-report-form/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[1]")));
		return totalCallsNumber; 
	}
}
