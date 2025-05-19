package tests;

import modelObject.WebTableModel;
import org.testng.annotations.Test;
import pages.IndexPage;
import pages.WebTablePage;
import sharedData.SharedData;
import suites.TestCaseSuite;
import suites.TestSuite;


public class WebTablesTest extends SharedData {


    @Test(groups = {TestSuite.REGRESSION_SUITE, TestSuite.ELEMENT_SUITE, TestCaseSuite.TICKET_123, TestCaseSuite.TC_459
    })
    public void metodaTest () {

        WebTableModel testData = new WebTableModel("src/test/resources/testData/WebTablesData.json");

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickOnElementsMenu();
        indexPage.clickOnWeTablesSubMenu();

//add

        WebTablePage webTablePage = new WebTablePage(getDriver());
        webTablePage.addNewEntry(testData);

//Edit Functionality


        webTablePage.editNewEntry(testData);


//Delete information

        webTablePage.deleteNewEntry(testData);
    }
}
