package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    @Before
    public void openUrl() {
        //open browser before each test
        openBrowser("https://demo.nopcommerce.com/");
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //click on computers tab
        clickOnElement(By.xpath("//div[@class='header-menu']/ul[1]/li[1]/a[text()='Computers ']"));
        //define expected text
        String expectedText = "Computers";
        //get actual text
        String actualText = getTextFromElement(By.xpath("//div[@class='page-title']/h1[text()='Computers']"));
        //verify whether expected equals actual
        Assert.assertEquals("Not Navigated To Computer Tab", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //click on Electronics tab
        clickOnElement(By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a[text()='Electronics ']"));
        //define expected text
        String expectedText = "Electronics";
        //get actual text
        String actualText = getTextFromElement(By.xpath("//div[@class='page-title']/h1[text()='Electronics']"));
        //verify whether expected equals actual
        Assert.assertEquals("Not Navigated To Electronics Tab",expectedText,actualText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        //click on Apparel tab
        clickOnElement(By.xpath("//div[@class='header-menu']/ul[1]/li[3]/a[text()='Apparel ']"));
        //define expected text
        String expectedText = "Apparel";
        //get actual text on the page
        String actualText = getTextFromElement(By.xpath("//div[@class='page-title']/h1[text()='Apparel']"));
        //verify if expected equals actual
        Assert.assertEquals("Not Navigated To Apparel Tab",expectedText,actualText);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //click on Digital Downloads page
        clickOnElement(By.xpath("//div[@class='header-menu']/ul[1]/li[4]/a[text()='Digital downloads ']"));
        //define expected text
        String expectedText = "Digital downloads";
        //get actual text on the page
        String actualText = getTextFromElement(By.xpath("//div[@class='page-title']/h1[text()='Digital downloads']"));
        //verify whether expected equals actual
        Assert.assertEquals("Not Navigated To Digital downloads Tab",expectedText,actualText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //click on books tab
        clickOnElement(By.xpath("//div[@class='header-menu']/ul[1]/li[5]/a[text()='Books ']"));
        //define expected text
        String expectedText = "Books";
        //get actual text
        String actualText = getTextFromElement(By.xpath("//div[@class='page-title']/h1[text()='Books']"));
        //verify whether expected equals actual
        Assert.assertEquals("Not Navigated To Books Tab",expectedText,actualText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //click on Jewelry tab
        clickOnElement(By.xpath("//div[@class='header-menu']/ul[1]/li[6]/a[text()='Jewelry ']"));
        //define expected text
        String expectedText = "Jewelry";
        //get actual text
        String actualText = getTextFromElement(By.xpath("//div[@class='page-title']/h1[text()='Jewelry']"));
        //verify whether expected equals actual
        Assert.assertEquals("Not Navigated To Jewelry Tab",expectedText,actualText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        //click on Gift Cards page
        clickOnElement(By.xpath("//div[@class='header-menu']/ul[1]/li[7]/a[text()='Gift Cards ']"));
        //define expected text
        String expectedText = "Gift Cards";
        //get actual text
        String actualText = getTextFromElement(By.xpath("//div[@class='page-title']/h1[text()='Gift Cards']"));
        //verify whether expected equals actual
        Assert.assertEquals("Not Navigated To Gift Cards Tab",expectedText,actualText);
    }
@After
    public void tearDown(){
        // quit the browser after each test
        closeBrowser();
}
}
