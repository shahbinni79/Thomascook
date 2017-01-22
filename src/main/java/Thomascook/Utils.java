package Thomascook;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

/**
 * Created by welcome on 30/12/2016.
 */
public class Utils extends DriverManager {

    public static String get_Text(By by) {
        return driver.findElement(by).getText();
    }

    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static void enterText (By by , String text){
        //driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }

    public static void clickOnAlert() {
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e){

        }
    }
    public static void mouseHover(WebElement element ){

        Actions actions = new Actions(driver);
    actions.moveToElement (element).build().perform();
    }
    public static void selectByvisibletext (By by, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);


    }



    public static void captureScreenShot(ITestResult result) {
    String browser = "browser";
    if (ITestResult.FAILURE == result.getStatus()){
        try {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File("C:\\Binni's Project\\Thomascook\\src\\Screenshot\\"
                    +result.getName() + System.currentTimeMillis() +"("+browser+")"+ ".png"));
        } catch (IOException e) {

        }
    }


    }
}
