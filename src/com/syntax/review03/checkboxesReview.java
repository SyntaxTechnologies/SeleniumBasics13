package com.syntax.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class checkboxesReview {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        launch the website
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
//        select purple colour

//        get all the checkboxes in a list
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@name='color']"));

//   loop through

        for(WebElement checkbox:checkboxes){
            String color = checkbox.getAttribute("value");
//            make a selection if the color is purple
            if(color.equalsIgnoreCase("purple")){
                checkbox.click();
            }

        }



    }
}
