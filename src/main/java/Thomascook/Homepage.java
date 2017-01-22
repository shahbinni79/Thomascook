package Thomascook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by welcome on 30/12/2016.
 */
public class Homepage extends DriverManager {


    By cookies = By.id("accept-cookies");
    By departurAirport = By.xpath("//div[2]/div/div/div/tc-typeahead/div/div[2]");
    By enterDeparturAirport = By.cssSelector("#SearchbarForm-origin");
    By selectDeparturAirport = By.xpath("//tc-typeahead/div/div/div/ul/li");
    By destinationAirport = By.cssSelector("div.SearchbarForm-summary.ng-binding");
    By enterDestinationAirport = By.id("SearchbarForm-goingTo");
    By selectDestinationAirport = By.xpath("//tc-typeahead/div/div/div/div/ul/li");
    By whenToGo = By.id("when");
    By selectMonth = By.className("ui-datepicker-month");
    By selectDate = By.xpath("//tr[4]//td[2]");
    By duration = By.id("SearchbarForm-duration");
    By selectAdultsNumbers = By.id("SearchbarRooms-adults0");
    By selectChildren = By.id("SearchbarRooms-children0");
    By selectFirstchildage = By.id("SearchbarChildAge-age0-0");
    By selectSecondchildage = By.id("SearchbarChildAge-age0-1");
    By applyage = By.id("SearchbarChildAge-apply");
    By searchbtn = By.id("SearchbarForm-submitBtn");



    public void airportName() {
        List<WebElement> londonAirports = driver.findElements(By.xpath("//tc-typeahead/div/div/div/ul/li"));
        System.out.println("total London airports = " + londonAirports.size());
        for (int i = 1; i<=londonAirports.size();i++){
            System.out.println("\n"+driver.findElement(By.xpath("//tc-typeahead/div/div/div/ul/li["+i+"]")).getText());
        }



    }
}