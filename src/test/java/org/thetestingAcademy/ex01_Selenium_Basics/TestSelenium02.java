package org.thetestingAcademy.ex01_Selenium_Basics;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium02 {
    @Test
    @Description("TC#1 -open app.vwo.com and verify the current URL . ")
    @Owner("Uvesh")
    public void test_Selenium02(){
        // Open the url
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("/snap/firefox/current/usr/lib/firefox/firefox"); // adjust if different
        FirefoxDriver driver = new FirefoxDriver(options);
        // new EdgeDriver(); -> POST Request(Browser Driver) (localhost:XXXXX),
        // Create New Session Endpoint - 16 digit Unique ID is also created.

        // get the URL
        driver.get("https://app.vwo.com");// Navigate the URL -> HTTP GET the URL
        // verify the  URL
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login"); // Assert the URL - Validation - TestNG Assertions
       driver.quit();// POST request to close all the tabs in the browser
    }
}
