package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

public class ImplicitWaite {


    WebDriver driver;

    @BeforeMethod
    public void Setup(){
        driver = Driver.getDriver();

    }

    @AfterMethod
    public void tearDown()  throws InterruptedException {
        Thread.sleep(1000);
        Driver.closeDriver();
    }

    @Test
    public void ImplicitWait() throws InterruptedException{
        Thread.sleep(3000);
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
    }

}
