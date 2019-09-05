package sdetTutorials;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotAPI {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://spreadsheetpage.com/index.php/file/yearly_calendar_with_holidays/");
		WebElement calander=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul/li[3]/a"));
		calander.click();
		Robot robot=new Robot();
		
		
		
		
		

	}

}
