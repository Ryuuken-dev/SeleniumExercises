package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;

public class FooterPage {

    @FindBy(xpath = "//*[@id=\"Banner\"]/img")
    private WebElement loginLogo;

    public FooterPage(){

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public boolean isBannerAfterLoginDisplayed(){
        return loginLogo.isDisplayed();
    }
}
