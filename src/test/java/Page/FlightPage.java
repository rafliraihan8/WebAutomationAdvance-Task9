package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightPage extends HomePage {
    public FlightPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
        super(driver, explicitWait);
        PageFactory.initElements(driver.get(), this);
    }

    @FindBy(xpath = "//div[@class='flt_fsw_inputBox searchCity inactiveWidget ']")
    WebElement btnFrom;

    @FindBy(xpath = "//div[@class='flt_fsw_inputBox searchToCity inactiveWidget ']")
    WebElement btnTo;



    public void search(){
    clickAndWait(btnFrom);
    clickAndWait(btnTo);

    }
}
