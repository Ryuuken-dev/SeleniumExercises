package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AngelFishPage {

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a")
    private WebElement smallAngelfishAddToCartButton;

    private WebDriver driver;

    public AngelFishPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addSmallAngelfishToCard(){
        smallAngelfishAddToCartButton.click();
    }
}
