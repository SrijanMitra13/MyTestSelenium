package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch Chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://en.savefrom.net/24/");
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String parentWindowId = it.next();
		System.out.println("parent window id " + parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("Child window id: "+ childWindowId);
		
		driver.switchTo().window(childWindowId);
		
		System.out.println("child window pop up title"+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		System.out.println("parent window title" + driver.getTitle());

	}

}
