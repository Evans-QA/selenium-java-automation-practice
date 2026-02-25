package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CourseAssignmentOne {
    public static void main(String args[]) throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/automationpractice");
    driver.findElement(By.id("checkBoxOption1")).click();
    Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
    Thread.sleep(2000);
    driver.findElement(By.id("checkBoxOption1")).click();
    Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());

    driver.quit();

    }
}
