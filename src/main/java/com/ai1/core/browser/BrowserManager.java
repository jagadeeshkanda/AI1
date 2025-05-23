package com.ai1.core.browser;

import org.openqa.selenium.WebDriver;
import com.ai1.DriverFactory;
import org.junit.Assert;
public class BrowserManager {
    private WebDriver driver;

	
    // Open the specified browser
    public void openBrowser(String browser) {
        driver = DriverFactory.getDriver(browser);
    }

    // Navigate to a URL
    public void navigateTo(String url) {
        driver.get(url);
    }

    // Assert Google homepage and quit driver
    public void assertGoogleHomepageAndQuit() {
        Assert.assertTrue(driver.getTitle().contains("Google"));
        driver.quit();
    }

    // Optional: Provide access to the driver if needed
    public WebDriver getDriver() {
        return driver;
    }


}
