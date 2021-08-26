package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\SELENIUM\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch Chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic waits
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		// get the count of links on the page
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		
		//Print out the text of all the links
		for(int i=0; i<linklist.size(); i++) {
			String linktest = linklist.get(i).getText();
			System.out.println(linktest);
		}
		
		Thread.sleep(10000);
		driver.quit();

	}

}
