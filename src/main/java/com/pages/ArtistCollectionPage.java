package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArtistCollectionPage {
	private WebDriver driver;
	
	// 1. By Locators: OR
	//private String figureSelectionPath = "//figure[.//a[contains(text(),'<<ARTNAME>>')]]//a[contains(@class,'button-like')]";
	private String figureSelectionPath = "//figure//a[@data-title='<<ARTNAME>>']";
	private String collectionNameSelect = "//a[text()='<<COLLECTION_NAME>>']";
	private By addToCollectionModel = By.xpath("//section[contains(@class,'lightbox-content')]//a");
	// 2. Constructor of the page class:
	public ArtistCollectionPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickHeartButton(String artName){
		figureSelectionPath = figureSelectionPath.replace("<<ARTNAME>>", artName);
		Actions actions = new Actions(driver);
		WebElement heartButton = driver.findElement(By.xpath(figureSelectionPath));
		actions.moveToElement(heartButton).perform();
		heartButton.click();
	}
	
	public void clickCollectionName(String collectionName){
		collectionNameSelect = collectionNameSelect.replace("<<COLLECTION_NAME>>", collectionName);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(addToCollectionModel));
		driver.findElement(By.xpath(collectionNameSelect)).click();
	}
	
	public void waitForDialogClosure(){
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(addToCollectionModel));
	}
}
