package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvancedWindowHandling {

    public static String url = "https://syntaxprojects.com/window-popup-modal-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle = driver.getWindowHandle();

        WebElement igButton = driver.findElement(By.linkText("Follow On Instagram"));
        WebElement fbButton = driver.findElement(By.linkText("Like us On Facebook"));
        WebElement igAndFbButton = driver.findElement(By.linkText("Follow Instagram & Facebook"));

        igButton.click();
        fbButton.click();
        igAndFbButton.click();

        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        Iterator<String> it = allWindowHandles.iterator();
        while(it.hasNext()) { // start iterating through the handles (tabs)
            String handle = it.next(); // get one handle (tab)
            if(!mainPageHandle.equals(handle)) { // set a condition where main page is not equal to the handle
                driver.switchTo().window(handle);// switch to that specific handle
                //driver.manage().window().maximize();
                String title = driver.getTitle(); // get the title
                System.out.println(title);
                driver.close(); // close the tab
            }
        }
        driver.switchTo().window(mainPageHandle);
        igButton.click();
    }
}
