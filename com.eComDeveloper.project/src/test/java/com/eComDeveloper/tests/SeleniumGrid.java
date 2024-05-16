package com.eComDeveloper.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setCapability("browserName", "chrome");
		ds.setCapability("platformName", "Windows 11");

		WebDriver driver = new RemoteWebDriver(new URL(" http://192.168.1.204:4444"), ds);
		driver.get("https://www.facebook.com");
		driver.quit();

	}

}
