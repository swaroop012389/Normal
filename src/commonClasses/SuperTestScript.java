package commonClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

@Listeners(CustomListener.class)
public class SuperTestScript 
{
	public static WebDriver driver;
	
	@BeforeClass
	public static void preConfig() throws Exception
     {
		
	for(int i=1;i<=2;i++)
		{
	String browser = ExcelOperation.readData("data",1,0);
    String url = ExcelOperation.readData("data",1,1);
	if(browser.equals("FF"))
    {
		 System.setProperty("webdriver.gecko.driver", "C://Users//hp//Desktop//New folder//geckodriver.exe");
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities = DesiredCapabilities.firefox();
		 capabilities.setBrowserName("firefox");
		 capabilities.setVersion("45.0.1");
		 capabilities.setPlatform(Platform.WINDOWS);
		 capabilities.setCapability("marionette", false);	
		driver = new FirefoxDriver(capabilities);
		   }
		else if(browser.equals("Chrome"))
		   {
			 System.setProperty("webdriver.gecko.driver", "C://Users//hp//Desktop//New folder//geckodriver.exe");
			 DesiredCapabilities capabilities = new DesiredCapabilities();
			 capabilities = DesiredCapabilities.chrome();
			 capabilities.setBrowserName("chrome");
			 capabilities.setVersion(" ");
			 capabilities.setPlatform(Platform.WINDOWS);
			 capabilities.setCapability("marionette", false);
             driver = new ChromeDriver(capabilities);	
		   }
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
       }
     }
	
	
	@AfterClass
	public static void postConfig() throws Exception
	{
		driver.close();
	}
	
}