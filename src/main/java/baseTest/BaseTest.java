package baseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.github.dockerjava.api.model.LogConfig;

import constantant.ConstantUsed;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseTest {
	public static WebDriver driver;
	public static Properties prop;
	protected static Logger log = LogManager.getLogger(BaseTest.class);
	
	public BaseTest( ){
				
			try {
				prop = new Properties();
				FileInputStream fl = new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\Practice_HRM\\src\\main\\resources\\prop.properties");
				prop.load(fl);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("file not found");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("not loaded");
			}
			
		 
	}
	public void Initialization() {
		String BrowserName =prop.getProperty("Browser");
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			driver.get(prop.getProperty("URL"));
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(ConstantUsed.PageLoag,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(ConstantUsed.ImplicitWait,TimeUnit.SECONDS);
			log.info("Chorme browser is selected");
			
		}
		
	}
	
	
}
