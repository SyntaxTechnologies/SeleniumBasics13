package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDocuments {

    public static String url = "http://the-internet.herokuapp.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement fileUploadLink = driver.findElement(By.linkText("File Upload"));
        fileUploadLink.click();

        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        // if file name or folder name contains space, try to have them as separate strings and concatenate
        chooseFile.sendKeys("/Users/Syntax/Desktop/SampleTestData.xlsx");
                                        // windows users might need to use \\
        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.click();
    }
}
