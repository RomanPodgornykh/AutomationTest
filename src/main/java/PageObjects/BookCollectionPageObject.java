package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookCollectionPageObject {
    WebDriver driver = null;

// locators
    By profilebtn = By.xpath("//span[contains(text(),'Profile')]");
    By imagebtn = By.xpath("//div[contains(text(),'Image')]");
    By titlebtn = By.xpath("//div[contains(text(),'Image')]");
    By authorbtn = By.xpath("//div[contains(text(),'Author')]");
    By publisherbtn = By.xpath("//div[contains(text(),'Publisher')]");
    By actionbtn = By.xpath("//div[contains(text(),'Action')]");
    By deleteallbooksbtn = By.cssSelector("#submit");

//constructor
    public BookCollectionPageObject(WebDriver driver) {
        this.driver = driver;
    }

//methods
    public void clickprofilebtn(){driver.findElement(profilebtn).click();}
    public void clickimagebtn(){driver.findElement(imagebtn).click();}
    public void clicktitlebtn(){driver.findElement(titlebtn).click();}
    public void clickauthorbtn(){driver.findElement(authorbtn).click();}
    public void clickpublisherbtn(){driver.findElement(publisherbtn).click();}
    public void clickactionbtn(){driver.findElement(actionbtn).click();}
    public void clickdeleteallbooksbtn(){driver.findElement(deleteallbooksbtn).click();}

}