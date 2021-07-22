package webElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

/***
 * Contiene los selectores para el Login en Demo Blaze
 * 
 * @author dgutierrez
 *
 */
public class demoBlazeSingUp extends PageObject {
	
	public void opcSingUp() {
		$(By.id("signin2")).click();
	}
	
	public void enterUserName(String user) {
		$(By.id("sign-username")).type(user);
	}

	public void enterUserPass(String password) {
		$(By.id("sign-password")).type(password);
	}

	public void clickSingUp() {
		$(By.cssSelector("#signInModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
		}
	
}
