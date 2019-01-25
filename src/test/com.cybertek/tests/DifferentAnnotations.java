package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DifferentAnnotations {



    @Test
    public void testOne (){
        System.out.println("THIS IS TEST ONE");
    }

    @BeforeMethod ///its running first
    public void beforeMethod() {
        System.out.println("This is before method");
    }

       @Test
        public void testTwo() {
            System.out.println("This is test two");
        }

    @BeforeClass
    public void beforeClass() {
        System.out.println("this is before class");
    }










}
