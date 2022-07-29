//package com.syntax.class10;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.io.File;
//import java.io.IOException;
//
//public class TakingScreenshots {
//
//    public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
//
//    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.get(url);
//
//        WebElement username = driver.findElement(By.id("ctl00_MainContent_username")); // gettin webelement in return
//        username.sendKeys("Tester"); // performing action on the specific element
//        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
//        password.sendKeys("test");
//        WebElement loginButton = driver.findElement(By.className("button"));
//        loginButton.click();
//
//        //downcasting to driver in order to interact with web page
//        TakesScreenshot ts = (TakesScreenshot)driver;
//        File srcFile = ts.getScreenshotAs(OutputType.FILE); // the screenshot is taken
//
//        try {
//            // copy the file and paste in the new location as png file
//            // commons.io jar file is needed for this
//            FileUtils.copyFile(srcFile, new File("screenshots/SmartBear/adminPage111111.png"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
