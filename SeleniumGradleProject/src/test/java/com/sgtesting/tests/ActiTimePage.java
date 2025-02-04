package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage
{
    public ActiTimePage(WebDriver oBrowser)
    {
        PageFactory.initElements(oBrowser,this);
    }

    //WebElement for UserName text field
    private WebElement username;
    public WebElement getUsername()
    {
        return username;
    }
    //WebElement for Password text field
    private WebElement pwd;
    public WebElement getPassword()
    {
        return pwd;
    }
    //WebElement for Login Button
    @FindBy(xpath = "//*[@id='loginButton']/div")
    private WebElement oLogin;
    public WebElement getoLogin()
    {
        return oLogin;
    }
    //Webelement for FlyOutWindow
    private WebElement gettingStartedShortcutsPanelId;
    public WebElement getFlyOutWindow()
    {
        return gettingStartedShortcutsPanelId;
    }
    //Webelement for User
    @FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")
    private WebElement users;
    public WebElement getUsers()
    {
        return users;
    }
    //webElements for create user
    @FindBy(xpath="//*[@id=\"createUserDiv\"]/div/div[2]")
    private WebElement createUser;
    public WebElement getCreateUser()
    {
        return createUser;
    }
    //WebElement for FirstName text field
    private WebElement firstName;
    public WebElement getFirstName()
    {
        return firstName;
    }
    private WebElement lastName;
    public WebElement getLastName()
    {
        return lastName;
    }
    private WebElement email;
    public WebElement getEmail1()
    {
        return email;
    }
    @FindBy(xpath="//*[@id='userDataLightBox_usernameField']")
    private WebElement usrname;
    public WebElement getUsrname ()
    {
        return usrname;
    }
    //webelement for password
    private WebElement password;
    public WebElement getpassword()
    {
        return password;
    }

    //webelement for passwordcopy
    private WebElement passwordCopy;
    public WebElement getpasswordcopy()
    {
        return passwordCopy;
    }

    //webElements for create user
    @FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div")
    private WebElement createUserConfirm;
    public WebElement getCreateUserConfirm()
    {
        return createUserConfirm;
    }

    //WebElement For ModifyUser
    @FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
    private WebElement saveChanges;
    public WebElement getSaveChanges()
    {
        return saveChanges;
    }

    //WebElement for Select User
    @FindBy(xpath="//span[normalize-space()='Demo, User1013']")
    private WebElement selectUser;
    public WebElement getSelectUser()
    {
        return selectUser;
    }

    //WebElement for Select User again
    @FindBy(xpath="//span[@class='userNameSpan'][normalize-space()='Demo5, User1015']")
    private WebElement selectUseragain;
    public WebElement getSelectUseragain()
    {
        return selectUseragain;
    }

    //webElements for Delete user
    @FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
    private WebElement clickOnDeleteUser;
    public WebElement getDeleteUser()
    {
        return clickOnDeleteUser;
    }

    //WebElement for Logout Link
    @FindBy(linkText="Logout")
    private WebElement oLogout;
    public WebElement getoLogout()
    {
        return oLogout;
    }
}
