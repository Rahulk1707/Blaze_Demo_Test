package com.eComDeveloper.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ParallelTest {

	WebDriver driver;

	@Test
	public void testChromeBrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

	@Test
	public void testEdgeBrowser() {
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
