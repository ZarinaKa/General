package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class ExplicitWait {

    WebDriver driver;


    @BeforeClass
    public void Setup(){
        driver= Driver.getDriver();
    }

    @Test
    public void  test () throws InterruptedException{

        Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_controls");


        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().findElement(By.xpath("//form[@id='input-example']//button")).click();
      // Thread.sleep(4000);

        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),10);
             wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='input-example']//input")));


        Driver.getDriver().findElement(By.xpath("//form[@id='input-example']//input")).sendKeys("Zarina");



    }


}
