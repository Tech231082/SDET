package naveenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement fname=driver.findElement(By.name("firstname"));
		WebElement lname=driver.findElement(By.name("lastname"));
		WebElement number=driver.findElement(By.name("reg_email__"));
		WebElement pass=driver.findElement(By.name("reg_passwd__"));
		
		sendKeys(driver,fname,10,"Sula");
		sendKeys(driver,lname,5,"funk");
		sendKeys(driver,number,4,"sush.rinwa@gmail.com");
		sendKeys(driver,pass,4,"rahini@1234");

	}
	public static void sendKeys(WebDriver driver,WebElement elemenet,int timeout,String value) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(elemenet));
		elemenet.sendKeys(value);
	}

}
