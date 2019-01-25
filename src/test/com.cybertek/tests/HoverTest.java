package tests;

import utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTest extends TestBase {

    @Test
    public void test() {
        driver.get("https://www.amazon.com");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement signIn = driver.findElement(By.xpath("//span[.='Hello. Sign in']"));
        actions.moveToElement(signIn).perform();

        driver.findElement(By.xpath("//span[.='Your Hearts']")).click();
        Assert.assertTrue(driver.getTitle().contains("Interesting"));
    }


        @Test
        public void test2() {
            driver.get("https://www.amazon.com");
            WebElement help = driver.findElement(By.xpath("(//a[.='Help'])[2]"));
            actions.moveToElement(help).perform();
        }









}
