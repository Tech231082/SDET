package naveenAutomation;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class ImageDisableInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		
		ChromeOptions op=new ChromeOptions();
		
		disableImage(op);
		
		
		//launching chrome browser
		WebDriver driver=new ChromeDriver(op);
		
		driver.get("https://www.amazon.com/");
		
		System.out.println(driver.getTitle());
		
		//driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		

	}
	public static void disableImage(ChromeOptions op) {
		HashMap<String,Object> img=new HashMap<String,Object>();
		img.put("images", 2);
		HashMap<String,Object> pref=new HashMap<String,Object>();
		pref.put("profile.default_content_setting_values", img);
		op.setExperimentalOption("prefs", pref);
		
		
	}
	public static void disableImageFirefox(FirefoxOptions op) {
		FirefoxProfile ff=new FirefoxProfile();
		
		ff.setPreference("permissions.default.images", 2);
		op.setProfile(ff);
		op.setCapability(FirefoxDriver.PROFILE, ff);
}
}