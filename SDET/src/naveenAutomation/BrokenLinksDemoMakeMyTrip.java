package naveenAutomation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksDemoMakeMyTrip {

	public static void main(String[] args) throws MalformedURLException, IOException {
System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		
		//launching chrome browser
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
driver.get("https://www.makemytrip.com/");

		
		List<WebElement> list=driver.findElements(By.tagName("a"));
		
		list.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("Total links on the page are ----> "+list.size());
		
		List<WebElement> activeLinks=new ArrayList<WebElement>();
		
		//exclude inactive links href=null
		
		try {
			for(int i=0;i<list.size();i++) {
				//System.out.println(list.get(i).getAttribute("href"));
				if(list.get(i).getAttribute("href")!=null && (! list.get(i).getAttribute("href").contains("javascript"))) {
					activeLinks.add(list.get(i));
					
				}
			}
		}
		catch(StaleElementReferenceException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Total number of active links are --->>"+activeLinks.size());
		
		try {
			for(int i=0;i<activeLinks.size();i++) {
				HttpURLConnection conn=(HttpURLConnection)new URL(activeLinks.get(i).getAttribute("href")).openConnection();
				conn.connect();
				String respo=conn.getResponseMessage();
				conn.disconnect();
				
				System.out.println(activeLinks.get(i).getAttribute("href")+respo);
			}
		}
		catch(StaleElementReferenceException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
	
		
		driver.quit();


	}

}
