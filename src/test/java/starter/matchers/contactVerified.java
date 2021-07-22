package starter.matchers;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;

public class contactVerified extends PageObject {

	public void contactVerify() {

		WebDriverWait wait = new WebDriverWait(getDriver(), 2);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = getDriver().switchTo().alert();
		System.out.println(alert.getText());
		Assert.assertEquals("Thanks for the message!!", alert.getText());
	}

}
