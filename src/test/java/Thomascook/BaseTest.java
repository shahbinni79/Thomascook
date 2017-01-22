package Thomascook;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;

/**
 * Created by welcome on 30/12/2016.
 */
public class BaseTest extends DriverManager {
    @BeforeClass
    public  void openbrowser () throws InterruptedException, MalformedURLException {
        DriverManager.openBrowser();

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @AfterClass
    public  void closebrowser (){
        DriverManager.closeBrowser();
    }
}
