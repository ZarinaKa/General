package tests;

import utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleClickTest extends TestBase {

    @Test
    public void Test(){
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        driver.switchTo().frame("iframeResult");
                //create actions object
        Actions actions = new Actions(driver);
                // identify the webelement on which we double click
        WebElement text = driver.findElement(By.id("demo"));

                //double click in element
            // we eed to add  perform at the end  of any action
            actions.doubleClick(text).perform();
        Assert.assertTrue(text.getAttribute("style").contains("red"));






    }

}
