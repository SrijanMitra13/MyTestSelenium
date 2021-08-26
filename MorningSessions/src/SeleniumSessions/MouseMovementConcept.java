package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch Chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.goindigo.in/");
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Manage"))).build().perform();
		Thread.sleep(2000);
		//action.moveToElement(driver.findElement(By.linkText("Accommodation"))).build().perform();
		driver.findElement(By.linkText("Check-in")).click();
		
		Thread.sleep(15000);
		driver.quit();
	}

}
