import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Dropdown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/dropdown");
// we have to locate an element with tag select
        WebElement selectElement = driver.findElement(By.id("dropdown"));
        //2. create obgect using the webelement list-optiins list
        Select list = new Select(selectElement);

        //print the selected options
        String selectedOptions = list.getFirstSelectedOption().getText();
        System.out.println(selectedOptions); // by default it gives us  some text

        //print all available options
        List<WebElement> options = list.getOptions();
        System.out.println("options size " + options.size());

        for (WebElement option : options){
            System.out.println(option.getText());
        }
        //select different options
        // 1. by vizible text
        list.selectByVisibleText("Option 2");
        System.out.println("SElected options " + list.getFirstSelectedOption().getText());
    }
}
