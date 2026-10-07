package actionMethods;

import org.openqa.selenium.WebElement;

public class ActionMethods {

	public void clickMethod(WebElement btn) {
		btn.click();
	}

	public void sendkeysMethod(WebElement txtbox, String txt) {
		txtbox.sendKeys(txt);
	}

	public String gettext(WebElement element1) {
		try {

			return element1.getText();

		} catch (Exception e) {
			return (e.getMessage());
		}
	}

	public boolean isReflected(WebElement element2) {
		try {

			return (element2.isDisplayed());

		} catch (Exception e) {
			return false;
		}
	}
}
