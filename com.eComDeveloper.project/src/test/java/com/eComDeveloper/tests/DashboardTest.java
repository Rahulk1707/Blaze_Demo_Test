package com.eComDeveloper.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.eComDeveloper.commonPage.MasterPage;
import com.eComDeveloper.pages.DashboardPage;
import com.eComDeveloper.pages.LoginPage;

public class DashboardTest {

	@Test
	public void dashboardTest() throws Exception {
		
		LoginPage lp = new LoginPage();
		DashboardPage dp = new DashboardPage();

		lp.clickUsername();
		lp.enterUsername();
		Thread.sleep(2000);
		lp.clickPassword();
		lp.enterPassword();
		Thread.sleep(2000);
		lp.clickLogin();
		Thread.sleep(2000);

		dp.clickCatalog();
		dp.getCatalogList();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void closeBrowser() {
		MasterPage.driver.close();
	}

}
