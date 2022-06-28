package Umrahme;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.umrahme.com/home/en-sa");
		ListingPage listing = new ListingPage(driver);
		listing.getSelectDestination().click();
		listing.getSearchBox().sendKeys("Makkah Only Package", Keys.ENTER);
		listing.getStartDate().click();
		listing.getStartDate().clear();
		listing.getStartDate().sendKeys("01-07-2022", Keys.ENTER);
		listing.getMakkahStay().click();
		listing.getMeccaSearch().sendKeys("5", Keys.ENTER);
		listing.getTravellersRooms().click();
		Select adult= new Select(listing.getAdults());
		adult.selectByVisibleText("5");
		Select child= new Select(listing.getChilds());
		child.selectByVisibleText("1");
		
		Select age = new Select(listing.getAge());
		age.selectByIndex(3);
		listing.getCountryOfResidence().click();
		listing.getSearchCON().sendKeys("United States Of America", Keys.ENTER);
		listing.getNationality().click();
		listing.getSearchNationality().sendKeys("United States Of America", Keys.ENTER);
		listing.getSearch().click();
	}

}
