package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class MillionPage extends Base {
	
	//Add Information
	
	By textBoxEmail = By.name("email");
	By textBoxName = By.name("name");
	By textBoxPhone = By.xpath("//*[@id=\"phone\"]"); 
	By buttonSite = By.id("btnSendModal");
	
	//Add Location Information
	
	By buttonPresentation = By.id("addressBtn");
	By buttonSelectDate= By.xpath("(//*[@id='scheduleDate'])[2]");
	By buttonNext = By.xpath("//span[@class='fc-icon fc-icon-chevron-right']");
	By buttonDay = By.xpath("//*[@class='fc-daygrid-day-number'][contains(text(),'3')]");
	By buttonHour = By.xpath("/html/body/div[4]/div/div/div/div[3]/div/div/form/div[2]/div/div[4]/div/div/ul/li[3]"); 
	By buttonCall = By.xpath("/html/body/div[4]/div/div/div/div[3]/div/div/form/div[2]/div/div[6]/div/button[2]");
	By buttonSchedule = By.xpath("/html/body/div[4]/div/div/div/div[3]/div/div/form/div[3]/div[5]/button");
	By textPhone = By.xpath("/html/body/div[4]/div/div/div/div[3]/div/div/form/div[3]/div[4]/input[1]");
	By assertRequest = By.xpath("/html/body/div[4]/div/div/div/div[3]/div/div/form/div[3]/div[5]/button");
	
	
	
	public MillionPage(WebDriver driver) {
		super(driver);
	}

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	//Add Information
	
	public void sendKeysEmail() {
		driver.findElement(textBoxEmail).sendKeys("laugarcia416@gmail.com");
	}
	public void sendKeysName() {
		driver.findElement(textBoxName).sendKeys("Laura Garcia");
	}
	
	public void sendKeysPhone() {
		driver.findElement(textBoxPhone).sendKeys("3142895809");
	}
	
	public void clickButtonSite() {
		driver.findElement(buttonSite).click();
	}

	//Add Location Information
	
	public void clickButtonPresentation() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("arguments[0].click()",driver.findElement(buttonPresentation)); 
		
	}
	public void clickSelectDate() {
		driver.findElement(buttonSelectDate).click();
		
		
	}
	
	public void clickbuttonDay() {
		driver.findElement(buttonDay).click();
	}
	
	
	public void clickbuttonNext() {
		driver.findElement(buttonNext).click();
	}
	
	public void clickbuttonHour() {
		driver.findElement(buttonHour).click();
	}
	
	public void clickbuttonCall() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("arguments[0].click()",driver.findElement(buttonCall));
	}
	
	public void clickbuttonSchedule() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("arguments[0].click()",driver.findElement(buttonSchedule));
	}
	
	public void sendKeysNumber() {
		driver.findElement(textPhone).sendKeys("3142895809");
	}
	
	 public String assertValidateRequest() {
	     String validateRequest = driver.findElement(assertRequest).getText();
	     return validateRequest; 
			

		}	

}
