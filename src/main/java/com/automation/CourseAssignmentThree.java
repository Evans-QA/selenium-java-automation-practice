package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CourseAssignmentThree {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("Learning@830$3mK2");
        driver.findElement(By.xpath("//label[2]//span[2]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();

        WebElement staticDropdown = driver.findElement(By.cssSelector("select.form-control"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(2);

        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();

        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".btn-info"), 4));

        List<WebElement> addProducts = driver.findElements(By.cssSelector(".btn-info"));

        for (WebElement button : addProducts) {
            button.click();
        }

        System.out.println("You have added to the cart: " + addProducts.size() + " phones");

        driver.findElement(By.cssSelector(".btn-primary")).click();

        driver.quit();
    }
}
