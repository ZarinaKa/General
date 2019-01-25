package tests;

import utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploudTest  extends TestBase {
    @Test
    public void Test() throws InterruptedException{
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        //chooseFile.click();
    String path = "/Users/zarinakargaeva/Downloads/image.png";
       Thread.sleep(2000);
        chooseFile.sendKeys(path);
    driver.findElement(By.id("file-submit")).click();

        Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());

    }
}
