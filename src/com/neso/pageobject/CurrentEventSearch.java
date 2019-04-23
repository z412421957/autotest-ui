package com.neso.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neso.factory.CommonUtil;

public class CurrentEventSearch extends CommonUtil {
	private WebDriver driver = null;
	private WebDriverWait wait = null;
	
	
	private WebElement itemNumberText;
	private WebElement manufacturerText;
	private WebElement categoryText;
	private WebElement typeButton;
	private WebElement typeValue;
	private WebElement solutionButton;
	private WebElement solutionValue;
	private WebElement buButton;
	private WebElement buValue;
	private WebElement subjectText;
	private WebElement searchButton;
	private WebElement newButton;
	private WebElement srVoidButton;
	private WebElement srCategory;
	private WebElement srStatus;
	private WebElement errorOKButton;
	
	// new
	private WebElement emEventNumberText;
	private WebElement emItemNumberText;
	private WebElement emManufacturerText;
	private WebElement emCategoryText;
	private WebElement emBuButton;
	private WebElement emBuValue;
	private WebElement emTypeButton;
	private WebElement emTypeValue;
	private WebElement emSolutionButton;
	private WebElement emSolutionValue;
	private WebElement emSubjectText;
	private WebElement emPeriodClass;
	private WebElement emPeriodText;
	private WebElement emToClass;
	private WebElement emToText;
	private WebElement emDetailSourceButton;
	private WebElement emDetail;
	private WebElement emSaveButton;
	private WebElement emCancelButton;
	private WebElement emNewButton;

	
	
	public CurrentEventSearch() {
		driver = super.getDriver();
		wait = new WebDriverWait(driver,15);
	}
	
	
	
	public WebElement getItemNumberText(){
		itemNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//event-information/div/div[2]/form/div[1]/div[1]/div/nk-input/input")));
		return itemNumberText; 							
	}
	public WebElement getManufacturerText(){
		manufacturerText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//event-information/div/div[2]/form/div[1]/div[2]/div/input")));
		return manufacturerText; 							
	}
	public WebElement getCategoryText(){
		categoryText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//event-information/div/div[2]/form/div[1]/div[3]/div/input")));
		return categoryText; 							
	}
	public WebElement getTypeButton(){
		typeButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//event-information/div/div[2]/form/div[1]/div[4]/div/kendo-dropdownlist/span")));
		return typeButton; 							
	}
	public WebElement getTypeValue(){
		typeValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//event-information/div/div[2]/form/div[1]/div[4]/div/kendo-dropdownlist/span/span[1]")));
		return typeValue; 							
	}
	public WebElement getSolutionButton(){
		solutionButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//event-information/div/div[2]/form/div[1]/div[5]/div/kendo-dropdownlist/span")));
		return solutionButton; 							
	}
	public WebElement getSolutionValue(){
		solutionValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//event-information/div/div[2]/form/div[1]/div[5]/div/kendo-dropdownlist/span/span[1]")));
		return solutionValue; 							
	}
	public WebElement getBuButton(){
		buButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//event-information/div/div[2]/form/div[2]/div[1]/div/kendo-dropdownlist/span")));
		return buButton; 							
	}
	public WebElement getBuValue(){
		buValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//event-information/div/div[2]/form/div[2]/div[1]/div/kendo-dropdownlist/span/span[1]")));
		return buValue; 							
	}
	public WebElement getSubjectText(){
		subjectText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//event-information/div/div[2]/form/div[2]/div[2]/div/input")));
		return subjectText; 							
	}
	public WebElement getSearchButton(){
		searchButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//event-information/div/div[2]/form/div[2]/div[4]/div/button")));
		return searchButton; 							
	}
	public WebElement getNewButton(){
		newButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//event-view/div[1]/div[1]/div[2]/a")));
		return newButton; 							
	}
	public WebElement getSrVoidButton(){
		srVoidButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//event-view/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[1]/div/a[2]")));
		return srVoidButton; 							
	}
	public WebElement getSrCategory(){
		srCategory= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//event-view/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[4]/span")));
		return srCategory; 							
	}
	public WebElement getSrStatus(){
		srStatus= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//event-view/div[1]/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[11]")));
		return srStatus; 							
	}
	public WebElement getErrorOKButton(){
		errorOKButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-message-box-warpper']/div[1]/div[3]/button[1]")));
		return errorOKButton; 							
	}
	
