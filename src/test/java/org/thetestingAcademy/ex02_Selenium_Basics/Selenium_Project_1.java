package org.thetestingAcademy.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.thetestingAcademy.CommonToALL;

public class Selenium_Project_1 extends CommonToALL {
    @Test
    @Description("TC#1 - Verify that A particular text is Exist on the page of Katalon website . ")
    @Owner("Uvesh")
    public void test_Verify_text(){
        // Open the URL
        // Get the source code
        // Verify the source Code

        WebDriver driver = new FirefoxDriver();
        openBrowser(driver,"https://katalon-demo-cura.herokuapp.com");

        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("Test Case Passed!!");
            Assert.assertTrue(true);
        }else{
            System.out.println("Test Case Failed!!");
            Assert.assertTrue(false);
        }

        closeBrowser(driver);
    }
}
