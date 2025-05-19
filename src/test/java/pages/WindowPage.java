package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import pageLocators.TabWindowLocators;

public class WindowPage extends BasePage {


    public WindowPage(WebDriver driver) {
        super(driver);


    }

    public void interactionWithTab(){
        LoggerUtility.infoLog("Starting interaction with new Tab.");
        elementsHelper.clickJSlocator(TabWindowLocators.newTabElement);
        LoggerUtility.infoLog("User click on new Tab. ");
        System.out.println("URL-ul curent este: "+driver.getCurrentUrl());
        LoggerUtility.infoLog("Current URL after clicking new Tab: " + driver.getCurrentUrl());

        tabHelper.switchToSpecificTab(1);
        LoggerUtility.infoLog("Switched to tab with index 1.");

        tabHelper.closeCurrentTab();
        LoggerUtility.infoLog("Closed current tab (index 1).");

        tabHelper.switchToSpecificTab(0);
        LoggerUtility.infoLog("Switched back to original tab (index 0).");


    }

    public void interactionWithWindow(){
        elementsHelper.clickJSlocator(TabWindowLocators.newWindowElement);
        LoggerUtility.infoLog("User clicked on new Window.");
        System.out.println("URL-ul curent este: "+driver.getCurrentUrl());
        LoggerUtility.infoLog("Current URL after clicking new Window: " + driver.getCurrentUrl());

        tabHelper.switchToSpecificTab(1);
        LoggerUtility.infoLog("Switched to window with index 1.");

        tabHelper.closeCurrentTab();
        LoggerUtility.infoLog("Closed current window (index 1).");

        tabHelper.switchToSpecificTab(0);
        LoggerUtility.infoLog("Finished interaction with new Window.");


    }
}
