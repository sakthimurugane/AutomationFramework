package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {


	private WebDriver driver;

	// 1. By Locators: OR
	private By txt_UserName = By.name("email");
	private By txt_Pswd = By.name("password");
	private By btn_login = By.xpath("//button[normalize-space()='Log in']");
	private By forgotPwdLink = By.xpath("//a[normalize-space()='Forgot your password']");
	private By cookieConsent = By.xpath("//span[text()='Accept']");
	private By loginLink = By.xpath("//li[@class='header-link']/a/span[contains(text(),'Login')]");

	// 2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}

	public void enterUserName(String username) {
		driver.findElement(txt_UserName).clear();
		driver.findElement(txt_UserName).sendKeys(username);
	}

	public void enterPassword(String pwd) {
		driver.findElement(txt_Pswd).clear();
		driver.findElement(txt_Pswd).sendKeys(pwd);
	}

	public void clickOnLogin() {
		driver.findElement(btn_login).click();
	}
	
	public void acceptCookies(){
		driver.findElement(cookieConsent).click();
	}
	
	public void clickOnLoginLink(){
		driver.findElement(loginLink).click();
	}
}
