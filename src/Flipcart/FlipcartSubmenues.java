package Flipcart;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipcartSubmenues {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		List<WebElement> menus = driver.findElements(By.xpath("//div[@class='xtXmba']"));
		Actions a = new Actions(driver);
		for (int i = 0; i < menus.size(); i++) {
			System.err.println(menus.get(i).getText());
			String nam=menus.get(i).getText();
			a.moveToElement(menus.get(i)).perform();
			Thread.sleep(3000);
			List<WebElement> submenus = driver.findElements(By.xpath("//descendant::div[contains(.,'"+ nam + "')]/ancestor::div[@class='_1psGvi SLyWEo']/descendant::div[@class='_3XS_gI _7qr1OC']/a"));
			for (WebElement submenu : submenus) {
				System.out.println(submenu.getText());
				String namm=submenu.getText();
				a.moveToElement(submenu).perform();
				Thread.sleep(3000);
				List<WebElement> sssmenus = driver.findElements(By.xpath("//span[contains(.,'"+ namm + "')]/parent::div[@class=\"_3XS_gI\"]/a"));
				for (WebElement ssmenu : sssmenus) {
					System.out.println(ssmenu.getText());
				}
			}
		}

	}

}
