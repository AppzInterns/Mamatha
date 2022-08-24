package com.mamatha.automation.pageObjects;

import com.mamatha.automation.pageFactory.HomePageFactory;

public class HomePageObjects extends HomePageFactory {

	public void verifyHomePage() {
		getHome().getAttribute("selected");

	}
}
