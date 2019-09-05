package sdetTutorials;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Downloadfile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		
		String path="C://selenium/";
		HashMap<String, Object>  chromePref=new HashMap<String, Object>();
		chromePref.put("profile.default_content_settings.popups", 0);
		chromePref.put("download.default_directory", path);
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", chromePref);
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("File Download")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[1]")).click();
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[7]")).click();
		

	}

}
