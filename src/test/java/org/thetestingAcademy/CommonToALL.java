package org.thetestingAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CommonToALL {
    public EdgeDriver driver;
    public void openBrowser(WebDriver driver,String url){
        driver.get(url);
       WebDriver.Window Driver = driver.manage().window();
       Driver.maximize();
    }
    public void closeBrowser(WebDriver driver){

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
