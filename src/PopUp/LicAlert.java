package PopUp;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LicAlert {
	public static void ScrollView(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void Scroll(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://licindia.in/Home?lang=en-US");

		WebElement ele = driver.findElement(By.xpath("//div[@class='tab-left']/descendant::li[contains(.,'Pay Premium through ')]/a"));
		WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(10));
		ScrollView(driver, ele);
		Thread.sleep(2000);
		ele.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}
}
