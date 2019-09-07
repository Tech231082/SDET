package multiBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class BaseTest {
	//public static  browser;
	public static WebDriver driver;
	
	
	
	@Test
	@Parameters({"browser"})
	public void test(@Optional("browser")) {
		if(browser.equals("chrome"))	{
			System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
			
			 driver=new ChromeDriver();
		}
		else {
			System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
			
			driver=new FirefoxDriver();
		}
		
	}
	
}	
	


