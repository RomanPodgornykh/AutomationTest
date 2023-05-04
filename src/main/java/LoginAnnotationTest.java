import PageObjects.LoginPageFactory;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginAnnotationTest {
    private WebDriver driver;

    @BeforeMethod
   public void Setup(){
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\IdeaProjects\\AutomationTest\\chromedriver.exe");
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
    }

    @Test
    public void newLogin() throws InterruptedException {
        driver.get("https://demoqa.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,2500)");
        driver.findElement(By.xpath("//h5[contains(text(),'Book Store Application')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='login']")).click();
        LoginPageFactory loginPage = PageFactory.initElements(driver, LoginPageFactory.class);
        loginPage.login("JohnTron", "Demoqa1!");
        Thread.sleep(2000);
        WebElement successMsg = driver.findElement(By.xpath("//label[@id='userName-value']"));
        String expMsg = "JohnTron";
        String actualMsg = successMsg.getText();
        Assert.assertEquals(actualMsg, expMsg);
    }

    @After
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }
}

