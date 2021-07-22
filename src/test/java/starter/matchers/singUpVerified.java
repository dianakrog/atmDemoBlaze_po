package starter.matchers;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;

public class singUpVerified extends PageObject {

	public void singUpVerify() {
			WebDriverWait wait = new WebDriverWait(getDriver(), 2);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = getDriver().switchTo().alert();
			System.out.println(alert.getText());
			Assert.assertTrue(alert.getText().contains("Sign up successful."));

	}
}
