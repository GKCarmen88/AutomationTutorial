package pages;

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
    }

    public void interactionWithTimerAlert(){
        elementsHelper.clickLocator(AlertsLocators.alertTimerElement);
        alertsHelper.acceptAlert();
    }

    public void interactWithCancelAlert(){
        elementsHelper.clickLocator(AlertsLocators.alertOkCancelElement);
        alertsHelper.acceptAlert();
    }

    public void interactWithValueAlert(AlertTableModel testData) {
        elementsHelper.clickLocator(AlertsLocators.alertTextElement);
        alertsHelper.fillTextAlert(testData.getPromptData());
    }

}
