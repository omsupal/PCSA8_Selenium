package PopUp;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopup {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicit wait
		driver.get("http://demo.automationtesting.in/Register.html");
//		driver.findElement(By.id("imagesrc")).click(); --(invalid argument exception)  The input element may not support the click action 
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.id("imagesrc"))).click().build().perform();
		Runtime.getRuntime().exec("E://QSPIDER//JAVA//eclipse//PCSA8//AutoItScripts//scriptupload.exe"+" "+"E:\\personel\\omkar\\documents\\PHOTO.jpg");

	}

}
