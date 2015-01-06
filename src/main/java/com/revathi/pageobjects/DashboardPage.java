package com.revathi.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DashboardPage extends BaseClassPage{

    public DashboardPage(WebDriver driver){
        super(driver);
    }

    public void navigateToPIM(){
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
    }

    public void clickMyInfo(){
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
    }
}
