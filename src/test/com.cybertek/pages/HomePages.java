package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePages {

    public HomePages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="ctl00_MainContent_username")
    public WebElement username;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement password;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(id="ctl00_MainContent_status")
    public WebElement errorMessage;





    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();

    }
    public void open(){
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

}


}
