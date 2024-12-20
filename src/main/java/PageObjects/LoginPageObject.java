package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

//locators
public class LoginPageObject {

        WebDriver driver = null;
        By loginbtn = By.xpath("//button[@id='login']");
        By username = By.cssSelector("#userName");
        By password = By.cssSelector("#password");


//constructor
public LoginPageObject(WebDriver driver){
    this.driver = driver;};

//methods
    public void clickLoginButton() {
        driver.findElement(loginbtn).click();
    }
    public void enterUsername(String text){driver.findElement(username).sendKeys(text);}
    public void enterPassword(String text){driver.findElement(password).sendKeys(text);}
    public void VerifyLogin(){
        driver.findElement(loginbtn).click();
        String title = driver.getTitle();
        //Assert.assertEquals(title, "DEMOQA");
        WebElement wellcomeMessage = driver.findElement(By.xpath("//label[@id='userName-value']"));
        WebElement welcomeMessage = null;
        Assert.assertTrue(welcomeMessage.isDisplayed(), "JohnTron");
        driver.close();
    }




}
