package com.sgtesting.tests.TestSelenium;

import com.sgtesting.tests.WebElementSenarios.ActiTimePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SGsoftLoginLogout
{
    private static WebDriver oBrowser=null;
    private static ActiTimePage oPage=null;

    public static void main(String[] args)
    {
        launchBrowser();
        navigateURL();
        sgLogin();
        sgLogout();
        closeApplication();
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
            oBrowser.navigate().to("http://www.sgtestinginstitute.com/");
            Thread.sleep(2000);
            oPage.clickContinue().click();
            Thread.sleep(2000);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void sgLogin()
    {
        try
        {
            oPage.clickOnLogin().click();
            Thread.sleep(2000);
            oPage.enterSgEmail().sendKeys("patilbhavanasp@gmail.com");
            Thread.sleep(2000);
            oPage.enterSgPassword().sendKeys("sWa@123bha");
            Thread.sleep(2000);
            oPage.clickOnSGLogin().click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void sgLogout()
    {
        try
        {
            oPage.selectOnLogout().click();
            Thread.sleep(2000);
            oPage.clickOnLogout().click();
            Thread.sleep(2000);
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
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
