package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static  WebDriver driver;

    private Driver(){};

    public  static WebDriver getDriver (){
        if (driver == null){

         String browser = ConfigurationReader.getProperty("browser") ;
         switch (browser){
             case "chrome":
                 WebDriverManager.chromedriver().setup();
                 driver = new ChromeDriver();

                 break;
             case "firefox":
                 WebDriverManager.firefoxdriver().setup();
                 break;
             case "ie":
                 WebDriverManager.iedriver().setup();
                 break;
         }
           // WebDriverManager.chromedriver().setup();
        }

        return driver;
    }




    public static void closeDriver(){
        if (driver != null){
            driver.quit();
            driver=null;

        }
    }



}
