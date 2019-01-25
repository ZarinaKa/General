import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class checkboxes {
    public static void main(String[] args) {


        //  System.setProperty("","");
        // SETTING DRIVER PATH FOR CHORME  USING THE WEBDRIVER MANAGER
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/forgot_password");
            driver.manage().window().fullscreen();
      WebElement input = driver.findElement(By.name("email"));
    input.sendKeys("somemail@somemail.com"+ Keys.ENTER);

    String expetced= "Your e-mail's been sent!";

   // WebElement wElement = driver.findElement(By.id("content"));
        // String actual = wElement.getText();

        String actual = driver.findElement(By.id("content")).getText();
             if (expetced.equals(actual)){
                  System.out.println("Pass");
             }else{
                  System.out.println("Failed");
    }

    }

}
