package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class JavaScriptExecutorDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

        List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int sum = 0;

        for (int i = 0; i < values.size(); i++) {
            String valueText = values.get(i).getText();

            sum = sum + Integer.parseInt(valueText);
        }

        System.out.println(sum);

        String totalText = driver.findElement(By.cssSelector(".totalAmount")).getText();

        System.out.println(totalText);

        String valueOnly = totalText.split(":")[1].trim();

        int totalAmountFromPage = Integer.parseInt(valueOnly);

        Assert.assertEquals(sum, totalAmountFromPage, "Sum does not match");

        driver.quit();

    }
}
