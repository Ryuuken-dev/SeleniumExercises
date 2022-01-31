package TestExamples;

import org.openqa.selenium.WebDriver;
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

        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnEnterStoreLink();

        TopMenuPage topMenuPage = new TopMenuPage(driver);
        topMenuPage.clickOnSignInLink();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeInUsernameField("NotExistingLogin");
        loginPage.typeInPasswordField("NotExistingPassword");
        loginPage.clickOnLoginButton();
        String warningMessage = loginPage.getWarningMessage();

        assertEquals(warningMessage, "Invalid username or password. Signon failed.");


    }

    @AfterMethod
    public void logOff(){
        driver.close();
        driver.quit();
    }
}
