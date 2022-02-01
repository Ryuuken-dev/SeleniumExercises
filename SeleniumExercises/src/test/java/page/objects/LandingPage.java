package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;

public class LandingPage {

    @FindBy(xpath = "//*[@id=\"Content\"]/p[1]/a")
    private WebElement enterStoreLink;

    public LandingPage(){

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnEnterStoreLink(){

        enterStoreLink.click();
    }
}
