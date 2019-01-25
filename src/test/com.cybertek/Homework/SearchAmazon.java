package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAmazon {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("book" + Keys.ENTER);

        if (driver.getTitle().contains("book")){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Actual Title " + driver.getTitle() );
        }
    }
}
