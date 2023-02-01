package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

public class SelectionPage extends WebTestBase {
    @FindBy(id="dte")
    WebElement radioBtn;

    @FindBy(xpath="//button[text()='Check this']")
    WebElement buttonclk;

    public SelectionPage(){ PageFactory.initElements(driver,this); }

    public void enableAndDisable(){
        Utility.scrollDownByPixel();
        Utility.waitUntilElementToBeClick(driver,buttonclk);
        System.out.println(radioBtn.isSelected());  //false
        radioBtn.click();
        System.out.println(buttonclk.isEnabled());  //true
        buttonclk.click();
        Utility.waitUntilElementToBeClick(driver,radioBtn);
        System.out.println(radioBtn.isEnabled());   //true
        radioBtn.click();
    }
}
