package CreatingSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.Scanner;

public class General {
    /*
    Stwórz lokatory XPath oraz CSS dla poniższych elementów ze strony
    http://przyklady.javastart.pl/jpetstore/actions/Catalog.action. Do tworzenia i testowania selektorów użyj zakładki
    Elements z panelu deweloperskiego przeglądarki Chrome.

    Lista elementów do pokrycia:

    1. Logo w lewym górnym rogu strony głównej,
    2. Przycisk koszyk,
    3. Link do strony logowania,
    4. Link do strony pomocy,
    5. Pole wyszukiwarki,
    6. Przycisk Search,
    7. Link Fish z górnego menu,
    8. Link Dogs z górnego menu,
    9. Link Reptiles z górnego menu,
    10. Link Cats z górnego menu,
    11. Link Birds z górnego menu,
    12. Link Fish z bocznego menu,
    13. Link Dogs z bocznego menu,
    14. Link Reptiles z bocznego menu,
    15. Link Cats z bocznego menu,
    16. Link Birds z bocznego menu,
    17. Główny obraz strony,
    18. Hiperłącze do strony www.mybaits.org.
     */


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "E:\\Andrzej\\IT\\Testowanie\\Repozytoria\\SeleniumExercises\\" +
                "SeleniumExercises\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://przyklady.javastart.pl/jpetstore/actions/Catalog.action");

        //1
        WebElement logo = driver.findElement(By.id("LogoContent"));
        //2
        WebElement basketButton = driver.findElement(By.name("img_cart"));
        //3
        WebElement logInSiteLink = driver.findElement(By.linkText("Sign In"));
        //4
        WebElement helpSiteLink = driver.findElement(By.linkText("?"));
        //5
        WebElement searchField = driver.findElement(By.name("keyword"));
        //6
        WebElement searchButton = driver.findElement(By.name("searchProducts"));
        //7
        WebElement fishUpperLink = driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[1]"));
        //8
        WebElement dogsUpperLink = driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[2]"));
        //9
        WebElement reptilesUpperLink = driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[3]"));
        //10
        WebElement catsUpperLink = driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[4]"));
        //11
        WebElement birdsUpperLink = driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[5]"));
        //12
        WebElement fishLeftLink = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]"));
        //13
        WebElement dogsLeftLink = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[2]"));
        //14
        WebElement reptilesLeftLink = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[4]"));
        //15
        WebElement catsLeftLink = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[3]"));
        //16
        WebElement birdsLeftLink = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[5]"));
        //17
        WebElement mainImageContent = driver.findElement(By.id("MainImageContent"));
        //18
        WebElement mybaitsLink = driver.findElement(By.xpath("//*[@id=\"PoweredBy\"]/a"));

    }



}
