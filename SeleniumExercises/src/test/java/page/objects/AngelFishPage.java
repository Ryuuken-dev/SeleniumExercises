package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;

public class AngelFishPage {

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a")
    private WebElement smallAngelfishAddToCartButton;

    public AngelFishPage(){

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void addSmallAngelfishToCard(){
        smallAngelfishAddToCartButton.click();
    }
}
