package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;

public class FishPage {

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement angelfishLink;

    public FishPage(){

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void chooseAngelfish(){

        angelfishLink.click();
    }
}
