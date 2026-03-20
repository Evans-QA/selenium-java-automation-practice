package com.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CourseAssignmentSix {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // 1. Select any checkbox
        WebElement checkBox = driver.findElement(By.id("checkBoxOption2"));
        checkBox.click();

        // 2. Grab the label
        String grabbedText = driver.findElement(By.xpath("//*[@id='checkBoxOption2']/parent::label")).getText().trim();
        System.out.println("Pobrany tekst to: " + grabbedText);

        // 3. Select option in dropdown using variable
        WebElement dropdownElement = driver.findElement(By.id("dropdown-class-example"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(grabbedText);

        // 4. Enter grabbed text in Editbox
        driver.findElement(By.id("name")).sendKeys(grabbedText);

        // 5. Click Alert and verify
        driver.findElement(By.id("alertbtn")).click();

        String alertMessage = driver.switchTo().alert().getText();


        Assert.assertTrue(alertMessage.contains(grabbedText),
                "Error: Alert message does not contain " + grabbedText);

        driver.switchTo().alert().accept();
        driver.quit();
    }
}
