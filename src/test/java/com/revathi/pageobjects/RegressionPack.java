package com.revathi.pageobjects;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class RegressionPack extends BaseTest {

    String adminUsername="admin", adminPassword="Insoft12";

    String empUname="rmuppidi"+Utils.generateRandomNo();
    String empPassword="qwerty12";
    String empFname="Revathi",empLname="Muppidi";
    String empid;

    public RegressionPack(){
        super();
    }

    protected RegressionPack(WebDriver driver) {
        super(driver);
    }

    @Test
    public void empCompletesProbation(){
        LoginPage loginPage=new LoginPage(driver);
        DashboardPage dashboardPage =new DashboardPage(driver);
        PIMPage pimPage=new PIMPage(driver);
        AddEmpPage addEmpPage=new AddEmpPage(driver);
        EmployeeListPage employeeListPage=new EmployeeListPage(driver);
        MyInfoPage myInfoPage=new MyInfoPage(driver);
        loginPage.login(adminUsername,adminPassword); //login as Admin
        Assert.assertTrue(Utils.isTextPresent("Welcome Admin")); //Checkpoint for Admin Login
        dashboardPage.navigateToPIM();
        pimPage.clickOnAddEmp(); //Clicking on Add employee
        empid = addEmpPage.addEmpDetails(empFname,empLname,empUname,empPassword);
        employeeListPage.clickJobHistory();
        employeeListPage.addJobDetails();
        employeeListPage.logout();
        loginPage.login(empUname,empPassword); //Login as Employee
        dashboardPage.clickMyInfo();
        myInfoPage.clickOnJobHistory();
        myInfoPage.empCheckLoginDetails();  //Employee check details Probation
        myInfoPage.logout();
        loginPage.login(adminUsername,adminPassword); //login as Admin
        Assert.assertTrue(Utils.isTextPresent("Welcome Admin"));
        dashboardPage.navigateToPIM();
        pimPage.clickOnEmpList();
        employeeListPage.searchEmp(empid);
        employeeListPage.clickJobHistory();
        employeeListPage.editJobDetails();
        employeeListPage.logout();
        loginPage.login(empUname,empPassword); //Login as Employee
        dashboardPage.clickMyInfo();
        myInfoPage.clickOnJobHistory();
        myInfoPage.empCheckChangeDetails();
        myInfoPage.logout();

    }

}
