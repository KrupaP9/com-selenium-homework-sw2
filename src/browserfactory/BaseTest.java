package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    //Webdriver declared globally, made public and static to allow access from within other packages
    public static WebDriver driver;
    public void openBrowser(String baseUrl){
        //Set key to value for browser location
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        //declare an object
        driver = new ChromeDriver();
        //Launch the URL
        driver.get(baseUrl);
        //Maximise Window
        driver.manage().window().maximize();
        //Give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public void closeBrowser(){
        //close the browser
        driver.quit();
    }
}
