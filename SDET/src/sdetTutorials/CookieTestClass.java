package sdetTutorials;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieTestClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com");
		Set<Cookie> cookies=driver.manage().getCookies();
		//System.out.println(cookies);
		System.out.println(cookies.size());
		Cookie cObj=new Cookie("myCookie","123456789");
		driver.manage().addCookie(cObj);
		Set<Cookie> cookies1=driver.manage().getCookies();
		System.out.println(cookies1.size());
		for(Cookie cookie:cookies1) {
			System.out.println("Name of the cookie= "+cookie.getName()+"    " + "Value of the cookie"+cookie.getValue());
		}
		driver.manage().deleteCookieNamed("csm-hit");
		System.out.println(driver.manage().getCookies());
		

	}

}
