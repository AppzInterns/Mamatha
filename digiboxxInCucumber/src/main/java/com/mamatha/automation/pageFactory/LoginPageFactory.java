package com.mamatha.automation.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mamatha.automation.base.BaseDriver;
import com.mamatha.automation.utils.WaitUtil;

public class LoginPageFactory extends BaseDriver {

	By emailBy = By.id("com.liqvd.digibox.test:id/edtEmail");
	By passwdBy = By.id("com.liqvd.digibox.test:id/edtPassword");
	By digiBy = By.id("com.liqvd.digibox.test:id/edtDigiSpaceName");
	By signInBy = By.id("com.liqvd.digibox.test:id/btnSignIn");

	public WebElement getEmail() {
		WaitUtil.waitForElementVisibility(driver, emailBy);
		return driver.findElement(emailBy);
	}

	public WebElement getPassword() {
		WaitUtil.waitForElementVisibility(driver, passwdBy);
		return driver.findElement(passwdBy);
	}

	public WebElement getDigispace() {
		WaitUtil.waitForElementVisibility(driver, digiBy);
		return driver.findElement(digiBy);
	}

	public WebElement getSignIn() {
		WaitUtil.waitForElementVisibility(driver, signInBy);
		return driver.findElement(signInBy);
	}

}
