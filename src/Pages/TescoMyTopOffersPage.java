package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TescoMyTopOffersPage 
{
	@FindBy(xpath="//span[text()='Category']")
	private WebElement categoryFilterDD;
	
	@FindBy(linkText="Apples")
	private WebElement applesFilter;
	
	public void clickOnCategoryFilter()
	{
		if(applesFilter.isDisplayed())
		{}
		else
			{categoryFilterDD.click();}
	}
	
	public void clickOnApplesFilter()
	{
		applesFilter.click();
	}


}
