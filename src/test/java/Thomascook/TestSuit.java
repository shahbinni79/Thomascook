package Thomascook;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by welcome on 30/12/2016.
 */
public class TestSuit extends BaseTest {
    Homepage homepage = new Homepage();
    HolidayHotels holidayHotels = new HolidayHotels();
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void homePage () throws InterruptedException {
        Thread.sleep(2000);
       Utils.clickOnElement(homepage.cookies);
        Assert.assertEquals(driver.getTitle(),"Thomas Cook | Package Holidays, Hotels and Flights, Cheap holidays");
       Thread.sleep(1000);

       Utils.clickOnElement(homepage.departurAirport);
       Utils.enterText(homepage.enterDeparturAirport,"lo");
       homepage.airportName();
       Utils.clickOnElement(homepage.selectDeparturAirport);
       Utils.clickOnElement(homepage.destinationAirport);
       Utils.enterText(homepage.enterDestinationAirport,"duba");
       Thread.sleep(1000);
       Utils.clickOnElement(homepage.selectDestinationAirport);
       Utils.clickOnElement(homepage.whenToGo);
       //Utils.clickOnElement(homepage.selectMonth);
       Utils.selectByvisibletext(homepage.selectMonth,"Apr");
       Utils.clickOnElement(homepage.selectDate);
      // Utils.clickOnElement(homepage.duration);
       Utils.selectByvisibletext(homepage.duration,"5 Nights");
       Utils.selectByvisibletext(homepage.selectAdultsNumbers,"2");
       Utils.selectByvisibletext(homepage.selectChildren,"2");
       Utils.selectByvisibletext(homepage.selectFirstchildage,"9");
       Utils.selectByvisibletext(homepage.selectSecondchildage,"<2");
       Utils.clickOnElement(homepage.applyage);
       Utils.clickOnElement(homepage.searchbtn);
       Thread.sleep(70000);
       softAssert.assertEquals("Any London",Utils.get_Text(holidayHotels.origin));
       softAssert.assertEquals("All Dubai, Dubai, United Arab Emirates",Utils.get_Text(holidayHotels.destination));
       softAssert.assertEquals("18 Apr 2017",Utils.get_Text(holidayHotels.when));
       softAssert.assertEquals("Room 1: 2 Adults, 1 Child, 1 Infant",Utils.get_Text(holidayHotels.withwho));
       Utils.clickOnElement(holidayHotels.checkrating);
       holidayHotels.getHotelsName();
       softAssert.assertAll();

    }
@Test

    public void selectPackageHoliday () throws InterruptedException {

}


//


}
