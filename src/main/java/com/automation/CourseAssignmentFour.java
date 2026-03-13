package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class CourseAssignmentFour {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentID = it.next();
        String childID = it.next();
        driver.switchTo().window(childID);
        String textOne = driver.findElement(By.cssSelector("div.example h3")).getText();
        System.out.println(textOne);
        driver.switchTo().window(parentID);
        String textTwo = driver.findElement(By.xpath("//h3[normalize-space()='Opening a new window'][1]")).getText();
        System.out.println(textTwo);
        driver.quit();
    }
}
