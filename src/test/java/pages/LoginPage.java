package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.NAME, using = "UserName")
    public WebElement userNameText;

    @FindBy(how = How.NAME, using = "Password")
    public WebElement passwordText;

    @FindBy(how = How.NAME, using = "Login")
    public WebElement loginButton;

    public void Login(String userName, String password){
        userNameText.sendKeys(userName);
        passwordText.sendKeys(password);
    }

    public void ClickLogin(){
        loginButton.submit();
    }
}
