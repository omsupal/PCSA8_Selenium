import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoguru99 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
//		WebElement ele=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions a = new Actions(driver);
//		a.contextClick(ele).perform();
		WebElement ele=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		a.doubleClick(ele).perform();
	}
//span[contains(.,'more in Men's Top Wear')]
}
