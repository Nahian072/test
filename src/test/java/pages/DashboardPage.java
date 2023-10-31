package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BasePage{
    public void verifyDashboardText(){
        WebElement dashboardText=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
        String dbTValue=dashboardText.getText();
        if (dbTValue.equals("Dashboard")){
            System.out.println("Dash board text found");

        }else {
            System.out.println("Dashboard not found");
        }

    }
    public void clickOnLogOutDropDown(){
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")).click();

    }
    public void clickOnLogOut(){
        driver .findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();

    }

}
