package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCheckboxFunctionality {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");

        WebElement chbox1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
        WebElement chbox2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));

        System.out.println("chbox1 "+ chbox1.isSelected() +" chbox2 "+chbox2.isSelected());

        if (!(chbox1.isSelected()) && chbox2.isSelected()) {
            chbox1.click();
                System.out.println("chbox1 is Selected is " + chbox1.isSelected());

        }  if (chbox1.isSelected() && chbox2.isSelected()) {
            chbox2.click();
            System.out.println("chbox2 is Selected is " + chbox2.isSelected());

        } if (chbox1.isSelected() && !(chbox2.isSelected())) {

            System.out.println("chbox1 is Selected is " + chbox1.isSelected());
            System.out.println("chbox2 is Selected is " + chbox2.isSelected());
       }
    }
}
