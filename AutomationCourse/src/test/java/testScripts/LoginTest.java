package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationCore.TestNGBase;
import pages.LoginPage;

public class LoginTest extends TestNGBase {
	
	@Test
	public void verifyWetherUserIsAbleToLoginWithValidCredentials() {
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField();
		loginpage.enterPasswordOnPasswordField();
		loginpage.loginButtonClick();
		
	}

	@Test
	public void verifyWetherUserIsAbleToLoginWithValidUsernameAndInvalidPassword() {
		WebElement Username = driver.findElement(By.id("user-name"));
		Username.sendKeys("standard_user");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("sauce");
		WebElement LoginBtn = driver.findElement(By.id("login-button"));
		LoginBtn.click();
	}

	@Test
	public void verifyWetherUserIsAbleToLoginWithInvalidUsernameAndValidPassword() {
		WebElement Username = driver.findElement(By.id("user-name"));
		Username.sendKeys("user");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("secret_sauce");
		WebElement LoginBtn = driver.findElement(By.id("login-button"));
		LoginBtn.click();
	}
	
	@Test
	public void verifyWetherUserIsAbleToLoginWithInvalidUsernameAndInvalidPassword() {
		WebElement Username = driver.findElement(By.id("user-name"));
		Username.sendKeys("user");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("sauce");
		WebElement LoginBtn = driver.findElement(By.id("login-button"));
		LoginBtn.click();
	}
	
}
