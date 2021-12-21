package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
private WebDriver driver;
	
	// 1. By Locators: OR
	private By advancedSearchLink = By.xpath("//a[normalize-space(text())='Advanced search']");
	private By txtTitle = By.id("QueryDescriptor_AdvancedSearchOptions_ObjectCriteria_Title");
	private By checkBoxOnlyImage = By.id("QueryDescriptor_AdvancedSearchOptions_ObjectCriteria_ShowImage");
	private By txtFromYear = By.id("QueryDescriptor_AdvancedSearchOptions_ObjectCriteria_DatingPeriod_StartDate");
	private By txtToYear = By.id("QueryDescriptor_AdvancedSearchOptions_ObjectCriteria_DatingPeriod_EndDate");
	private String titleSelectionOption = "//li/a[contains(text(),'<<NAME>>')]";
	private By txtNameField = By.id("token-input-QueryDescriptor_AdvancedSearchOptions_ArtistCriteria_InvolvedMakerName");
	private By findbutton = By.xpath("//input[@type='submit'][@value='Find']");
	// 2. Constructor of the page class:
	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickAdvancedSearchLink(){
		driver.findElement(advancedSearchLink).click();
	}
	
	public void setTitleField(String fieldValue){
		driver.findElement(txtTitle).clear();
		driver.findElement(txtTitle).sendKeys(fieldValue);
	}
	
	public void setFromYear(String fieldValue){
		driver.findElement(txtFromYear).clear();
		driver.findElement(txtFromYear).sendKeys(fieldValue);
	}
	
	public void setToYear(String fieldValue){
		driver.findElement(txtToYear).clear();
		driver.findElement(txtToYear).sendKeys(fieldValue);
	}
	
	public void clickImageOnlyCheckBox(){
		driver.findElement(checkBoxOnlyImage).click();
	}
	
	public void setNameField(String firstName, String lastName){
		titleSelectionOption = titleSelectionOption.replace("<<NAME>>", lastName);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement txtNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(txtNameField));
		txtNameElement.sendKeys(firstName);
		WebElement nameSelection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(titleSelectionOption)));
		nameSelection.click();
	}
	public void clickOnFindButton(){
		driver.findElement(findbutton).click();
	}
}
