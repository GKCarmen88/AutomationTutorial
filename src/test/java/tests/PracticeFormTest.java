package tests;

import modelObject.PracticeFormModel;
import org.testng.annotations.Test;
import pages.IndexPage;
import pages.PracticeFormPage;
import sharedData.SharedData;
import suites.TestSuite;

public class PracticeFormTest extends SharedData {


     @Test(groups = {TestSuite.REGRESSION_SUITE,TestSuite.FORM_SUITE})

     public void metodaTest() {

         PracticeFormModel testData = new PracticeFormModel("src/test/resources/testData/PracticeFormData.json");

         IndexPage indexPage = new IndexPage(getDriver());
         indexPage.clickOnFormsMenu();
         indexPage.clickOnFormSubmenu();


         PracticeFormPage practiceFormPage = new PracticeFormPage(getDriver());
         practiceFormPage.populateEntireForm(testData);

         practiceFormPage.validateEntireContent(testData);

     }

}
