package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObject {
    private static WebElement element = null;
    public static WebElement SignUp(WebDriver driver){
        element = driver.findElement(By.xpath("//button[@id='login']"));
        return element;
    }
}
