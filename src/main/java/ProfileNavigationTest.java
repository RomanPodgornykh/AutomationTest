import PageObjects.LoginPageObject;
import PageObjects.SignupPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProfileNavigationTest {
    WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\IdeaProjects\\AutomationTest\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(co);

        LoginPageObject loginObj = new LoginPageObject(driver);
        driver.get("https://demoqa.com/");
        //driver.wait(3000);
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,2500)");

        driver.findElement(By.xpath("//h5[contains(text(),'Book Store Application')]")).click();

        //js.executeScript("scrollBy(0,2500)");
        Thread.sleep(3000);
        loginObj.clickLoginButton();
        loginObj.enterUsername("JohnTron");
        loginObj.enterPassword("Demoqa1!");
        loginObj.VerifyLogin();
        driver.wait(3000);

        driver.close();
    }
}