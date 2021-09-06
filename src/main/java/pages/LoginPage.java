package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Base {

	//Add Users
	
	By textBoxUsarname = By.name("username");
	By textBoxPassword = By.name("password");
	By buttonSave = By.name("FormsButton2");
	By pageLogin = By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[2]/small/a");
	

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	public void sendKeysName() {
		driver.findElement(textBoxUsarname).sendKeys("Hola");
	}
	public void sendKeysPassword() {
		driver.findElement(textBoxPassword).sendKeys("hola1");
	}
	
	public void clickSave() {
		driver.findElement(buttonSave).click();
	}
	
	public void clickPagelogin() {
		driver.findElement(pageLogin).click();
	}


	
}
