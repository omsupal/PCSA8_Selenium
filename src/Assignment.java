import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");  
		System.out.println(driver.getTitle() +" "+ driver .getCurrentUrl());
		driver.get("http://automationpractice.com/index.php");
		System.out.println(driver.getTitle() +" "+ driver .getCurrentUrl());     
		driver.get("https://www.goibibo.com/");  
		System.out.println(driver.getTitle() +" "+ driver .getCurrentUrl());
		driver.get("https://www.sastasundar.com/");
		System.out.println(driver.getTitle() +" "+ driver .getCurrentUrl());
		driver.get("https://www.naukri.com/");		  
 		driver.close();
	}

}
