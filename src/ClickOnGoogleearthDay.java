import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import JsExecutorUtil.JsUtil;

public class ClickOnGoogleearthDay {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/doodles");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicit wait
//		WebElement ele=driver.findElement(By.xpath("//a[contains(.,'Earth Day 2022')]"));

		try {
			WebElement ele = driver.findElement(By.partialLinkText("Mother's Day"));
			ele.click();
		} catch (NoSuchElementException e) {
//			JsUtil.scrollBy(driver, 0, 2500);
			JsUtil.scrollTo(driver, 0, 3500);
		}
//		JsUtil.scrollIntoView(ele, driver);
		driver.findElement(By.partialLinkText("Mother's Day")).click();

	}

}
