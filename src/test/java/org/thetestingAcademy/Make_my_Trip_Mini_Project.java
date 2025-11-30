package org.thetestingAcademy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.thetestingAcademy.CommonToALL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Make_my_Trip_Mini_Project extends CommonToALL {


    @Test
    public  void test_Verify_Number(){
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.makemytrip.com/");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)) ;
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));
        WebElement M_Number = driver.findElement(By.xpath("//input[@data-cy=\"userName\"]"));
        M_Number.sendKeys("7827289273");
        WebElement Continue = driver.findElement(By.xpath("//button[@data-cy=\"continueBtn\"]"));
        Continue.click();
        WebDriverWait wait_1 = new WebDriverWait(driver,Duration.ofSeconds(10)) ;
        wait_1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"CommonModal_3\"]")));
        WebElement Back = driver.findElement(By.xpath("//span[@data-cy=\"CommonModal_3\"]"));
        Back.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement Cross = driver.findElement(By.xpath("/span[@data-cy=\"closeModal\"]"));
        Cross.click();


    }
}
