package com.mamatha.automation.pageObjects;

import com.mamatha.automation.pageFactory.LoginPageFactory;

public class LoginPageObjects extends LoginPageFactory {

	public LoginPageObjects() {
		super();
	}

	public void enterEmail() {

		getEmail().sendKeys("maxarlo264@gmail.com");
	}

	public void enterPassword() {
		getPassword().sendKeys("Gaurav@123");

	}

	public void enterDigispace() {

		getDigispace().sendKeys("test98");
	}

	public void clickSignIn() {
		getSignIn().click();

	}

	public void verifyHomePage() {

	}

}
