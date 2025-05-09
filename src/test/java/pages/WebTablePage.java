package pages;

import modelObject.WebTableModel;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

        elementsHelper.validateSizeList(WebTableLocatores.initialTabelElement, testData.getNewTableSize()-1);

        elementsHelper.clickLocator(WebTableLocatores.addElement);

        elementsHelper.fillLocator(WebTableLocatores.firstNameElement, testData.getFirstNameValue());

        elementsHelper.fillLocator(WebTableLocatores.lastNameElement, testData.getLastNameValue());

        elementsHelper.fillLocator(WebTableLocatores.emailElement, testData.getEmailValue());

        elementsHelper.fillLocator(WebTableLocatores.ageElement, testData.getAgeValue());

        elementsHelper.fillLocator(WebTableLocatores.salaryElement, testData.getSalaryValue());

        elementsHelper.fillLocator(WebTableLocatores.departmentElement, testData.getDepartmentValue());

        elementsHelper.clickLocator(WebTableLocatores.submitElement);

        elementsHelper.validateSizeList(WebTableLocatores.addTableElementLocatore, testData.getNewTableSize());

        //Validam continutul tabelului
        List<WebElement> addTabelElementList = driver.findElements(WebTableLocatores.addTableElementLocatore);
        String rowText = addTabelElementList.get(testData.getNewTableSize()-1).getText();
        Assert.assertTrue(rowText.contains(testData.getFirstNameValue()));
        Assert.assertTrue(rowText.contains(testData.getLastNameValue()));
        Assert.assertTrue(rowText.contains(testData.getDepartmentValue()));
        Assert.assertTrue(rowText.contains(testData.getEmailValue()));
        Assert.assertTrue(rowText.contains(testData.getAgeValue()));
        Assert.assertTrue(rowText.contains(testData.getSalaryValue()));

    }

    public void editNewEntry(WebTableModel testData){

        elementsHelper.clickJSlocator(WebTableLocatores.clickeditElement);

        elementsHelper.changeValue(WebTableLocatores.editsalaryElement, testData.getEditSalaryValue());

        elementsHelper.changeValue(WebTableLocatores.editdepartmentElement, testData.getEditDepartmentValue());

        elementsHelper.changeValue(WebTableLocatores.editageElement, testData.getEditAgeValue());

        elementsHelper.clickLocator(WebTableLocatores.editSubmitElement);

        elementsHelper.validateSizeList(WebTableLocatores.editTabelElement, testData.getNewTableSize());



        //Validam continutul tabelului
        List<WebElement> editTabelElementList = driver.findElements(WebTableLocatores.editTabelElement);
        String editRowText = editTabelElementList.get(testData.getNewTableSize()-1).getText();
        Assert.assertTrue(editRowText.contains(testData.getEditDepartmentValue()));
        Assert.assertTrue(editRowText.contains(testData.getEditAgeValue()));
        Assert.assertTrue(editRowText.contains(testData.getEditSalaryValue()));
    }

    public void deleteNewEntry(WebTableModel testData){

        elementsHelper.clickJSlocator(WebTableLocatores.deleteElement);

        elementsHelper.validateSizeList(WebTableLocatores.deleteTabelElement, testData.getActualTableSize());
    }
}

