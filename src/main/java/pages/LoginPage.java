package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.WebTestBase;
import utils.Utility;

public class LoginPage  extends WebTestBase {
    @FindBy(xpath = "//a[text()='onlytestingblog']")
    WebElement onlyTestingBlog;

    @FindBy(xpath = "//a[@class='home-link']")
    WebElement  homeClk;

    @FindBy(xpath = "//input[@name='userid']")
    WebElement UserIdTextBox;

    @FindBy(xpath = "//input[@name='pswrd']")
    WebElement PasswordTextBox;

    @FindBy(xpath = "(//input[@value='Cancel']//following::input[@name='fname'])[1]")
    WebElement FirstNameTextBox;


    @FindBy(xpath = "(//input[@name='fname']//following::input[@type='text'])[12]")
    WebElement LastNameTextBox;

    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginBtn;
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public void clkOnTestLink(){
        Utility.scrollDownByElement(onlyTestingBlog);
        onlyTestingBlog.click();
    }
    public void homeTextLinkClk(){
        Utility.scrollDownByElement(homeClk);
        homeClk.click();
    }
    public void loginVeification(String First_Name,String Last_Name,String UserId,String Password){
        Utility.scrollDownByElement(UserIdTextBox);
            UserIdTextBox.sendKeys(UserId);
            PasswordTextBox.sendKeys(Password);
            FirstNameTextBox.sendKeys(First_Name);
            LastNameTextBox.sendKeys(Last_Name);
        }

    public void loginBtnClk(){
        loginBtn.click();
        Utility.alertHandlingElement();
        Utility.alertHandlingElement();
    }





    }


