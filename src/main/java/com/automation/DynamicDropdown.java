package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicDropdown {

    public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();

    driver.get("https://rahulshettyacademy.com/dropdownsPractise");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_mainContent_ddl_originStation1_CTXT"))).click();
    driver.findElement(By.xpath("//a[@value='IXI']")).click();

    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@value='CCU'])[2]"))).click();

    System.out.println("Origin: " + driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getAttribute("value"));
    System.out.println("Destination: " + driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).getAttribute("value"));

    driver.quit();

    }
}
