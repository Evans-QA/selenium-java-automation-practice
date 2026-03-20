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
        WebElement checkBoxOption = driver.findElement(By.id("checkBoxOption2"));
        checkBoxOption.click();

        WebElement dropdownElement = driver.findElement(By.id("dropdown-class-example"));

        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("Option2");

        WebElement enterNameOption = driver.findElement(By.id("name"));
        enterNameOption.sendKeys("Option2");

        String selectedOption = "Option2";

        driver.findElement(By.id("alertbtn")).click();

        Alert alert = driver.switchTo().alert();

        String alertMessage = alert.getText();

        Assert.assertTrue(alertMessage.contains(selectedOption), "Error: alert should contain " + selectedOption);

        driver.switchTo().alert().accept();

        driver.quit();

    }
}
