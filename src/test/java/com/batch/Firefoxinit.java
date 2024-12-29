package com.batch;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class Firefoxinit {

    WebDriver driver;

    @BeforeSuite
    public void StartFirefoxBrowser() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void OpenURL() throws InterruptedException {
        driver.get("https://www.daraz.com.bd/#?");
        Thread.sleep(15000);

    }

    @AfterSuite
    public void CloseBrowser() {
        driver.close();

    }


}

