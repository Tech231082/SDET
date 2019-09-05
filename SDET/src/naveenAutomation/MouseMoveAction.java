package naveenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMoveAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		//driver.get("https://www.google.com/");
		driver.get("https://www.spicejet.com/");
		Actions action=new Actions(driver);
		WebElement element=driver.findElement(By.linkText("ADD-ONS"));
		action.moveToElement(element).build().perform();
		
		
		

	}

}
