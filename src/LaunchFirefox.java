import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class LaunchFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
	}

}
