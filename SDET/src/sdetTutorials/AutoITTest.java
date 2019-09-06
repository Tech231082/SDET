package sdetTutorials;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITTest {

	public static void main(String[] args) throws IOException, InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://tinyupload.com/");
		driver.findElement(By.name("uploaded_file")).click();
		
		Runtime.getRuntime().exec("C:\\text\\upload.exe");
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//img[@alt='Upload']")).click();
		
		

	}

}
