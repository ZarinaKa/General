import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DEmo {

    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/tinymce");
        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframe);
//xpath dont working
        driver.findElement(By.tagName("body")).sendKeys("hello");

        driver.switchTo().parentFrame();
        driver.findElement(By.linkText("Elemental Selenium")).click();
    }


}
