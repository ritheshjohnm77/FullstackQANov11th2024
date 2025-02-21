package com.sgtesting.tests.TestSelenium;

import com.sgtesting.tests.WebElementSenarios.ActiTimePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class NavigateToTomcat
{
    private static WebDriver oBrowser=null;
    private static ActiTimePage oPage=null;
    public static void main(String[] args)
    {
        launchBrowser();
        navigateURL();
        relativeCSSUsingTagNameWithAttributeName();
    }
    private static void launchBrowser()
    {
        try
        {
            oBrowser = new FirefoxDriver();
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
            oBrowser.navigate().to("https://tomcat.apache.org/");
            Thread.sleep(2000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void relativeCSSUsingTagNameWithAttributeName()
    {
        // display Number of div tags in the tomcat
        List<WebElement> oLinks=oBrowser.findElements(By.cssSelector("div"));
        System.out.println("Number of div tags in Application:"+oLinks.size());
    }
}
