package headLessDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitHeadLess {

	public static void main(String[] args) {
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title=driver.getTitle();
		
		System.out.println(title);

	}

}
