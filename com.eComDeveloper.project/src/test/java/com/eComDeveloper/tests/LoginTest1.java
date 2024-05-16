package com.eComDeveloper.tests;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.eComDeveloper.pages.LoginPage1;

public class LoginTest1 {
	
	private WebDriver driver;
	private String baseUrl = "https://www.facebook.com";
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseUrl);
	}
	
	@Test
	public void loginTest() {
		LoginPage1 lp1 = new LoginPage1(driver);
		lp1.enterUsername("rahulk@gmail.com");
		lp1.enterPassword("1234567");
		lp1.clickLogin();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
