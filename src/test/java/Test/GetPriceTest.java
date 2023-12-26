
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

        String expectDeparturePrice = pricePage.setGetPrice();
        Assert.assertTrue(expectDeparturePrice.contains("₹ 8,484"));

    }

}