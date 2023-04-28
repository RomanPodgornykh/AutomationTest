package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
    private WebDriver driver;
    @FindBy(css = "#userName")
private WebElement usernameField;
    @FindBy(css = "#password")
private WebElement passwordField;

    public LoginPageFactory(WebDriver driver){
    this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void login(String username, String password){
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        passwordField.submit();

    }
}
