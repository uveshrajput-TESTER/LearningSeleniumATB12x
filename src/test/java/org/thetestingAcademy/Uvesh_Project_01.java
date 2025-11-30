package org.thetestingAcademy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.thetestingAcademy.CommonToALL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Uvesh_Project_01 extends CommonToALL {

    @Test
    public void test_Renew_Trail() {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.idrive360.com/enterprise/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));
        WebElement Email_id = driver.findElement(By.xpath("//input[@id='username']"));
        Email_id.sendKeys("augtest_040823@idrive.com");
        WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
        Password.sendKeys("123456");
        WebElement Remember_me = driver.findElement(By.xpath("//span[@class='id-checkmark']"));
        Remember_me.click();
        WebElement Sign_in = driver.findElement(By.xpath("//button[@id='frm-btn']"));
        Sign_in.click();

        WebDriverWait wait_1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait_1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Postal Code']")));

        WebElement Post_code = driver.findElement(By.xpath("//input[@placeholder='Postal Code']"));
        Post_code.sendKeys("560089");
        List<WebElement> country = driver.findElements(By.xpath("//select[@id='countryname']"));
        Select select = new Select(country.get(0));
        select.selectByVisibleText("India");

        List<WebElement> State = driver.findElements(By.xpath("//select[@formcontrolname='state']"));
        Select select_1 = new Select(State.get(3));
        select_1.selectByVisibleText("Karnataka");
        WebElement Address = driver.findElement(By.xpath("//input[@id='upgradeaddress']"));
        Address.sendKeys("JP NAGAR ");
        WebDriverWait wait_2 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait_2.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("iframe")));
        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
        System.out.println("Total number of iframes on page: " + iframes.size());

        // Switch to the correct iframe and fill card details
        boolean cardFieldFound = false;

        for (int i = 0; i < iframes.size(); i++) {
            try {
                // Switch to iframe
                driver.switchTo().frame(iframes.get(i));
                System.out.println("Switched to iframe " + i);

                // Try to find credit card input
                List<WebElement> cardInputs = driver.findElements(
                        By.cssSelector("input[aria-label='Credit or debit card number']")
                );
                if (!cardInputs.isEmpty()) {
                    System.out.println("Card field found in iframe " + i);
                    WebElement Card_Number = cardInputs.get(0);
                    Card_Number.sendKeys("5186001700009726");
                    cardFieldFound = true;
                    // Wait and fill MM/YY
                    WebDriverWait wait_3 = new WebDriverWait(driver, Duration.ofSeconds(10));
                    wait_3.until(ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//input[@placeholder='MM / YY']")
                    ));

                    WebElement MM_YY = driver.findElement(By.xpath("//input[@placeholder='MM / YY']"));
                    MM_YY.sendKeys("0235");
                    // Fill CVC
                    WebElement CVC = driver.findElement(By.xpath("//input[@placeholder='CVC']"));
                    CVC.sendKeys("235");

                    break; // Exit loop after finding and filling
                }

                // Switch back to default content if card field not found in this iframe
                driver.switchTo().defaultContent();

            }catch (Exception e) {
                System.out.println("Card field not found in iframe " + i + ". Trying next iframe...");
                driver.switchTo().defaultContent();
            }
        }


        // Step 8: Switch back to default content for remaining actions
        driver.switchTo().defaultContent();

        // Wait for page to stabilize
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<WebElement> Agree = driver.findElements(By.xpath("//span[@tabindex='-1']"));
        Agree.get(1).click();
        WebElement Upgrade = driver.findElement(By.xpath("//button[@id=\"frm-btn1\"]"));
        Upgrade.click();
        WebElement Continue = driver.findElement(By.xpath("//button[@id=\"id-btn-continuefree\"]"));
        Continue.click();


    }

}
