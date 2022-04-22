package TakeScreenShoT;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicit wait
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		TakesScreenshot srnsht = (TakesScreenshot) driver;
		File file=srnsht.getScreenshotAs(OutputType.FILE);
//		file.getAbsolutePath();
		File saveSs = new File("./ScreenShot/test.png");
		file.renameTo(saveSs);

	}

}
