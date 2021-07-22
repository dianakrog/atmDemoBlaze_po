package pages;

import net.thucydides.core.annotations.Step;
import webElement.demoBlazeLogIn;

public class LogInPage {
	//WebElement
	demoBlazeLogIn pageLogIn;
	
	@Step
	public void openAplication() {
		
		pageLogIn.open();
	}
	
	@Step
	public void opcLogIn() {
		
		pageLogIn.opcLogin();
		
	}
	
	
	@Step
	public void enterUser() {
		
		pageLogIn.enterUserName();
		
	}
	
	@Step
	public void enterPassword() {
		
		pageLogIn.enterUserPass();
		
	}
	
	@Step
	public void clickLogIn() {
		
		pageLogIn.clickLogIn();
	}

}
