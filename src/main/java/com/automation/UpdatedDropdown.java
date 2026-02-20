package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class UpdatedDropdown {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));


        driver.get("https:/rahulshettyacademy.com/dropdownsPractise");


        driver.findElement(By.id("divpaxinfo")).click();

        Thread.sleep(3000);

        for(int i=1; i<5; i++) {
            driver.findElement(By.id("hrefIncChd")).click();
        }

        driver.findElement(By.id("btnclosepaxoption")).click();


    }

}
