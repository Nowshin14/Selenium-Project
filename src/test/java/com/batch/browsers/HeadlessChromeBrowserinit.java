package com.batch.browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HeadlessChromeBrowserinit {
    WebDriver driver;

    @BeforeSuite
    public void StartChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");

        driver = new ChromeDriver(options);
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
