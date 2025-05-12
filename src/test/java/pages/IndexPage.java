package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import pageLocators.IndexLocators;

public class IndexPage extends BasePage{


    public IndexPage(WebDriver driver) {
        super(driver);

    }

    public void clickOnAlertWindowFrameMenu(){
        elementsHelper.clickJSlocator(IndexLocators.alertsMenuElement);
        LoggerUtility.infoLog("The User clicks on: AlertWindow Menu");
    }

    public void clickOnAlertsSubmenu(){
        elementsHelper.clickJSlocator(IndexLocators.alertsElements);
        LoggerUtility.infoLog("The User clicks on: AlertWindow SubMenu");
    }

    public void clickOnFramesSubmenu(){
        elementsHelper.clickJSlocator(IndexLocators.frameElement);
        LoggerUtility.infoLog("The User clicks on: Frame SubMenu");
    }

    public void clickOnWindowSubmenu(){
        elementsHelper.clickJSlocator(IndexLocators.windowElement);
        LoggerUtility.infoLog("The User clicks on: Window SubMenu");
    }

    public void clickOnFormsMenu(){
        elementsHelper.clickJSlocator(IndexLocators.formsMenuElement);
        LoggerUtility.infoLog("The User clicks on: Form Menu");
    }
 public void clickOnFormSubmenu(){
     elementsHelper.clickJSlocator(IndexLocators.practiceFormElement);
     LoggerUtility.infoLog("The User clicks on: Form SubMenu");
 }
    public void clickOnElementsMenu(){
        elementsHelper.clickJSlocator(IndexLocators.elementsMenuElement);
        LoggerUtility.infoLog("The User clicks on: Element Menu");
    }

    public void clickOnWeTablesSubMenu(){
        elementsHelper.clickJSlocator(IndexLocators.webTablesElements);
        LoggerUtility.infoLog("The User clicks on: Element SubMenu");
    }
}
