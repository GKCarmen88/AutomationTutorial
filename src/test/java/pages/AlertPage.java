package pages;

import loggerUtility.LoggerUtility;
import modelObject.AlertTableModel;
import org.openqa.selenium.WebDriver;
import pageLocators.AlertsLocators;

public class AlertPage extends BasePage{

    public AlertPage(WebDriver driver) {
        super(driver);

    }

    public void interactionWithAcceptAlert(){
        elementsHelper.clickLocator(AlertsLocators.alertOKElement);
        alertsHelper.acceptAlert();
        LoggerUtility.infoLog("The User click on Accept Alert." );

    }

    public void interactionWithTimerAlert(){
        elementsHelper.clickLocator(AlertsLocators.alertTimerElement);
        alertsHelper.acceptAlert();
        LoggerUtility.infoLog("The User click on Accept Alert." );

    }

    public void interactWithCancelAlert(){
        elementsHelper.clickLocator(AlertsLocators.alertOkCancelElement);
        alertsHelper.acceptAlert();
        LoggerUtility.infoLog("The User click on Accept Alert." );

    }

    public void interactWithValueAlert(AlertTableModel testData) {
        elementsHelper.clickLocator(AlertsLocators.alertTextElement);
        LoggerUtility.infoLog("User click on Alert Text. ");
        alertsHelper.fillTextAlert(testData.getPromptData());
        LoggerUtility.infoLog("The User fill in the Alert Helper: " + testData.getPromptData());

    }

}
