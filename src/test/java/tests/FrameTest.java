package tests;

import org.testng.annotations.Test;
import pages.FramePage;
import pages.IndexPage;
import sharedData.SharedData;
import suites.TestCaseSuite;
import suites.TestSuite;

public class FrameTest extends SharedData {


    @Test(groups = {TestSuite.REGRESSION_SUITE, TestSuite.ALERT_FRAME_SUITE,
            TestCaseSuite.TICKET_123, TestCaseSuite.TC_456, TestCaseSuite.TC_458})
    public void metodaTest(){


        //By frameMenuElement = By.xpath("//h5[text()='Alerts, Frame & Windows']");
        //elementsHelper.clickJSlocator(frameMenuElement);
        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickOnAlertWindowFrameMenu();
        indexPage.clickOnFramesSubmenu();

        FramePage framePage = new FramePage(getDriver());
        framePage.interactFirstIFrame();
        framePage.interactSecondIFrame();

    }

}
