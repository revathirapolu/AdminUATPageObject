package com.revathi.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class EmployeeListPage extends BaseClassPage {

    public EmployeeListPage(WebDriver driver){
        super(driver);
    }

    public void searchEmp(String empid){
        driver.findElement(By.id("empsearch_id")).sendKeys(empid);
        driver.findElement(By.id("searchBtn")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.linkText(empid)).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void clickJobHistory(){
        driver.findElement(By.linkText("Job History")).click();
        driver.findElement(By.id("btnSave")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void addJobDetails(){

        // new Select(driver.findElement(By.id("job_job_title"))).selectByVisibleText("Automation Tester");
        Utils.selectFromDropDown(By.id("job_job_title"),"Automation Tester");
        // new Select(driver.findElement(By.id("job_emp_status"))).selectByVisibleText("Probation");
        Utils.selectFromDropDown(By.id("job_emp_status"),"Probation");
        //  new Select(driver.findElement(By.id("job_eeo_category"))).selectByVisibleText("IT Worker");
        Utils.selectFromDropDown(By.id("job_eeo_category"),"IT Worker");
        driver.findElement(By.id("job_effective_date")).clear();
        driver.findElement(By.id("job_effective_date")).sendKeys("2014-06-01");
        driver.findElement(By.id("btnSave")).click();
    }
    public void editJobDetails(){
        //new Select(driver.findElement(By.id("job_emp_status"))).selectByVisibleText("Permanent");
        Utils.selectFromDropDown(By.id("job_emp_status"),"Permanent");
        driver.findElement(By.id("job_comment")).sendKeys("Employee made permanent");
        driver.findElement(By.id("btnSave")).click();

    }
}
