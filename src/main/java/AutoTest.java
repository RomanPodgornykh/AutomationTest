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
        driver.get("https://demoqa.com/");
        driver.manage().window().fullscreen();
        //driver.wait(3000);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0,2500)");

        driver.findElement(By.xpath("//h5[contains(text(),'Book Store Application')]")).click();

        //js.executeScript("scrollBy(0,2500)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Git Pocket Guide')]")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='login']"));





    }
}

