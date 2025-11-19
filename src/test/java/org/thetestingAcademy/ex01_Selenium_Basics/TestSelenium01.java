package org.thetestingAcademy.ex01_Selenium_Basics;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium01 {
    @Test
    @Owner("Uvesh")
    @Description("TC#-1")
    public void test_code(){
        Assert.assertEquals("Uvesh","Uvesh");
    }
    @Test
    @Owner("Uvesh")
    @Description("TC#-2")
    public void test_openVWOLoginPage(){
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("/snap/firefox/current/usr/lib/firefox/firefox"); // adjust if different
        FirefoxDriver driver = new FirefoxDriver(options);
        driver.get("https://app.vwo.com");
    }
}
