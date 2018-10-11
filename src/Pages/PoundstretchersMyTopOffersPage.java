package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonClasses.CommonLibrary;

public class PoundstretchersMyTopOffersPage 
{

	@FindBy(id="SelectStoreDropDownListWrp")
	private WebElement selectStoreDropDown;
	
	public void clickOnSelectStoreDropDown()
	{
		selectStoreDropDown.click();
	}
	
	public void selectStoreFromDropdown(int index)
	{
		CommonLibrary cl = new CommonLibrary();
	cl.selectOptionFromDropdownByIndex(selectStoreDropDown, index);
	}
	
	 
}
