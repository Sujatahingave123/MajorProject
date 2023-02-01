package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.WebTestBase;

import java.time.Duration;
import java.util.Set;


public class Utility extends WebTestBase {
    public static final long PAGE_LOAD_TIMEOUT = 30;
    public static final long IMPLICITE_WAIT = 30 ;

    public static void waitUntilElementToBeClick(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IMPLICITE_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void scrollDownByPixel(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,2000)");

    }

    public static void scrollDownByElement(WebElement srcElement){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", srcElement);

    }

    public static void alertHandlingElement(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(IMPLICITE_WAIT));
    }

    public static void mouseHovering(WebElement mouseHover){
        Actions action = new Actions(driver);
        action.moveToElement(mouseHover).build().perform();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    }

    public static void windowsHandling(){
        String parentWindowId = driver.getWindowHandle();
        Set<String> allWindow = driver.getWindowHandles();

        for(String s : allWindow){
            if(!parentWindowId.contentEquals(s)){
                driver.switchTo().window(s);
                System.out.println(driver.getTitle());
                driver.close();
            }
            driver.switchTo().window(parentWindowId);
            System.out.println(driver.getTitle());
        }
    }
}
