package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
  WebDriver driver;

   @BeforeMethod
    public void setUp(){
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.get("htpps://Google.com");

    }
@Test
    public void test(){
    Assert.assertTrue(driver.getTitle().contains("adsf"));
}
    @AfterMethod
    public void tearDown (){
       driver.quit();
    }


}
