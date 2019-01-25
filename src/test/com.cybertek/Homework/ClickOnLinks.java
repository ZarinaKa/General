package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ClickOnLinks {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("File Download")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        if (driver.getCurrentUrl().contains("download")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.println("Actual: " + driver.getCurrentUrl());
        }
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.findElement(By.linkText("File Upload")).click();

        if (driver.getCurrentUrl().contains("upload")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.println("Actual: " + driver.getCurrentUrl());
        }
    }
}