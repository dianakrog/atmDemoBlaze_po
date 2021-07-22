package pages;

import net.thucydides.core.annotations.Step;
import webElement.demoBlazeSingUp;

public class SingUpPage {

	demoBlazeSingUp pageSingUp;

	@Step
	public void openAplication() {

		pageSingUp.open();
	}

	@Step
	public void opcSingUp() {

		pageSingUp.opcSingUp();

	}

	@Step
	public void enterUser(String user) {

		pageSingUp.enterUserName(user);

	}

	@Step
	public void enterPassword(String password) {

		pageSingUp.enterUserPass(password);

	}

	@Step
	public void clickSingUp() {

		pageSingUp.clickSingUp();
	}

}
