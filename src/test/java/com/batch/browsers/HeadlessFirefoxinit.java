package com.batch.browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HeadlessFirefoxinit {
    WebDriver driver;

    @BeforeSuite
    public void StartFirefoxBrowser() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless=new");

        driver = new FirefoxDriver(options);
        driver.manage().window().maximize();

    }

    @Test
    public void OpenURL() throws InterruptedException {
        driver.get("https://www.daraz.com.bd/#?");
        Thread.sleep(15000);
        System.out.println(driver.getTitle());

    }

    @AfterSuite
    public void CloseBrowser() {
        driver.close();

    }

}
