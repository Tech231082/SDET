package multiBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserName;

public class BaseTest {
	public static WebDriver driver;
	@Parameters("browserName")
	@BeforeTest
	public void setUp() {
	
				
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	

}
