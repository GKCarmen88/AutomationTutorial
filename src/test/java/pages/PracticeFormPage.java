package pages;

import modelObject.PracticeFormModel;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageLocators.PracticeFormLocators;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class PracticeFormPage extends BasePage {

    public PracticeFormPage(WebDriver driver) {
        super(driver);

    }
    public void populateEntireForm(PracticeFormModel testData) {
        elementsHelper.fillLocator(PracticeFormLocators.firstNameElement, testData.getFirstNameValue());

        elementsHelper.fillLocator(PracticeFormLocators.lastNameElement, testData.getLastNameValue());

        elementsHelper.fillLocator(PracticeFormLocators.emailElement, testData.getEmailValue());

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

        elementsHelper.fillLocator(PracticeFormLocators.mobileElement, testData.getMobileValue());

        for (String subject : testData.getSubjectValues()) {
            elementsHelper.fillPressLocator(PracticeFormLocators.subjectElement, subject, Keys.ENTER);
        }

        List<WebElement> hobbiesElements = elementsHelper.getListElements(PracticeFormLocators.hobbiesLocator);
        for (WebElement hobby : hobbiesElements) {
            if (testData.getHobbiesValues().contains(hobby.getText())) {
                elementsHelper.clickJSlocator(hobby);
            }
        }


        File file = new File(testData.getPictureValue());
        elementsHelper.fillLocator(PracticeFormLocators.pictureElement, file.getAbsolutePath());

        elementsHelper.fillLocator(PracticeFormLocators.addressElement, testData.getAddressValue());

        elementsHelper.clickJSlocator(PracticeFormLocators.stateElement);


        elementsHelper.fillPressLocator(PracticeFormLocators.stateInputElement, testData.getStateValue(), Keys.ENTER);


        elementsHelper.clickJSlocator(PracticeFormLocators.cityElement);


        elementsHelper.fillPressLocator(PracticeFormLocators.cityInputElement, testData.getCityValue(), Keys.ENTER);

        elementsHelper.clickJSlocator(PracticeFormLocators.submitButton);
    }

    public void validateEntireContent(String expectedMessage, String firstNameValue, String lastNameValue,
                                      String emailValue,String genderValue, String mobileValue,
                                     List<String> subjectValues,List<String> hobbiesValues,
                                      String uploadFile, String addressValue,String stateValue, String cityValue  ){


        elementsHelper.validateElementText(PracticeFormLocators.thankYouElement, expectedMessage);

        List<WebElement> tabelContentList = elementsHelper.getListElements(PracticeFormLocators.tableContentListLocator);

        elementsHelper.validateElementContainsText(tabelContentList.get(0),"Student Name");
        elementsHelper.validateElementContainsText(tabelContentList.get(0), firstNameValue+' '+lastNameValue);

        elementsHelper.validateElementContainsText(tabelContentList.get(1),"Student Email");
        elementsHelper.validateElementContainsText(tabelContentList.get(1),emailValue);

        elementsHelper.validateElementContainsText(tabelContentList.get(2), "Gender");
        elementsHelper.validateElementContainsText(tabelContentList.get(2),genderValue);

        elementsHelper.validateElementContainsText(tabelContentList.get(3),"Mobile");
        elementsHelper.validateElementContainsText(tabelContentList.get(3), mobileValue);

        elementsHelper.validateElementContainsText(tabelContentList.get(5),"Subjects" );
        String subjectValue = String.join(", ", subjectValues);
        elementsHelper.validateElementContainsText(tabelContentList.get(5),subjectValue);

        elementsHelper.validateElementContainsText(tabelContentList.get(6),"Hobbies");
        String hobbyValue = String.join(", ", hobbiesValues);
        elementsHelper.validateElementContainsText(tabelContentList.get(6),hobbyValue);

        elementsHelper.validateElementContainsText(tabelContentList.get(7),"Picture");
        File file = new File(uploadFile);
        String fileName = file.getName();
        elementsHelper.validateElementContainsText(tabelContentList.get(7),fileName);

        elementsHelper.validateElementContainsText(tabelContentList.get(8),"Address");
        elementsHelper.validateElementContainsText(tabelContentList.get(8),addressValue);


        elementsHelper.validateElementContainsText(tabelContentList.get(9),"State and City");
        elementsHelper.validateElementContainsText(tabelContentList.get(9),stateValue+' '+cityValue);



    }


}
