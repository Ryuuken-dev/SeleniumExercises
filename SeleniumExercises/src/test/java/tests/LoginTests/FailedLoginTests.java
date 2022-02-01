package tests.LoginTests;

import org.testng.annotations.Test;
import page.objects.LandingPage;
import page.objects.LoginPage;
import page.objects.TopMenuPage;
import tests.TestBase;

import static org.testng.Assert.*;


public class FailedLoginTests extends TestBase {

    /*

     */

    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword(){

        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink();

        TopMenuPage topMenuPage = new TopMenuPage();
        topMenuPage.clickOnSignInLink();

        LoginPage loginPage = new LoginPage();
        loginPage.typeInUsernameField("NotExistingLogin");
        loginPage.typeInPasswordField("NotExistingPassword");
        loginPage.clickOnLoginButton();
        String warningMessage = loginPage.getWarningMessage();

        assertEquals(warningMessage, "Invalid username or password. Signon failed.");


    }

}
