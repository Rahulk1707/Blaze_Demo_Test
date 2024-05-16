package com.eComDeveloper.tests;

import org.testng.annotations.Test;

import com.eComDeveloper.commonPage.BaseClass;
import com.eComDeveloper.pages.DashboardPage1;

public class DashboardTest1 extends BaseClass {
	
	@Test
	private void dashboardTest() throws Exception {
		DashboardPage1 dp1 = new DashboardPage1(driver);
		
		dp1.enterUsername("demoadmin");
		dp1.enterPassword("demopass");
		Thread.sleep(2000);
		dp1.clickLogin();
		Thread.sleep(2000);
		System.out.println("Homepage title: " + driver.getTitle());
		dp1.clickCatalog();
		dp1.getListOfCatalog();
		Thread.sleep(2000);

	}

}
