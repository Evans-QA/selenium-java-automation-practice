package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CourseAssignmentSeven {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement table = driver.findElement(By.id("product"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));
        int rowCount = rows.size();
        System.out.println("Number of Rows: " + rowCount);

        int colCount = rows.get(0).findElements(By.tagName("th")).size();
        System.out.println("Number of Columns: " + colCount);
        
        List<WebElement> secondRowCells = rows.get(2).findElements(By.tagName("td"));

        System.out.println("Row 2 Content:");
        for (WebElement cell : secondRowCells) {
            System.out.println(cell.getText());
        }

        driver.quit();
    }
}