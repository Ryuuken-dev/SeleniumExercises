package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;

public class LeftMenuPage {

    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[1]")
    private WebElement fishLink;

    public LeftMenuPage(){

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnFishLink(){

        fishLink.click();
    }
}
