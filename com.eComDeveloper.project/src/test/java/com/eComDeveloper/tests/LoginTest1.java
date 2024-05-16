package com.eComDeveloper.tests;

import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest1 {
	
	private WebDriver driver;
	private String baseUrl = "https://www.facebook.com";
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseUrl);
		Thread.sleep(2000);
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("rahulk@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("rahulk123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@id,'u_0_5')]")).click();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
