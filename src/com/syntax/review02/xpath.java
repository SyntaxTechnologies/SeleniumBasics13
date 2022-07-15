package com.syntax.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        launch the website
        driver.get("https://demo.guru99.com/insurance/v1/register.php");
//        access the text box Surname using absolute xpath
        WebElement surName = driver.findElement(By.xpath("/html/body/div[3]/form/div[2]/div[1]/input"));
        surName.sendKeys("sadiq");
//        access the textbox firstname using xpath
        WebElement firstName = driver.findElement(By.xpath("//input[@id='user_firstname']"));
        firstName.sendKeys("moazzam");

//        access the webelement date of birth and print the text on console
        WebElement dateOfBirth = driver.findElement(By.xpath("//label[text()='Date of Birth']"));
        System.out.println(dateOfBirth.getText());

//        acces the webElement lisence period and print on the console
        WebElement lisence = driver.findElement(By.xpath("//label[contains (text(),'Licence Period')]"));
        System.out.println(lisence.getText());


//        access the WebElement radio button and click on it
        WebElement radioBtn = driver.findElement(By.xpath("//label[text()='Full']/following-sibling::input"));
        radioBtn.click();

//        acces the textbox phone number and send in the number
        WebElement phoneNumb = driver.findElement(By.cssSelector("input#user_phone"));
        phoneNumb.sendKeys("+923457307222222");

//   acces the webelement address and send in the address
        WebElement address = driver.findElement(By.cssSelector("input[id*='attributes_street']"));
        address.sendKeys("paksitan");

    }

}
