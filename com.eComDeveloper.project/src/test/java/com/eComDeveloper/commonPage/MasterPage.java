package com.eComDeveloper.commonPage;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MasterPage {

	public static WebDriver driver;
	public Properties configs;
	public Properties locators;
	public Properties testdata;

	// Constructor implementation
	public MasterPage() throws Exception {

		// configuration.properties file implementation
		FileInputStream fic = new FileInputStream(
				".\\src\\test\\java\\com\\eComDeveloper\\repository\\configuration.properties");
		configs = new Properties();
		configs.load(fic);
		fic.close();

		// locators.properties file implementation
		FileInputStream fil = new FileInputStream(
				".\\src\\test\\java\\com\\eComDeveloper\\repository\\locators.properties");
		locators = new Properties();
		locators.load(fil);
		fil.close();

		// testdata.properties file implementation
		FileInputStream fit = new FileInputStream(
				".\\src\\test\\java\\com\\eComDeveloper\\repository\\testdata.properties");
		testdata = new Properties();
		testdata.load(fit);
		fit.close();

		// Browser implementation with if else if ladder
		if (configs.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (configs.getProperty("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", "D:\\Software's\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(configs.getProperty("url"));

	}
}
