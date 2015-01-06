package com.revathi.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class PIMPage extends BaseClassPage {

    public PIMPage(WebDriver driver)
    {
        super(driver);
    }

    public void clickOnAddEmp(){
        driver.findElement(By.id("menu_pim_addEmployee")).click();
    }

    public void clickOnEmpList(){
        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();

    }
}
