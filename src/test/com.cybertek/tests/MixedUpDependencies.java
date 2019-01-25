package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MixedUpDependencies {
   @Test
    public void openBrowser(){
        System.out.println("opening browsweer");
    }

    @Test(dependsOnMethods = "openBrowser")
    public void login(){
        System.out.println("login");
        Assert.assertTrue(false);
    }
    @AfterMethod
    public void cleanUP(){
        System.out.println("Close browser");
    }

}
