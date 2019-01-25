package Homework;

    import io.github.bonigarcia.wdm .*;
import org.openqa.selenium .*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations .*;

import java.util .*;
import java.util.concurrent.TimeUnit;

    public class Departments {
        WebDriver driver;
        Select dropdown;
        List<WebElement> dropdownElements;
        ArrayList<String> dropdownLabels = new ArrayList<String>();
        ;
        List<WebElement> fullstoreServices;
        ArrayList<String> fullstoreServiceNames = new ArrayList<String>();


        @BeforeClass
        public void setUp() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(21, TimeUnit.SECONDS);

            driver.get("https://amazon.com");
            dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
            dropdownElements = dropdown.getOptions();

            for (int i = 0, index = 1; i < dropdownElements.size(); i++) {
                if (dropdownElements.get(i).getText().startsWith("  "))
                    dropdownLabels.add(i, "Clothing, Shoes & Jewelry: " + index++ + ") " + dropdownElements.get(i).getText().trim());
                else
                    dropdownLabels.add(i, dropdownElements.get(i).getText());
            }
        }

        @AfterClass
        public void cleanUp() {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
            driver.quit();
        }

        /**
         * 1.open browser
         * 2.go to https://amazon.com
         * 3.verify that default dropdown option is all
         * 4.verify that all options are sorted alphabetically
         * 5.Click on the menu icon on the left
         * 6.click on Full Store directory
         * 7.capture all of the main department names in the page.
         * Examples for main department pages shown in the picture.
         * 8.verify that departments names are sorted alphabetically
         * 9.verify that all departments names are listed in the dropdown
         * from step 2
         */
        @Test(priority = 1)
        public void testCase3() {
            Assert.assertTrue(dropdown.getFirstSelectedOption().getText().contains("All"));
        }

        @Test(priority = 2)
        public void testCase4() {
            for (int i = 1; i < dropdownLabels.size() - 1; i++) {
                System.out.println("ORIGINAL: " + dropdownElements.get(i).getText());
                System.out.println("\tEDITED: " + dropdownLabels.get(i) + "\n");

                Assert.assertTrue(dropdownLabels.get(i).compareTo(dropdownLabels.get(i + 1)) < 1);
            }
        }

        @Test(priority = 3)
        public void testCases5_6_7_8() {
            driver.findElement(By.id("nav-hamburger-menu")).click();

            driver.findElement(By.partialLinkText("Full Store Directory")).click();

            fullstoreServices = driver.findElements(By.tagName("h2"));
            for (WebElement each : fullstoreServices)
                fullstoreServiceNames.add(each.getText());

            Collections.sort(fullstoreServiceNames);
//        for (String each : fullstoreServiceNames)
//            System.out.println(each);
        }

        @Test(priority = 4)
        public void testCase9() {
            for (String each : fullstoreServiceNames) {
                try {
                    Assert.assertTrue(dropdownLabels.contains(each));
                    System.out.println(each + " is found in dropdown");
                } catch (Throwable t) {
                    System.out.println(">>>FAIL: " + each + " is NOT found in dropdown");
                }
            }

        }
    }



