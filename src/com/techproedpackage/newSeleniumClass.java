package com.techproedpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class newSeleniumClass {
    public static void main(String[] args) {
        //setup your drivers for selenium
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fatma\\OneDrive\\Documents\\Selenium Dependencies\\drivers\\chromedriver_win32\\chromedriver.exe");

        /* create Chrome Driver */
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.cnn.com/");

    }
}
