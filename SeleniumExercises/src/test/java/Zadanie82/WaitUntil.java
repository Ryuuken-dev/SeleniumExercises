package Zadanie82;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUntil {

    private final WebDriverWait webDriverWait;

    public WaitUntil(WebDriver driver) {
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void waitToInv(WebElement element){
        webDriverWait.until(ExpectedConditions.invisibilityOf(element));
    }

    public WebElement waitToVis(By by){
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
