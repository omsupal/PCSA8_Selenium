package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v1/");
		driver.findElement(By.name("btnLogin")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicit wait
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

	}

}
