package scripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Example 
{
	
	@Test
	public void testExample() throws Exception
	{
	
	   System.setProperty("webdriver.gecko.driver", "C://Users//hp//Desktop//New folder//geckodriver.exe");
	   DesiredCapabilities capabilities = new DesiredCapabilities();
	   capabilities = DesiredCapabilities.firefox();
	   capabilities.setBrowserName("firefox");
	   capabilities.setVersion("45.0.1");
	   capabilities.setPlatform(Platform.WINDOWS);
	   capabilities.setCapability("marionette", false);
   	   WebDriver driver = new FirefoxDriver(capabilities);

	 driver.get("https://www.mysupermarket.co.uk/");
	 
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[contains(text(),'I accept')]"))));
	    element.click();
	 
	 driver.findElement(By.linkText("Sign In")).click();
	
	    File f1 = new File("C://Users//hp//Desktop//New folder//practice.xlsx");
		FileInputStream fis = new FileInputStream(f1);
		XSSFWorkbook w1 = new XSSFWorkbook(fis);	
		String username = w1.getSheet("data").getRow(1).getCell(2).getStringCellValue();
		String password = w1.getSheet("data").getRow(1).getCell(3).getStringCellValue();
      
	 driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
	 driver.findElement(By.xpath("//input[@id='PasswordLogin']")).sendKeys(password);
	 driver.findElement(By.linkText("Sign in ")).click();
	}
}
