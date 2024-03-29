package naveenAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChromeTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		
		//for headless chrome we need to create an abject of class ChromeOptions
		ChromeOptions op=new ChromeOptions();
		op.addArguments("headless");
		//launching chrome browser
		WebDriver driver=new ChromeDriver(op);
		
	
		driver.get("https://freecrm.com");
		driver.findElement(By.linkText("LOG IN")).click();
		WebElement email=driver.findElement(By.name("email"));
		//email.clear();
		email.sendKeys("sush.rinwa@gmail.com");
		WebElement password=driver.findElement(By.name("password"));
		//password.clear();
		password.sendKeys("sushila231082");
		WebElement button=driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
		button.submit();

		String title=driver.getTitle();
		System.out.print(title);

	}

}
