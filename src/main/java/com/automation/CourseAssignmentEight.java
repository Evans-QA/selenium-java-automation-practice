package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CourseAssignmentEight {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement autoSuggestInput = driver.findElement(By.id("autocomplete"));
        autoSuggestInput.sendKeys("uni");

        Thread.sleep(2000);

        List<WebElement> options = driver.findElements(By.cssSelector(".ui-menu-item div"));

        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase("United States (USA)")) {
                option.click();
                break;
            }
        }
        
        System.out.println("Selected value: " + autoSuggestInput.getAttribute("value"));
    }
}


