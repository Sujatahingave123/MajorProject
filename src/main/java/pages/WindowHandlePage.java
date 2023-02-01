package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

public class WindowHandlePage extends WebTestBase {
    @FindBy(id="selenium143")
    WebElement  Selenium143;


    public WindowHandlePage(){
        PageFactory.initElements(driver,this);
    }

    public void seleniumClk(){
        Selenium143.click();
    }

    public void handleWindows(){
        Utility.windowsHandling();
        Utility.scrollDownByPixel();
       // Utility.mouseHovering(mouseHoveringAction);
    }
}
