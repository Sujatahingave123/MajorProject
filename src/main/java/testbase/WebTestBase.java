package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.Utility;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class WebTestBase {
    public static WebDriver driver;
    public Properties prop;          //creating obj i.e prop

    public WebTestBase(){    //constructor
        try{
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("User.dir","src/main/resources/properties/config.properties"));
                    prop = new Properties();        //already created the obj
                    prop.load(fileInputStream);     //loading my file
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void intialization(){       //intialization browser
        String browserName = prop.getProperty("browser");
        if(browserName.equals("chrome")){
            System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir") + "src/main/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }else if(browserName.equals("firefox")){
            System.setProperty("WebDriver.gecko.driver",System.getProperty("user.dir") + "src/main/resources/drivers/gecko.exe");
            driver = new FirefoxDriver();
        }else if(browserName.equals("edge")){
            System.setProperty("WebDriver.edge.driver",System.getProperty("user.dir") + "src/main/resources/drivers/edge.exe");
            driver = new EdgeDriver();
        }else{
            System.out.println("please select correct browser name");
        }

        driver.navigate().to(prop.getProperty("url"));
        driver.manage().timeouts().pageLoadTimeout((Duration.ofSeconds(Utility.PAGE_LOAD_TIMEOUT)));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utility.IMPLICITE_WAIT));
        driver.manage().deleteAllCookies();

    }

}
