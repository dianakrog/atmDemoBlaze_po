package starter.matchers;

import net.thucydides.core.annotations.Step;

public class matchersDemoBlazeLogIn {

	logInVerified logInPageVerified;

	@Step
	public void verifyLogIn() {

		logInPageVerified.logInVerify();

	}

}
