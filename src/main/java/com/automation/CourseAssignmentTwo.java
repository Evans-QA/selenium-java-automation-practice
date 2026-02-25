package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CourseAssignmentTwo {
    public static void main(String args[]) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/angularpractice");
        driver.findElement(By.name("name")).sendKeys("MyName");
        driver.findElement(By.name("email")).sendKeys("MyEmail");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("MyPassword");
        driver.findElement(By.className("form-check-input")).click();
        driver.findElement(By.name("inlineRadioOptions")).click();
        driver.findElement(By.id("exampleFormControlSelect1")).click();
        driver.findElement(By.xpath("//option[text()='Female']")).click();
        driver.findElement(By.name("bday")).sendKeys(("01.01.2000"));
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());




    }
}
