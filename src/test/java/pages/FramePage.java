package pages;

import org.openqa.selenium.WebDriver;
import pageLocators.FrameLocators;

public class FramePage extends BasePage{


    public FramePage(WebDriver driver) {
        super(driver);

    }

    public void interactFirstIFrame(){
        frameHelper.switchToIFrame("frame1");
        elementsHelper.printLocatorText(FrameLocators.textElement);
        frameHelper.switchToParentFrame();

    }

    public void interactSecondIFrame(){
        frameHelper.switchToIFrame("frame2");
        elementsHelper.printLocatorText(FrameLocators.text2Element);
    }
}
