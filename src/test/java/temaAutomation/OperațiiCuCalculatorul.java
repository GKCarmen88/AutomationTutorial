package temaAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OperațiiCuCalculatorul {
    public WebDriver drive;

    @Test

    public void metodaTest(){
        drive = new ChromeDriver();

        drive.get("https://www.automationtesting.co.uk/calculator.html");

        drive.manage().window().maximize();

        //Calcul de adunare

        WebElement button5Element = drive.findElement(By.xpath("//input[@value='5']"));
        String button5Value = "5";
        button5Element.sendKeys(button5Value);

        WebElement click5Element = drive.findElement(By.xpath("//input[@value='5']"));
        click5Element.click();

        WebElement buttonPlusElement = drive.findElement(By.xpath("//input[@value='+']"));
        String buttonPlusValue = "+";
        buttonPlusElement.sendKeys(buttonPlusValue);

        WebElement clickPlusElement = drive.findElement(By.xpath("//input[@value='+']"));
        clickPlusElement.click();

        WebElement button9Element = drive.findElement(By.xpath("//input[@value='9']"));
        String button9Value = "9";
        button9Element.sendKeys(button9Value);

        WebElement click9Element = drive.findElement(By.xpath("//input[@value='9']"));
        click9Element.click();

        WebElement buttonEqualElement = drive.findElement(By.xpath("//input[@value='=']"));
        String buttonEqualValue = "=";
        buttonEqualElement.sendKeys(buttonEqualValue);

        WebElement clickEqualElement = drive.findElement(By.xpath("//input[@value='=']"));
        clickEqualElement.click();

        WebElement clickClearElement = drive.findElement(By.xpath("//input[@value='c']"));
        clickClearElement.click();




//Calcul de scadere

        WebElement button8Element = drive.findElement(By.xpath("//input[@value='8']"));
        String button8Value = "8";
        button8Element.sendKeys(button8Value);

        WebElement click8Element = drive.findElement(By.xpath("//input[@value='8']"));
        click8Element.click();

        WebElement buttonMinElement = drive.findElement(By.xpath("//input[@value='-']"));
        String buttonMinValue = "-";
        buttonMinElement.sendKeys(buttonMinValue);

        WebElement clickMinElement = drive.findElement(By.xpath("//input[@value='-']"));
        clickMinElement.click();

        WebElement button6Element = drive.findElement(By.xpath("//input[@value='6']"));
        String button6Value = "6";
        button6Element.sendKeys(button6Value);

        WebElement click6Element = drive.findElement(By.xpath("//input[@value='6']"));
        click6Element.click();

        WebElement buttonEqual2Element = drive.findElement(By.xpath("//input[@value='=']"));
        String buttonEqual2Value = "=";
        buttonEqual2Element.sendKeys(buttonEqual2Value);

        WebElement clickEqual2Element = drive.findElement(By.xpath("//input[@value='=']"));
        clickEqual2Element.click();

        WebElement clickClear1Element = drive.findElement(By.xpath("//input[@value='c']"));
        clickClear1Element.click();


//Inmultire


        WebElement clickOptElement = drive.findElement(By.xpath("//input[@value='8']"));
        clickOptElement.click();
        WebElement clickpointElement = drive.findElement(By.xpath("//input[@value='.']"));
        clickpointElement.click();
        WebElement clicksaseElement = drive.findElement(By.xpath("//input[@value='6']"));
        clicksaseElement.click();
        WebElement clickxElement = drive.findElement(By.xpath("//input[@value='*']"));
        clickxElement.click();
        WebElement clickSaseElement = drive.findElement(By.xpath("//input[@value='6']"));
        clickSaseElement.click();
        WebElement clickEqual3Element = drive.findElement(By.xpath("//input[@value='=']"));
        clickEqual3Element.click();
        WebElement clickClear2Element = drive.findElement(By.xpath("//input[@value='c']"));
        clickClear2Element.click();

//Impartire
        WebElement clickOpt1Element = drive.findElement(By.xpath("//input[@value='8']"));
        clickOpt1Element.click();
        WebElement clickImpartireElement = drive.findElement(By.xpath("//input[@value='/']"));
        clickImpartireElement.click();
        WebElement clicksase1Element = drive.findElement(By.xpath("//input[@value='6']"));
        clicksase1Element.click();
        WebElement clickEqual4Element = drive.findElement(By.xpath("//input[@value='=']"));
        clickEqual4Element.click();



    }

}
