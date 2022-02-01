package tests.SubmitAnOrderTests;

import org.testng.annotations.Test;
import page.objects.*;
import tests.TestBase;
import static org.testng.Assert.*;

public class FailedProceedToCheckoutTests extends TestBase {

    @Test
    public void asUserTryToProceedToCheckoutWithoutSigningIn(){

        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink();
        LeftMenuPage leftMenuPage = new LeftMenuPage();
        leftMenuPage.clickOnFishLink();
        FishPage fishPage = new FishPage();
        fishPage.chooseAngelfish();

        AngelFishPage angelFishPage = new AngelFishPage();
        angelFishPage.addSmallAngelfishToCard();

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        shoppingCartPage.proceedToCart();
        LoginPage loginPage = new LoginPage();

        assertEquals(loginPage.getWarningMessage(), "You must sign on before attempting to check out. " +
                "Please sign on and try checking out again.");
    }
}
