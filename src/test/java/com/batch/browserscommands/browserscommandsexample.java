package com.batch.browserscommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class browserscommandsexample {

    String url = " https://www.daraz.com.bd/";
    WebDriver driver;

    @BeforeSuite
    public void StartChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void getCurrentUrl() {
        driver.get(url);
        String currentURL= driver.getCurrentUrl();
        System.out.println(currentURL);
        if(url.equals(currentURL)){
            System.out.println("Current URL is same as mentioned URL ");
        }
        else{
            System.out.println("Current URL is not same as mentioned URL");
        }
    }


}
