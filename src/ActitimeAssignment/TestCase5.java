package ActitimeAssignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		// implicit wait
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager", Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='content reports']")).click();
		List<WebElement> drop = driver.findElements(By.xpath("//div[@class='i']/ancestor::td[@class='x-table-layout-cell']"));
		drop.get(2).click();
		driver.findElement(By.xpath("//a[contains(.,'Staff Performance')]/parent::li")).click();
		WebElement Ghtml= driver.findElement(By.xpath("//span[@id='applyReportConfiguration']"));
		TestCase2.ScrollView(driver, Ghtml);
		Ghtml.click();
		driver.findElement(By.xpath("//div[@class='addToDashboard']")).click();
		driver.findElement(By.xpath("//input[@class='reportNameEdit inputFieldWithPlaceholder']")).sendKeys("Staff");
		driver.findElement(By.xpath("//td[@class='saveNewConfigButton greyButton']")).click();
	}

}
