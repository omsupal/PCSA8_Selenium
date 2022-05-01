package SERE;
// defination :-
	/*
	 * its one of selenium exception  whenever webdriver try to identify an element,
	 * element was available in GUI but at time of performing an action on the elements, element
	 * was not recognized due to page got refreshed or elements may become old or element not attached
	 * to page in such case we get StateElementRefernceException 
	 * */
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Serexception {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicit wait
		WebElement username=driver.findElement(By.id("username"));
		driver.navigate().refresh();
		username.sendKeys("admin");
	}
}
