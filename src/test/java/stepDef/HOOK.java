package stepDef;

import base.Config;
import com.beust.jcommander.Parameterized;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.util.Strings;

public class HOOK extends Config {

    public static String url;
    public static String driverType = System.getProperty("browser");
    public static String envType = System.getProperty("env");

    @Before
    public void startTest(){
        if (Strings.isNullOrEmpty(envType)){
            envType="qa";
        }
        if (Strings.isNullOrEmpty(driverType)){
            driverType="ch";
        }
        driver = setupBrowser (driverType);
        switch (envType){
            case "qa":
                url = "https://www.walgreens.com/";

                break;
        }
        driver.get(url);

    }

    @After
    public void endTest(Scenario scenario){
        try {
            if (scenario.isFailed()){
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                // embed it in the report.
                scenario.attach(screenshot, "image/png", scenario.getName());
            }
        } finally {
            //  driver.quit();
        }
    }



}

















