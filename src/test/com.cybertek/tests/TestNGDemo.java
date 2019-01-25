package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNGDemo {
    @Test
    public void testOne(){
        System.out.println("Hello World!");
        String expected = "a";
        String actual = "B";

        if (expected.equals(actual)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");

        }// this is not how you test in TestNG

    }

}