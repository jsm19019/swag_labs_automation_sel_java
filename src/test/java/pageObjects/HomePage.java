package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[text()=\"Products\"]")
	public WebElement txtHomepage;
	
	@FindBy(xpath="//*[@class=\"inventory_list\"]/div[1]/div[2]/div[2]/button")
	public WebElement btndirectaddtocartone;
	
	@FindBy(xpath="//*[@class=\"inventory_list\"]/div[1]/div[2]/div[2]/div")
	public WebElement directproductpriceone;
	
	@FindBy(xpath="//*[@id=\"remove-sauce-labs-backpack\"]")
	public WebElement btnremove;
	
	@FindBy(xpath="//*[@class=\"shopping_cart_badge\"]")
	public WebElement cartcount;
	
	@FindBy(xpath="//*[@class=\"shopping_cart_link\"]")
	public WebElement cartbutton;

}