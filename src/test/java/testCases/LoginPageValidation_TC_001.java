package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import actionMethods.ActionMethods;
import pageObjects.LoginPage;

public class LoginPageValidation_TC_001 extends BaseTest {

	@Test
	public void loginPageValidation() throws InterruptedException {
		logger.debug("Starting testing...");
		ActionMethods obj1 = new ActionMethods();
		LoginPage obj2 = new LoginPage(driver);

		String txt = obj1.gettext(obj2.loginConfirmtxt);
		logger.debug("Text captured");
		Assert.assertEquals(txt, "Swag Labs");
		Thread.sleep(1000);
	}

}
