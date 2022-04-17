package ActitimeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicit wait
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager", Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='content reports']")).click();
		driver.findElement(By.xpath("//span[contains(.,'Create Chart')]/ancestor::td[@class='x-table-layout-cell']")).click();
		driver.findElement(By.xpath("//div[@class='addToDashboard']")).click();
		driver.findElement(By.xpath("//input[@class='reportNameEdit inputFieldWithPlaceholder']")).sendKeys("Timings Chart");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@class='saveNewConfigButton greyButton']//span[contains(text(),'Save')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='closeCreateChartLightboxButton']")).click();
	}

}
