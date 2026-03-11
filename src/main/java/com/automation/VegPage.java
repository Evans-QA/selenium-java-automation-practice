package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class VegPage {
    public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot"};


        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
        driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector(".promoBtn")).click();

        String actualText = driver.findElement(By.cssSelector(".promoInfo")).getText();
        Assert.assertEquals(actualText, "Code applied ..!");


    }
}
