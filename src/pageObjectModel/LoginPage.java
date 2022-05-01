package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		public WebDriver driver;
		@FindBy(id="username") 
		private WebElement username;
		
		@FindBy(name="pwd") 
		private WebElement password;

		@FindBy(id="loginButton") 
		private WebElement loginbtn;
		
		@FindBy(id="keepLoggedInCheckBox")
		WebElement keepMeLogin;

		public WebElement getKeepMeLogin() {
			return keepMeLogin;
		}

		public WebElement getUsername() {
			return username;
		}

		public WebElement getPassword() {
			return password;
		}
		
		public WebElement getLoginbtn() {
			return loginbtn;
		}
		
		public LoginPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this); // pagefactory.initElements is use to initialize the @FindBy
		}
		
		public HomePage login(String usernameData, String passwordData) {
			
			username.sendKeys(usernameData);
			password.sendKeys(passwordData);
			loginbtn.click();
			return new HomePage(driver);
			
		}

		
		
}
