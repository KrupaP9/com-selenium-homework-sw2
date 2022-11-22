package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends BaseTest {
    public void clickOnElement(By by){
        //find the element to click
        WebElement link = driver.findElement(by);
        //click on the element
        link.click();
    }
    public void sendTextToElement(By by, String text){
        // Find the field
        WebElement field = driver.findElement(by);
        // Type in field
        field.sendKeys(text);
    }
    public String getTextFromElement(By by){
        //find the element where a response will be generated
        WebElement actualTextMessageElement = driver.findElement(by);
        //return the response of the WebElement as a String
        return actualTextMessageElement.getText();
    }
}
