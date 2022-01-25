package CreatingSelectors;

import org.openqa.selenium.WebDriver;

public class ConfigData {

    public static WebDriver driver;


    public static void custommizeChrDriver(String path){
        System.setProperty("webdriver.chrome.driver", path);
    }
}
