package com.eComDeveloper.pages;

import com.eComDeveloper.commonPage.CommonMethods;

public class DashboardPage extends CommonMethods {

	public DashboardPage() throws Exception {
		super();
	}
	
	public void clickCatalog() {
		click("Catalog");
	}
	
	public void getCatalogList() {
		listOfElements("CatalogList", 1);
	}

}
