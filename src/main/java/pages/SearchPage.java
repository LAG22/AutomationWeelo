package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SearchPage extends Base {

	
	// Text Search
	
	By textBoxSearch = By.name("search_query");
	By buttonSearch = By.name("submit_search");
	By assertSearch = By.className("heading-counter");
	
	
	public SearchPage(WebDriver driver) {
		super(driver);
	}

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	}

	public void sendKeysSearch() {
		driver.findElement(textBoxSearch).sendKeys("Blouse");
	}
	
	public void sendClickSearch() {
		driver.findElement(buttonSearch).click();
	}
	
	
	 public String assertValidaSearch() {
     String validateSearch = driver.findElement(assertSearch).getText();
     return validateSearch; 
		

	}
}


