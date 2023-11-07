import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Practice {
    public static WebDriver driver;
    public void OpenChromeBrowsr(){
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\workspace\\Jenkins_Setup\\chromedriver.exe");
        // Instantiate a ChromeDriver class.
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the webpage
        driver.get("https://abc9262.sg-host.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void EnterUsername(){
driver.findElement(By.xpath("//*[@id='customer_login']//div[2]/form/p/input[@name='username']")).sendKeys("a");

    }


    public void EnterEmail(){

    }
    public void Enterpassword(){

    }

    public static void main(String[] args) {
        Practice p =new Practice();
        p.OpenChromeBrowsr();
        p.EnterUsername();

    }
}
