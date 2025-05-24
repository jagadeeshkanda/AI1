package com.ai1.stepdefinitions;

import com.ai1.DriverFactory;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

public class BrowserSteps {
	private WebDriver driver;

    @Given("I's open the {string} browser")
    public void i_open_the_browser(String browser) {
        driver = DriverFactory.getDriver(browser);
    }

    @When("I's navigate to {string}")
    public void i_navigate_to(String url) {
        driver.get(url);
    }

    @Then("I should see the Google homepage")
    public void i_should_see_the_google_homepage() {
        Assert.assertTrue(driver.getTitle().contains("Google"));
        driver.quit();
    }

}
