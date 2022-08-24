package com.mamatha.automation.stepdef;

import com.mamatha.automation.pageObjects.FirstPageObjects;
import com.mamatha.automation.pageObjects.HomePageObjects;
import com.mamatha.automation.pageObjects.LoginPageObjects;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {

	FirstPageObjects firstPO = new FirstPageObjects();
	LoginPageObjects loginPO = new LoginPageObjects();
	HomePageObjects homePO = new HomePageObjects();

	@Given("^I press the skip button$")
	public void i_press_the_skip_button() throws Throwable {
		firstPO.clickSkip();

	}

	@And("^I press the continue button$")
	public void i_press_the_continue_button() throws Throwable {
		firstPO.clickContinue();

	}

	@When("^I input the email$")
	public void i_input_the_email() throws Throwable {
		loginPO.enterEmail();

	}

	@And("^I input the password$")
	public void i_input_the_password() throws Throwable {
		loginPO.enterPassword();

	}

	@And("^I input the digispace$")
	public void i_input_the_digispace() throws Throwable {
		loginPO.enterDigispace();

	}

	@And("^I click the signin button$")
	public void i_click_the_signin_button() throws Throwable {
		loginPO.clickSignIn();

	}

	@Then("^verify that I have reached the homepage$")
	public void verify_that_i_have_reached_the_homepage() throws Throwable {
		homePO.verifyHomePage();

	}

}
