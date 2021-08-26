package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXapth {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\SELENIUM\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch Chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic waits
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://mypage.rediff.com/login/dologin");
		//driver.findElement(By.xpath("//input[@value='Login']")).click();
		//driver.findElement(By.xpath("//input[contains(@value,'Login')]")).click();
		//driver.findElement(By.xpath("//input[starts-with(@value,'Log')]")).click();
		//driver.findElement(By.xpath("//input[ends-with(@value,'ogin')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'rediff.com')]")).click();
		
		Thread.sleep(8000);
		driver.quit();
	}

}
