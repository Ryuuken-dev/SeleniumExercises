package Zadanie83;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.*;

public class FluentWaitTests {

    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://theinternet.przyklady.javastart.pl/dynamic_loading/1");
    }

    @Test
    public void fluentWaitTest(){

        WebElement hiddenText = driver.findElement(By.xpath("//*[@id=\"finish\"]/h4"));
        WebElement startBtn = driver.findElement(By.xpath("//*[@id=\"start\"]/button"));

        assertFalse(hiddenText.isDisplayed());

        startBtn.click();
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
        fluentWait.withTimeout(Duration.ofSeconds(15));
        fluentWait.pollingEvery(Duration.ofMillis(250));
        fluentWait.ignoring(NoSuchElementException.class);
        hiddenText = fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"finish\"]/h4")));
        assertTrue(hiddenText.isDisplayed());
    }
}
