package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch Chrome
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple 12 pro max");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Nillkin")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).clear();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Samsung F62");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
		
		Thread.sleep(15000);
		driver.quit();

	}

}
