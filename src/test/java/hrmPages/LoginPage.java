package hrmPages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base_HRM.BasePage;

public class LoginPage extends BasePage{
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	By username = By.xpath("//input[@name='username']");
	By password= By.xpath("//input[@name='password']");
	By submit = By.xpath("//button[@type='submit']");
	By logo =By.xpath("//img[@alt='company-branding']");
	String name;
	
	public void loginlogo() {
		super.waitForElement(logo);
		if (driver.findElement(logo).isDisplayed()) {
		System.out.println("logo visible");
		}
		else {
			System.out.println("Logo not visible");
		}
	}
	public void EnterUserName(String Uname) {
		super.waitForElement(username);
		
		super.entervalue(username,Uname);
	}
	public void enterPasword(String pwd) {
		super.waitForElement(password);
		
		super.entervalue(password,pwd);
	}
	public void clickOnSubmit() {
		super.waitForElement(submit);
		clickable(submit);
	} 
	public void loginMehod() {
		this.EnterUserName(name);
		
	}
	

}
 