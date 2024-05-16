package com.eComDeveloper.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage1 {
	
	WebDriver ldriver;
	
	public DashboardPage1(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id='input-username']")
	@CacheLookup
	WebElement txtUsername;
	
	@FindBy(how = How.XPATH, using = "//input[@id='input-password']")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Catalog')]")
	@CacheLookup
	WebElement btnCatalog;
	
	@FindBy(how = How.XPATH, using = "//ul[@id='collapse1']/li")
	@CacheLookup
	List<WebElement> listCatalog;
	
	public void enterUsername(String uname) {
		txtUsername.sendKeys(uname);
	}
	
	public void enterPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	
	public void clickCatalog() {
		btnCatalog.click();
	}
	
	public void getListOfCatalog() {
		// Printing no of elements present inside 'Catalog' menu
		System.out.println("Total elements are: " + listCatalog.size());
		
		// Printing name of all elements present inside 'Catalog' menu
		for(int i = 0; i < listCatalog.size(); i++) {
			String text = listCatalog.get(i).getText();
			System.out.println("Element name: " + text);
		}
		
	}
	
}
