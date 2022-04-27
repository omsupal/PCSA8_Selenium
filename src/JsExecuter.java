import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import JsExecutorUtil.JsUtil;

public class JsExecuter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicit wait
		JsUtil.scrollBy(driver, 0, 800);
		JsUtil.creatAlert(driver);
		

	}

}
