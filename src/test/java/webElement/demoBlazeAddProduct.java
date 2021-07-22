package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class demoBlazeAddProduct extends PageObject {

	public void clickLaptops() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		$(By.xpath("(//a[contains(@href, '#')])[10]")).click();

	}

	public void selectProduct() {

		$(By.xpath("//a[contains(text(),'MacBook Pro')]")).click();
	}

	public void addToCart() {

	/*	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		WebElement btnAddTo = $(By.xpath("(//a[contains(@href, '#')])[9]"));

		withAction().moveToElement(element(btnAddTo)).moveToElement(element(btnAddTo)).click().build().perform();

		btnAddTo.click();

	}

}
