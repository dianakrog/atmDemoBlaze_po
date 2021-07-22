package starter.matchers;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;

public class addProdVerified extends PageObject{
	
	public void addProdVerify() {
		
		WebDriverWait wait = new WebDriverWait(getDriver(), 2);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = getDriver().switchTo().alert();
		System.out.println(alert.getText());
		Assert.assertTrue(alert.getText().contains("Product added."));
	}

}
