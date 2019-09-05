package naveenAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		//launching chrome browser
		driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
		
		//id
		driver.findElement(By.id("ap_email")).sendKeys("sush.rinwa@gmail.com");
		
		driver.findElement(By.id("ap_password")).sendKeys("sushila231082");
		
		driver.findElement(By.id("signInSubmit")).click();
		
		System.out.println("Title is :---->"+driver.getTitle());
		
		//By class name(not recommended)
		//driver.findElement(By.className("nav-input")).sendKeys("kids");
		
		//name
		Select select=new Select(driver.findElement(By.name("url")));
		List<WebElement> list=select.getOptions();
		System.out.println("No of options in the dropdown are : "+list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
		
		
		Actions action=new Actions(driver);
		
		//xpath
		WebElement el=driver.findElement(By.xpath("//span[contains(text(),'Account & Lists') and @class='nav-line-2']"));
		action.moveToElement(el).build().perform();
		
		//cssSelector
		//driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(7)")).click();
		
		//System.out.println(driver.getTitle());
		
		//linkText
		//driver.findElement(By.linkText("Whole Foods")).click();
		
		//partial linkText
		//driver.findElement(By.partialLinkText("Whole")).click();
		
		System.out.println(driver.findElement(By.tagName("input")));
		
			
		//driver.quit();

	}

}
