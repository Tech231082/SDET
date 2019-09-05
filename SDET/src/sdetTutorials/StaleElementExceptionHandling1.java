package sdetTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementExceptionHandling1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.facebook.com");
		WebElement username=driver.findElement(By.id("email"));
		WebElement pass=driver.findElement(By.id("pass"));
		username.sendKeys("sush.rinwa@gmail.com");
		pass.sendKeys("sushila231082");
		driver.navigate().refresh();
		try {
		username.sendKeys("sush.rinwa@gmail.com");
		pass.sendKeys("sushila231082");
		}
		catch(StaleElementReferenceException e) {
			WebElement username1=driver.findElement(By.id("email"));
			WebElement pass1=driver.findElement(By.id("pass"));
			username1.sendKeys("sush.rinwa@gmail.com");
			pass1.sendKeys("sushila231082");
			
		}

	}

}
