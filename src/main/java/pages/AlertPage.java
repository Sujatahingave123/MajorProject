package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

public class AlertPage extends WebTestBase {
    @FindBy(id="alert1")
    WebElement alertBtn;

    public AlertPage(){
        PageFactory.initElements(driver,this);
    }

    public void alertBtnClk(){
        alertBtn.click();
        Utility.alertHandlingElement();
    }

}
