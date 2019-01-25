package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.List;

public class OpenXCL {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://openxcell.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        WebElement atribute = driver.findElement(By.linkText("Case Studies"));
        String atrName = atribute.getAttribute("class");
        System.out.println(atribute.getText());

        if (atrName.equals("mega-menu-link")) {
            System.out.println("Pass");
        } else {
            System.out.println("failed");
        }

        List<WebElement> links = driver.findElements(By.xpath("//body//a"));
        System.out.println(links.size());// count of tag a.
            for (WebElement eachLink: links){
             System.out.println(eachLink.getText());// print each element on webpage
}


    }
}