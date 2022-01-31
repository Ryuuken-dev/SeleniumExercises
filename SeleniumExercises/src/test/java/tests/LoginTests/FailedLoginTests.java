package tests.LoginTests;

import org.testng.annotations.Test;
import page.objects.LandingPage;
import page.objects.LoginPage;
import page.objects.TopMenuPage;
import tests.TestBase;

import static org.testng.Assert.*;


public class FailedLoginTests extends TestBase {

    /*
    Scenariusz testowy:

    1. Wejdź na stronę http://przyklady.javastart.pl/jpetstore/
    2. Kliknij w link Sign In
    3. Na stronie logowania podając nieprawidłowy login i hasło spróbuj się zalogować
    4. Test powinien skończyć się sprawdzeniem czy komunikat „Invalid username or password. Signon failed.” został wyświetlony.
     */

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

}
