package Base_HRM;

import java.time.Duration;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import constantant.ConstantUsed;



public class BasePage {
	public static WebDriver driver;
	private WebDriverWait wait;
	protected static Logger log;
	

	public BasePage(WebDriver driver)
	{
		BasePage.driver=driver;
		log=LogManager.getLogger(BasePage.class);
		
	}
	public void waitForElement(By ele)
	{
		wait =new WebDriverWait(driver,Duration.ofSeconds(ConstantUsed.ewait));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ele));
		log.info("watting for" + ele);
		
	}
	public void clickable(By ele) {
		this.waitForElement(ele);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		driver.findElement(ele).click();
//		log.info("Click on"+ele );
	}
	public void InputValue(By ele, String value) {
		this.waitForElement(ele);
		this.clickable(ele);
		log.info("Click on " +ele + " to send value" );
		driver.findElement(ele).sendKeys(value);
	}
	
	public void entervalue(By ele, String value) {
		this.waitForElement(ele);
		driver.findElement(ele).clear();
		driver.findElement(ele).sendKeys(value);
	}
//	public void DropdownByValue(By ele, String DropdownValue) {
//		
////		Select dropdown = new Select(ele);
//		WebElement dropdown = driver.findElement(ele);
//		List<WebElement> list = dropdown.findElements(ele);
//		for (WebElement option : list) {
//			if(option.getText().equals(DropdownValue)) {
//				option.click();
//			}
////			else
//		}
//
//	}
	


}
