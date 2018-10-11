package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage 
{
	@FindBy(id="SignIn")
	  private WebElement signInLink;
	
	@FindBy(xpath="//span[text()='Tesco']")
	  private WebElement tescoLink;
	
	@FindBy(xpath="//span[text()='Asda']")
	  private WebElement asdaLink;
	
	@FindBy(xpath="//span[text()='Ocado']")
	  private WebElement ocadoLink;
	
	@FindBy(xpath="//span[text()='Waitrose']")
	  private WebElement waitroseLink;
	
	@FindBy(xpath="//span[text()='Sainsburys']")
	  private WebElement sainsburysLink;
	
	@FindBy(xpath="//span[text()='Morrisons']")
	  private WebElement morrisonsLink;
	
	@FindBy(xpath="//span[text()='Pounland']")
	  private WebElement poundlandLink;
	
	@FindBy(xpath="//span[text()='Iceland']")
	  private WebElement icelandLink;
	
	@FindBy(xpath="//span[text()='Aldio']")
	  private WebElement aldiLink;
	
	@FindBy(xpath="//span[text()='Lidl']")
	  private WebElement lidlLink;
	
	@FindBy(xpath="//span[text()='Amazon']")
	  private WebElement amazonLink;
	
	@FindBy(xpath="//span[text()='Boots']")
	  private WebElement bootsLink;
	
	@FindBy(xpath="//span[text()='Superdrug']")
	  private WebElement superdrugLink;
	
	@FindBy(xpath="//span[text()='M&S']")
	  private WebElement mandsLink;
	
	@FindBy(xpath="//span[text()='Poundstretcher']")
	  private WebElement poundstretcherLink;
	
	
	public void clickOnSignInLink()
	{
		signInLink.click();
	}
	
	public void clickOnTescoLink()
	{
		tescoLink.click();
	}
	
	public void clickOnAsdaLink()
	{
		asdaLink.click();
	}
	
	public void clickOnOcadoLink()
	{
		ocadoLink.click();
	}
	
	public void clickOnWaitroseLink()
	{
		waitroseLink.click();
	}
	
	public void clickOnSainsburysLink()
	{
		sainsburysLink.click();
	}
	
	public void clickOnMorrisonsLink()
	{
		morrisonsLink.click();
	}
	
	public void clickOnPoundlandLink()
	{
		poundlandLink.click();
	}
	
	public void clickOnIcelandLink()
	{
		icelandLink.click();
	}
	
	public void clickOnAldiLink()
	{
		aldiLink.click();
	}
	
	public void clickOnLidlLink()
	{
		lidlLink.click();
	}
	
	public void clickOnAmazonLink()
	{
		amazonLink.click();
	}
	
	public void clickOnBootsLink()
	{
		bootsLink.click();
	}
	
	public void clickOnSuperdrugLink()
	{
		superdrugLink.click();
	}
	
	public void clickOnMandSLink()
	{
		mandsLink.click();
	}
	
	public void clickOnPoundstretcherLink()
	{
		poundstretcherLink.click();
	}
}
