package com.automation;

import java.io.IOException;

import java.net.*;

import java.util.List;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.asserts.SoftAssert;


public class BrokenLinks {


    public static void main(String[] args) throws MalformedURLException, IOException, URISyntaxException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));

        SoftAssert a = new SoftAssert();

        for (WebElement link : links) {
            String url = link.getAttribute("href");

            HttpURLConnection conn = (HttpURLConnection) new URI(url).toURL().openConnection();
            conn.setRequestMethod("HEAD");

            conn.connect();

            int respCode = conn.getResponseCode();

            System.out.println(respCode);

            a.assertTrue(respCode < 400, "The link with Text" + link.getText() + " is broken with code" + respCode);

        }

        a.assertAll();

    }


    private static Object getReturnCode(WebElement link) {
        return null;
    }
}