package tests.SubmitAnOrderTests;

import org.testng.annotations.Test;
import page.objects.*;
import tests.TestBase;
import static org.testng.Assert.*;

public class FailedProceedToCheckoutTests extends TestBase {

    @Test
    public void asUserTryToProceedToCheckoutWithoutSigningIn(){

        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnEnterStoreLink();
        LeftMenuPage leftMenuPage = new LeftMenuPage(driver);
        leftMenuPage.clickOnFishLink();
        FishPage fishPage = new FishPage(driver);
        fishPage.chooseAngelfish();

        AngelFishPage angelFishPage = new AngelFishPage(driver);
        angelFishPage.addSmallAngelfishToCard();

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.proceedToCart();
        LoginPage loginPage = new LoginPage(driver);

        assertEquals(loginPage.getWarningMessage(), "You must sign on before attempting to check out. " +
                "Please sign on and try checking out again.");
    }
}
