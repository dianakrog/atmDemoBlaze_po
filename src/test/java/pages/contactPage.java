package pages;

import net.thucydides.core.annotations.Step;
import webElement.demoBlazeContactWithoutLogin;

public class contactPage {

	demoBlazeContactWithoutLogin contactWL;

	@Step
	public void openAplication() {
		contactWL.open();
	}

	@Step
	public void opcContact() {
		contactWL.opcContact();
	}

	@Step
	public void enterContactMail() {
		contactWL.enterContactMail();
	}

	@Step
	public void enterContactName() {

		contactWL.enterContactName();
	}

	@Step
	public void enterMessage() {
		contactWL.enterMessage();
	}

	@Step
	public void clickSendMessage() {
		contactWL.clickSendMessage();
	}

}
