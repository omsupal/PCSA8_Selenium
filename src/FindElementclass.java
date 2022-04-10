
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementclass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		// it will open separate tab in chrome
		driver.get("https://www.linkedin.com/home");
		WebElement obj = driver.findElement(By.name("q"));
		obj.sendKeys("facebook");
		Thread.sleep(2000);
		obj.sendKeys(Keys.ENTER);
		driver.findElement(By.className("nav__button-secondary")).click();
		driver.findElement(By.id("username")).sendKeys("supalomkar225@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Omkar@123");
		driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
	}

}
