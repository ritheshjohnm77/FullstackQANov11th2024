package com.sgtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser
{
    public static WebDriver oBrowser=null;
    public static void main(String[] args)
    {
        launchBrowser();
        navigateURL();
        closeApplication();
    }
    private static void launchBrowser()
    {
        try
        {
            oBrowser = new FirefoxDriver();
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
            oBrowser.get("http://localhost:81/login.do");
            Thread.sleep(4000);
        }
        catch (Exception e)
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
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
