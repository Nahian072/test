package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {
   public static  WebDriver driver;
    public void OpenChromeBrowser(){
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\workspace\\Jenkins_Setup\\chromedriver_119.exe");
        // Instantiate a ChromeDriver class.
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the webpage
        driver.get("https://abc9262.sg-host.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    public void CLoseChromeBrowser(){
        driver.close();
    }
}
