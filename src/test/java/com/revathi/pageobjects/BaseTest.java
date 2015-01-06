package com.revathi.pageobjects;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest extends BaseClassPage {

    public BaseTest() {
        super();
    }

    protected BaseTest(WebDriver driver){
        super(driver);
    }

    @BeforeClass
    public static void startBrowser(){
        driver = new FirefoxDriver();
        driver.get("http://insoftt.trial47.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void stopBrowser()
    {
        driver.quit();
    }
}
