package com.syntax.review04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandles {
    public static String url = "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

//        goto gmail.com
//        open up privacy help term tabs
//        goto privacy tab and get the title print it on the screen
//        find all the buttons that open up new windows or tabs
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        WebElement termsBtn = driver.findElement(By.xpath("//a[text()='Terms']"));
//        clicking on the btns
        helpBtn.click();
        privacyBtn.click();
        termsBtn.click();
        String privacyPageHandle=null;
//        get the main page handle and print on the screen
        String mainPagehandle = driver.getWindowHandle();
        System.out.println("The main Page Handle is "+mainPagehandle);

//       MAJOR TASK--> GET THE TITLE FROM PRIVACY TAB
//        1.Get all the window Handles
        Set<String> allHandles = driver.getWindowHandles();

//        2.to iterate create an iterator
                Iterator<String> it =allHandles.iterator();
//        3. the while loop
            while(it.hasNext()) {

//              4.getting the first handle from the set
                String handle = it.next();
//              5.switch to this particular and handle to make sure it is the right one
                driver.switchTo().window(handle);
//              6.make sure that this window is the privacy one
                String title = driver.getTitle();
//              7.make sure the title is that of the privacy page
                if (title.contains("Privacy Policy – Privacy & Terms – Google")) {
                    System.out.println(title);
                    privacyPageHandle = handle;
                    break;
                }


                driver.switchTo().defaultContent();
                driver.switchTo().window(privacyPageHandle);
            }

          }









    }