	// new
	public WebElement getEmEventNumberText(){
		emEventNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-section-body']/form/div[1]/div[1]/div/input")));
		return emEventNumberText; 							
	}
	public WebElement getEmItemNumberText(){
		emItemNumberText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-section-body']/form/div[1]/div[2]/div/div/input")));
		return emItemNumberText; 							
	}
	public WebElement getEmManufacturerText(){
		emManufacturerText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-section-body']/form/div[1]/div[3]/div/div/input")));
		return emManufacturerText; 							
	}
	public WebElement getEmCategoryText(){
		emCategoryText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-section-body']/form/div[1]/div[4]/div/div/input")));
		return emCategoryText; 							
	}
	public WebElement getEmBuButton(){
		emBuButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-section-body']/form/div[2]/div[1]/div/kendo-dropdownlist/span")));
		return emBuButton; 							
	}
	public WebElement getEmBuValue(){
		emBuValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-section-body']/form/div[2]/div[1]/div/kendo-dropdownlist/span/span[1]")));
		return emBuValue; 							
	}
	public WebElement getEmTypeButton(){
		emTypeButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-section-body']/form/div[2]/div[2]/div/kendo-dropdownlist/span")));
		return emTypeButton; 							
	}
	public WebElement getEmTypeValue(){
		emTypeValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-section-body']/form/div[2]/div[2]/div/kendo-dropdownlist/span/span[1]")));
		return emTypeValue; 							
	}
	public WebElement getEmSolutionButton(){
		emSolutionButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-section-body']/form/div[2]/div[3]/div/kendo-dropdownlist/span")));
		return emSolutionButton; 							
	}
	public WebElement getEmSolutionValue(){
		emSolutionValue= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-section-body']/form/div[2]/div[3]/div/kendo-dropdownlist/span/span[1]")));
		return emSolutionValue; 							
	}
	public WebElement getEmSubjectText(){
		emSubjectText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-section-body']/form/div[2]/div[4]/div/div/input")));
		return emSubjectText; 							
	}
	public WebElement getEmPeriodClass(){
		emPeriodClass= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-section-body']/form/div[3]/div[1]/div/div/kendo-datepicker")));
		return emPeriodClass; 							
	}
	public WebElement getEmPeriodText(){
		emPeriodText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-section-body']/form/div[3]/div[1]/div/div/kendo-datepicker/span/kendo-dateinput/span/input")));
		return emPeriodText; 							
	}
	public WebElement getEmToClass(){
		emToClass= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-section-body']/form/div[3]/div[2]/div/div/kendo-datepicker")));
		return emToClass; 							
	}
	public WebElement getEmToText(){
		emToText= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nk-section-body']/form/div[3]/div[2]/div/div/kendo-datepicker/span/kendo-dateinput/span/input")));
		return emToText; 							
	}
	public WebElement getEmDetailSourceButton(){
		emDetailSourceButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//ck-editor/div/div/span[1]/span[2]/span[1]/span[3]/a[1]")));
		return emDetailSourceButton; 						
	}
	public WebElement getEmDetail(){
		emDetail= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='cke_contents cke_reset']/textarea")));
		return emDetail; 							
	}
	public WebElement getEmSaveButton(){
		emSaveButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nk-function-panel/div/div/div[1]/div/div[1]/button")));
		return emSaveButton; 							
	}
	public WebElement getEmCancelButton(){
		emCancelButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nk-function-panel/div/div/div[1]/div/div[2]/button")));
		return emCancelButton; 							
	}
	public WebElement getEmNewButton(){
		emNewButton= wait.until(  
				ExpectedConditions.presenceOfElementLocated(By.xpath("//nk-function-panel/div/div/div[1]/div/div[3]/button")));
		return emNewButton; 							
	}
}
