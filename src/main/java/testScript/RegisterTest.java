package testScript;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import pages.RegisterPage;



public class RegisterTest {
	
	private WebDriver driver;
    RegisterPage registerPage; 
    
    @BeforeMethod
 	public void setUp() throws Exception {
 		 registerPage = new RegisterPage(driver);
 		 driver = registerPage.chromeDriverConnection();
 		 registerPage.driver.get("https://demoqa.com/automation-practice-form");
    }
    
    @Test
	public void registerTest() throws InterruptedException {
		registerPage = new RegisterPage(driver);
		
		registerPage.sendKeysFirstName();
		registerPage.sendKeysLastName();
		registerPage.sendKeysEmail();
		registerPage.clickGender();
		registerPage.sendKeysNumber();
		registerPage.clickDate();
		registerPage.clickButtonDate();
	    registerPage.clickHobies();
	    registerPage.sendKeysAddress();
		registerPage.clickSend();
		Thread.sleep(1000);
		
        //Validate Register
		
	    String textSearch = registerPage.assertValidateRegister();
		String validateSearch = "Thanks for submitting the form";
		Assert.assertEquals( textSearch,validateSearch);
		System.out.println("Successfully register- Test OK"); 
		
	}
    
    @AfterMethod
	public void tearDown() throws Exception {
	driver.close();
   
    
	}
    
		
		
		
		
		
	
    }
 

