package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @io.cucumber.java.en.Given("^User opens browser$")
    public void userOpensBrowser() {
        System.out.print("Hello");
    }

    @And("user navigated to Travel app url")
    public void userNavigatedToTravelAppUrl() {

    }

    @When("user enters the useremail")
    public void userEntersTheUseremail() {

    }

    @And("user enters the password")
    public void userEntersThePassword() {

    }

    @And("clicks on submit button")
    public void clicksOnSubmitButton() {
    }

    @Then("users should successfully log in")
    public void usersShouldSuccessfullyLogIn() {
    }

    @And("home page should be displayed")
    public void homePageShouldBeDisplayed() {
    }

}
