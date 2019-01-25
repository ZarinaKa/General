package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ZeroBank {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password");
        driver.findElement(By.name("submit")).click();

        String expectedUsName = "username";
        String actualUsName = driver.findElement(By.linkText("username")).getText();

if (actualUsName.equals(expectedUsName)){
    System.out.println("Pass");
}else{
    System.out.println("Failed");
    System.out.println("Expected " + expectedUsName);
    System.out.println("Actual " + actualUsName);
}
 String actualTitle = driver.getTitle();
String expectedTitle = "Zero - Account Summary";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Pass");
        }else{
            System.out.println("Failed");
            System.out.println("Expected " + expectedTitle);
            System.out.println("Actual " + actualTitle);
        }
    }
}
