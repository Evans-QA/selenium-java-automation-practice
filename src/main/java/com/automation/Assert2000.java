package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert2000 {

    @Test

    public void AssertionTest() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://pl.wikipedia.org/wiki/2000");

        String title = driver.getTitle();

        String expectedValue = "2000";

        Assert.assertTrue(title.contains(expectedValue), ("Test failed. Title does not contain"));
    }


}

