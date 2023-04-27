package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPageObject {

        WebDriver driver = null;
        By loginbtn = By.xpath("//button[@id='login']");
        By username = By.cssSelector("#userName");
        By password = By.cssSelector("#password");

public LoginPageObject(WebDriver driver){this.driver = driver};
    public void clickLoginButton() {
        driver.findElement(loginbtn).click();
    }
    public void enterUsername(String text){driver.findElement(username).sendKeys(text);}
    public void enterPassword(String text){driver.findElement(password).sendKeys(text);}
    public void VerifyLogin(){
        driver.findElement(loginbtn).click();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Login page");

    }




}
