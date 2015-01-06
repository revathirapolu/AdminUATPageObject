package com.revathi.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BaseClassPage {

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void login(String username,String password)
    {
        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
        driver.findElement(By.id("btnLogin")).click();
    }
    public void forgotPassword(){

    }

}
