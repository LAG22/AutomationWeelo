package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends Base {
	
		
	
	By textBoxFirstName = By.id("firstName");
	By textBoxLastName = By.id("lastName");
	By textBoxEmail = By.id("userEmail"); 
	By checkGender = By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label");
	By textBoxNumber = By.id("userNumber");
	By selectDate = By.id("dateOfBirthInput");
	By buttonDate = By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[3]");
	By checkHobbies = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[7]/div[2]/div[2]/input");
	By textBoxAddress = By.id("currentAddress"); 
	By selectSend = By.xpath("//*[@id=\"submit\"]"); 
	By assertRegister = By.xpath("//*[@id=\"example-modal-sizes-title-lg\"]");
	

	public RegisterPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void sendKeysFirstName() {
		driver.findElement(textBoxFirstName).sendKeys("Laura");
	}
	
	public void sendKeysLastName() {
		driver.findElement(textBoxLastName).sendKeys("Garcia");
	}
	
	public void sendKeysEmail() {
		driver.findElement(textBoxEmail).sendKeys("l@gmail.com");
	}
	
	public void clickGender() {
		driver.findElement(checkGender).click();
	}
	
	public void sendKeysNumber() {
		driver.findElement(textBoxNumber).sendKeys("3142895709");
	}
	
	public void clickDate() {
		driver.findElement(selectDate).click();
	}
	
	public void clickButtonDate() {
		driver.findElement(buttonDate).click();
		
	}
	
	public void clickHobies() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("arguments[0].click()",driver.findElement(checkHobbies));
	}
	
	public void sendKeysAddress() {
		driver.findElement(textBoxAddress).sendKeys("Calle 123");
	}
	
	public void clickSend() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("arguments[0].click()",driver.findElement(selectSend));

	}
	
	 public String assertValidateRegister() {
	     String validateSearch = driver.findElement(assertRegister).getText();
	     return validateSearch; 
			

		}

}
