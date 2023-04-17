import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.SignupPageObject;
import org.openqa.selenium.chrome.ChromeOptions;

public class Book {
    public static void main(String[] args) {
        BookTest();
    }

    public static void BookTest(){
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");

        System.setProperty("webdriver.chrome.driver","C:\\IdeaProjects\\AutomationTest\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(co);

        SignupPageObject signupPajeobj = new SignupPageObject(driver);
        driver.get("https://demoqa.com/");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0,2500)");
        driver.findElement(By.xpath("//h5[contains(text(),'Book Store Application')]")).click();

        signupPajeobj.clickLoginButton();
        signupPajeobj.clickNewuserButton();
        signupPajeobj.setFirstname("John");
        signupPajeobj.setLastname("Smith");
        signupPajeobj.setUsername("John");
        signupPajeobj.setPassword("Test6tg6ug1");
        signupPajeobj.clickRegisterButton();
        //driver.quit();
    }


}
