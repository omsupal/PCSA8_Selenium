package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	@FindBy(xpath = "//a[contains(.,'Logout')]")
	private WebElement logout;

	@FindBy(xpath = "//a[@class='content users']")
	private WebElement users;

	public WebElement getUsers() {
		return users;
	}

	public WebElement getLogout() {
		return logout;
	}

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // pagefactory.initElements is use to initialize the @FindBy
	}

	public void logout() {
		logout.click();
	}
}
