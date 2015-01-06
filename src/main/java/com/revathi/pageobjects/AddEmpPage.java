package com.revathi.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by ACER on 1/6/2015.
 */
public class AddEmpPage extends BaseClassPage {

    public AddEmpPage(WebDriver driver)
    {
        super(driver);
    }

    public String addEmpDetails(String fname,String lname,String uname,String upassword){
        String empid;
        driver.findElement(By.id("firstName")).sendKeys(fname);
        driver.findElement(By.id("lastName")).sendKeys(lname);
        driver.findElement(By.id("chkLogin")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("user_name")).sendKeys(uname);
        driver.findElement(By.id("user_password")).sendKeys(upassword);
        driver.findElement(By.id("re_password")).sendKeys(upassword);
        Utils.selectFromDropDown(By.id("location"),"ASC_London");
        driver.findElement(By.id("btnSave")).click();
        empid = driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value"); //Get the emp id
        System.out.println("Emp id is"+empid);

        return empid;
    }

}
