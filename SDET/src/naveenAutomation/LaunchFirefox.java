package naveenAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {
	static WebDriver driver;

	public static void main(String[] args) {
		if(Constants.browserName.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
			driver=new FirefoxDriver();
		}else
		{
			System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
			
			driver=new ChromeDriver();
		}	
     	
		driver.get("https://www.facebook.com/");
		System.out.print(driver.getTitle());
		
		

	}

}
