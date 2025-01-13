package hrmPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base_HRM.BasePage;

public class AdminPage extends BasePage{
	public AdminPage(WebDriver driver) {
		super(driver);
	}
	By admin = By.xpath("//a[contains(@href, '/web/index.php/admin/viewAdminModule')]");
	By userManagment = By.xpath("//li[@class ='oxd-topbar-body-nav-tab --parent --visited']");
	By User = By.xpath("//a[contains(text(),'Users')]");
	By Addbutton = By.xpath("//i[contains(@class,'bi-plus')]");
	By EmpName = By.xpath("//input[@placeholder ='Type for hints...']");
	By UserRole = By.xpath("(//div[@class ='oxd-select-wrapper'])[1]");
	
	public void clickOnadmin() {
		super.waitForElement(admin);
		super.clickable(admin);
	}
	public void clickOnUesrMangment() {
		super.clickable(userManagment);
	}
	public void ClickOnUser() {
		super.waitForElement(User);
		super.clickable(User);
	}
	public void ClickonAddButton()
	{
		super.waitForElement(Addbutton);
		super.clickable(Addbutton);
	}
	public void addUser()
	{
		super.waitForElement(Addbutton);
		log.info("Wating for"+ Addbutton);
		super.clickable(Addbutton);
	}
	public void addEmployeeName(String Ename)
	{
		InputValue(EmpName, Ename);
		log.info("added "+Ename);
		
	}
	public void addUserRole(String role) {
	    driver.findElement(UserRole).click();  // Click to open the role selection
	    List<WebElement> list = driver.findElements(By.xpath("//div[@role='option']"));
	    
	    // Check if the list is empty first
	    if (list.isEmpty()) {
	        log.info("No roles found.");
	        return;  // Exit the method if no options are available
	    }
	    
	    boolean roleFound = true;  // Flag to check if the role is selected
	    for (WebElement e : list) {
	        // Compare role with element text, ignoring case
	        if (role.equalsIgnoreCase(e.getText().trim())) {
	            e.click();  // Click the role if it's found
	            log.info(role + " role is selected");
	            roleFound = true;  // Mark role as found
	            break;  // Exit loop once the role is selected
	        }
	    }

	    // If the role was not found, log the message
	    if (!roleFound) {
	        log.info(role + " role is not available on the page.");
	    }
	}

		
	
}
