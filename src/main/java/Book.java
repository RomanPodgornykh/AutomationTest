import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.SignupPageObject;
import org.openqa.selenium.chrome.ChromeOptions;

public class Book {
    private static WebDriver driver = null;
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","C:\\IdeaProjects\\AutomationTest\\chromedriver.exe");
        driver = new ChromeDriver(co);
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        //driver.wait(3000);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0,2500)");

        driver.findElement(By.xpath("//h5[contains(text(),'Book Store Application')]")).click();

        //js.executeScript("scrollBy(0,2500)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Git Pocket Guide')]")).click();

        //Thread.sleep(3000);
        //driver.findElement(By.xpath("//button[@id='login']")).click();

        SignupPageObject.button_login(driver).click();

        //driver.findElement(By.xpath("//button[@id='newUser']")).click();

        SignupPageObject.button_newuser(driver).click();

        //driver.findElement(By.cssSelector("#firstname")).sendKeys("John");

        SignupPageObject.field_firstname(driver).sendKeys("John");

        //driver.findElement(By.cssSelector("#lastname")).sendKeys("Smith");

        SignupPageObject.field_lastname(driver).sendKeys("Smith");

        //driver.findElement(By.cssSelector("#userName")).sendKeys("John");

        SignupPageObject.field_username(driver).sendKeys("John");

        //driver.findElement(By.cssSelector("#password")).sendKeys("Test6tg6ug1");

        SignupPageObject.field_password(driver).sendKeys("Test6tg6ug1");

        //driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
        //Thread.sleep(5000);

        //driver.findElement(By.cssSelector("#register")).click();

        SignupPageObject.button_register(driver).click();
        driver.quit();






    }
}

