package naveenAutomation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinksDemo {

	public static void main(String[] args) throws MalformedURLException, IOException {
		//create prefs map to store all preferences
		Map<String,Object> prefs=new HashMap<String,Object>();
		
		//put this into prefs map to switch off browser notification
		prefs.put("profile.default_content_setting_values.notifications", 2);
		
		//create chrome options to set this prefs				
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		
		//launching chrome browser
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sush.rinwa@gmail.com");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sushila231082");
		
		
		//WebElement element1=driver.findElement(By.xpath("//input[@type='submit']"));
		//element1.click();
		
		driver.get("https://www.makemytrip.com/");

		
		List<WebElement> list=driver.findElements(By.tagName("a"));
		
		list.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println(list.size());
		
		List<WebElement> activeLinks=new ArrayList<WebElement>();
		
		//exclude inactive links href=null
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getAttribute("href"));
			if(list.get(i).getAttribute("href")!=null) {
				activeLinks.add(list.get(i));
				
			}
		}
		
		System.out.println(activeLinks);
		
		for(int i=0;i<activeLinks.size();i++) {
			HttpURLConnection conn=(HttpURLConnection)new URL(activeLinks.get(i).getAttribute("href")).openConnection();
			conn.connect();
			String respo=conn.getResponseMessage();
			conn.disconnect();
			
			System.out.println(activeLinks.get(i).getAttribute("href")+respo);
		}

	}

}
