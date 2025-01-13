package hrmTest;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import hrmPages.AdminPage;
import hrmPages.LoginPage;
import utility_HRM.Utility;

public class AdminPageTest extends BaseTest{
	public AdminPageTest() {
		super();
	}
	LoginPage loginPage;
	AdminPage adminPage;
	LoginPageTest loginTest;
	Sheet sheet;
	
	@BeforeMethod
	public void Initialise() {
		Initialization();
		loginPage = new LoginPage(driver);
//		loginTest = new LoginPageTest();
//		loginTest.LoginWithValid();
////		loginPage.Initialization();
		loginPage.EnterUserName(prop.getProperty("UserId"));
		loginPage.enterPasword(prop.getProperty("Password"));
		loginPage.clickOnSubmit();
		log.info("login HRM portal");
		
	}
	@Test (priority = 1)
	public void UserManagment()
	{
		adminPage = new AdminPage(driver);
		adminPage.clickOnadmin();
		log.info("click on admin portal");
		adminPage.clickOnUesrMangment();
		adminPage.ClickOnUser();
		log.info("click on user");
		adminPage.addUser();
//		adminPage.addEmployeeName("Test");
		sheet = Utility.testData(0);
		log.info("test Data");
		adminPage.addEmployeeName(sheet.getRow(1).getCell(1).getStringCellValue());
		log.info("employee name added");
		adminPage.addUserRole(sheet.getRow(1).getCell(0).getStringCellValue());
		log.info("user role added");
//		adminPage.addUserRole();
		

	}
//	@Test (priority =2)
//	public void addUserdetais() {
//		sheet = Utility.testData(0);
//		
//		adminPage.addEmployeeName(sheet.getRow(1).getCell(1).getStringCellValue());
//
//
//		
//
//	}
//	@AfterMethod
//	public void quitejovb()
//	{
//		driver.close();
//	}

}
