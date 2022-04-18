package ActitimeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase2 {
	public static void ScrollView(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicit wait
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager", Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='content reports']")).click();
		driver.findElement(By.xpath("//span[contains(.,'Create Chart')]/ancestor::td[@class='x-table-layout-cell']")).click();
		WebElement ele = driver.findElement(By.xpath("//tr[1]/td[4]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[3]/span[1]"));
		Thread.sleep(2000);
		ele.click();
		driver.findElement(By.xpath("//div[@class='x-form-radio-wrap']/div/img")).click();
		driver.findElement(By.xpath("//span[contains(.,'Users Without Department')]/preceding-sibling::span")).click();
		driver.findElement(By.xpath("//span[contains(.,'Apply')]/parent::div")).click();
		driver.findElement(By.xpath("//span[contains(.,'Export to PDF')]/ancestor::div[@id='createChartLightbox_commitBtn']")).click();
		WebElement pdfE=driver.findElement(By.xpath("//div[@id='createChartLightbox_commitBtn']//div[@class='buttonIcon']"));
		ScrollView(driver, pdfE);
		Thread.sleep(2000);
		pdfE.click();
		WebElement pdfD = driver.findElement(By.xpath("//div[@id='createChartLightbox_downloadPdfBtn']"));
		Thread.sleep(2000);
		pdfD.click();
	}

}
