
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import readFromExcel.ReadCellExample;// local package

public class ReadFromExcel {


	public static void main(String[] args) throws Exception, IOException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicit wait

		String entry1 = ReadCellExample.readExcel("./documents/SeleniumActitime.xlsx", "omkar", 1, 0);
		String entry2 = ReadCellExample.readExcel("./documents/SeleniumActitime.xlsx", "omkar", 1, 1);
		System.out.println(entry1+" "+entry2);
		driver.findElement(By.id("username")).sendKeys(entry1);
		driver.findElement(By.name("pwd")).sendKeys(entry2, Keys.ENTER);
	}

}
