package TestExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    @FindBy(xpath = "//*[@id=\"Content\"]/p[1]/a")
    private WebElement enterStoreLink;

    private final WebDriver driver;

    public LandingPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnEnterStoreLink(){

        enterStoreLink.click();
    }
}
