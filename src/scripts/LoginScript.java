package scripts;


import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.WelcomePage;
import commonClasses.SuperTestScript;

public class LoginScript extends SuperTestScript
{
	
@Test
public void testLoginScript() throws Exception
{

	WelcomePage wp = new WelcomePage();
	LoginPage lp = new LoginPage();
	
	
	wp.clickOnSignInLink();
	lp.enterUsername("swaroop012389@gmail.com");
	lp.enterPassword("23May1989");
    lp.clickOnLogin();
}
}
