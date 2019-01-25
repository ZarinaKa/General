package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
    @Test
    public void test1(){
        String a = "A";
        String b = "A";

        Assert.assertEquals(a,b); //compariing a to b
      //  System.out.println("");
    }
    @Test
    public void test2(){
        String a = "A";
        String b = "AAA";

        Assert.assertEquals(a,b); //compariing a to b
       // System.out.println(""); Junit takes first parameters as actual, second as expected
    }
    @Test
    public void test3(){
        boolean b = 1==1;
         Assert.assertTrue(b);

    }

}
