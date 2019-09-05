package naveenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class JavaScriptExecutorTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		WebElement fAccount=driver.findElement(By.xpath("//a[contains(text(),'Forgot account')]"));

	}
	public static void flash(WebDriver driver,WebElement element) {
		JavaScriptExecutor js=(JavaScriptExecutor)driver;
		String bgcolor=element.getCssValue("backgroundColor");
		changeColor("rgb(0,200,0)",element,driver);
		changeColor("bgcolor",element,driver);
		
		
	}
	public static void changeColor(String color,WebElement element,WebDriver driver) {
		JavaScriptExecutor js=(JavaScriptExecutor)driver;
	
	}

}
