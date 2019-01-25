package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenciesTest {
    @Test
    public void login(){
        System.out.println("login");
        Assert.assertTrue(false);
    }
    @Test (dependsOnMethods = "login")
    public void zbuySth(){
        System.out.println("buy buy baby");
    }
    @Test(priority = 5)
    public void homePage(){
        System.out.println("home page");
    }

}
