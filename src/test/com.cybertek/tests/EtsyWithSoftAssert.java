package tests;

import utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EtsyWithSoftAssert extends TestBase {
    @Test
    public void test(){
        SoftAssert softAssert = new SoftAssert();

        driver.get("https://etsy.com");
        driver.findElement(By.id("search-query")).sendKeys("gift" + Keys.ENTER);

        softAssert.assertTrue(driver.getTitle().contains("gift"));
        Assert.assertTrue(driver.getTitle().contains("AAA"));
        //  softAssert.assertAll();
    }
}
