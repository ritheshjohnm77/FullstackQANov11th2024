package com.sgtesting.tests.WebElementSenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo
{
    private static WebDriver oBrowser=null;
    private static ActiTimePage oPage=null;
    public static void main(String[] args)
    {
        launchBrowser();
        navigateURL();
        login();
        minimizeFlyOutWindow();
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

