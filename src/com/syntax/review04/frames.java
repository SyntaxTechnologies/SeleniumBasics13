package com.syntax.review04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frames {
    public static String url = "https://chercher.tech/practice/frames";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
//print the topic on the screen
        driver.switchTo().frame(0);
//        find the desired element topic
        WebElement topic = driver.findElement(By.xpath("//b[@id='topic']"));
//      get the text
        System.out.println( topic.getText());

//        goto the drop down animals and select big Baby cat

//        change focus to default
        driver.switchTo().defaultContent();
//        switch
        driver.switchTo().frame(1);

//        select from dropdown
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));
        Select select=new Select(dropDown);
        select.selectByIndex(2);

//        click the checkBox
//switch to default
        driver.switchTo().defaultContent();
// swtich to iframe 1 using WebElement method
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frame1);
//switch to frame 3 by nameorid
        driver.switchTo().frame("frame3");

        WebElement checkbox = driver.findElement(By.xpath("//input[@id='a']"));
        checkbox.click();

    }
}
