package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

    public class TestBase {

        protected  WebDriver driver;
        protected Actions actions;
        protected SoftAssert softAssert;


// WE DONT NEED THIS ANNOTAITIONS BCS WE HAVE ===> Driver.getDriver();
//    @BeforeClass
//    public void SetupClass(){
//        WebDriverManager.chromedriver().setup();


    @BeforeMethod
    public void setupMethod() {
         //Driver.getDriver();
                driver= Driver.getDriver();
        actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


    }
    @AfterMethod
    public void DownMethod() throws InterruptedException {
        Thread.sleep(4000);
        Driver.closeDriver();
        softAssert.assertAll();

    }





}
