package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_Register {
    @Given("Navigate to Webseite")
    public void navigateToWebseite() {
        GWD.getDriver().get("https://shop.demoqa.com/");


    }

    @When("Enter username,email_adress and password and click register button")
    public void enterUsernameEmail_adressAndPasswordAndClickRegisterButton() {
    }

    @Then("User should register successfully")
    public void userShouldRegisterSuccessfully() {
    }
}
