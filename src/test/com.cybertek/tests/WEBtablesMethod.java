package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WEBtablesMethod {
   WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(21, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
    }

   @Test
    public void Orders (){
       driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
       driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test" + Keys.ENTER);
       System.out.println("Login Succesfull");

       // find all the webTable
       WebElement table = driver.findElement(By.xpath("//table[@class='SampleTable']"));
      // System.out.println(table);


     List <WebElement> rows = table.findElements(By.tagName("tr"));
       for (WebElement row : rows){

    List <WebElement> columns= row.findElements(By.tagName("td"));
        for (WebElement column : columns ){
            System.out.println(column.getText() + " | ");
        }
           System.out.println();
           System.out.println("--------------------------");
}


    printData (1,1);
    printData (3,5);
    printData (7,3);

}
    public void printData(int row, int column) {

    String xpath = "//table[@class='SampleTable']//tr["+ (row +1)+"]//td["+ (column +1)+"]";
    WebElement tergetElement = driver.findElement(By.xpath(xpath));
    System.out.println(tergetElement.getText());
}
}