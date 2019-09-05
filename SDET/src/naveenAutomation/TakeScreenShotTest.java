package naveenAutomation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenShotTest {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		//take screenshot
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//saving the screenshot to desired location
		FileUtils.copyFile(src, new File("C:\\JUnit\\eclipse-workspace\\SDET\\picUtil\\google.png"));
		

	}

}
