package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;

public class TopMenuPage {

    @FindBy(xpath = "//*[@id=\"MenuContent\"]/a[2]")
    private WebElement signOnLink;

    public TopMenuPage(){

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnSignInLink(){

        signOnLink.click();
    }
}
