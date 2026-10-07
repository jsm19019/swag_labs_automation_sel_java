package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "user-name")
	public WebElement txtUserName;

	@FindBy(id = "password")
	public WebElement txtpassword;

	@FindBy(id = "login-button")
	public WebElement btnLogoin;

	@FindBy(xpath = "//div[text()=\"Swag Labs\"]")
	public WebElement loginConfirmtxt;

}
