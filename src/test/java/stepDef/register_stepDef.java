package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.register_page;

public class register_stepDef extends Config {
    register_page ru = new register_page(driver);

    @Given("I am at the walgreens homepage")
    public void iAmAtTheWalgreensHomepage() {
        ru.verifyHomePageTitle();
    }

    @And("I click on Account")
    public void iClickOnAccount() {
        ru.clickonsigninbuttontolSignInWindow();


    }

    @And("I click on Register")
    public void iClickOnRegister() {
        ru.clickRegister();


    }

    @And("I enter valid First Name")
    public void iEnterValidFirstName() {
        ru.enterfirstname();
    }

    @And("I enter valid Last Name")
    public void iEnterValidLastName() {
        ru.enterlastname();
    }

    @And("I enter valid Email Address")
    public void iEnterValidEmailAddress() {
        ru.enteremail();
    }

    @And("I enter valid Password")
    public void iEnterValidPassword() {
        ru.enterpassword();
    }


    @And("I click on I read and agree to the Walgreens terms of use")
    public void iClickOnIReadAndAgreeToTheWalgreensTermsOfUse() {
   ru.agree();
    }


    @When("I click on continue button")
    public void iClickOnContinueButton() {
    ru.Continue();
    }
}


