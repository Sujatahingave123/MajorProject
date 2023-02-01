package utils;

import org.openqa.selenium.Cookie;
import testbase.WebTestBase;

import java.util.Set;

public class ActionStuff extends WebTestBase {
    //Cookies Method
    public static void Cookies() throws InterruptedException{
        Cookie addCookie = new Cookie("Omayo", "sujata hingave");
        driver.manage().addCookie(addCookie);

        Set<Cookie> cookies = driver.manage().getCookies();
        for(Cookie c : cookies){
            System.out.println(c);
        }
        System.out.println("-------------Get cookie by name-------------------");
        System.out.println(driver.manage().getCookieNamed("Omayo"));


        System.out.println("-------------Delete cookie-------------------------");
        driver.manage().deleteCookie(addCookie);
        Set<Cookie> cookie2 = driver.manage().getCookies();
        for(Cookie c : cookie2){
            System.out.println(c);
        }

        System.out.println("----------Delete cookie by name");
        driver.manage().deleteCookieNamed("Omayo");
        Set<Cookie> cookie3 = driver.manage().getCookies();
        for(Cookie c : cookie3){
            System.out.println(c);
        }

        System.out.println("---------Delete all cookies");
        driver.manage().deleteAllCookies();
        Set<Cookie> cookie4 = driver.manage().getCookies();
        for(Cookie c : cookie4){
            System.out.println(c);
        }
    }
}
