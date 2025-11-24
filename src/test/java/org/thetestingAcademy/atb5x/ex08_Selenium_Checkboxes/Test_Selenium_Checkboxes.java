package org.thetestingAcademy.atb5x.ex08_Selenium_Checkboxes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.thetestingAcademy.CommonToALL;

import java.util.List;

public class Test_Selenium_Checkboxes extends CommonToALL {
    @Test
    public void test_Check_Checkboxes() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        openBrowser(driver, "https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> allCheck = driver.findElements(By.cssSelector("input[type='checkbox']"));

        for (WebElement checkbox : allCheck) {
            // Check the checkbox if it is not already checked
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
        }
        closeBrowser(driver);


    }
}
