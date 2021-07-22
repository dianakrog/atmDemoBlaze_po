package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.SingUpPage;
import starter.matchers.matchersDemoBlaze;



public class stepsSingUpDB {
	
	@Steps
	SingUpPage singUp;
	
	@Steps
	matchersDemoBlaze dash; 
	
	@Before
	public void openAplication() {
		singUp.openAplication();
	}
	
	@Given("I want create that does not exist")
	public void i_want_create_that_does_not_exist() {
		
		singUp.opcSingUp();
	}
	
	@When("I sing Up with valid information {string} and {string}")
	public void i_sing_Up_with_valid_information_and(String string, String string2) {
		singUp.enterUser(string);
		singUp.enterPassword(string2);
	}	

	@When("I confirm the registration")
	public void i_confirm_the_registration() {
		singUp.clickSingUp();
		
	}

	@Then("I validate the User is registered")
	public void i_validate_the_User_is_registered() {
		dash.verifySingUp();
		
	}

}
