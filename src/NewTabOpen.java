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
		String newTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		driver.findElement(By.linkText("Mobiles")).sendKeys(newTab);
	}

}
