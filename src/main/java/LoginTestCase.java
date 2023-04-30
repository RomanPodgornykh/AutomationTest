import PageObjects.LoginPageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class LoginTestCase {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\IdeaProjects\\AutomationTest\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(co);
        //LoginPageFactory LoginPage = new LoginPageFactory(driver);
        driver.get("https://demoqa.com/");
        //driver.wait(3000);
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,2500)");

        driver.findElement(By.xpath("//h5[contains(text(),'Book Store Application')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='login']")).click();

        LoginPageFactory loginPage = PageFactory.initElements(driver, LoginPageFactory.class);
        loginPage.login("JohnTron", "Demoqa1!");
        boolean isSuccessful = loginPage.isLoginSuccessfull();
        if(isSuccessful) {
            System.out.println("Login was successful!");}
        else {
            System.out.println("Login failed");
        };
        driver.close();
    }}
