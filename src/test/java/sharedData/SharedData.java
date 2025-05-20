package sharedData;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class SharedData {
    //public WebDriver driver;
    private WebDriver driver;
    private String testName;

    //Inainte de fiecare metoda de test se executa secventa

    @BeforeMethod (alwaysRun = true)
    public void prepareEnvironment(){
        testName = this.getClass().getSimpleName();

        String remoteEnv = System.getProperty("remote"); //returneaza acel false dar sub forma de string
        if (Boolean.parseBoolean(remoteEnv)){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless=new");
            driver = new ChromeDriver(options); //deschidem un browser
        } else {
            driver = new ChromeDriver();
        }

        //accesam pagina web
        driver.get("https://demoqa.com");
        //facem browserul in modul maximize
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        LoggerUtility.startTest(testName);


    }

    @AfterMethod (alwaysRun = true)
    public void clearEnvironment(){
        driver.quit();
        LoggerUtility.finishTest(testName);

    }

    public WebDriver getDriver() {
        return driver;
    }
}
