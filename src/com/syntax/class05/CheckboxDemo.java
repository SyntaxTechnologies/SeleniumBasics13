package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckboxDemo {

    public static String url = "https://www.syntaxprojects.com/basic-checkbox-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        List<WebElement> optionCheckboxes = driver.findElements(By.xpath("//input[@class = 'cb1-element']"));
        int size = optionCheckboxes.size();
        System.out.println(size);

        for(WebElement option: optionCheckboxes) {
            String checkBoxValue = option.getAttribute("value");
            if(checkBoxValue.equals("Option-2")) {
                option.click();
                break;
            }
        }
    }
}
