package TestExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.time.Duration;

public class FailedLoginTests {

    /*
    Scenariusz testowy:

    1. Wejdź na stronę http://przyklady.javastart.pl/jpetstore/
    2. Kliknij w link Sign In
    3. Na stronie logowania podając nieprawidłowy login i hasło spróbuj się zalogować
    4. Test powinien skończyć się sprawdzeniem czy komunikat „Invalid username or password. Signon failed.” został wyświetlony.
     */

    public WebDriver driver;

    @BeforeMethod
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("http://przyklady.javastart.pl/jpetstore/");

    }

    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword(){

        WebElement enterStoreLink = driver.findElement(By.xpath("//*[@id=\"Content\"]/p[1]/a"));
        enterStoreLink.click();
        WebElement signOnLink = driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
        signOnLink.click();
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("NotProperUsername");
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("NotProperPassword");
        WebElement signOnButton = driver.findElement(By.name("signon"));
        signOnButton.click();
        WebElement messageLabel = driver.findElement(By.cssSelector(".messages li"));

        assertEquals(messageLabel.getText(), "Invalid username or password. Signon failed.");


    }

    @AfterMethod
    public void logOff(){
        driver.close();
        driver.quit();
    }
}
