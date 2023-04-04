import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoTest {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","C:\\IdeaProjects\\AutomationTest\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(co);
        driver.manage().window().fullscreen();
        driver.get("https://demoqa.com/");

        //driver.wait(5000);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0,2500)");
        //driver.findElement(By.cssSelector("//h5[contains(text(),'Book Store Application')]")).click();
        driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards div.card.mt-4.top-card:nth-child(6) div:nth-child(1) div.card-body > h5:nth-child(1)")).click();


    }
}

