package Zadanie73;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FileUploadTests {

    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://theinternet.przyklady.javastart.pl/upload");
    }

    @Test
    public void fileUploadTest(){

        WebElement fileUploadButton = driver.findElement(By.id("file-submit"));
        WebElement fileNameArea = driver.findElement(By.id("file-upload"));
        fileNameArea.sendKeys("E:\\Andrzej\\IT\\Testowanie\\Repozytoria\\SeleniumExercises\\" +
                "SeleniumExercises\\src\\main\\resources\\testfile.txt");
        fileUploadButton.click();
        WebElement uploadArea = driver.findElement(By.id("uploaded-files"));
        assertEquals(uploadArea.getText(), "testfile.txt");

    }

    @AfterMethod
    public void logOff(){
        driver.close();
        driver.quit();
    }
}
