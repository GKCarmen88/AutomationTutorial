package pages;

import helperMethods.ElementsHelper;
import helperMethods.TabHelper;
import org.openqa.selenium.WebDriver;
import pageLocators.TabWindowLocators;

public class WindowPage extends BasePage {


    public WindowPage(WebDriver driver) {
        super(driver);


    }

    public void interactionWithTab(){
        elementsHelper.clickLocator(TabWindowLocators.newTabElement);
        System.out.println("URL-ul curent este: "+driver.getCurrentUrl());
        tabHelper.switchToSpecificTab(1);
        tabHelper.closeCurrentTab();
        tabHelper.switchToSpecificTab(0);

    }

    public void interactionWithWindow(){
        elementsHelper.clickLocator(TabWindowLocators.newWindowElement);
        System.out.println("URL-ul curent este: "+driver.getCurrentUrl());
        tabHelper.switchToSpecificTab(1);
        tabHelper.closeCurrentTab();
        tabHelper.switchToSpecificTab(0);

    }
}
