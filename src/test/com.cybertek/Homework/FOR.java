package Homework;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FOR {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
        SearchBox.sendKeys("Selenim cookBook" + Keys.ENTER);
//        WebElement s = driver.findElement(By.xpath("//h2[@class='a-size-medium s-inline  s-access-title  a-text-normal']"));
//        String ds = s.getText();
//        System.out.println(ds);

        List<WebElement> ResultList = driver.findElements(By.xpath("//h2[@class='a-size-medium s-inline  s-access-title  a-text-normal']"));
        for (int i = 0; i < ResultList.size(); i++) {
            String s = ResultList.get(i).getText();
            System.out.println(s + ",");

        }
    }
}
