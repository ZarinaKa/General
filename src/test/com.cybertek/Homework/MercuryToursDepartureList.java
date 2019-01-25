package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MercuryToursDepartureList {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get("http://www.newtours.demoaut.com/");
        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("tutorial");
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("tutorial" + Keys.ENTER);
        WebElement dropDwnName = driver.findElement(By.name("fromPort"));
        String DepartingFromActual = dropDwnName.getText();
        String DepartingFromExpected = "Acapulco";

        if (DepartingFromActual.equals(DepartingFromExpected)) {
            System.out.println("By default Departing From value is "+ DepartingFromActual);
        } else {
            System.out.println("Unexpected result, value is "+DepartingFromActual);
        }
        Thread.sleep(2000);


        WebElement selectedElements = driver.findElement(By.name("fromPort")); //founded our dropdown location
        Select List1 = new Select(selectedElements);//creating object List1 of Select type
              //  System.out.println(List1.getFirstSelectedOption().getText());//print 1 value from dropdown values
        Thread.sleep(2000);

        List <WebElement> ActualLocationsWeb = List1.getOptions(); //create ArrayList which contains values from dropdown
//        // create ARRAY LIST WITH String type and store our values from Webelemet class that need us for comparing expected List1 with actual
                 System.out.println(ActualLocationsWeb.size());
                      System.out.println();


        WebElement Airline = driver.findElement(By.name("airline"));
        Select AirlineList = new Select(Airline);
                 System.out.println(AirlineList.getFirstSelectedOption().getText());
        List <WebElement> CurentListAirlilne = AirlineList.getOptions();
                 System.out.println(CurentListAirlilne.size());
for (WebElement each:CurentListAirlilne){
    System.out.println(each.getText());
}

        List<String> ListOfLocations = new ArrayList<String>();
        for (WebElement ActualLocationsText : ActualLocationsWeb) {
            ListOfLocations.add(ActualLocationsText.getText());
        }
        System.out.println("Locations List " + ListOfLocations);

        List<String> ExpectedLocations = Arrays.asList("Acapulco", "Frankfurt", "London", "New York", "Paris", "Portland", "San Francisco", "Seattle", "Sydney", "Zurich");
        System.out.println(ExpectedLocations.size());

        System.out.print("Actual List are matched with expected : ");

        for (int i = 0; i < ListOfLocations.size(); i++) {
            for (int j = 0; j < ExpectedLocations.size(); j++) {
                if (ListOfLocations.get(i).equals(ExpectedLocations.get(j))) {
                    System.out.print(ListOfLocations.get(i)+" ");
                }
            }
        }
        System.out.println();

        List1.selectByIndex(3);
        if (selectedElements.getText().equals("New York")) {
            System.out.println("Pass");

        }
Thread.sleep(2000);
        List1.selectByVisibleText("Paris");
        if (selectedElements.getText().equals("Paris")) {
            System.out.println("Pass");
        }
        Thread.sleep(2000);

        List1.selectByValue("San Francisco");
        if (selectedElements.getText().equals("Paris")) {
            System.out.println("Pass");
        }
    }
}

