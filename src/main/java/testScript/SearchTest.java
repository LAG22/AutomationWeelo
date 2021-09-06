package testScript;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import pages.SearchPage;


public class SearchTest {

	private WebDriver driver;
    SearchPage searchPage; 
    
    
    @BeforeMethod
	public void setUp() throws Exception {
		 searchPage = new SearchPage(driver);
		 driver = searchPage.chromeDriverConnection();
		 searchPage.driver.get("http://automationpractice.com/index.php");
			
	
	}
	@Test
	public void searchTest() throws InterruptedException {
		searchPage = new SearchPage(driver);
		
		searchPage.sendKeysSearch();
		searchPage.implicitWait();
		searchPage.sendClickSearch();
		Thread.sleep(1000);
		
		//Validate Search
		
	    String textSearch = searchPage.assertValidaSearch();
		String validateSearch = "1 result has been found.";
		Assert.assertEquals( textSearch,validateSearch);
		System.out.println("Successfully search blouse - Test OK"); 
		
	}
		

	@AfterMethod
	public void tearDown() throws Exception {
		driver.close();

	}}
