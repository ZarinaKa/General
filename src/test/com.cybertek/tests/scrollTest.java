package tests;

import utilities.TestBase;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class scrollTest extends TestBase {
    @Test
    public void test() {

        driver.get("https://youtube.com");

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        actions.sendKeys(Keys.PAGE_UP).perform();

        actions.sendKeys(Keys.ARROW_DOWN).perform();


    }


}
