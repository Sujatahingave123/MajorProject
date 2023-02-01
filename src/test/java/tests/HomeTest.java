package tests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;


public class HomeTest extends WebTestBase{
    AlertPage alertPage;
    SelectionPage selectionPage;
    DropDownPage  dropDownPage;
    DisplayText displayText;
    LoginPage loginPage;
    MouseHover mouseHover;
    WindowHandlePage windowHandlePage;
    CookiePage cookiePage;

    public HomeTest(){
        super();
    }

    @BeforeMethod
    public void beforeMethod(){
        intialization();
        alertPage = new AlertPage();
        selectionPage = new SelectionPage();
        dropDownPage = new DropDownPage();
        displayText = new DisplayText();
        loginPage = new LoginPage();
        mouseHover = new MouseHover();
        windowHandlePage = new WindowHandlePage();
        cookiePage = new CookiePage();
    }

    @Test
    public void verifyCookiePage() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        cookiePage.cookiesPageHandling();
        softAssert.assertAll();
    }

    @Test
    public void verifyAlertPage(){
        SoftAssert softAssert = new SoftAssert();
        alertPage.alertBtnClk();
        softAssert.assertAll();
    }
    @Test
    public void verifyingEnableAndDisable(){
        SoftAssert softAssert= new SoftAssert();
        selectionPage.enableAndDisable();
        softAssert.assertAll();
    }

    @Test
    public void verifyDropDownOpt(){
        SoftAssert softAssert= new SoftAssert();
        dropDownPage.dropdown();
        softAssert.assertAll();
    }

    @Test
    public void verifyingTextIsDisplayOrNot(){
        SoftAssert softAssert= new SoftAssert();
        displayText.textIsDisplayOrNot();
        softAssert.assertAll();
    }
    @Test
    public void verifyingLoginPageWithValidCredentials(){
        SoftAssert softAssert= new SoftAssert();
        loginPage.clkOnTestLink();
        loginPage.homeTextLinkClk();
        loginPage.loginVeification(prop.getProperty("UserId"),prop.getProperty("Password"),prop.getProperty("First_Name"),prop.getProperty("Last_Name"));
        loginPage.loginBtnClk();
        softAssert.assertAll();
    }

    @Test
    public void verifyBlogViaMouseHovering(){
        SoftAssert softAssert = new SoftAssert();
        mouseHover.blogMouseHover();
        softAssert.assertAll();
    }

    @Test
    public void verifyWindowsHandle(){
        SoftAssert softAssert = new SoftAssert();
        windowHandlePage.seleniumClk();
        windowHandlePage.handleWindows();
        softAssert.assertAll();
    }


@AfterMethod
public void afterMethod(){
    driver.close();
}

}
