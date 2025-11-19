package org.thetestingAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CommonToALL {
    public EdgeDriver driver;
    public void openBrowser(WebDriver driver,String url){
        driver.get(url);
    }
    public void closeBrowser(WebDriver driver){
        driver.quit();
    }
}
