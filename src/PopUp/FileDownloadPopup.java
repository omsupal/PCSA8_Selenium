package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadPopup {

	public static void main(String[] args) {
	
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference ("browser. helper Apps.neverAsk.saveToDisk", "text/plain, application/pdf"); //Mime ty
		profile.setPreference ("browser.download.manager.showwhenStarting", false);
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		profile.setPreference ("pdfjs.disabled", true); // only for pdf file
		
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(profile);
		
		WebDriver driver=new FirefoxDriver(option);
		
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		
		
		WebElement ele=driver.findElement(By.id("textbox"));
		LicAlert.ScrollView(driver, ele);
		ele.sendKeys("testing files");
		driver.findElement(By.id("createTxt")).click(); //Generate button
		driver.findElement(By.id("link-to-download")).click();

		WebElement ele1 =driver.findElement(By.id("pdfbox"));
		LicAlert.ScrollView(driver, ele1);
		ele1.sendKeys ("Testing pdf files");
		driver.findElement(By.id("createPdf")).click(); //click on Generate PDF button
	
		driver.findElement(By.id("pdf-link-to-download")).click();
}
}