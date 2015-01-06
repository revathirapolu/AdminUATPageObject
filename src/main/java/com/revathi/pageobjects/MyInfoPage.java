package com.revathi.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class MyInfoPage extends BaseClassPage {

    public MyInfoPage(WebDriver driver){
        super(driver);
    }

    public void clickOnJobHistory(){
        driver.findElement(By.linkText("Job History")).click();
    }

    public void empCheckLoginDetails(){
        Select sel=new Select(driver.findElement(By.id("job_job_title")));
        String jobTitleOption = sel.getFirstSelectedOption().getText();
        Assert.assertEquals(jobTitleOption, "Automation Tester");
        Select sel1=new Select(driver.findElement(By.id("job_emp_status")));
        String jobStatusOption = sel1.getFirstSelectedOption().getText();
        Assert.assertEquals(jobStatusOption,"Probation");
    }

    public void empCheckChangeDetails(){
        Select sel= new Select(driver.findElement(By.id("job_emp_status")));
        String jobStatusOption = sel.getFirstSelectedOption().getText();
        Assert.assertEquals(jobStatusOption,"Permanent");
    }
}
