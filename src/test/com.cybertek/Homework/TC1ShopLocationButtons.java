package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


// 1.Open Etsy
// 2.Enter search any term
// 3.Verify Shop location: Anywhere is checked
// 4.Verify Shop location: United States is not checked
// 5.Click on Shop location: United States
// 6.Verify Shop location: Anywhere is checked
// 7.Verify Shop location: United States is not checked


public class TC1ShopLocationButtons {
    WebDriver driver;
    @BeforeClass
    public void Setup(){
        WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
        driver.get("https://etsy.com");
        System.out.println("Setup web Driver");
    }
        @Test
    public void SearchItem(){
        WebElement searchBox = driver.findElement(By.xpath("//div[@class='search-input-wrapper text-field-wrapper']//input"));
            searchBox.sendKeys("dress"+ Keys.ENTER);
            System.out.println("search Item Test");
        }
@Test
    public void RadioButon(){
        WebElement RadioButon= driver.findElement(By.xpath("//*[@id='\"search-filter-reset-form\"]/div[7]/fieldset/div/div/div[1]/label[1]/a"));
    System.out.println("Anywhere is checked " + RadioButon.isSelected());
//    WebElement UnitedState = driver.findElement(By.linkText("Anywhere"));
//    System.out.println("UnitedState is not checked " + UnitedState.isSelected());
//    UnitedState.click();


    }
}
