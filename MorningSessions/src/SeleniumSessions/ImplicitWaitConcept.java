package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch Chrome
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//dynamic waits
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(10000);
		driver.quit();
	}
	
}
