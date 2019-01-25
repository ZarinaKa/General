package tests;

import utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DragAndDrop extends TestBase {
     @Test
    public void test(){
         driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
         WebElement source = driver.findElement(By.id("draggable"));
         WebElement target = driver.findElement(By.id("droptarget"));

         actions.dragAndDrop(source,target).perform();

     }
@Test
    public void test2(){
    driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
    WebElement source = driver.findElement(By.id("draggable"));
    WebElement target = driver.findElement(By.id("droptarget"));

    //write the steps for doing the drag and  drop operation
    //without using the  dragAndDropp(); method

actions.
        clickAndHold(source).
                          moveToElement(target).release().build(). perform();



}

}
