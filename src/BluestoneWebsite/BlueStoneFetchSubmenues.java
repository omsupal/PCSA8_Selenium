package BluestoneWebsite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneFetchSubmenues {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		List<WebElement> nav = driver.findElements(By.xpath("//ul[@class='wh-main-menu']/li"));
		for (WebElement list : nav) {
			System.out.println(list.getText());
			String menu = list.getText();
			a.moveToElement(driver.findElement(By.xpath("//ul[@class='wh-main-menu']/li"))).perform();
			List<WebElement> snav = driver.findElements(
					By.xpath("//div[contains(.,'" + menu + "')]/parent::div[@class=\"col-inner\"]\r\n" + "		}"));
			for (WebElement list2 : snav) {
				System.out.println(list2.getText());
			}

		}

//		

	}

}
