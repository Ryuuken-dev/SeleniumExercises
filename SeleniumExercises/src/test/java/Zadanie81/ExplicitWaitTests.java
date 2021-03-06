package Zadanie81;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

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
    public void waitForDisappearingElement(){

        WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"checkbox\"]/input"));
        WebElement removeBtn = driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button"));

        assertTrue(checkBox.isDisplayed());
        assertFalse(checkBox.isSelected());

        removeBtn.click();
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(15));
        webDriverWait.until(ExpectedConditions.invisibilityOf(checkBox));
        WebElement text = driver.findElement(By.id("message"));
        assertEquals(text.getText(), "It's gone!");

    }

    @AfterMethod
    public void logOff(){
        driver.close();
        driver.quit();
    }
}
