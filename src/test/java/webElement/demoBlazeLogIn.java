package webElement;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class demoBlazeLogIn extends PageObject{
	
	public void opcLogin() {
		$(By.id("login2")).click();
	}
	
	public void enterUserName() {
		$(By.id("loginusername")).type("User021358");
	}

	public void enterUserPass() {
		$(By.id("loginpassword")).type("123456");
	}

	public void clickLogIn() {
		$(By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
		
		}

}
