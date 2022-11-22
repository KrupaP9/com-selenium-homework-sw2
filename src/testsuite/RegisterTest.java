package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class RegisterTest extends Utility {
   @Before
   public void openBrowser(){
       //open the browser and launch url before each test
       openBrowser("https://demo.nopcommerce.com/");
   }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
       //click on register link
       clickOnElement(By.xpath("//a[@class='ico-register']"));
       //define expected text on register page
       String expectedText = "Register";
       //get actual text on register page
       String actualText = getTextFromElement(By.xpath("//div[@class='page-title']/h1[text()='Register']"));
       //check whether expected and actual are equal
       Assert.assertEquals("Not on Register page",expectedText,actualText);
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
       //click on register button
        clickOnElement(By.xpath("//a[@class='ico-register']"));
        // Select gender radio button
        clickOnElement(By.xpath("//input[@id='gender-male']"));
        // Enter First name
        sendTextToElement(By.xpath("//input[@id='FirstName']"),"Jonathon");
        // Enter Last name
        sendTextToElement(By.xpath("//input[@id='LastName']"),"Smith");
        // Select Day
        clickOnElement(By.xpath("//select[@name='DateOfBirthDay']/option[text()='10']"));
        //Select Month
        clickOnElement(By.xpath("//select[@name='DateOfBirthMonth']/option[text()='July']"));
       //Select Year
        clickOnElement(By.xpath("//select[@name='DateOfBirthYear']/option[text()='2000']"));
        // Enter Email address
        sendTextToElement(By.xpath("//input[@name='Email']"),"JonathonSmith@gmail.com");
        // Enter Password
        sendTextToElement(By.xpath("//input[@name='Password']"),"JonathonSmithPassword");
        // Enter Confirm password
        sendTextToElement(By.xpath("//input[@name='ConfirmPassword']"),"JonathonSmithPassword");
        // Click on register button
        clickOnElement(By.xpath("//button[@name='register-button']"));
        //expected text
        String expectedMessage = "Your registration completed";
        //get actual messgae
        String actualMessage = getTextFromElement(By.xpath("//div[@class='result']"));
        //check whether expected and actual are equal
        Assert.assertEquals("registration unsuccessful",expectedMessage,actualMessage);
    }
    @After
    public void tearDown(){
       //quit the browser after each test
     closeBrowser();
   }
}
