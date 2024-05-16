package com.eComDeveloper.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase_1 {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		Thread.sleep(2000);
	}

	@Test
	public void test() throws Exception {
		driver.findElement(By.xpath("//select[@name='fromPort']")).sendKeys("Mexico City");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='toPort']")).sendKeys("New York");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);

		int rows = driver.findElements(By.xpath("//table[@class='table']//tr//td[6]")).size();

		for (int i = 1; i <= rows; i++) {
			String price = driver.findElement(By.xpath("//table[@class='table']//tr[" + i + "]//td[6]")).getText();

			if (price.equals("$200.98")) {
				driver.findElement(By.xpath("//table[@class='table']//tr[3]//td[1]")).click();
				break;
			}
		}

		driver.findElement(By.cssSelector("#inputName")).sendKeys("Ryan Gosling");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#address")).sendKeys("123 Main Street");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#city")).sendKeys("Rochestor");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#state")).sendKeys("New York");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#zipCode")).sendKeys("41235");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#cardType")).sendKeys("Visa");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#creditCardNumber")).sendKeys("4569 3459 2341 4458");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#creditCardMonth")).clear();
		driver.findElement(By.cssSelector("#creditCardMonth")).sendKeys("10");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#creditCardYear")).clear();
		driver.findElement(By.cssSelector("#creditCardYear")).sendKeys("2028");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#nameOnCard")).sendKeys("Ryan Gosling");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#rememberMe")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);

		String actualHeader = driver.findElement(By.xpath("//h1")).getText();
		String expectedHeader = "Thank you for your purchase today!";

		Assert.assertEquals(actualHeader, expectedHeader);

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
