package sdetTutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchAutomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium ");
		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']/li/descendant::div[@class='sbl1']"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			String item=list.get(i).getText();
			System.out.println(item);
			if(item.equals("selenium testing")) {
				list.get(i).click();
				break;
				
			}
		}
		

	}

}
