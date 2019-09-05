package sdetTutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSaerchTeast {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']/li/descendant::div[@class='sbl1']"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			String listItem=list.get(i).getText();
			System.out.println(listItem);
			if(listItem.contentEquals("java jdk")) {
				list.get(i).click();
				break;
				
			}
		}

	}

}
