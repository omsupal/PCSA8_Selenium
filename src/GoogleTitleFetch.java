import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleFetch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement title = driver.findElement(By.xpath("//head/title"));
		
		System.out.println(title.getAttribute("innerText"));
		System.out.println(title.getAttribute(""));
		System.out.println(title.getText());
	}

}
