package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import actionMethods.ActionMethods;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utilities.ExcelUtils;

public class LoginProcessValidation_TC_002 extends BaseTest {

	@Test
	public void testLoginPage() throws IOException, InterruptedException {
		LoginPage obj2 = new LoginPage(driver);
		ActionMethods obj1 = new ActionMethods();
		HomePage obj3 = new HomePage(driver);
		ExcelUtils data = new ExcelUtils();
		logger.info("started fetching");
		System.out.println("username read");
		obj1.sendkeysMethod(obj2.txtUserName, data.getcellData(1, 0));
		System.out.println("Got user name");
		logger.info("got the username");
		Thread.sleep(1000);
		obj1.sendkeysMethod(obj2.txtpassword, data.getcellData(1, 1));
		System.out.println("Got pwd");
		logger.info("got the password");
		Thread.sleep(2000);
		obj1.clickMethod(obj2.btnLogoin);
		logger.info("clicked login");
		Thread.sleep(1000);
		String txt = obj1.gettext(obj3.txtHomepage);
		Assert.assertEquals(txt, "Products");
	}
}
