package pages;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.ActionStuff;

import static testbase.WebTestBase.driver;

public class CookiePage extends WebTestBase {
    public CookiePage(){
        PageFactory.initElements(driver,this);
    }

public void cookiesPageHandling() throws InterruptedException {
    ActionStuff.Cookies();
}
}
