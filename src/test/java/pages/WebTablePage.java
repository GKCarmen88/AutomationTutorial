package pages;

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
    public void addNewEntry(String firstNameValue, String lastNameValue,
                            String emailValue, String ageValue,
                            String salaryValue, String departmentValue, int tabelSize) {

        elementsHelper.validateSizeList(WebTableLocatores.initialTabelElement, tabelSize-1);

        elementsHelper.clickLocator(WebTableLocatores.addElement);

        elementsHelper.fillLocator(WebTableLocatores.firstNameElement,firstNameValue);

        elementsHelper.fillLocator(WebTableLocatores.lastNameElement, lastNameValue);

        elementsHelper.fillLocator(WebTableLocatores.emailElement,emailValue);

        elementsHelper.fillLocator(WebTableLocatores.ageElement,ageValue);

        elementsHelper.fillLocator(WebTableLocatores.salaryElement,salaryValue);

        elementsHelper.fillLocator(WebTableLocatores.departmentElement,departmentValue);

        elementsHelper.clickLocator(WebTableLocatores.submitElement);

        elementsHelper.validateSizeList(WebTableLocatores.addTableElementLocatore, tabelSize);

        //Validam continutul tabelului
        List<WebElement> addTabelElementList = driver.findElements(WebTableLocatores.addTableElementLocatore);
        String rowText = addTabelElementList.get(tabelSize-1).getText();
        Assert.assertTrue(rowText.contains(firstNameValue));
        Assert.assertTrue(rowText.contains(lastNameValue));
        Assert.assertTrue(rowText.contains(departmentValue));
        Assert.assertTrue(rowText.contains(emailValue));
        Assert.assertTrue(rowText.contains(ageValue));
        Assert.assertTrue(rowText.contains(salaryValue));

    }

    public void editNewEntry(String editsalaryValue, String editdepartmentValue, String editageValue, int tableSize){

        elementsHelper.clickJSlocator(WebTableLocatores.clickeditElement);

        elementsHelper.fillPressLocator(WebTableLocatores.editsalaryElement,editsalaryValue, Keys.ENTER);

        elementsHelper.fillPressLocator(WebTableLocatores.editdepartmentElement,editdepartmentValue,Keys.ENTER);

        elementsHelper.fillPressLocator(WebTableLocatores.editageElement,editageValue,Keys.ENTER);

        elementsHelper.clickLocator(WebTableLocatores.editSubmitElement);

        elementsHelper.validateSizeList(WebTableLocatores.editTabelElement, tableSize);


        //Validam continutul tabelului
        List<WebElement> editTabelElementList = driver.findElements(WebTableLocatores.editTabelElement);
        String editRowText = editTabelElementList.get(tableSize-1).getText();
        Assert.assertTrue(editRowText.contains(editdepartmentValue));
        Assert.assertTrue(editRowText.contains(editageValue));
        Assert.assertTrue(editRowText.contains(editsalaryValue));
    }

    public void deleteNewEntry(int tableSize){

        elementsHelper.clickJSlocator(WebTableLocatores.deleteElement);

        elementsHelper.validateSizeList(WebTableLocatores.deleteTabelElement, tableSize);
    }
}

