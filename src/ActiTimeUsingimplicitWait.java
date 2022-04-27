import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeUsingimplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicit wait
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager", Keys.ENTER);
		
		WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(10));// explicit wait or intelligent wait
		//ww.until(ExpectedConditions.titleContains("act"));
		//ww.until(ExpectedConditions.urlContains("actitime"));
		ww.until(ExpectedConditions.urlToBe("https://demo.actitime.com/user/submit_tt.do"));
		driver.findElement(By.id("logoutLink")).click();
		
	}

}
