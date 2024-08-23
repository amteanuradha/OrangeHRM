package hybrid;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.loginpagepom;

public class LoginpageTest extends baseclass {

	@BeforeClass
	public void setup()
	{
		launchweb();
	}

	@AfterClass
	public void teardown()
	{
		//driver.close();

	}


	@Test	
	public void checkPageTitle()
	{
		String pagetitle= driver.getTitle();
		if(pagetitle.equalsIgnoreCase("OrangeHRM"))
		{
			System.out.println("We are on correct page");
		}

	}
	@Test
	public void loginwithcorrectCredential()
	{
		loginpagepom loginpagepom=new loginpagepom();
		
		String username=loginpagepom.getUsername();
		String password=loginpagepom.getPassword();
		
		loginpagepom.setUsername(username);
		loginpagepom.setPassword(password);

		loginpagepom.loginClick();

	}


}
