import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HTMLPopUp {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
   // @AfterMethod
    public void cleanUp() throws InterruptedException{
       Thread.sleep(5000);
        driver.quit();
}

    @Test
public void doNotDestroyTheTest(){
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");
        driver.findElement(By.xpath("//span[.='Destroy the World']")).click();
        driver.findElement(By.xpath("//span[.='No']")).click();
    }
@Test
    public void popsTest(){
        driver.get("https://sweetalert.js.org/");
        driver.findElement(By.xpath("(//button[@class='preview'])[2]")).click();
        driver.findElement(By.xpath("//buton[.='OK']")).click();

}


}
