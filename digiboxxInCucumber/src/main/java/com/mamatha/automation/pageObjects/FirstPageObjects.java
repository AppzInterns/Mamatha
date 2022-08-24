package com.mamatha.automation.pageObjects;

import com.mamatha.automation.pageFactory.FirstPageFactory;

public class FirstPageObjects extends FirstPageFactory {

//	public FirstPageObjects() {
//		super();
//	}

	public void clickSkip() {
		getSkip().click();
	}

	public void clickContinue() {
		getContinue().click();
	}

}
