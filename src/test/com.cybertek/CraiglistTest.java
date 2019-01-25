import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CraiglistTest {
    public static void main(String[] args)  throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        Thread.sleep(2000);

        driver.get("https://washington craiglist.com");





    }
}
