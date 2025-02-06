package com.sgtesting.tests.Assaignments1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedSenario1
{
    private static WebDriver oBrowser=null;
    public static void main(String[] args)
    {
        launchBrowser();
        navigateURL();
        login();
        createUser1();
        createUser2();
        createUser3();
        logout();
        loginUser1();
        logoutUser1();
        loginUser2();
        logoutUser2();
        loginUser3();
        logoutUser3();
        loginAsAdmin();
        modifyUser1Password();
        modifyUser2Password();
        modifyUser3Password();
        logoutAsAdmin();
        loginAsUser1();
        logoutAsUser1();
        loginAsUser2();
        logoutAsUser2();
        loginAsUser3();
        logoutAsUser3();
        loginAsAdminAgain();
        deleteUser1();
        deleteUser2();
        deleteUser3();
        logoutAsAdminAgain();
        closeApplication();
    }
    private static void launchBrowser()
    {
        try
        {
            oBrowser=new ChromeDriver();
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
    private static void login()
    {
        try
        {
            oBrowser.findElement(By.id("username")).sendKeys("admin");
            oBrowser.findElement(By.name("pwd")).sendKeys("manager");
            oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
            Thread.sleep(4000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void createUser1()
    {
        try
        {
            oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.name("firstName")).sendKeys("demo1");
            oBrowser.findElement(By.name("lastName")).sendKeys("User1");
            oBrowser.findElement(By.name("email")).sendKeys("demo1@gss.com");
            oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
            oBrowser.findElement(By.name("password")).sendKeys("Hassan123");
            oBrowser.findElement(By.name("passwordCopy")).sendKeys("Hassan123");
            oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
            Thread.sleep(5000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void createUser2()
    {
        try
        {
            oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.name("firstName")).sendKeys("demo2");
            oBrowser.findElement(By.name("lastName")).sendKeys("User2");
            oBrowser.findElement(By.name("email")).sendKeys("demo@gss.com");
            oBrowser.findElement(By.name("username")).sendKeys("demoUser2");
            oBrowser.findElement(By.name("password")).sendKeys("Hassan1234");
            oBrowser.findElement(By.name("passwordCopy")).sendKeys("Hassan1234");
            oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
            Thread.sleep(5000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void createUser3()
    {
        try
        {
            oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.name("firstName")).sendKeys("demo3");
            oBrowser.findElement(By.name("lastName")).sendKeys("User3");
            oBrowser.findElement(By.name("email")).sendKeys("demo@gss.com");
            oBrowser.findElement(By.name("username")).sendKeys("demoUser3");
            oBrowser.findElement(By.name("password")).sendKeys("Hassan12345");
            oBrowser.findElement(By.name("passwordCopy")).sendKeys("Hassan12345");
            oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
            Thread.sleep(5000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void logout()
    {
        try
        {
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void loginUser1()
    {
        try
        {
            oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
            oBrowser.findElement(By.name("pwd")).sendKeys("Hassan123");
            oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
            Thread.sleep(4000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void logoutUser1()
    {
        try
        {
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void loginUser2()
    {
        try
        {
            oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
            oBrowser.findElement(By.name("pwd")).sendKeys("Hassan1234");
            oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
            Thread.sleep(4000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void logoutUser2()
    {
        try
        {
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void loginUser3()
    {
        try
        {
            oBrowser.findElement(By.id("username")).sendKeys("demoUser3");
            oBrowser.findElement(By.name("pwd")).sendKeys("Hassan12345");
            oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
            Thread.sleep(4000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void logoutUser3()
    {
        try
        {
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void loginAsAdmin()
    {
        try
        {
            oBrowser.findElement(By.id("username")).sendKeys("admin");
            oBrowser.findElement(By.name("pwd")).sendKeys("manager");
            oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
            Thread.sleep(4000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void modifyUser1Password()
    {
        try
        {
            oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.name("firstName")).sendKeys("demo1");
            oBrowser.findElement(By.name("lastName")).sendKeys("User1");
            oBrowser.findElement(By.name("email")).sendKeys("demo1@gss.com");
            oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
            oBrowser.findElement(By.name("password")).sendKeys("Hassan@123");
            oBrowser.findElement(By.name("passwordCopy")).sendKeys("Hassan@123");
            oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
            Thread.sleep(5000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void modifyUser2Password()
    {
        try
        {
            oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.name("firstName")).sendKeys("demo2");
            oBrowser.findElement(By.name("lastName")).sendKeys("User2");
            oBrowser.findElement(By.name("email")).sendKeys("demo@gss.com");
            oBrowser.findElement(By.name("username")).sendKeys("demoUser2");
            oBrowser.findElement(By.name("password")).sendKeys("Hassan@1234");
            oBrowser.findElement(By.name("passwordCopy")).sendKeys("Hassan@1234");
            oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
            Thread.sleep(5000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void modifyUser3Password()
    {
        try
        {
            oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.name("firstName")).sendKeys("demo3");
            oBrowser.findElement(By.name("lastName")).sendKeys("User3");
            oBrowser.findElement(By.name("email")).sendKeys("demo@gss.com");
            oBrowser.findElement(By.name("username")).sendKeys("demoUser3");
            oBrowser.findElement(By.name("password")).sendKeys("Hassan@12345");
            oBrowser.findElement(By.name("passwordCopy")).sendKeys("Hassan@12345");
            oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
            Thread.sleep(5000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void logoutAsAdmin()
    {
        try
        {
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void loginAsUser1()
    {
        try
        {
            oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
            oBrowser.findElement(By.name("pwd")).sendKeys("Hassan@123");
            oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
            Thread.sleep(4000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void logoutAsUser1()
    {
        try
        {
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void loginAsUser2()
    {
        try
        {
            oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
            oBrowser.findElement(By.name("pwd")).sendKeys("Hassan@1234");
            oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
            Thread.sleep(4000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void logoutAsUser2()
    {
        try
        {
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void loginAsUser3()
    {
        try
        {
            oBrowser.findElement(By.id("username")).sendKeys("demoUser3");
            oBrowser.findElement(By.name("pwd")).sendKeys("Hassan@12345");
            oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
            Thread.sleep(4000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void logoutAsUser3()
    {
        try
        {
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void loginAsAdminAgain()
    {
        try
        {
            oBrowser.findElement(By.id("username")).sendKeys("admin");
            oBrowser.findElement(By.name("pwd")).sendKeys("manager");
            oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
            Thread.sleep(4000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void deleteUser1()
    {
        try
        {
            oBrowser.findElement(By.xpath("//span[text()='User1, demo']")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
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
    private static void deleteUser2()
    {
        try
        {
            oBrowser.findElement(By.xpath("//span[text()='User2, demo']")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
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
    private static void deleteUser3()
    {
        try
        {
            oBrowser.findElement(By.xpath("//span[text()='User3, demo']")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
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
    private static void logoutAsAdminAgain()
    {
        try
        {
            oBrowser.findElement(By.linkText("Logout")).click();
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
