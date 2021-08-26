package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\SELENIUM\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch Chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		
		// Scrolling down
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 300)");
		Thread.sleep(2000);

		// Switching frames
		driver.switchTo().frame(0);
				
		// To perform drag and drop
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))
				.moveToElement(driver.findElement(By.xpath("//div[@id='droppable']")))
				.release()
				.build()
				.perform();

		Thread.sleep(8000);
		driver.quit();
	}

}
