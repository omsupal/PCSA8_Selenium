import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		ChromeDriver driver1= new ChromeDriver();
		ChromeDriver driver2= new ChromeDriver();
		ChromeDriver driver3= new ChromeDriver();
		ChromeDriver driver4= new ChromeDriver();
		
		// it will open separate windows of chrome for each website
		driver.get("https://www.makemytrip.com/");
		driver1.get("http://automationpractice.com/index.php");
		driver2.get("https://www.goibibo.com/");
		driver3.get("https://www.sastasundar.com/");
		driver4.get("https://www.naukri.com/");
		
		
		/*
		 * automationpractice.com
		 * goibibo
		 * sastasundar.com
		 * naukri.com
		 * makemytrip
		 * */
		
	}
}
