package com.revathi.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;


public class Utils extends BaseClassPage{

    public Utils(WebDriver driver){
        super(driver);
    }
    public static int generateRandomNo(){
    Random random1=new Random();
    int randomNumber=random1.nextInt();
    return randomNumber;
    }
    public static boolean isTextPresent(String text){
        System.out.println("text = [" + text + "]");
        System.out.println("text = [" + text + "]");
        return driver.findElement(By.tagName("body")).getText().contains(text);
    }

    public static void selectFromDropDown(By by,String text){
        Select sel= new Select(driver.findElement(by));
        sel.selectByVisibleText(text);
    }
}
