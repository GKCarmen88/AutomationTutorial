package pages;

import loggerUtility.LoggerUtility;
import modelObject.PracticeFormModel;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageLocators.PracticeFormLocators;

import java.io.File;
import java.util.List;

public class PracticeFormPage extends BasePage {

    public PracticeFormPage(WebDriver driver) {
        super(driver);

    }
    public void populateEntireForm(PracticeFormModel testData) {
        elementsHelper.fillLocator(PracticeFormLocators.firstNameElement, testData.getFirstNameValue());
        LoggerUtility.infoLog("The User fills First Name with value: " + testData.getFirstNameValue());

        elementsHelper.fillLocator(PracticeFormLocators.lastNameElement, testData.getLastNameValue());
        LoggerUtility.infoLog("The User fills Last Name with value: " + testData.getLastNameValue());

        elementsHelper.fillLocator(PracticeFormLocators.emailElement, testData.getEmailValue());
        LoggerUtility.infoLog("The User fills Email with value: " + testData.getEmailValue());

        List<WebElement> genderElement = elementsHelper.getListElements(PracticeFormLocators.genderLocator);

        switch (testData.getGenderValue()) {
            case "Male":
                elementsHelper.clickJSlocator(genderElement.get(0)); // Click forțat!
                break;

            case "Female":
                elementsHelper.clickJSlocator(genderElement.get(1));
                break;

            case "Other":
                elementsHelper.clickJSlocator(genderElement.get(2));
                break;
        }
        LoggerUtility.infoLog("The User fills Gender with value: " + testData.getGenderValue());


        elementsHelper.fillLocator(PracticeFormLocators.mobileElement, testData.getMobileValue());
        LoggerUtility.infoLog("The User fills  with Mobile value: " + testData.getMobileValue());

        for (String subject : testData.getSubjectValues()) {
            elementsHelper.fillPressLocator(PracticeFormLocators.subjectElement, subject, Keys.ENTER);
            LoggerUtility.infoLog("The User fills Subject with value: " + subject);

        }

        List<WebElement> hobbiesElements = elementsHelper.getListElements(PracticeFormLocators.hobbiesLocator);
        for (WebElement hobby : hobbiesElements) {
            if (testData.getHobbiesValues().contains(hobby.getText())) {
                elementsHelper.clickJSlocator(hobby);
                LoggerUtility.infoLog("The User checks Hobbies box: " + hobby.getText());

            }
        }


        File file = new File(testData.getPictureValue());
        elementsHelper.fillLocator(PracticeFormLocators.pictureElement, file.getAbsolutePath());
        LoggerUtility.infoLog("The User uploads a picture : " + testData.getPictureValue());


        elementsHelper.fillLocator(PracticeFormLocators.addressElement, testData.getAddressValue());
        LoggerUtility.infoLog("The User fills Address with value: " + testData.getAddressValue());


        elementsHelper.clickJSlocator(PracticeFormLocators.stateElement);
        elementsHelper.fillPressLocator(PracticeFormLocators.stateInputElement, testData.getStateValue(), Keys.ENTER);
        LoggerUtility.infoLog("The User fill State element: " + testData.getStateValue());


        elementsHelper.clickJSlocator(PracticeFormLocators.cityElement);
        elementsHelper.fillPressLocator(PracticeFormLocators.cityInputElement, testData.getCityValue(), Keys.ENTER);
        LoggerUtility.infoLog("The User fill City element: " + testData.getCityValue());

        elementsHelper.clickJSlocator(PracticeFormLocators.submitButton);
        LoggerUtility.infoLog("The User clicks on Submit button: ");

    }

    public void validateEntireContent(PracticeFormModel testData){


        elementsHelper.validateElementText(PracticeFormLocators.thankYouElement, testData.getExpectedMessage());

        List<WebElement> tabelContentList = elementsHelper.getListElements(PracticeFormLocators.tableContentListLocator);

        elementsHelper.validateElementContainsText(tabelContentList.get(0),"Student Name");
        elementsHelper.validateElementContainsText(tabelContentList.get(0), testData.getFirstNameValue()+' '+ testData.getLastNameValue());
        LoggerUtility.infoLog("The User validates First Name: " + testData.getFirstNameValue() + ' ' + " and Last Name: " + testData.getLastNameValue());


        elementsHelper.validateElementContainsText(tabelContentList.get(1),"Student Email");
        elementsHelper.validateElementContainsText(tabelContentList.get(1), testData.getEmailValue());
        LoggerUtility.infoLog("The User validates the Email : " + testData.getEmailValue());

        elementsHelper.validateElementContainsText(tabelContentList.get(2), "Gender");
        elementsHelper.validateElementContainsText(tabelContentList.get(2), testData.getGenderValue());
        LoggerUtility.infoLog("The User validates Gender : " + testData.getGenderValue());

        elementsHelper.validateElementContainsText(tabelContentList.get(3),"Mobile");
        elementsHelper.validateElementContainsText(tabelContentList.get(3), testData.getMobileValue());
        LoggerUtility.infoLog("The User validates Mobile : " + testData.getMobileValue());

        elementsHelper.validateElementContainsText(tabelContentList.get(5),"Subjects" );
        String subjectValue = String.join(", ", testData.getSubjectValues());
        elementsHelper.validateElementContainsText(tabelContentList.get(5),subjectValue);
        LoggerUtility.infoLog("The User validates Subject : " + testData.getSubjectValues());

        elementsHelper.validateElementContainsText(tabelContentList.get(6),"Hobbies");
        String hobbyValue = String.join(", ", testData.getHobbiesValues());
        elementsHelper.validateElementContainsText(tabelContentList.get(6),hobbyValue);
        LoggerUtility.infoLog("The User validates Hobbies : " + testData.getHobbiesValues());

        elementsHelper.validateElementContainsText(tabelContentList.get(7),"Picture");
        File file = new File(testData.getPictureValue());
        String fileName = file.getName();
        elementsHelper.validateElementContainsText(tabelContentList.get(7),fileName);
        LoggerUtility.infoLog("The User validates the uploaded Picture: " + testData.getPictureValue());

        elementsHelper.validateElementContainsText(tabelContentList.get(8),"Address");
        elementsHelper.validateElementContainsText(tabelContentList.get(8), testData.getAddressValue());
        LoggerUtility.infoLog("The User validates Address : " + testData.getAddressValue());

        elementsHelper.validateElementContainsText(tabelContentList.get(9),"State and City");
        elementsHelper.validateElementContainsText(tabelContentList.get(9), testData.getStateValue() + ' ' +  testData.getCityValue());
        LoggerUtility.infoLog("The User validates State : " + testData.getStateValue() + ' ' +  "and City" +  testData.getCityValue());

    }

}
