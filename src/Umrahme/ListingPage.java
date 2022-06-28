package Umrahme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListingPage {
		public WebDriver driver;
		@FindBy(xpath="//*[@id=\"frmHomeSearch\"]/div/div/div[1]/span") 
		private WebElement select_destination;
		
		@FindBy(xpath="//input[@class='select2-search__field']")
		private WebElement selctdest_search;
		
		@FindBy(id="StartDate") 
		private WebElement startdate;
//
		@FindBy(xpath="//span[@aria-labelledby='select2-meccaCityNight-container']") 
		private WebElement makkah_stay;
//		
		@FindBy(xpath="//input[@class='select2-search__field']")
		private WebElement mecca_search;
		
//		@FindBy(xpath="//span[@aria-labelledby='select2-madinaCityNight-container']")
//		WebElement madina_stay;
//
		@FindBy(xpath="//div[@class='all-traveller show-occupancy']")
		WebElement travellers_rooms;
//
		@FindBy(xpath="//label[contains(.,'Adults')]/preceding-sibling::select")
		WebElement adult_select;
//
		@FindBy(xpath="//label[contains(.,'Children')]/preceding-sibling::select")
		WebElement child_select;
		
		@FindBy(xpath="//label[contains(.,'Age')]/preceding-sibling::select")
		WebElement child_age_select;
//		
		@FindBy(xpath="//span[@aria-labelledby='select2-CountryOfResidence-container']/parent::span/parent::span") 
		private WebElement countryofresidence;
		
		@FindBy(xpath="//input[@aria-controls='select2-CountryOfResidence-results']")
		private WebElement searchCon;
//
		@FindBy(xpath="//span[@aria-labelledby='select2-Nationality-container']/parent::span/parent::span") 
		private WebElement nationality;
		
		@FindBy(xpath="//input[@aria-controls='select2-Nationality-results']")
		private WebElement search_nationality;

		@FindBy(id="btnSearchPackage") 
		private WebElement searchbtn;


		public WebElement getSelectDestination(){

			return select_destination;
		}
		
		public WebElement getSearchBox() {
			return selctdest_search;
		}
//
		public WebElement getStartDate(){

			return startdate;
		}
//		
		public WebElement getMakkahStay(){

			return makkah_stay;
		}
		
		public WebElement getMeccaSearch() {
			return mecca_search;
		}
//		
//		public WebElement getMadinaStay(){
//
//			return madina_stay;
//		}
//		
		public WebElement getTravellersRooms(){

			return travellers_rooms;
		}
//
		public WebElement getAdults(){

			return adult_select;
		}
//
		public WebElement getChilds(){

			return child_select;
		}
		
		public WebElement getAge() {
			return child_age_select;
		}
//
		public WebElement getCountryOfResidence(){

			return countryofresidence;
		}
		
		public WebElement getSearchCON() {
			return searchCon;
		}
//
		public WebElement getNationality(){

			return nationality;
		}
		
		public WebElement getSearchNationality(){

			return search_nationality;
		}
	
		public WebElement getSearch(){

			return searchbtn;
		}
		
		public ListingPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this); // pagefactory.initElements is use to initialize the @FindBy
		}
				
}