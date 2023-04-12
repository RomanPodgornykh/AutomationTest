package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObject {
    private static WebElement element = null;
    public static WebElement button_login(WebDriver driver){
        element = driver.findElement(By.xpath("//button[@id='login']"));
        return element;
    }
    public static WebElement button_newuser(WebDriver driver){
        element = driver.findElement(By.xpath("//button[@id='newUser']"));
        return element;
    }
    public static WebElement field_firstname(WebDriver driver){
        element = driver.findElement(By.cssSelector("#firstname"));
        return element;
    }
    public static WebElement field_lastname(WebDriver driver){
        element = driver.findElement(By.cssSelector("#lastname"));
        return element;
    }
    public static WebElement field_username(WebDriver driver){
        element = driver.findElement(By.cssSelector("#userName"));
        return element;
    }
    public static WebElement field_password(WebDriver driver){
        element = driver.findElement(By.cssSelector("#password"));
        return element;
    }

    public static WebElement button_register(WebDriver driver){
        element = driver.findElement(By.cssSelector("#register"));
        return element;
    }

}
