package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class LoginPageFactory {
    public WebDriver driver;
    @FindBy(css = "#userName")
    private WebElement usernameField;
    @FindBy(css = "#password")
    private WebElement passwordField;
    @FindBy(xpath = "//button[@id='login']")
    private WebElement loginbutton;
    @FindBy(xpath = "#userName-label")
    private WebElement usernamelabel;

    public void login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginbutton.click();


    }

    public boolean isLoginSuccessfull() {
        try {
            return usernamelabel.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
   }
}

