package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAndDeleteUserWithWebElement
{
    private static WebDriver oBrowser=null;
    private static ActiTimePage oPage=null;
    public static void main(String[] args)
    {
        launchBrowser();
        navigateURL();
        login();
        minimizeFlyOutWindow();
        users();
        createUser();
        createUserConfirm();
        getSelectUser();
        getDeleteUser();
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
    private static  void users()
    {
        try
        {
            oPage.getUsers().click();
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static  void createUser()
    {
        try
        {
            oPage.getCreateUser().click();
            Thread.sleep(2000);
            oPage.getFirstName().sendKeys("User1013");
            oPage.getLastName().sendKeys("Demo");
            oPage.getEmail1().sendKeys("demo1013@gss.com");
            oPage.getUsrname().sendKeys("demoUser1013");
            oPage.getpassword().sendKeys("Pwd123");
            Thread.sleep(2000);
            oPage.getpasswordcopy().sendKeys("Pwd123");
            Thread.sleep(2000);
            //oPage.getCreateUserConfirm().click();
            //Thread.sleep(2000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static  void createUserConfirm()
    {
        try
        {
            oPage.getCreateUserConfirm().click();
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static  void getSelectUser()
    {
        try
        {
            oPage.getSelectUser().click();
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static  void getDeleteUser()
    {
        try
        {
            oPage.getDeleteUser().click();
            Thread.sleep(2000);
            Alert oAlert=oBrowser.switchTo().alert();
            String content=oAlert.getText();
            System.out.println(content);
            oAlert.accept();
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

