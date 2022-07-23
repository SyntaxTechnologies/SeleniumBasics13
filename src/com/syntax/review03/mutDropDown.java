package com.syntax.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mutDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");

//        to check if the drop down is multiselect or not
        WebElement mulDD = driver.findElement(By.xpath("//select[@id='cars']"));

        Select select =new Select(mulDD);
        boolean isMultiselect = select.isMultiple();
        System.out.println("the dropdown is multSelect :"+isMultiselect);

        select.selectByIndex(0);

        select.selectByVisibleText("Opel");

        select.selectByValue("saab");
        Thread.sleep(2000);
//        deselection
        select.deselectByVisibleText("Opel");
        Thread.sleep(2000);
        select.deselectAll();



    }
}
