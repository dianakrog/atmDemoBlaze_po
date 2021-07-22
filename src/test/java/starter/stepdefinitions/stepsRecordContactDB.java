package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.contactPage;
import starter.matchers.matchersDemoBlazeContact;

public class stepsRecordContactDB {
	
	@Steps
	contactPage contact;
	
	@Steps
	matchersDemoBlazeContact recordContact; 
	
	@Before
	public void openAplication() {
		contact.openAplication();
	}
	
	@Given("I want record contact user")
	public void i_want_record_contact_user() {
	   contact.opcContact();
	}

	@When("register contact with valid information")
	public void register_contact_with_valid_information() {
		
		contact.enterContactMail();
		contact.enterContactName();
		contact.enterMessage();
	
	}

	@When("I confirm Send message")
	public void i_confirm_Send_message() {
		
		contact.clickSendMessage();

	}

	@Then("Show the message Thanks for the message")
	public void show_the_message_Thanks_for_the_message() {
		recordContact.verifyContact();
	}

}
