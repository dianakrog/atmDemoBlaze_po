package starter.matchers;

import net.thucydides.core.annotations.Step;

public class matchersDemoBlazeContact {
	

	contactVerified contactPageVerified;

	@Step
	public void verifyContact() {

		contactPageVerified.contactVerify();

	}


}
