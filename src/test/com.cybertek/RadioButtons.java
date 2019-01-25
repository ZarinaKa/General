import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadioButtons {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwRadioButton");

        WebElement blue = driver.findElement(By.id("gwt-debug-cwRadioButton-color-blue-input"));
        WebElement red = driver.findElement(By.id("gwt-debug-cwRadioButton-color-red-input"));

//        if (!(blue.isSelected() && red.isSelected())) {
//            blue.click();
//            System.out.println("blue clicked");
//        }
//        if (blue.isSelected() && (!red.isSelected())) {
//            red.click();
//            System.out.println("red is selcted");
//        }
//        if (red.isSelected() && !blue.isSelected()) {
//            System.out.println("red is selcted");
//        }

        System.out.println("Default");
        System.out.println("blue: " + blue.isSelected());
        System.out.println("red: " + red.isSelected());

        System.out.println("Clicking on BLUE");
        blue.click();
        System.out.println("blue: " + blue.isSelected());
        System.out.println("red: " + red.isSelected());

        System.out.println("Clicking on RED");
        red.click();
        System.out.println("blue: " + blue.isSelected());
        System.out.println("red: " + red.isSelected());

    }
}
