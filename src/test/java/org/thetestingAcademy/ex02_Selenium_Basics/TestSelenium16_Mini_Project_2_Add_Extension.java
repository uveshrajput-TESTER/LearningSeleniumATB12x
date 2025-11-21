package org.thetestingAcademy.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium16_Mini_Project_2_Add_Extension {
    @Description("Options Class")
    @Test
    public void test_Selenium01()  {


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=1920,1080"); // Full HD

        File path = new File("/home/uvaesh/IdeaProjects/LearningSeleniumATB12x/src/test/java/org/thetestingAcademy/ex02_Selenium_Basics/AdBlock.crx");
        chromeOptions.addExtensions(path);


        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.youtube.com");




    }
}
