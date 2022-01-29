package Zadanie74;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class HoverTests {

    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://theinternet.przyklady.javastart.pl/hovers");
    }

    @Test
    public void hoverTest(){

        WebElement firstUserImg = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"));
        WebElement secondUserImg = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/img"));
        WebElement thirdUserImg = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/img"));
        Actions action = new Actions(driver);

        WebElement secondUserMsg = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/h5"));
        WebElement firstUserMsg = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/h5"));
        WebElement thirdUserMsg = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div/h5"));

        action.moveToElement(firstUserImg).perform();
        assertEquals(firstUserMsg.getText(), "name: user1");
        assertEquals(secondUserMsg.getText(), "");
        assertEquals(thirdUserMsg.getText(), "");

        action.moveToElement(secondUserImg).perform();
        assertEquals(secondUserMsg.getText(), "name: user2");
        assertEquals(firstUserMsg.getText(), "");
        assertEquals(thirdUserMsg.getText(), "");

        action.moveToElement(thirdUserImg).perform();
        assertEquals(thirdUserMsg.getText(), "name: user3");
        assertEquals(firstUserMsg.getText(), "");
        assertEquals(secondUserMsg.getText(), "");

    }

    @AfterMethod
    public void logOff(){
        driver.close();
        driver.quit();
    }
}
