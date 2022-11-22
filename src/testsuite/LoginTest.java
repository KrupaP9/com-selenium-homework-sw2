package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    @Before
    public void openBrowserUrl(){
        //open browser before each test
        openBrowser("https://demo.nopcommerce.com/");
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //click on login page link
        clickOnElement(By.xpath("//a[@class='ico-login']"));
        //define expected message
        String expectedMessage ="Welcome, Please Sign In!";
        //get the actual message text
        String actualMessage = getTextFromElement(By.xpath("//div[@class='page-title']//h1[text()='Welcome, Please Sign In!']"));
        //validate actual and expected message
        Assert.assertEquals("Not navigated to login page",expectedMessage,actualMessage);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //click on login page link
        clickOnElement(By.xpath("//a[@class='ico-login']"));
        //enter valid username
        sendTextToElement(By.xpath("//input[@class='email']"), "abcd123@gmail.com");
        //enter valid password
        sendTextToElement(By.xpath("//input[@class='password']"),"ABCTesting123");
        //login
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
        //define expected message when logged in
        String expectedMessage = "Log out";
        //get actual message
        String actualMessage = getTextFromElement(By.xpath("//a[@class='ico-logout']"));
        //validate expected and actual is equal
        Assert.assertEquals("Not Logged In",expectedMessage,actualMessage);
    }
    @Test
    public void verifyTheErrorMessage(){
        //click on login page
        clickOnElement(By.xpath("//a[@class='ico-login']"));
        //enter invalid username
        sendTextToElement(By.xpath("//input[@class='email']"), "abcd123456789@gmail.com");
        //enter invalid password
        sendTextToElement(By.xpath("//input[@class='password']"),"ABCDEFGHIJTesting123");
        //login button click
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
        //define expected error message
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        //get actual error message
        String actualErrorMessage = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        //check whether expected and actual are same
        Assert.assertEquals("Invalid Error Message",expectedErrorMessage,actualErrorMessage);
    }
    @After
    public void tearDown(){
        //after each test, quit the browser
        closeBrowser();
    }
}
