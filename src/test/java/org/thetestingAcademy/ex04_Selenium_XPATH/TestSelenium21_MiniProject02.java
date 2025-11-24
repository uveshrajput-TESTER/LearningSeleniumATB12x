package org.thetestingAcademy.ex04_Selenium_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.thetestingAcademy.CommonToALL;

public class TestSelenium21_MiniProject02 extends CommonToALL {
    @Test
    public void test_Make_Appointment_Katalon_demo_cure(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement Make_Appointment = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        Make_Appointment.click();
        WebElement Username = driver.findElement(By.xpath("//input[@id='txt-username']"));
        Username.sendKeys("John Doe");
        WebElement Password = driver.findElement(By.xpath("//input[@id='txt-password']"));
        Password.sendKeys("ThisIsNotAPassword");
        WebElement Login = driver.findElement(By.xpath("//button[@id='btn-login']"));
        Login.click();
        WebElement Text = driver.findElement(By.xpath("//h2[text()='Make Appointment']"));
        Assert.assertEquals(Text.getText(),"Make Appointment");
        Assert.assertTrue(Text.isDisplayed());
        closeBrowser(driver);


    }
}
