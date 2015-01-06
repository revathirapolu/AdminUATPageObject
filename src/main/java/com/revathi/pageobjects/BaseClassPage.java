package com.revathi.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object Model, Base page.
 */

public class BaseClassPage {
protected static WebDriver driver;
    public BaseClassPage() {

    }

    public BaseClassPage(WebDriver driver){
        this.driver=driver;
      }

    //Logout
    public void logout()
    {
        driver.findElement(By.id("welcome")).click();
        driver.findElement(By.linkText("Logout")).click();
    }

}
