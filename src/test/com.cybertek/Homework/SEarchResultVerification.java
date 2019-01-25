package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SEarchResultVerification {

    WebDriver driver;

    @BeforeMethod
    public void Setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("http://amazon.com");
        System.out.println("Setup web Driver");
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    }


    @Test
    public void checkResult() throws InterruptedException {
        WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
        SearchBox.sendKeys("Selenium cookBook" + Keys.ENTER);
        Thread.sleep(3000);

        List<WebElement> ResultList = driver.findElements(By.xpath("//h2[@class='a-size-medium s-inline  s-access-title  a-text-normal']"));
        System.out.println(ResultList.size());
       List<String> Names = new ArrayList<String>();
        SoftAssert softAssert = new SoftAssert();



        for (int i = 0; i < ResultList.size(); i++) {

            Names.add(ResultList.get(i).getText().replace(" ","").replace(".:","").replace(",",""));
           System.out.println(Names.get(i));
           softAssert.assertTrue(Names.get(i).toLowerCase().contains("selenium"));
            System.out.println(Names.get(i).toLowerCase().contains("selenium"));
        }
        softAssert.assertAll();
    }

}






