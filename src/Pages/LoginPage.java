package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonClasses.SuperTestScript;

public class LoginPage 
{
	@FindBy(className="Email  Input")
      private WebElement username;
	
	@FindBy(className="PasswordLogin  Input")
	  private WebElement password;
		
	public void enterUsername(String userName)
	{
		username.sendKeys(userName);
	}
	
//	Wait fluwait = new FluentWait(SuperTestScript.driver)
//	.withTimeout(20, TimeUnit.SECONDS)
//	.pollingEvery(20, TimeUnit.SECONDS);
		
	public void enterPassword(String passWord)
	{
		password.sendKeys(passWord);
	}
	
	WebDriverWait expwait = new WebDriverWait(SuperTestScript.driver,20);
	private WebElement loginButton = expwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SignInButton")));
	
//    alertIsPresent()
//    elementSelectionStateToBe()
//    elementToBeClickable()
//    elementToBeSelected()
//    frameToBeAvaliableAndSwitchToIt()
//    invisibilityOfTheElementLocated()
//    invisibilityOfElementWithText()
//    presenceOfAllElementsLocatedBy()
//    presenceOfElementLocated()
//    textToBePresentInElement()
//    textToBePresentInElementLocated()
//    textToBePresentInElementValue()
//    titleIs()
//    titleContains()
//    visibilityOf()
//    visibilityOfAllElements()
//    visibilityOfAllElementsLocatedBy()
//    visibilityOfElementLocated()
    
	public void clickOnLogin()
	{
		loginButton.click();
	}
	
}
