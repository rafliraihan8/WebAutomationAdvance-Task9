
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
        pricePage.setGetPrice();
        String txtExpPrice = "₹ 12,575\n" +
                "per adult";
        Assert.assertEquals(txtExpPrice, pricePage.setGetPrice());
    }

}