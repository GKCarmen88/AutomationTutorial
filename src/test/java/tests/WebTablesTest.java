package tests;

import org.testng.annotations.Test;
import pages.IndexPage;
import pages.WebTablePage;
import sharedData.SharedData;
import suites.TestSuite;


public class WebTablesTest extends SharedData {


    @Test(groups = {TestSuite.REGRESSION_SUITE, TestSuite.ELEMENT_SUITE})
    public void metodaTest () {

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickOnElementsMenu();
        indexPage.clickOnWeTablesSubMenu();

//add
        String firstNameValue = "Carmen";
        String lastNameValue = "Gerendi-KLimek";
        String emailValue = "carmen.gerendi@gmail.com";
        String ageValue = "36";
        String salaryValue = "20000";
        String departmentValue = "QA";

        WebTablePage webTablePage = new WebTablePage(getDriver());
        webTablePage.addNewEntry(firstNameValue, lastNameValue, emailValue, ageValue, salaryValue, departmentValue, 4);

//Edit Functionality

        String editsalaryValue = "2800";

        String editdepartmentValue = "HR";

        String editageValue = "37";

        webTablePage.editNewEntry(editsalaryValue, editdepartmentValue, editageValue, 4);


//Delete information

        webTablePage.deleteNewEntry(3);
    }
}
