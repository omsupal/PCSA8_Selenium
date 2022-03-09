import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NineMarch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		// driver.get("https://www.google.com/");
		// driver.navigate().to("https://www.google.com/");
		// difference between get() and to() methods
		// driver.navigate().back();
		// driver.navigate().forward();
		// driver.navigate().refresh();  

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());//it will fetch the source of page in the console
		 driver.close();
	}
 
}
