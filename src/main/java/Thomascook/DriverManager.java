package Thomascook;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by welcome on 30/12/2016.
 */
public class DriverManager {

    protected static WebDriver driver;
    public DriverManager (){
        PageFactory.initElements(driver,this);}


static DesiredCapabilities capabilities = new DesiredCapabilities();
    public static void openBrowser () throws InterruptedException, MalformedURLException {

     // String browser = LoadProps.getProperty("browser");
       String browser = System.getProperty("browser");
        if (browser.equalsIgnoreCase("Chrome")){

            capabilities = DesiredCapabilities.chrome();
            capabilities.setBrowserName("chrome");
            capabilities.setPlatform(Platform.WINDOWS);
           // System.setProperty("webdriver.chrome.driver","src\\test\\java\\Resources\\BrowserDrivers\\chromedriver.exe");
           // driver=new ChromeDriver();
            driver = new RemoteWebDriver(new URL("http://192.168.0.8:5555/wd/hub"),capabilities);
        }
        else if((browser.equalsIgnoreCase("IE"))){
            DesiredCapabilities capability = new DesiredCapabilities();
            capabilities = DesiredCapabilities.internetExplorer();
            capabilities.setBrowserName("InternetExplorer");
            capabilities.setPlatform(Platform.WIN10);
//            System.setProperty("webdriver.ie.driver", "src\\test\\java\\Resources\\BrowserDrivers\\IEDriverServer.exe");
//            driver=new InternetExplorerDriver();
            driver = new RemoteWebDriver(new URL("http://192.168.0.8:5555/wd/hub"),capability);

        }
        else {
            driver = new FirefoxDriver();}

        driver.get(LoadProps.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
;


    }

    public static void closeBrowser(){
        driver.quit();
    }

}
