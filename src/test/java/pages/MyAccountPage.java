package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends BasePage{


    public void enter_username(String un){
        driver.findElement(By.xpath("//*[@id=\"reg_username\"]")).sendKeys(un);

    }
    public void enter_email(String em){
        driver.findElement(By.xpath("//*[@id=\"reg_email\"]")).sendKeys(em);

    }

    public void enter_password(String pwd){
        driver.findElement(By.xpath("//*[@id=\"reg_password\"]")).sendKeys(pwd);

    }
    public void ClickOnRegisterBtn(){
        driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[4]/button")).click();


    }


        public void i_enter_weak_password(String wp){
            driver.findElement(By.xpath("//*[@id=\"reg_password\"]")).sendKeys(wp);

        }

        public void i_validate_error_message_for_weak_password() throws InterruptedException {
        Thread.sleep(5000);
        WebElement weekPasswordmsg= driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/span/div"));
             String  weekPassword=weekPasswordmsg.getText();
            System.out.println(weekPassword);
            if(weekPassword.contains("Weak")){
                System.out.println("Weak - Please enter a stronger password.:-->Test Pass");

            }else{
                System.out.println("Weak - Please enter a stronger password not found: Test failed");
            }


        }
    public void enter_esisting_username(String un){
        driver.findElement(By.xpath("//*[@id=\"reg_username\"]")).sendKeys(un);

    }
    public void i_validate_error_message_for_existing_user_name() throws InterruptedException {
        Thread.sleep(5000);
        WebElement existingUserNamedmsg= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul/li/strong"));
        String  existinguser=existingUserNamedmsg.getText();
        System.out.println(existinguser);
        if(existinguser.contains("Error")){
            System.out.println("Error: An account is already registered with that username. Please choose another.:-->Test Pass");

        }else{
            System.out.println("Error: An account is already registered with that username. Please choose another. not found: Test failed");
        }


    }

    }

