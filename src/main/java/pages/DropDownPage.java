package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Utility;

import static testbase.WebTestBase.driver;

public class DropDownPage {
    @FindBy(id="drop1")
    WebElement doc1;

    public DropDownPage(){
        PageFactory.initElements(driver,this);
    }
    public void dropdown(){
        Select select = new Select(doc1);
        Utility.waitUntilElementToBeClick(driver,doc1);
        select.selectByIndex(1);
        select.selectByValue("ghi");
    }

}
