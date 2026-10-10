package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import actionMethods.ActionMethods;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utilities.ExcelUtils;

public class TestCartCount_TC_004 extends BaseTest {

	@Test
	public void batchCount() throws IOException {

		ExcelUtils eu = new ExcelUtils();
		ActionMethods am = new ActionMethods();
		HomePage hp = new HomePage(driver);
		LoginPage lp = new LoginPage(driver);
		am.sendkeysMethod(lp.txtUserName, eu.getcellData(1, 0));
		am.sendkeysMethod(lp.txtpassword, eu.getcellData(1, 1));
		am.clickMethod(lp.btnLogoin);
		am.clickMethod(hp.btndirectaddtocartone);
		String count = am.gettext(hp.cartcount);
		Assert.assertEquals(count, "1");

	}

}
