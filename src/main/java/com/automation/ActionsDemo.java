package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsDemo {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.amazon.pl/");
        //<input id="sp-cc-accept" name="action" aria-label="Akceptuj" class="a-button-input" type="submit" value="Akceptuj">
        driver.findElement(By.id("sp-cc-accept")).click();
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"))).build().perform();
        driver.quit();


    }
}
