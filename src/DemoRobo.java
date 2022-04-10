import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import java.awt.AWTException;
//import java.awt.Robot;
public class DemoRobo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//div[@class=\"_6ltg\"]/a[@role=\"button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Omkar");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Supal");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("supalomkar225@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("omkarrsup");
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select sday= new Select(day);
		List<WebElement> daylist = sday.getOptions();
		for (WebElement list : daylist) {
			System.out.println(list.getText());
		}
		sday.selectByVisibleText("5");
		Thread.sleep(2000);
	
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select smonth= new Select(month);
		List<WebElement> monthlist = smonth.getOptions();
		for (WebElement list : monthlist) {
			System.out.println(list.getText());
		}
		smonth.selectByVisibleText("Apr");
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select syear= new Select(year);
		List<WebElement> yearlist = syear.getOptions();
		for (WebElement list : yearlist) {
			System.out.println(list.getText());
		}
		syear.selectByVisibleText("1997");
		Thread.sleep(2000);
	}

}
