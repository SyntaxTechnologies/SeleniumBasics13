package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver"); // setting the property to use chromedriver
                                                        // for windows users add extension .exe
        WebDriver driver = new ChromeDriver(); // launch the browser
        driver.get("http://www.google.com");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}
