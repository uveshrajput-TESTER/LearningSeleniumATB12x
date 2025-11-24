package org.thetestingAcademy.atb5x.ex06_Selenium_DropdownBoxes;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestSelenium_Normal_Option_Dropdown {
    @Owner("Uvesh")
    @Test
    public void Choose_Option()  {
        // Create Session via the API and Session ID is generated
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("dropdown"));
        Select select = new Select(element);
        select.selectByVisibleText("Option 2");

}}
