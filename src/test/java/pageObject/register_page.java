package pageObject;

import base.Config;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class register_page extends Config {

    public register_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//span[@class='inner-focus hide-on-mobile truncate']")
    public WebElement SignINLocator;
    @FindBy(how = How.LINK_TEXT, using = "Register")
    public WebElement registerlocator;

    @FindBy(how = How.XPATH, using = "//input[@name='firstName']")
    public WebElement firstNamelocator;

    @FindBy(how = How.XPATH, using = "//input[@name='lastName']")
    public WebElement lastNamelocator;

    @FindBy(how = How.XPATH, using = "//input[@name='registerData']")
    public WebElement emaillocator;

    @FindBy(how = How.ID, using = "wag-password")
    public WebElement passwordlocator;
   @FindBy(how = How.XPATH, using = "//input[@id='wag-terms-checkbox']")
   public WebElement readandagreelocator;

@FindBy(how=How.XPATH,using="//a[@id='wag-rxuser-continue-btm']")
public WebElement continuebuttonLocator;

    public void clickonsigninbuttontolSignInWindow() {
        SignINLocator.click();
    }






  public void clickRegister() {
      registerlocator.click();

  }

    public void enterfirstname(){
        firstNamelocator.sendKeys("rumana");
    }
public void enterlastname(){
        lastNamelocator.sendKeys("akther");
}
public void enteremail(){
        emaillocator.sendKeys("rumanaakther355@gmail.com");
}
public void enterpassword(){
        passwordlocator.sendKeys("ruma3550");
}

public void agree(){
        readandagreelocator.click();

    }
public void Continue(){
        continuebuttonLocator.click();
    }


    public void verifyHomePageTitle(){
        String act = driver.getTitle();
        String exp = "Walgreens: Pharmacy, Health & Wellness, Photo & More for You";
        Assert.assertEquals(exp, act);
        System.out.println("I am in walgreens home page ");
    }


    public void readandagreelocator() {
    }
}



















