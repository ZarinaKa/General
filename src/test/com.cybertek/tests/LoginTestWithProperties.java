package tests;

import org.testng.annotations.Test;
import pages.HomePages;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class LoginTestWithProperties extends TestBase {




    @Test
    public void ReadPropertyTest(){

        driver.get(ConfigurationReader.getProperty("url"));

        HomePages homePage = new HomePages();

        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        homePage.login(username, password);


    }





}
