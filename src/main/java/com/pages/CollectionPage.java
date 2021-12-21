package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CollectionPage {

	private WebDriver driver;
	
	// 1. By Locators: OR
	private By exploreStudioLink = By.xpath("//li/a/span[contains(text(),'Rijksstudio: explore the collection')]");
	private By hamburgerIcon = By.xpath("//div[@class='navigation']//button[@aria-label='Open menu.']");
	private String collectionHeaderLink = "//figcaption//a[text()='<<ARTISTNAME>>']";
	private By searchStudioButton = By.xpath("//a[normalize-space(text())='Search Rijksstudio']");
	// 2. Constructor of the page class:
	public CollectionPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickExploreStudioLink(){
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement studioLink = wait.until(ExpectedConditions.visibilityOfElementLocated(exploreStudioLink));
		studioLink.click();
	}
	
	public void clickHamburgerIcon(){
		driver.findElement(hamburgerIcon).click();
	}
	
	public void clickSearchStudio(){
		driver.findElement(searchStudioButton).click();
	}
	public void clickArtistName(String artistName){
		collectionHeaderLink = collectionHeaderLink.replace("<<ARTISTNAME>>", artistName);
		System.out.println("Artist name: "+ artistName + " xpath: " + collectionHeaderLink);
		driver.findElement(By.xpath(collectionHeaderLink)).click();
	}

}
