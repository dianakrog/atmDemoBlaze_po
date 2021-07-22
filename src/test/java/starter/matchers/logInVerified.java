package starter.matchers;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class logInVerified extends PageObject {

	public void logInVerify() {
		
			
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement user = getDriver().findElement(By.cssSelector("#nameofuser"));
		
		System.out.println(user.getText());

		Assert.assertEquals("Welcome User021358", user.getText());
		

	}

}
