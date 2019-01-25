import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NestedFrame {
    WebDriver driver;
    @BeforeMethod
   public void setup(){
        WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tinymce");

    }


    @Test
            public void SwitchByElement(){
        //locate the iframe
        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.tagName("body")).sendKeys("heLLO ");
    }
    @Test
    public void SwitchById(){
        //locate the iframe
        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.tagName("body")).sendKeys("heLLO ");
    }
    @Test
    public void SwitchByIndex(){
        //locate the iframe
        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(0);
        driver.findElement(By.tagName("body")).sendKeys("heLLO ");
    }


}
