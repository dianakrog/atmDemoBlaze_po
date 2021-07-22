package pages;

import net.thucydides.core.annotations.Step;
import webElement.demoBlazeAddProduct;

public class AddProductPage {

	demoBlazeAddProduct pageAddProduct;

	@Step
	public void openAplication() {

		pageAddProduct.open();
	}

	@Step
	public void selectOpc() {

		pageAddProduct.clickLaptops();

	}

	@Step
	public void selectProduct() {

		pageAddProduct.selectProduct();

	}

	@Step
	public void enterAddTo() {

		pageAddProduct.addToCart();

	}

}
