package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;

public class ShoppingCartPage {

    @FindBy(xpath = "//*[@id=\"Cart\"]/a")
    private WebElement proceedToCartButton;

    public ShoppingCartPage(){

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void proceedToCart(){

        proceedToCartButton.click();
    }
}
