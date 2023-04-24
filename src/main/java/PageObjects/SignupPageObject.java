package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObject {
    WebDriver driver = null;
    By loginbtn = By.xpath("//button[@id='login']");
    By newuserbtn = By.xpath("//button[@id='newUser']");
    By firstname = By.cssSelector("#firstname");
    By lastname = By.cssSelector("#lastname");
    By username = By.cssSelector("#userName");
    By password = By.cssSelector("#password");
    By registerbtn = By.cssSelector("#register");

    public SignupPageObject(WebDriver driver){
        this.driver = driver;
    }

    public void clickLoginButton() {
        driver.findElement(loginbtn).click();
    }

    public void clickNewuserButton() {
        driver.findElement(newuserbtn).click();
    }
    public void setFirstname(String text){
        driver.findElement(firstname).sendKeys(text);
    }
    public void setLastname(String text){
        driver.findElement(lastname).sendKeys(text);
    }
    public void setUsername(String text){
        driver.findElement(username).sendKeys(text);
    }
    public void setPassword(String text){
        driver.findElement(password).sendKeys(text);
    }
    public void clickRegisterButton(){
        driver.findElement(registerbtn).click();
    }
}