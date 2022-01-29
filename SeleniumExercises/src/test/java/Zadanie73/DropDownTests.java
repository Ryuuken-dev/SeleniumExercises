package Zadanie73;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class DropDownTests {

    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://theinternet.przyklady.javastart.pl/dropdown");
    }

    @Test
    public void dropDownTest(){

        WebElement dropdownMenu = driver.findElement(By.id("dropdown"));
        Select dropdownSelected = new Select(dropdownMenu);

        assertEquals(dropdownSelected.getFirstSelectedOption().getText(), "Please select an option");

        dropdownSelected.selectByValue("1");
        assertEquals(dropdownSelected.getFirstSelectedOption().getText(), "Option 1");

        dropdownSelected.selectByValue("2");
        assertEquals(dropdownSelected.getFirstSelectedOption().getText(), "Option 2");

    }

    @AfterMethod
    public void logOff(){
        driver.close();
        driver.quit();
    }
}
