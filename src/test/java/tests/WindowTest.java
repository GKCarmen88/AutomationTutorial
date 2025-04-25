package tests;

import helperMethods.ElementsHelper;
import helperMethods.TabHelper;
import org.testng.annotations.Test;
import pages.IndexPage;
import pages.WindowPage;
import sharedData.SharedData;
import suites.TestSuite;

public class WindowTest extends SharedData {

    @Test(groups = {TestSuite.REGRESSION_SUITE,TestSuite.ALERT_FRAME_SUITE})
    public void metodaTest() {
        //ElementsHelper elementsHelper = new ElementsHelper(getDriver());
        //ElementHelper.elementHelper = new ElementHelper();
        //TabHelper tabHelper = new TabHelper(getDriver());


        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickOnAlertWindowFrameMenu();
        indexPage.clickOnWindowSubmenu();

        //New Window
        WindowPage windowPage = new WindowPage(getDriver());
        windowPage.interactionWithTab();

        //New Window
        windowPage.interactionWithWindow();

    }

}