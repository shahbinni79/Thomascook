package Thomascook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by welcome on 19/01/2017.
 */
public class HolidayHotels extends DriverManager {
    By origin = By.id("SearchbarReadonly-origin");
    By destination = By.id("SearchbarReadonly-goingTo");
    By when = By.id("SearchbarReadonly-when");
    By withwho = By.id("SearchbarReadonly-value0");
    By checkrating = By.xpath("//div/div/div[2]/div[3]/div/label");

    public  void getHotelsName (){
        List<WebElement>hotelsName = driver.findElements(By.xpath("//div[@id='searchResults']/div"));
        System.out.println(hotelsName.size());
        for (int i =1 ; i<=hotelsName.size();i++){
            System.out.println("\n"+driver.findElement(By.xpath("//div[@id='searchResults']/div["+i+"]/div/div/h4/a")).getText());
        }
    }


}
