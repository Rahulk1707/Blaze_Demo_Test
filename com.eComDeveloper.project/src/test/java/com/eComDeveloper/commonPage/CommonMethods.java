package com.eComDeveloper.commonPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CommonMethods extends MasterPage {

	// Constructor to access superclass variables & functions using 'super' keyword
	public CommonMethods() throws Exception {
		super();
	}

	public void enterData(String xpathKey, String data) {
		driver.findElement(By.xpath(locators.getProperty(xpathKey))).sendKeys(testdata.getProperty(data));
	}

	public void clearData(String xpathKey, String password) {
		driver.findElement(By.xpath(locators.getProperty(xpathKey))).clear();
	}

	public void click(String xpathKey) {
		driver.findElement(By.xpath(locators.getProperty(xpathKey))).click();
	}

	public void listOfElements(String xpathKey, int index) {
		List<WebElement> list = driver.findElements(By.xpath(locators.getProperty(xpathKey)));
		System.out.println(list.size());
		list.get(index).click();
	}

}
