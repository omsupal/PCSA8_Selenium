package UrbanLadderWebsite;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverUrbanSublist {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		
//		System.out.println(menus.size());
		Actions a = new Actions(driver);
		for (int i = 0; i < menus.size(); i++) {
			System.err.println(menus.get(i).getText());
			String nam=menus.get(i).getText();
			a.moveToElement(menus.get(i)).perform();
			Thread.sleep(2000);
			List<WebElement> submenus = driver.findElements(By.xpath("//span[contains(.,'"+ nam + "')]//parent::li/descendant::ul[@class=\"taxonslist\"]/li"));
			for (WebElement submenu : submenus) {
				System.out.println(submenu.getText());
			}
		}
	}

}
