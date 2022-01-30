package Zadanie82;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ExplicitWaitTests {

    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://theinternet.przyklady.javastart.pl/dynamic_controls");
    }

    @Test
    public void waitForPresenceOfTheElement(){

        WebElement checkBox = driver.findElement(By.id("checkbox"));
        WebElement removeBtn = driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button"));
        WaitUntil waitUntil = new WaitUntil(driver);

        assertTrue(checkBox.isDisplayed());
        assertFalse(checkBox.isSelected());

        removeBtn.click();
        waitUntil.waitToInv(checkBox);
        WebElement text = driver.findElement(By.id("message"));
        assertEquals(text.getText(), "It's gone!");

        removeBtn.click();
        checkBox = waitUntil.waitToVis(By.id("checkbox"));

        assertTrue(checkBox.isDisplayed());
        assertFalse(checkBox.isSelected());
    }

    @AfterMethod
    public void logOff(){
        driver.close();
        driver.quit();
    }
}
