import PageObjects.SignupPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProfileNavigationTest {
    WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\IdeaProjects\\AutomationTest\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(co);

        SignupPageObject loginObj = new SignupPageObject(driver);
        driver.get("https://demoqa.com/");
        //driver.wait(3000);
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,2500)");

        driver.findElement(By.xpath("//h5[contains(text(),'Book Store Application')]")).click();

        //js.executeScript("scrollBy(0,2500)");
        Thread.sleep(3000);
        loginObj.clickLoginButton();
        loginObj.setUsername("JohnTron");
        loginObj.setPassword("Demoqa1!");
        loginObj.clickLoginButton();
        driver.wait(3000);
        driver.quit();
    }
}