package commonClasses;


import org.testng.Assert;

public class ValidationOperation 
{
public static String verifyMsg(String expRes, String actRes)
{
    try
   {
    Assert.assertEquals(actRes, expRes);
    return "pass";
   }
    catch(AssertionError rv)
   {
	return "fail";
   }
}
}
