package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ListingPage {

    public ListingPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "asdfasfda")
    public WebElement address;


    @FindBy(xpath = "asdfasfda")
    public WebElement agent;


    @FindBy(xpath = "asdfasfda")
    public WebElement map;


}

