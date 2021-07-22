package starter.matchers;

import net.thucydides.core.annotations.Step;

public class matchersDemoBlazeAddProd {

	addProdVerified addProdPageVerified;

	@Step
	public void verifyAddProduct() {

		addProdPageVerified.addProdVerify();

	}

}
