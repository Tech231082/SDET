package sdetTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementExceptionHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.pavantestingtools.com/");
		driver.manage().window().maximize();
		WebElement trainingLink=driver.findElement(By.xpath("//*[@id=\"site-navigationpbt\"]/div/ul/li[13]/a"));
		trainingLink.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		try {
			trainingLink.click();
		}
		catch(StaleElementReferenceException e){
			WebElement trainingLink1=driver.findElement(By.xpath("//*[@id=\"site-navigationpbt\"]/div/ul/li[13]/a"));
			trainingLink1.click();
			
		}
		

	}

}
