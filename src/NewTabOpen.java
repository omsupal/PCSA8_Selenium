import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabOpen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		// it will open separate tab in chrome
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("amazom");
		String newTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		driver.findElement(By.linkText("Books")).sendKeys(newTab);
		driver.findElements(By.linkText("Books"));
//		driver.close();
		
	}

}
