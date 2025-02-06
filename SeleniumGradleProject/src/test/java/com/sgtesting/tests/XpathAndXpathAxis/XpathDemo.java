package com.sgtesting.tests.XpathAndXpathAxis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo
{
    private static WebDriver oDriver=null;
    public static void main(String[] args)
    {
        launchBrowser();
        navigatURL();
        //absoluteXPath();
        relativeXpathUsingTagName();
        //logout();
        //closeApplication();
    }
    private static void launchBrowser()
    {
        try
        {
            oDriver=new ChromeDriver();
            oDriver.manage().window().maximize();
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void navigatURL()
    {
        try
        {
            oDriver.get("B:\\Rithesh\\HTMLWorkspace\\HTML\\Sample.html");
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void absoluteXPath()
    {
        try
        {
            oDriver.findElement(By.xpath("/html/body/div/form/input")).sendKeys("DemoUser1");
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    /*
     *Case 1: Identify the element using tagName alone
     * syntax://<tagName>
     */
    private static void relativeXpathUsingTagName()
    {
        oDriver.findElement(By.xpath("//input")).sendKeys("DemoUser1");
    }
    private static  void logout()
    {
        try
        {
            oDriver.findElement(By.linkText("Logout")).click();
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
            oDriver.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
