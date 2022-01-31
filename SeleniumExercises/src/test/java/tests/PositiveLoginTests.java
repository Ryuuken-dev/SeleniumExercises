package tests;

import org.testng.annotations.Test;
import page.objects.FooterPage;
import page.objects.LandingPage;
import page.objects.LoginPage;
import page.objects.TopMenuPage;

import static org.testng.Assert.assertTrue;

public class PositiveLoginTests extends TestBase{


    @Test
    public void asUserLoginUsingValidLoginAndPassword(){

        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnEnterStoreLink();

        TopMenuPage topMenuPage = new TopMenuPage(driver);
        topMenuPage.clickOnSignInLink();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeInUsernameField("j2ee");
        loginPage.typeInPasswordField("j2ee");
        loginPage.clickOnLoginButton();

        FooterPage footerPage = new FooterPage(driver);

        assertTrue(footerPage.isBannerAfterLoginDisplayed());
    }
}
