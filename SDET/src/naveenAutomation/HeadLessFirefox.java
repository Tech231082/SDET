package naveenAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessFirefox {

	public static void main(String[] args) {
		FirefoxBinary binary=new FirefoxBinary();
		binary.addCommandLineOptions("--headless");
		
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		FirefoxOptions ffo=new FirefoxOptions();
		ffo.setBinary(binary);
		WebDriver driver=new FirefoxDriver(ffo);
		driver.get("https://www.facebook.com/");
		System.out.print(driver.getTitle());

	}

}
