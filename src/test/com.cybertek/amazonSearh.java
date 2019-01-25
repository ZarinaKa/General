import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonSearh {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("charger"+ Keys.ENTER);
//verify search item
         String actual = driver.findElement(By.id("twotabsearchtextbox")).getText();
          if (actual.equals("charger")){
              System.out.println("Pass");
          }else{
              System.out.println("Failed");
              System.out.println("actual "+ actual);
              System.out.println("expected: Charger");

          }




    }
}
