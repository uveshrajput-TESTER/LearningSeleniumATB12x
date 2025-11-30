package org.thetestingAcademy.ex09_WebTables;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ex09_Selenium_WebTables {
    @Owner("Uvesh")
    @Test
    public void test_Google_Country() throws InterruptedException {
        // Google In Which Country
        WebDriver driver = new ChromeDriver();
        // Who is in Google
        driver.get("https://awesomeqa.com/webtable.html");

        // How to Fetch To Table?
        // Xpath -> //table[@id="customers"], CSS Selector, ID
        // If something is Dynamic In nature - //table[contains@id,"cust"]
        // ByTageName - table - 1 table only

        // Row , Col
        // Number of Rows and Column in table
        int row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th")).size();
        System.out.println(row);
        System.out.println(col);

        // //table[@id='customers']/tbody/tr[i]/td[j]

        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";

        for (int i = 2; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                String dynamic_path = first_part+i+second_part+j+third_part;
                //System.out.println(dynamic_path);
                String data = driver.findElement(By.xpath(dynamic_path)).getText();
                System.out.print(data +" ");
                if (data.contains("Google")){
                    String temp = dynamic_path + "/following-sibling::td[2]";
                    String County_google =  driver.findElement(By.xpath(temp)).getText();
                    System.out.println(County_google);
                }
//                if(data.contains("Helen Bennett")){
//                    String country_path = dynamic_path+"/following-sibling::td";
//                    String country_text = driver.findElement(By.xpath(country_path)).getText();
//                    System.out.println("------");
//                    System.out.println("Helen Bennett is In - " + country_text);
//                }

            }

        }











    }
    @Owner("Uvesh")
    @Test
    public void test_Helen_Bennett_country() throws InterruptedException {
        // Find Helen Bennett In Which Country
        WebDriver driver = new ChromeDriver();
        // Who is in Google
        driver.get("https://awesomeqa.com/webtable.html");

        // How to Fetch To Table?
        // Xpath -> //table[@id="customers"], CSS Selector, ID
        // If something is Dynamic In nature - //table[contains@id,"cust"]
        // ByTageName - table - 1 table only

        // Row , Col
        // Number of Rows and Column in table
        int row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th")).size();
        System.out.println(row);
        System.out.println(col);

        // //table[@id='customers']/tbody/tr[i]/td[j]

        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";

        for (int i = 2; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                String dynamic_path = first_part + i + second_part + j + third_part;
                //System.out.println(dynamic_path);
                String data = driver.findElement(By.xpath(dynamic_path)).getText();
                System.out.print(data + " ");

                if(data.contains("Helen Bennett")){
                    String country_path = dynamic_path+"/following-sibling::td";
                    String country_text = driver.findElement(By.xpath(country_path)).getText();
                    System.out.println("------");
                    System.out.println("Helen Bennett is In - " + country_text);
                }

            }

        }
    }

}
