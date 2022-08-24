package com.mamatha.automation.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksOnFeatures extends BaseDriver {

	@Before
	public void beforeScenarios() {

		// setUp("BrowserStack");
		setUp("Emulator");
	}

	@After
	public void afterScenarios() throws InterruptedException {
		tearDown();
	}

}
