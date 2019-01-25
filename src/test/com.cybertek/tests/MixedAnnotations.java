package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class MixedAnnotations {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        System.out.println("Setting up the drivers here");
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUpMethod() {
        System.out.println("Openning browsers");
        driver = new ChromeDriver();
        System.out.println("Go to website and login ");
        driver.get("https://google.com");
    }
    @Test
    public void testOne(){
        System.out.println("Testinn, testinfg, testing : acount info ");

    }

    @AfterMethod
    public void beforeMethod() {
        System.out.println("logout");
        System.out.println("closing browser");
        driver.quit();
    }
    @AfterClass
    public void afterClass() {
        System.out.println("report Everything");
    }
    @Test
    public void testTwo(){
        System.out.println("Testing testing testing: payment");
    }
    @Test
    public void testThree(){
        System.out.println("Testing testing testing: another thing");
    }

}
