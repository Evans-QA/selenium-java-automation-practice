package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class VegPage {
    public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub


        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot"};


        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoCode")));
        driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector(".promoBtn")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
        String actualText = driver.findElement(By.cssSelector(".promoInfo")).getText();
        Assert.assertEquals(actualText, "Code applied ..!");
        System.out.println(actualText);


    }
}
