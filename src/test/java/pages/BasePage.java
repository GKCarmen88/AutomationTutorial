package pages;

import helperMethods.AlertsHelper;
import helperMethods.ElementsHelper;
import helperMethods.FrameHelper;
import helperMethods.TabHelper;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public WebDriver driver;
    public AlertsHelper alertsHelper;
    public ElementsHelper elementsHelper;
    public FrameHelper frameHelper;
    public TabHelper tabHelper;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        alertsHelper = new AlertsHelper(driver);
        elementsHelper = new ElementsHelper(driver);
        frameHelper = new FrameHelper(driver);
        tabHelper = new TabHelper(driver);

    }
}
