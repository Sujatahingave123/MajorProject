package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

public class MouseHover extends WebTestBase {
    @FindBy(xpath = "//span[@id='blogsmenu']")
    WebElement  blogHover;

    public MouseHover(){
        PageFactory.initElements(driver,this);
    }
    public void blogMouseHover() {
        Utility.mouseHovering(blogHover);
    }
}
