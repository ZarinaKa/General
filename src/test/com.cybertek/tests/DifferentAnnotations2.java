package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DifferentAnnotations2 {
    @Test
    public void testOne (){
        System.out.println("THIS IS TEST ONE");
    }
    @Test
    public void testTwo() {
        System.out.println("This is test two");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("This is after  method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }


}
