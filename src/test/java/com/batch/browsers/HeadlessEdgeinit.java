package com.batch.browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HeadlessEdgeinit {

        WebDriver driver;

        @BeforeSuite
        public void StartEdgeBrowser() {
            WebDriverManager.edgedriver().setup();
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--headless=new");

            driver = new EdgeDriver(options);
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



