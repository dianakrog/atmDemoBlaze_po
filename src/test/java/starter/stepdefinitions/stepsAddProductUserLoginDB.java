package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.AddProductPage;
import pages.*;
import starter.matchers.*;

public class stepsAddProductUserLoginDB {

	@Steps
	LogInPage logIn;

	@Steps
	AddProductPage add;
	
	@Steps
	matchersDemoBlazeLogIn validLogIn;

	@Steps
	matchersDemoBlazeAddProd validAssProduct;

	@Before
	public void openAplication() {
		add.openAplication();

	}

	@Given("LogIn in DemoBlaza with existing user")
	public void login_in_DemoBlaza_with_existing_user() {
		logIn.opcLogIn();
		logIn.enterUser();
		logIn.enterPassword();
		logIn.clickLogIn();
	}

	@Given("I Add product Laptops")
	public void i_Add_product_Laptops() {
		add.selectOpc();
	}

	@When("Add product Laptops with MacBook Pro")
	public void add_product_Laptops_with_MacBook_Pro() {
		add.selectProduct();
		add.enterAddTo();
	}

	@Then("Show the message Product added")
	public void show_the_message_Product_added() {
		validAssProduct.verifyAddProduct();
	}

}
