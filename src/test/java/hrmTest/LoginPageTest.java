package hrmTest;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import hrmPages.LoginPage;

public class LoginPageTest extends BaseTest {
	public LoginPageTest() {
		super();
	}
	LoginPage LoginPage;
	
	@BeforeMethod
	public void lunch() {
		Initialization();
		LoginPage =new LoginPage(driver);
	}
	@Test (priority =2 )
	public void LoginWithValid() {
		
		LoginPage.EnterUserName(prop.getProperty("UserId"));
		LoginPage.enterPasword(prop.getProperty("Password"));
		LoginPage.clickOnSubmit();
	}
	@Test(priority = 1)
	public void logotest()
	{
		LoginPage.loginlogo();
	}
	@AfterMethod
	public void quitejob() {
		driver.quit();
	}
	
	
}
