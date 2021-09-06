package testScript;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;


public class LoginTest {

      private WebDriver driver;
      LoginPage loginPage; 
      
	@BeforeMethod
	public void setUp() throws Exception {
		 loginPage = new LoginPage(driver);
		 driver = loginPage.chromeDriverConnection();
		 loginPage.driver.get("http://thedemosite.co.uk/addauser.php.");
			
	
	}
	@Test
	public void loginTest() throws InterruptedException {
		loginPage = new LoginPage(driver);
		
		loginPage.sendKeysName();
		loginPage.sendKeysPassword();
		loginPage.clickSave();
		loginPage.clickPagelogin();
		loginPage.sendKeysName();
		loginPage.sendKeysPassword();
		loginPage.clickSave();
		
	}
		

	@AfterMethod
	public void tearDown() throws Exception {
		driver.close();
			

	}
	

}
