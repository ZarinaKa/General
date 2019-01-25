package tests;

import org.openqa.selenium.WebElement;
import pages.HomePages;
import pages.ListingPage;
import pages.PrestashopHomePage;
import utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorMessageValidationTest extends TestBase {

//    1. go to website http://automationpractice.com/index.php
//    2. try to login with wrong email
//    3. verify error message Invalid email address.


@Test
    public void wrongEmail() throws InterruptedException {

    HomePages homePage = new HomePages();

    driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");// (Links to an external site.)Links to an external site. ");

    homePage.username.sendKeys("admin");
    homePage.password.sendKeys("test");
    homePage.loginButton.click();

   String ExpectErrMsg = "Invalid Login or Password.";
   String ActualerrorMsg= homePage.errorMessage.getText();
   System.out.println(ActualerrorMsg);


    Assert.assertTrue(ActualerrorMsg.equals(ExpectErrMsg));


}


    @Test

//    Wrong password
//    1. go to website  http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx
//    2. try to login with wrong password
//    3. verify error message Authentication failed.
//}
    public void wrongPassword () throws InterruptedException {

        HomePages homePage = new HomePages();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        // (Links to an external site.)Links to an external site. ");

        homePage.username.sendKeys("Tester");
        homePage.password.sendKeys("Test");
        homePage.loginButton.click();

        String ActualerrorMsg = homePage.errorMessage.getText();
        System.out.println(ActualerrorMsg);

        String ExpectErrMsg = "Invalid Login or Password.";

        Assert.assertTrue(ActualerrorMsg.equals(ExpectErrMsg));

    }

    @Test

    public void blankUserName(){

        HomePages homePage = new HomePages();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        homePage.open();
        homePage.login("","test");
        String expectedError="Invalid Login or Password.";
        String actualError=homePage.errorMessage.getText();
        Assert.assertEquals(actualError,expectedError);

    }

    @Test
    public void test(){
        ListingPage nilesLAne=new ListingPage();
        ListingPage palmetLane=new ListingPage();

        PrestashopHomePage prestaShopHomePage=new PrestashopHomePage();
        WebElement tshirt=prestaShopHomePage.product("tshirt");
        WebElement dress=prestaShopHomePage.product("dress");
    }
}



