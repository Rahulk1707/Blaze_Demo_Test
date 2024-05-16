package com.eComDeveloper.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.eComDeveloper.commonPage.MasterPage;
import com.eComDeveloper.pages.LoginPage;

public class LoginTest {

	@Test
	public void loginTest() throws Exception {

		LoginPage lp = new LoginPage();

		String title = MasterPage.driver.getTitle();
		System.out.println("Webpage title is --> " + title);
		lp.clickUsername();
		lp.enterUsername();
		Thread.sleep(2000);
		lp.clickPassword();
		lp.enterPassword();
		Thread.sleep(2000);
		lp.clickLogin();

		System.out.println("Webpage title is --> " + MasterPage.driver.getTitle());
		Assert.assertEquals(MasterPage.driver.getTitle(), "Dashboard");
		Thread.sleep(2000);

	}

	@AfterMethod
	public void closeBrowser() {
		MasterPage.driver.close();
	}

}
