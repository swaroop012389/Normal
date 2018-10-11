package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TescoApplesPage 
{

	@FindBy(linkText="Add to basket")
	private WebElement addToBasket;
	
	public void clickOnAddToBasket()
	{
		addToBasket.click();
	}
}
