package com.eComDeveloper.pages;

import com.eComDeveloper.commonPage.CommonMethods;

public class LoginPage extends CommonMethods {

	public LoginPage() throws Exception {
		super();
	}

	public void clickUsername() {
		click("Username");
	}

	public void enterUsername() {
		enterData("Username", "Uname");
	}

	public void clickPassword() {
		click("Password");
	}

	public void enterPassword() {
		enterData("Password", "Pwd");
	}

	public void clickLogin() {
		click("Login");
	}

}
