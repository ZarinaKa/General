package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTourRadioButton {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.newtours.demoaut.com/");
        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("tutorial");
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("tutorial"+ Keys.ENTER);
        WebElement RBroundTRip =driver.findElement(By.name("tripType"));
        WebElement RBoneWay =driver.findElement(By.xpath("//*[@value='oneway']"));

        System.out.println("RoundTRip By default was selected " + RBroundTRip.isSelected());
        System.out.println("One Way  By default was not  selected " + !RBoneWay.isSelected());

        if (RBroundTRip.isSelected() && !(RBoneWay.isSelected())){

            RBoneWay.click();

        }else{
            System.out.println("OneWAY was selected");
        }
        System.out.println("Round Trip selected " + RBroundTRip.isSelected());
        System.out.println("One Way selected "+ RBoneWay.isSelected());

    }

}
