package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.time.Duration;

public class Config {

    public static WebDriver driver;
    // We use this driver as variable to init the driver on other classes & for reusable purposes


    public static WebDriver setupBrowser (String driverType){

        if (driverType.equalsIgnoreCase("ch")) {
            ChromeOptions options = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);

        }
        else if (driverType.equalsIgnoreCase("ch")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        // GF.implicitWait(45);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        return driver;
    }


























}
