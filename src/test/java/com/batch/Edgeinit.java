
package com.batch;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Edgeinit {

    WebDriver driver;

    @BeforeSuite
    public void StartEdgeBrowser() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
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

