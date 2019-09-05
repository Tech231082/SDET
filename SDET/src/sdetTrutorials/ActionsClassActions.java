package sdetTrutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		
		
		ChromeOptions options=new ChromeOptions();
		//options.addArguments("window-size-1400,800");
		options.addArguments("headless");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.spicejet.com/");
		String title=driver.getTitle();
		System.out.print(title);
		//driver.manage().deleteAllCookies();
		/*WebElement element=driver.findElement(By.xpath("//*[@id=\"highlight-addons\"]"));
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"header-addons\"]/ul/li[4]/a")).click();
		*/

	}

}
