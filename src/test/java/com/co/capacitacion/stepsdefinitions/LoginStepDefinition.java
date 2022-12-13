package com.co.capacitacion.stepsdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.LoginStep;

public class LoginStepDefinition {

    @Steps
    LoginStep loginStep;

    @Given("^He user ison the page$")
    public void heUserIsonThePage() {
        loginStep.openBrowser();

    }

    @When("^He user enter credentials$")
    public void heUserEnterCredentials() throws InterruptedException {
        loginStep.clickLogin();
        loginStep.enterCredentials();
        loginStep.clickSignIn();

    }

    @Then("^He coud see the products$")
    public void heCoudSeeTheProducts() {
        loginStep.compareName();

    }
}
