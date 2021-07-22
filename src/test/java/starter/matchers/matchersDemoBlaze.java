package starter.matchers;

import net.thucydides.core.annotations.Step;

public class matchersDemoBlaze {
	
	singUpVerified singUpPageVerified; 
	
	@Step
	public void verifySingUp() {
		
		singUpPageVerified.singUpVerify();
	
	}

}
