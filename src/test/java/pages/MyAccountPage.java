package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends BasePage{


    public void enterValidUserNameAndPassword(){
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");

    }
    public void ClickOnLoginButton(){
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

    }
    public void verifyLoginText(){
        WebElement LoginText=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/h5"));
        String loginTValue=LoginText.getText();
        if (loginTValue.equals("Login")){
            System.out.println("Login text found");

        }else {
            System.out.println("Login not found");
        }
    }
    public void enterInvalidValidUserNameAndPassword(){
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Adcsfdfdmin");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin1cdsdcds23");

    }
    public void verifyInvalidUserLoginmessage(){
        WebElement InvalidLoginText=driver.findElement(By.xpath("<p class=\"oxd-text oxd-text--p oxd-alert-content-text\" data-v-7b563373=\"\" data-v-87fcf455=\"\">Invalid credentials</p>"));
        String InvalidloginTValue= InvalidLoginText.getText();
        if (InvalidloginTValue.equals("Invalid credentials")){
            System.out.println("Login message text found");

        }else {
            System.out.println("Login Login message not found");
        }
    }
}
