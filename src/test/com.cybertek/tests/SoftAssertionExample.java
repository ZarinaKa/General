package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample {
    @Test
    public void test1(){
        System.out.println("starting");

        Assert.assertTrue(true);
        System.out.println("Done");
    }

    @Test
    public void Test2(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("starting");

        softAssert.assertTrue(false);
        softAssert.assertEquals("google","etsy");
        System.out.println("Done");
        softAssert.assertAll();
    }

@Test
    public void Test3(){
    SoftAssert softAssert = new SoftAssert();
    System.out.println("starting");

    softAssert.assertTrue(false);
    Assert.assertTrue(false);

    System.out.println("Done");

    softAssert.assertAll();
}


}
