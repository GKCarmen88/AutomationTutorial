package pages;

import helperMethods.ElementsHelper;
import org.openqa.selenium.WebDriver;
import pageLocators.IndexLocators;

public class IndexPage extends BasePage{


    public IndexPage(WebDriver driver) {
        super(driver);

    }

    public void clickOnAlertWindowFrameMenu(){
        elementsHelper.clickJSlocator(IndexLocators.alertsMenuElement);
    }

    public void clickOnAlertsSubmenu(){
        elementsHelper.clickJSlocator(IndexLocators.alertsElements);
    }

    public void clickOnFramesSubmenu(){
        elementsHelper.clickJSlocator(IndexLocators.frameElement);
    }

    public void clickOnWindowSubmenu(){
        elementsHelper.clickJSlocator(IndexLocators.windowElement);
    }

    public void clickOnFormsMenu(){
        elementsHelper.clickJSlocator(IndexLocators.formsMenuElement);
    }
 public void clickOnFormSubmenu(){
     elementsHelper.clickJSlocator(IndexLocators.practiceFormElement);
 }
    public void clickOnElementsMenu(){
        elementsHelper.clickJSlocator(IndexLocators.elementsMenuElement);
    }

    public void clickOnWeTablesSubMenu(){
        elementsHelper.clickJSlocator(IndexLocators.webTablesElements);
    }
}
