import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoadLocalHtmlPage {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("E:\\QSPIDER\\JAVA\\eclipse\\PCSA8\\HTML\\Select.html");
		WebElement ele=driver.findElement(By.xpath("//select[@id='b']"));
		Select selctmul=new Select(ele);
		if(selctmul.isMultiple()) {
			List<WebElement> e=selctmul.getOptions();
			for (WebElement sel : e) {
				selctmul.selectByVisibleText(sel.getText());
			}
		}
		System.out.println(selctmul.getFirstSelectedOption().getText());
		System.out.println("-------------------------------------------------");
		List<WebElement> opt = selctmul.getAllSelectedOptions();
		for (WebElement elee : opt) {
			System.out.println(elee.getText());
		}
		selctmul.deselectByIndex(0);
		Thread.sleep(1000);
		selctmul.deselectByIndex(3);
		Thread.sleep(1000);
		selctmul.deselectAll();
		

	}

}
