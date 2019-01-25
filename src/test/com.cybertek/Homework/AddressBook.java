package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddressBook {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");
        driver.manage().window().fullscreen();

        driver.findElement(By.id("session_email")).sendKeys( "kexesobepu@zsero.com" );
        driver.findElement(By.id("session_password")).sendKeys("password");
        driver.findElement(By.name("commit")).click();
        String expected = "kexesobepu@zsero.com";

        String actual = driver.findElement(By.className("navbar-text")).getText();

        if (expected.equals(actual)){
            System.out.println("Pass");
        }else{
            System.out.println("Failed");
        }

    if (!(driver.getTitle().contains("Sign In"))){
        System.out.println("PASS NOT CONTAIN");
    }   else{
        System.out.println("Failed, Contain");
    }


    }
}
