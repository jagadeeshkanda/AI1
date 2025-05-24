package com.ai1.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import com.ai1.core.browser.BrowserManager;

public class BrowserManagerSteps {
	
	private BrowserManager browserManager;

    @Given("I open the {string} browser")
    public void i_open_the_browser(String browser) {
        browserManager = new BrowserManager();
        browserManager.openBrowser(browser);
    }

    @When("I navigate to {string}")
    public void i_navigate_to(String url) {
        browserManager.navigateTo(url);
    }

    @Then("The page title should contain {string}")
    public void the_page_title_should_contain(String expectedTitle) {
        Assert.assertTrue(browserManager.getDriver().getTitle().contains(expectedTitle));
        //browserManager.getDriver().quit(); // Clean up after test
    }

}
