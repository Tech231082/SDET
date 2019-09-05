package sdetTutorials;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCookie {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Set<Cookie> number=driver.manage().getCookies();
		System.out.println(number.size());
		Cookie newCookie=new Cookie("myCookie","77777777");
		driver.manage().addCookie(newCookie);
		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println(cookies.size() );
		driver.manage().deleteCookie(newCookie);
		System.out.println(driver.manage().getCookies().size());
		

	}

}
