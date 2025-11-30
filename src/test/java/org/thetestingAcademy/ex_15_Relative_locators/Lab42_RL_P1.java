package org.thetestingAcademy.ex_15_Relative_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Lab42_RL_P1 {
    @Test
    public void test_Relative() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement span_element = driver.findElement(By.xpath("//span[text()=\"Years of Experience\"]"));

        driver.findElement(with(By.xpath("exp-2")).toRightOf(span_element)).click();
    }
}