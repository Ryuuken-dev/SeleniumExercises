package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftMenuPage {

    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[1]")
    private WebElement fishLink;

    private final WebDriver driver;

    public LeftMenuPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnFishLink(){

        fishLink.click();
    }
}
