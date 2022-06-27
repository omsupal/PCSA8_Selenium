package RobotClass;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionrobot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("selenium");
		Robot robo = new Robot();
		Actions a = new Actions(driver);
		a.doubleClick(searchbox).perform();
		robo.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_C);
		Thread.sleep(1000);
		robo.keyRelease(KeyEvent.VK_CONTROL );
		Thread.sleep(1000);
		robo.keyRelease(KeyEvent.VK_C );
		Thread.sleep(1000);
		searchbox.clear();
		a.doubleClick(searchbox).perform();
		Thread.sleep(3000);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);

	}

}
