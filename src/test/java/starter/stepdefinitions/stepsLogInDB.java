package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.LogInPage;
import starter.matchers.matchersDemoBlazeLogIn;

public class stepsLogInDB {

	@Steps
	LogInPage logIn;

	@Steps
	matchersDemoBlazeLogIn dash;

	@Before
	public void openAplication() {
		logIn.openAplication();
	}

	@Given("I want LogIn in DemoBlaza with existing user")
	public void i_want_LogIn_in_DemoBlaza_with_existing_user() {
		logIn.opcLogIn();

	}

	@When("I LogIn with valid information user and password")
	public void i_LogIn_with_valid_information_user_and_password() {

		logIn.enterUser();
		logIn.enterPassword();

	}

	@When("I confirm the LogIn")
	public void i_confirm_the_LogIn() {
		logIn.clickLogIn();
	}

	@Then("BlazaDemo welcomes the user")
	public void blazademo_welcomes_the_user() {
		dash.verifyLogIn();

	}

}
