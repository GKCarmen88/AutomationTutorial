package tests;

import modelObject.AlertTableModel;
import org.testng.annotations.Test;
import pages.AlertPage;
import pages.IndexPage;
import sharedData.SharedData;
import suites.TestCaseSuite;
import suites.TestSuite;

public class AlerteTest extends SharedData {



    @Test (groups = {TestSuite.REGRESSION_SUITE, TestSuite.ALERT_FRAME_SUITE,
            TestCaseSuite.TICKET_123, TestCaseSuite.TC_457, TestCaseSuite.TC_459})
    public void metodaTest() {


        AlertTableModel testData = new AlertTableModel("src/test/resources/testData/AlertData.json");
//Folosit inainte de creere index page
        //By alertsMenuElement = By.xpath("//h5[text()='Alerts, Frame & Windows']");
        //elementsHelper.clickJSlocator(alertsMenuElement);

//Folosit din index page pt ce este mai sus
        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickOnAlertWindowFrameMenu();
        indexPage.clickOnAlertsSubmenu();

        AlertPage alertPage = new AlertPage(getDriver());
        alertPage.interactionWithAcceptAlert();
        alertPage.interactionWithTimerAlert();
        alertPage.interactWithCancelAlert();
        alertPage.interactWithValueAlert(testData);

    }
}