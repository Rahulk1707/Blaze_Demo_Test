package com.eComDeveloper.tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowns {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@role='listbox']//span[text()='QA Engineer']")).click();

		List<WebElement> dropdowns = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		Thread.sleep(2000);
		System.out.println("Total dropdowns: " + dropdowns.size() + "\n");
		Thread.sleep(2000);

		for (WebElement dropdown : dropdowns) {
			System.out.println(dropdown.getText());
		}

	}

}
