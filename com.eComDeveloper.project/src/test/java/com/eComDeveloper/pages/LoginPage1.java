package com.eComDeveloper.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage1 {

	WebDriver driver;

	public LoginPage1(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "email")
	@CacheLookup
	WebElement txtUsername;

	@FindBy(id = "pass")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//button[contains(@id,'u_0_5')]")
	@CacheLookup
	WebElement btnLogin;

	public void enterUsername(String username) {
		txtUsername.sendKeys(username);
	}

	public void enterPassword(String password) {
		txtPassword.sendKeys(password);
	}

	public void clickLogin() {
		btnLogin.click();
	}

}
