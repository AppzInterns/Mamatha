package com.mamatha.automation.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mamatha.automation.base.BaseDriver;
import com.mamatha.automation.utils.WaitUtil;

public class FirstPageFactory extends BaseDriver {

	By continueBy = By.id("com.liqvd.digibox.test:id/tvContinueToNext");
	By skipBy = By.id("com.liqvd.digibox.test:id/btnSkipIntroSlideOne");

//	public FirstPageFactory() {
//
//	}

	public WebElement getSkip() {
		WaitUtil.waitForElementVisibility(driver, skipBy);
		return driver.findElement(skipBy);
	}

	public WebElement getContinue() {
		WaitUtil.waitForElementVisibility(driver, continueBy);
		return driver.findElement(continueBy);
	}

}
