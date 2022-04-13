import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//div[@class='_6ltg']/a[@role='button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
		name.sendKeys("Omkar");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Supal");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("supalomkar225@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("omkarrsup");
		WebElement gender = driver.findElement(By.xpath("//input[@name='sex' and @value='2']"));
		gender.click();
		System.out.println(gender.isSelected());
//		System.out.println(gender.isDisplayed());
		System.out.println(gender.isEnabled());
		name.clear();
//		System.out.println(driver.getTitle());
		WebElement title = driver.findElement(By.xpath("//head/title[@id='pageTitle']"));
//		String nam = title.getText();
		System.out.println(title.getAttribute("innerText"));
		System.out.println(" height "+name.getRect().height+" width "+name.getRect().width);
		System.out.println(" x "+name.getRect().x+" y "+name.getRect().y);
		System.out.println(" dimension "+name.getRect().getDimension());
	}

}
