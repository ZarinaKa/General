package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Sports {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwRadioButton");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement football = driver.findElement(By.xpath("//span[@id='gwt-debug-cwRadioButton-sport-Football']/input"));
        System.out.println("Button Football is selected :"+football.isSelected());

        WebElement Baseball = driver.findElement(By.xpath("//span[@id='gwt-debug-cwRadioButton-sport-Baseball']/input"));
        System.out.println("Button Baseball is not selected: "+ !Baseball.isSelected());

        WebElement Basketball = driver.findElement(By.xpath("//span[@id='gwt-debug-cwRadioButton-sport-Basketball']/input"));
        System.out.println("Button Basketball is not selected: "+ !Basketball.isSelected());

        WebElement Hockey = driver.findElement(By.xpath("//span[@id='gwt-debug-cwRadioButton-sport-Hockey']/input"));
        System.out.println("Button Hockey is not selected: "+ !Hockey.isSelected());

        WebElement Soccer = driver.findElement(By.xpath("//span[@id='gwt-debug-cwRadioButton-sport-Soccer']/input"));
        System.out.println("Button Soccer is not selected: "+ !Soccer.isSelected());

        WebElement WaterPOlo = driver.findElement(By.xpath("//span[@id='gwt-debug-cwRadioButton-sport-WaterPolo']/input"));
        System.out.println("Button WaterPOlo is not selected: "+ !WaterPOlo.isSelected());

        System.out.println();

        List<WebElement> Sports = new ArrayList<WebElement>();
            Sports.add(football); Sports.add(Baseball); Sports.add(Basketball);
            Sports.add(Hockey);Sports.add(Soccer);Sports.add(WaterPOlo);

        Random randomNum = new Random();
                 int RNum;
        RNum = randomNum.nextInt(Sports.size());
            Sports.get(RNum).click();

            for (int j = 0; j <= Sports.size() - 1; j++) {
                if (j!=RNum){
                    System.out.println(Sports.get(j).isSelected());
                }else {
                    System.out.println(Sports.get(j).getText()+" was selected");


                }
            }
        }



}
