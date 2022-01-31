package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPage {

    @FindBy(xpath = "//*[@id=\"Banner\"]/img")
    private WebElement loginLogo;

    private final WebDriver driver;

    public FooterPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isBannerAfterLoginDisplayed(){
        return loginLogo.isDisplayed();
    }
}
