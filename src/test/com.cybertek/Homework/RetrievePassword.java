package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrievePassword {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/forgot_password");
         driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
         driver.findElement(By.xpath("//*[@class='icon-2x icon-signin']")).click();

if (driver.getCurrentUrl().contains("email_sent")){
    System.out.println("Pass");
}else{
    System.out.println("Fail");
    System.out.println("Actual URl " + driver.getTitle());

}



    }
}
