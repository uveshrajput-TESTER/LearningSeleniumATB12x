package org.thetestingAcademy.ex04_Selenium_XPATH;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.thetestingAcademy.CommonToALL;

public class TestSelenium20_MiniProject01 extends CommonToALL {
    @Description("TC-1 :- With Valid Username and Password user Successfully Login ")
    @Test
    public void Test_login_WISE(){
        WebDriver driver = new ChromeDriver();
       openBrowser(driver,"https://wise.codecompass.in/login");
       WebElement  Username =  driver.findElement(By.xpath("//input[@placeholder='Username']"));
       Username.sendKeys("UVESHRAJPUT");


}


}
