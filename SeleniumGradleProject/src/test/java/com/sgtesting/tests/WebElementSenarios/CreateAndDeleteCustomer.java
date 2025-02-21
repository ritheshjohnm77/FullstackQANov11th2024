package com.sgtesting.tests.WebElementSenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCustomer
{
    private static WebDriver oBrowser=null;
    private static ActiTimePage oPage=null;
    public static void main(String[] args)
    {
        launchBrowser();
        navigateURL();
        login();
        minimizeFlyOutWindow();
        addNewCustomer();
        deleteCustomer();
        logout();
        closeApplication();
    }
    private static void launchBrowser()
    {
        try
        {
            oBrowser = new ChromeDriver();
            oPage = new ActiTimePage(oBrowser);
            oBrowser.manage().window().maximize();
            Thread.sleep(2000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void navigateURL()
    {
        try
        {
            oBrowser.navigate().to("http://localhost:81/login.do");
            Thread.sleep(3000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static  void login()
    {
        try
        {
            oPage.getUsername().sendKeys("admin");
            oPage.getPassword().sendKeys("manager");
            oPage.getoLogin().click();
            Thread.sleep(5000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static  void minimizeFlyOutWindow()
    {
        try
        {
            oPage.getFlyOutWindow().click();
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static  void addNewCustomer()
    {
        try
        {
            oPage.getClickOnTask().click();
            Thread.sleep(2000);
            oPage.getClickOnAddNewCustomer().click();
            Thread.sleep(2000);
            oPage.getClickOnNewCustomer().click();
            Thread.sleep(2000);
            oPage.enterCustomerName().sendKeys("John");
            Thread.sleep(2000);
            oPage.enterInDescriptionField().click();
            Thread.sleep(2000);
            oPage.enterInDescriptionField().sendKeys("Hi This is Rithesh here..!!");
            Thread.sleep(2000);
            oPage.getClickOnCreateCustomer().click();
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static  void deleteCustomer()
    {
        try
        {
            oPage.clickOnCustomerToDelete().click();
            Thread.sleep(2000);
            oPage.getClickOnActions().click();
            Thread.sleep(2000);
            oPage.getClickOnDelete().click();
            Thread.sleep(2000);
            oPage.getConfirmDelete().click();
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static  void logout()
    {
        try
        {
            oPage.getoLogout().click();
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void closeApplication()
    {
        try
        {
            oBrowser.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
