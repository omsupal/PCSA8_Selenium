import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
//		driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("Rings", Keys.ENTER);
//		try {
//			Thread.sleep(6000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	List<WebElement> c=	driver.findElements(By.xpath("//*[@id=\"search-result\"]//div[@id=\"grid-view-result\"]//ul[@id=\"product_list_ui\"]//li[contains(@class,col-xs-4)]"));
//	System.out.println(c.size());
//	try {
//		Thread.sleep(5000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	//****************************new assignment*****************************************************
//	driver.navigate().back();
//	driver.findElement(By.xpath("//*[@class=\"hp-gms-top\"]//a")).click();
//	driver.findElement(By.xpath("//input[@id=\"amount\"]")).clear();
//	driver.findElement(By.xpath("//input[@id=\"amount\"]")).sendKeys("2000");
//	driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("supalomkar225@gmail.com");
//	driver.findElement(By.xpath("//input[@id=\"gmsStart\"]")).click();
	
	//****************************new assignment*****************************************************
//	driver.navigate().back();
//	driver.findElement(By.xpath("//li[@class='store-block']")).click();
	
//	List<WebElement> d=	driver.findElements(By.xpath("//*[@id=\"main\"]/div/div[3]/div/div/div[1]/ul/li"));
//	d.forEach( (n) -> { System.out.println(n.getAttribute("data-city")); } );
	

//	List<WebElement> a=	driver.findElements(By.xpath("//div[@class='col-xs-9 col-xs-push-1']/div//div[@class='col-xs-5']/div[2]"));
//	a.forEach( (n) -> { System.out.println(n.getAttribute("textContent")); } );
//	for(WebElement e:a) {
//		System.out.println(e.getAttribute("textContent")+"\n");
//	}
//*******************************************New Assignment******************************************************
	driver.findElement(By.xpath("//li[@class='bh-block']")).click();
	driver.findElement(By.xpath("//div[@class='col-xs-3 rv-btn']/a")).click();
	}

}
