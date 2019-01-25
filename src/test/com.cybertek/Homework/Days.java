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

public class Days {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        WebElement Monday = driver.findElement(By.id("gwt-debug-cwCheckBox-Monday-input"));
        //  Monday.click();
        WebElement Tuesday = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));
        // Tuesday.click();
        WebElement Wednesday = driver.findElement(By.id("gwt-debug-cwCheckBox-Wednesday-input"));
        // Wednesday.click();
        WebElement Thursday = driver.findElement(By.id("gwt-debug-cwCheckBox-Thursday-input"));
        // Thursday.click();
        WebElement Friday = driver.findElement(By.id("gwt-debug-cwCheckBox-Friday-input"));
        //Friday.click();
        WebElement Saturday = driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-input"));
        //Saturday.click();
        WebElement Sunday = driver.findElement(By.id("gwt-debug-cwCheckBox-Sunday-input"));
        // Sunday.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);


        List<WebElement> DAYS = new ArrayList<WebElement>();
        DAYS.add(Monday);
        DAYS.add(Tuesday);
        DAYS.add(Wednesday);
        DAYS.add(Thursday);
        DAYS.add(Friday);
        DAYS.add(Saturday);
        DAYS.add(Sunday);


        Random randomNum = new Random();
        int RNum;
        int count = 0;
        do {
            for (int j = 0; j <= DAYS.size() - 1; j++) {
                RNum = randomNum.nextInt(DAYS.size());
               j = RNum;
                if (RNum != 4 && RNum != 5 && RNum != 6) {

                    DAYS.get(RNum).click();
                    System.out.println(DAYS.get(RNum).isSelected() + DAYS.get(RNum).getText() + " " + RNum);
                    DAYS.get(RNum).click();

                }
                if (RNum == 4) {
                    DAYS.get(RNum).click();
                    count++;
                    System.out.println(DAYS.get(RNum).isSelected() + DAYS.get(RNum).getText() + "Friday");
                    DAYS.get(RNum).click();
                }
            }
        } while (count != 3);
            return;



}
}
