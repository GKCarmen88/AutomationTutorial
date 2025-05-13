package pages;

import loggerUtility.LoggerUtility;
import modelObject.WebTableModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageLocators.WebTableLocatores;

import java.util.List;

public class WebTablePage extends BasePage{
    public WebTablePage(WebDriver driver) {
        super(driver);
    }
    public void addNewEntry(WebTableModel testData) {
        int actualSize = testData.getNewTableSize()-1;
        elementsHelper.validateSizeList(WebTableLocatores.initialTabelElement, testData.getNewTableSize()-1);
        LoggerUtility.infoLog("The User validates the size of the current list. " + actualSize);

        elementsHelper.clickLocator(WebTableLocatores.addElement);
        LoggerUtility.infoLog("The User clicks on ADD new button to add a new row. ");

        elementsHelper.fillLocator(WebTableLocatores.firstNameElement, testData.getFirstNameValue());
        LoggerUtility.infoLog("The User fill the First Name field: " + testData.getFirstNameValue());

        elementsHelper.fillLocator(WebTableLocatores.lastNameElement, testData.getLastNameValue());
        LoggerUtility.infoLog("The User fill the Last Name field: " + testData.getLastNameValue());

        elementsHelper.fillLocator(WebTableLocatores.emailElement, testData.getEmailValue());
        LoggerUtility.infoLog("The User fill the Email field: " + testData.getEmailValue());

        elementsHelper.fillLocator(WebTableLocatores.ageElement, testData.getAgeValue());
        LoggerUtility.infoLog("The User fill the Age field: " + testData.getAgeValue());

        elementsHelper.fillLocator(WebTableLocatores.salaryElement, testData.getSalaryValue());
        LoggerUtility.infoLog("The User fill the Salary field: " + testData.getSalaryValue());

        elementsHelper.fillLocator(WebTableLocatores.departmentElement, testData.getDepartmentValue());
        LoggerUtility.infoLog("The User fill the Department field: " + testData.getDepartmentValue());

        elementsHelper.clickLocator(WebTableLocatores.submitElement);
        LoggerUtility.infoLog("The User clicks on Submit button. ");

        elementsHelper.validateSizeList(WebTableLocatores.addTableElementLocatore, testData.getNewTableSize());
        LoggerUtility.infoLog("The User validates the size of the list after new data has been added . " + testData.getNewTableSize());
        //Validam continutul tabelului
        List<WebElement> addTabelElementList = driver.findElements(WebTableLocatores.addTableElementLocatore);
        String rowText = addTabelElementList.get(testData.getNewTableSize()-1).getText();
        Assert.assertTrue(rowText.contains(testData.getFirstNameValue()));
        LoggerUtility.infoLog("The User validate the presence of the First Name in Table : " + testData.getFirstNameValue());
        Assert.assertTrue(rowText.contains(testData.getLastNameValue()));
        LoggerUtility.infoLog("The User validate the presence of the Last Name in Table : " + testData.getLastNameValue());
        Assert.assertTrue(rowText.contains(testData.getDepartmentValue()));
        LoggerUtility.infoLog("The User validate the presence of the Department in Table : " + testData.getDepartmentValue());
        Assert.assertTrue(rowText.contains(testData.getEmailValue()));
        LoggerUtility.infoLog("The User validate the presence of the Email in Table : " + testData.getEmailValue());
        Assert.assertTrue(rowText.contains(testData.getAgeValue()));
        LoggerUtility.infoLog("The User validate the presence of the Age in Table : " + testData.getAgeValue());
        Assert.assertTrue(rowText.contains(testData.getSalaryValue()));
        LoggerUtility.infoLog("The User validate the presence of the Salary in Table : " + testData.getSalaryValue());


    }

    public void editNewEntry(WebTableModel testData){

        elementsHelper.clickJSlocator(WebTableLocatores.clickeditElement);
        LoggerUtility.infoLog("The User clicks on Edit button to edit the elements. ");


        elementsHelper.changeValue(WebTableLocatores.editsalaryElement, testData.getEditSalaryValue());
        LoggerUtility.infoLog("The User edit the Salary value: " + testData.getEditSalaryValue());

        elementsHelper.changeValue(WebTableLocatores.editdepartmentElement, testData.getEditDepartmentValue());
        LoggerUtility.infoLog("The User edit the Department value: " + testData.getEditDepartmentValue());

        elementsHelper.changeValue(WebTableLocatores.editageElement, testData.getEditAgeValue());
        LoggerUtility.infoLog("The User edit the Age value: " + testData.getEditAgeValue());

        elementsHelper.clickLocator(WebTableLocatores.editSubmitElement);
        LoggerUtility.infoLog("The User click's on Submit button.");

        elementsHelper.validateSizeList(WebTableLocatores.editTabelElement, testData.getNewTableSize());
        LoggerUtility.infoLog("The User validates the size of the list after all fields has been edited. " + testData.getNewTableSize());



        //Validam continutul tabelului
        List<WebElement> editTabelElementList = driver.findElements(WebTableLocatores.editTabelElement);
        String editRowText = editTabelElementList.get(testData.getNewTableSize()-1).getText();
        Assert.assertTrue(editRowText.contains(testData.getEditDepartmentValue()));
        LoggerUtility.infoLog("The User validate the presence of the Department in Table: " + testData.getEditDepartmentValue());

        Assert.assertTrue(editRowText.contains(testData.getEditAgeValue()));
        LoggerUtility.infoLog("The User validate the presence of the Age in Table: " + testData.getEditAgeValue());

        Assert.assertTrue(editRowText.contains(testData.getEditSalaryValue()));
        LoggerUtility.infoLog("The User validate the presence of the Salary in Table: " + testData.getEditSalaryValue());

    }

    public void deleteNewEntry(WebTableModel testData){

        elementsHelper.clickJSlocator(WebTableLocatores.deleteElement);
        LoggerUtility.infoLog("The User delete all data by clicking on Delete. ");


        elementsHelper.validateSizeList(WebTableLocatores.deleteTabelElement, testData.getActualTableSize());
        LoggerUtility.infoLog("The User validates the size of the list after delete." + testData.getActualTableSize());

    }
}

