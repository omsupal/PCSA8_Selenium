import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestionClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/"); 
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> sugg = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//li//div[@role='option']"));
		System.out.println(sugg.size());
		for (WebElement sug : sugg) {
			System.out.println(sug.getText());
		}
		sugg.get(2).click();
		
	}

}
