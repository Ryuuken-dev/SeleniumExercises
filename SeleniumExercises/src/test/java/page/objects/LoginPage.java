package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;
import waits.WaitForElement;

public class LoginPage {

    @FindBy(name = "username")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(name = "signon")
    private WebElement loginButton;

    @FindBy(css = ".messages li")
    private WebElement messageLabel;

    public LoginPage(){

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void typeInUsernameField(String login){

        WaitForElement.waitUntilElementIsVisible(usernameField);
        usernameField.sendKeys(login);
    }

    public void typeInPasswordField(String password){

        if (!passwordField.getAttribute("value").equals("")){
            passwordField.clear();
        }
        passwordField.sendKeys(password);
    }

    public void clickOnLoginButton(){

        loginButton.click();
    }

    public String getWarningMessage(){

        WaitForElement.waitUntilElementIsVisible(messageLabel);
        return messageLabel.getText();
    }
}
