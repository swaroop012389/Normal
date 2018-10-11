package commonClasses;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ProjectSpecificLibrary 
{

	@FindBy(id="ConfirmWarning")
	private WebElement alertWarningMessage;
	
	@FindBy(id="ConfirmQuest")
	private WebElement confirmationWarningMessage;
	
	@FindBy(id="DiscardChangesButton")
	private WebElement cancelCustomerCreationButton;
	
	@FindBy(id="RemainOnThePageButton")
	private WebElement remainOnSamePageButton;
	
	public ProjectSpecificLibrary()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public String getConfirmationAlertMessageText()
	{
     String res = alertWarningMessage.getText();
     return res;
	}
	
	public String getConfirmationWarningMessageText()
	{
     String res = confirmationWarningMessage.getText();
     return res;
	}
	
	public String getCancelCustomerCreationButtonMessage(String attributeName)
	{
     String res = cancelCustomerCreationButton.getAttribute(attributeName);
     return res;
	}
	
	public String getRemainOnSamePageButtonMessage(String attributeName)
	{
     String res = remainOnSamePageButton.getAttribute(attributeName);
     return res;
	}
	
	public void clickOnCancelCustomerCreationButton()
	{
		cancelCustomerCreationButton.click();
	}
	
	public void clickOnRemainOnSamePageButton()
	{
		remainOnSamePageButton.click();
	}
}
