package org.thetestingAcademy.atb5x.ex07_Selenium_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.thetestingAcademy.CommonToALL;

public class Test_Selenium_JS_ALERT extends CommonToALL {
    @Test
    public void test_Extract_Text_From_JS_Alert() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        openBrowser(driver, "https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Alert alert = driver.switchTo().alert();
        String AlertText = alert.getText();
        System.out.println(AlertText);
         closeBrowser(driver);


    }}