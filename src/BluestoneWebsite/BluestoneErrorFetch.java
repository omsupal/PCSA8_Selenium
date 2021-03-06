package BluestoneWebsite;
import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneErrorFetch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("confirm-btn")).click();
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//li[@class='menuparent']"))).perform();
		driver.findElement(By.xpath("//a[contains(.,'Kadas')]/parent::li")).click();
		driver.findElement(By.xpath("//ul[@id=\"product_list_ui\"]/li[1]")).click();
		
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTab.get(1));
		driver.findElement(By.id("buy-now")).click();
		WebElement text = driver.findElement(By.xpath("//div[@class=\"formErrorContent\"]"));
		System.out.println(text.getText());
	}

}
////a[@title='Engagement Rings']/ancestor::ul[@class='odd-even-bg']/li
//