package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromefileDownloadPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/FileDownload.html");

		WebElement ele = driver.findElement(By.id("textbox"));
		LicAlert.ScrollView(driver, ele);
		ele.sendKeys("testing files");
		driver.findElement(By.id("createTxt")).click(); // Generate button
		driver.findElement(By.id("link-to-download")).click();

		WebElement ele1 = driver.findElement(By.id("pdfbox"));
		LicAlert.ScrollView(driver, ele1);
		ele1.sendKeys("Testing pdf files");
		driver.findElement(By.id("createPdf")).click(); // click on Generate PDF button

		driver.findElement(By.id("pdf-link-to-download")).click();

	}

}
