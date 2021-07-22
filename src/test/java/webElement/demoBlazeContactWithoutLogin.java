package webElement;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

/***
 * Selectores para el registro de contacto
 * 
 * @author Diana Gutierrez
 *
 */

public class demoBlazeContactWithoutLogin extends PageObject {

	public void opcContact() {
		
		$(By.xpath("//a[contains(text(),'Contact')]")).click();
	}

	public void enterContactMail() {
		$(By.id("recipient-email")).type("prueba@prueba.com");
	}

	public void enterContactName() {
		$(By.id("recipient-name")).type("Nombre pruebas");
	}

	public void enterMessage() {
		$(By.id("message-text")).type("contact option validation");
	}

	public void clickSendMessage() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		$(By.cssSelector("#exampleModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
		
	}

}
