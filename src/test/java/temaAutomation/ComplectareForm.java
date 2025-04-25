package temaAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ComplectareForm {

    public WebDriver driver;

    @Test
    public void metodaTest() {
        driver = new ChromeDriver();

        driver.get("https://www.automationtesting.co.uk/contactForm.html");

        driver.manage().window().maximize();

        WebElement firstNameElement = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        String firstNameValue = "Carmen";
        firstNameElement.sendKeys(firstNameValue);

        WebElement lastNameElement = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        String lastNameValue = "Gerendi";
        lastNameElement.sendKeys(lastNameValue);

        WebElement emailElement = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
        String emailValue = "carmen.gerendi@gmail.com";
        emailElement.sendKeys(emailValue);

        WebElement commentsElement = driver.findElement(By.xpath("//textarea[@placeholder='Comments']"));
        String commentsValue = "Here is the comment from the field";
        commentsElement.sendKeys(commentsValue);

    }

}
