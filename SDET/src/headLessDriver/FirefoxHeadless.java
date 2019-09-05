package headLessDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxHeadless {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		FirefoxOptions options=new FirefoxOptions();
		options.setHeadless(true);
		
		WebDriver driver=new FirefoxDriver(options);
		driver.get("http://www.amazon.com");
		String title=driver.getTitle();
		System.out.println(title);

	}

}
