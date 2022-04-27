import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import JsExecutorUtil.JsUtil;

public class ClickOnGoogleearthDay {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/doodles");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicit wait
		WebElement ele=driver.findElement(By.xpath("//a[contains(.,'Earth Day 2022')]"));
		//JsUtil.scrollBy(driver, 0, 900);
		JsUtil.scrollIntoView(ele, driver);
		ele.click();

	}

}
