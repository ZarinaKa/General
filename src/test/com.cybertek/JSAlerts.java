import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JSAlerts {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/windows");

    }
@Test
    public void oopsTest(){
    driver.get("https://sweetalert.js.org/");
    driver.findElement(By.xpath("(//button[@class='preview'])[1]")).click();
//for Allert we have to have an atual Alert on webPage

    Alert alert = driver.switchTo().alert();
    alert.accept();

    }
@Test
    public void dismiss(){
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
    Alert alert = driver.switchTo().alert();
    alert.dismiss();//cancel
}
@Test
    public void alertText() throws InterruptedException{
    driver.get("http://the-internet.herokuapp.com/javascript_alerts");
    driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
    Alert alert = driver.switchTo().alert();
   Thread.sleep(2000);
    alert.sendKeys("Hello");   // typing on the alert
    alert.accept();

}

}
