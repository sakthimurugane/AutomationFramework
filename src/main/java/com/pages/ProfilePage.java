package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
private WebDriver driver;
	
	// 1. By Locators: OR
	private By avatarCard = By.xpath("//li[@class='user-profile']/a/div[@class='avatar-placeholder']");
	private String artImageSelectionPath = "//figure//figcaption[.//a[text()='<<COLLECTION_NAME>>']]";
	private By getStartedButtoninProfile = By.xpath("//div[@data-role='lightbox-container']//button[text()='Get started']");
	// 2. Constructor of the page class:
	public ProfilePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickMyProfileAvatar(){
		driver.findElement(avatarCard).click();
	}
	
	public void clickCollectionInProfile(String collectionName){
		artImageSelectionPath = artImageSelectionPath.replace("<<COLLECTION_NAME>>", collectionName);
		driver.findElement(By.xpath(artImageSelectionPath)).click();
	}
	
	public boolean checkImageIsPresent(String imageName){
		artImageSelectionPath=artImageSelectionPath.replace("<<COLLECTION_NAME>>", imageName);
		return (driver.findElement(By.xpath(artImageSelectionPath))!=null);
	}
	
	public void clickGetStartedButton(){
		driver.findElement(getStartedButtoninProfile).click();
	}
}
