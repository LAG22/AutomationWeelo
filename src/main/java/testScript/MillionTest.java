package testScript;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import pages.MillionPage;


public class MillionTest {
	
	private WebDriver driver;
    MillionPage millionPage; 
    
    @BeforeMethod
  	public void setUp() throws Exception {
  		 millionPage = new MillionPage(driver);
  		 driver = millionPage.chromeDriverConnection();
  		 millionPage.driver.get("https://newdesign.millionandup.com/.");
  		 
}
    
    @Test
	public void millionTest() throws InterruptedException {
		millionPage = new MillionPage(driver);
		
		millionPage.sendKeysEmail();
		millionPage.sendKeysName();
		millionPage.clickButtonSite();
		millionPage.sendKeysPhone();
		millionPage.clickButtonSite();
		Thread.sleep(5000);
	    millionPage.clickButtonPresentation();
	    Thread.sleep(2000);
		millionPage.clickSelectDate();
		millionPage.clickbuttonNext();
		millionPage.clickbuttonNext();
		millionPage.clickbuttonDay();
		millionPage.clickbuttonHour();
		millionPage.clickbuttonHour();
    	millionPage.clickbuttonCall();
		millionPage.clickbuttonSchedule();
		millionPage.sendKeysNumber();
		millionPage.clickbuttonSchedule();
		millionPage.implicitWait();
		
		//Validate request
		
	   String textSearch = millionPage.assertValidateRequest();
	   String validateRequest = "ENVIANDO...";
	   Assert.assertEquals( textSearch,validateRequest);
	   System.out.println("Successfully Request - Test OK"); 
		
	}

    
	@AfterMethod
	public void tearDown() throws Exception {
	driver.close();
   
    
    
	}
    
}