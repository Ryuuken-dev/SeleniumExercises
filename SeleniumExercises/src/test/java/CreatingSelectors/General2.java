package CreatingSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class General2 extends ConfigData{


    /*
    Wykorzystując poznane dobre praktyki wybierz lokatory dla poniższych elementów ze strony
    http://przyklady.javastart.pl/jpetstore/actions/Account.action?newAccountForm=. Do wyboru i testowania selektorów
    użyj zakładki Elements z panelu deweloperskiego przeglądarki Chrome.

    Lista elementów do pokrycia:

    1. Edytowalne pole User ID
    2. Edytowalne pole New Password
    3. Edytowalne pole Repeat Password
    4. Lista wybieralna Language Preferences
    5. Lista wybieralna Favourite Category
    6. Przycisk edytowalny typu checkbox Enable MyList
    7. Przycisk edytowalny typu checkbox Enable MyBanner
    8. Przycisk Save Account Information
     */

    public static void main(String[] args) {

        custommizeChrDriver("E:\\Andrzej\\IT\\Testowanie\\Repozytoria\\" +
                "SeleniumExercises\\SeleniumExercises\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://przyklady.javastart.pl/jpetstore/actions/Account.action?newAccountForm=");

        //1
        WebElement userIdField = driver.findElement(By.name("username"));
        //2
        WebElement passwordField = driver.findElement(By.name("password"));
        //3
        WebElement repeatPasswordField = driver.findElement(By.name("repeatedPassword"));
        //4
        WebElement languagePreferencesList = driver.findElement(By.name("account.languagePreference"));
        //5
        WebElement favouriteCategoryList = driver.findElement(By.name("account.favouriteCategoryId"));
        //6
        WebElement enableMyListButton = driver.findElement(By.name("account.listOption"));
        //7
        WebElement enableMyBannerButton = driver.findElement(By.name("account.bannerOption"));
        //8
        WebElement saveAccountInformationButton = driver.findElement(By.name("newAccount"));


    }



}
