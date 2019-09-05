package dropdown;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifiedSortedDropDownlist {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form");
		WebElement element=driver.findElement(By.id("continents"));
		element.click();
		Select dropdown=new Select(driver.findElement(By.id("continents")));
		ArrayList original=new ArrayList();
		java.util.List<WebElement> options=dropdown.getOptions();
		for(WebElement e:options) {
			original.add(e.getText());
			
		}
		System.out.println(original);
		System.out.println("\n");
		
		
		

	}

}
