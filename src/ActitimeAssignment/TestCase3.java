package ActitimeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		// implicit wait
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager", Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='content reports']")).click();
		driver.findElement(By.xpath("//td[@class='configHeaderShareCell']")).click();
		driver.findElement(By.xpath("//span[contains(.,'Users Without Department')]/preceding-sibling::span")).click();
		driver.findElement(By.xpath("//td[@class='x-table-layout-cell footer']/div/div[2]/span")).click();
		
	}

}
