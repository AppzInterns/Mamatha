package com.mamatha.automation.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mamatha.automation.base.BaseDriver;
import com.mamatha.automation.utils.WaitUtil;

public class HomePageFactory extends BaseDriver {

	By homeBy = By.xpath("//android.widget.FrameLayout[@content-desc=\"Home\"]");

	public WebElement getHome() {
		WaitUtil.waitForElementVisibility(driver, homeBy);
		return driver.findElement(homeBy);
	}

}
