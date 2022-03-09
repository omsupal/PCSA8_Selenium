import org.openqa.selenium.edge.EdgeDriver;

public class LaunchMsEdge {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.edge.driver", "./software/msedgedriver.exe");
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.makemytrip.com/");
	}

}
