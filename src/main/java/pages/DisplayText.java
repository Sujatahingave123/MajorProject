package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

public class DisplayText extends WebTestBase {
    @FindBy(id="delayedText")
    WebElement textDelayed;
    @FindBy(xpath="//div[@id='deletesuccess']")
    WebElement textDisappear;
    @FindBy(id="alert2")
    WebElement clkAfterTextDisappears;

    public DisplayText(){
        PageFactory.initElements(driver, this);
    }

    public void textIsDisplayOrNot(){
        Utility.scrollDownByElement(textDelayed);
        System.out.println(textDelayed.isDisplayed());
        System.out.println(textDisappear.isDisplayed());
        clkAfterTextDisappears.click();
        Utility.alertHandlingElement();
        Utility.waitUntilElementToBeClick(driver,clkAfterTextDisappears);
        System.out.println(textDisappear.isDisplayed());
        System.out.println(textDelayed.isDisplayed());


    }
}
