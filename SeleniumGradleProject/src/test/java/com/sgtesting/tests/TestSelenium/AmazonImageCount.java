package com.sgtesting.tests.TestSelenium;

import com.sgtesting.tests.WebElementSenarios.ActiTimePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class AmazonImageCount
{
        private static WebDriver oBrowser = null;
        private static ActiTimePage oPage = null;

        public static void main(String[] args)
        {
            launchBrowser();
            navigateURL();
            relativeCSSUsingTagNameWithAttributeName();
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
                oBrowser.navigate().to("https://www.amazon.in/s?k=smart+phones&crid=28UY015KTSYLN&sprefix=smart+phones%2Caps%2C2453&ref=nb_sb_ss_ts-doa-p_2_12");
                Thread.sleep(2000);
                oPage.clickamazonContinue().click();
                Thread.sleep(2000);
               //oPage.enterSmartPhone().click();
                //Thread.sleep(2000);
                //oPage.enterSmartPhone().sendKeys("smartphones");
                //Thread.sleep(2000);
                //oPage.clickOnSearch();
                //Thread.sleep(2000);
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        private static void relativeCSSUsingTagNameWithAttributeName()
        {
            // display Number of images in the Amazon Website
            List<WebElement> oLinks=oBrowser.findElements(By.cssSelector("img"));
            System.out.println("Number of SmartPhone images count in Amazon:"+oLinks.size());
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

