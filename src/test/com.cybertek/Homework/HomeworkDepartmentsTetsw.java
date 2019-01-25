package Homework;
//1.open browser
// 2.go to https://amazon.com
// 3.verifythat default dropdown option is all
// 4.verify that all options are sorted alphabetically
// 5.Click on the menu icon on the left
// 6.click on Full Store directory
// 7.capture all of the main department namesin the page. Examples for main department pages shown in the picture.
// 8.verify that departments names are sorted alphabetically
// 9.verify that all departments names are listed in the dropdown from step 2

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class HomeworkDepartmentsTetsw {
    WebDriver driver;
    Select allDepartments;
    Select AllDepartments2;


// this   TEST WILL FAIL

    @BeforeClass
    public void setUpMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://amazon.com");

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test(priority = 0)
    public void test() {
        WebElement selectElement = driver.findElement(By.id("searchDropdownBox")); //this dropdown has a tag select
        // create a select class object
        allDepartments = new Select(selectElement);
        //get the current selected option
        String selectedOption = allDepartments.getFirstSelectedOption().getText();
        Assert.assertTrue(selectedOption.contains("All"));
    }

    @Test(priority = 1)
    public void sortAlphabetically() {

        List<WebElement> ActualList = allDepartments.getOptions();
        String[] ListText2 = new String[ActualList.size() - 1];

        String[] ListText = new String[ActualList.size() - 1];

        for (int i = 0; i < ActualList.size() - 1; i++) {
            ListText[i] = ActualList.get(i).getText();
            ListText2[i] = ActualList.get(i).getText();
            System.out.println(ListText[i].toString());
        }
        Arrays.sort(ListText2);


        Assert.assertFalse(ListText.equals(ListText2));
        System.out.println();
        System.out.println("All options not sorted alphabetically");
    }

    @Test(priority = 2)

   public void mainDepartmentsTest(){

    driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
    driver.findElement(By.linkText("Full Store Directory")).click();
    }

    @Test(priority = 3)
    public void AllDepartmentsName() {

        List<String> DepartNamesText = new ArrayList<String>();
        List<String> DepartNamesText2 = new ArrayList<String>();

        List<WebElement> AllDepartNames = driver.findElements(By.xpath("//h2[@class='fsdDeptTitle']"));
        for (WebElement allDepartNames : AllDepartNames) {
            DepartNamesText.add(allDepartNames.getText());
            DepartNamesText2.add(allDepartNames.getText());
        }
        Collections.sort(DepartNamesText2);
        Assert.assertTrue(DepartNamesText.equals(DepartNamesText2));

        System.out.println();
        System.out.println(" All main departments names from Full Store Directory are sorted alphabetically ");


    }
//Verify
    @Test
    public void SortAlphabetic(){
            for (int i=0; i< AllDepartments2.getOptions().size()-1; i ++){
                String current = AllDepartments2.getOptions().get(i).getText();
                String next = AllDepartments2.getOptions().get(i+1).getText();
                System.out.println("Comparing: " + current + " with " + next);
            Assert.assertTrue(current.compareTo(next)<=0);

        }
    }
}

