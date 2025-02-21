package com.sgtesting.tests.TestSelenium;

import com.sgtesting.tests.WebElementSenarios.ActiTimePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadResumeToGowrisoft
{
    private static WebDriver oBrowser = null;
    private static ActiTimePage oPage = null;
    public static void main(String[] args)
    {
        launchBrowser();
        navigateURL();
        careerLogin();
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
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void navigateURL()
    {
        try
        {
            oBrowser.navigate().to("http://www.gowrisoftsolutions.com/careers.html");
            Thread.sleep(2000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void careerLogin()
    {
        try
        {
            oPage.clickOnProfname().sendKeys("Rithesh John M");
            Thread.sleep(2000);
            oPage.clickOnProfemail().sendKeys("ritheshjohnm77@gmail.com");
            Thread.sleep(2000);
            oPage.clickOnProfphone().sendKeys("7899533725");
            Thread.sleep(2000);
            oPage.clickOnProfmessage().sendKeys("Hi this is Rithesh here");
            Thread.sleep(2000);
            oPage.clickOnBrowseButton().sendKeys("B:\\Rithesh\\SG-Software\\SampleAutomation\\John\\Harsha.doc");
            Thread.sleep(2000);
            oPage.clickOnSubmit().click();
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
