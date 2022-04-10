import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {
	static List<WebElement> submenus;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		System.out.println(menus.size());
		Actions a = new Actions(driver);
		for (int i=0;i<menus.size();i++) {
			System.out.println(menus.get(i).getText());
			a.moveToElement(menus.get(i)).build().perform();
			Thread.sleep(2000);
			if(menus.get(i)==menus.get(0)) {
				submenus = driver.findElements(By.xpath("//li[@class='topnav_item saleunit']/descendant::ul[@class='taxonslist']/li"));
			}else if(menus.get(i)==menus.get(1)) {
				submenus = driver.findElements(By.xpath("//li[@class='topnav_item livingunit']/descendant::ul[@class='taxonslist']/li"));
			}else if(menus.get(i)==menus.get(2)) {
				submenus = driver.findElements(By.xpath("//li[@class='topnav_item bedroomunit']/descendant::ul[@class='taxonslist']/li"));
			}else if(menus.get(i)==menus.get(3)) {
				submenus = driver.findElements(By.xpath("//li[@class='topnav_item diningunit']/descendant::ul[@class='taxonslist']/li"));
			}else if(menus.get(i)==menus.get(4)) {
				submenus = driver.findElements(By.xpath("//li[@class='topnav_item storageunit']/descendant::ul[@class='taxonslist']/li"));
			}else if(menus.get(i)==menus.get(5)) {
				submenus = driver.findElements(By.xpath("//li[@class='topnav_item studyunit']/descendant::ul[@class='taxonslist']/li"));
			}else if(menus.get(i)==menus.get(6)) {
				submenus = driver.findElements(By.xpath("//li[@class='topnav_item kidsroomunit']/descendant::ul[@class='taxonslist']/li"));
			}else if(menus.get(i)==menus.get(7)) {
				submenus = driver.findElements(By.xpath("//li[@class='topnav_item mattressesunit']/descendant::ul[@class='taxonslist']/li"));
			}else if(menus.get(i)==menus.get(8)) {
				submenus = driver.findElements(By.xpath("//li[@class='topnav_item decorunit']/descendant::ul[@class='taxonslist']/li"));
			}else if(menus.get(i)==menus.get(9)) {
				submenus = driver.findElements(By.xpath("//li[@class='topnav_item collectionsunit']/descendant::ul[@class='taxonslist']/li"));
			}
			for (WebElement submenu : submenus) {
				System.out.println(submenu.getText());
			}
		}
	}

}
