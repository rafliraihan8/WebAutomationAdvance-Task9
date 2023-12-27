
package Test;

import Page.FlightPage;
import Page.PricePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetPriceTest extends BaseWebTest{

    @Test
    public void getPrice(){
        FlightPage flightPage = new FlightPage(driver, explicitWait);
        PricePage pricePage = new PricePage(driver, explicitWait);

        flightPage.search();

        String expectedPrice = pricePage.setGetPrice();
        Assert.assertTrue(Boolean.parseBoolean(expectedPrice), "₹ 6,636 per adult");


    }

}