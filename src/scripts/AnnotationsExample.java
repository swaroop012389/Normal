package scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class AnnotationsExample 
{

	@Test(groups = {"Re"},priority=2)
public void testSample1() 
{
 System.out.println("Test 1");	
}
	@Test(groups = {"Reg"},priority=1)
public void testSample2() 
{
System.out.println("Test 2");	
}

	@Parameters ({"a","b"})
	@Test(groups = {"Re"}, priority=2)	
public void testSample3(int a,int b) 
{		
System.out.println("Test 3"); 
System.out.println(a+" "+b); 
}
	
	@Test(groups = {"Reg","Re"},priority=0)
public void testSample4() 
{
System.out.println("Test 4"); 	
}
	
	@Test(groups = {"Reg","Re"},priority=0)
public void testSample5() 
{
System.out.println("Test 5"); 	
}
	@AfterSuite
	public void afterSuite() 
	{
	System.out.println("After Suite is executed"); 	
	}
	
	@AfterTest
	public void afterTest() 
	{
	System.out.println("After Test is executed"); 	
	}
	
	@AfterClass
	public void afterClass() 
	{
	System.out.println("After Class is executed"); 	
	}

	@AfterMethod
	public void afterMethod() 
	{
	System.out.println("After Method is executed"); 	
	}
	
	@BeforeSuite
	public void beforeSuite() 
	{
	System.out.println("Before Suite starts"); 	
	}
	
	@BeforeTest
	public void beforeTest() 
	{
	System.out.println("Before Test starts"); 	
	}
	
	@BeforeClass
	public void beforeClass() 
	{
	System.out.println("Before Class starts"); 	
	}

	@BeforeMethod
	public void beforeMethod() 
	{
	System.out.println("Before starts starts"); 	
	}
	
	@Test(enabled = false)
	public void ignoreExample() 
	{
	System.out.println("Test Case Ignored"); 	
	}
	
//	@DataProvider(name = "Sample")
//	public void testDataProvider() throws Exception
//	{
//		int i=0;int j=0;
//		Object[][] data = new Object[i][j];
//		for(i=0;i<=3;i++)
//		{
//			for(j=0;j<=3;j++)
//			{		
//		      data[i][j]=ExcelOperation.readData("practice", i, j);
//			}
//		}
//
//	}
	
	
}
