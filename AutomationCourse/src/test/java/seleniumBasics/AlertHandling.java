package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base{

	public void verifySimpleAlert() {
		
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement clickMeSimple =driver.findElement(By.id("alertButton"));
		clickMeSimple.click();
		Alert al =driver.switchTo().alert();
		al.accept();
	}
	
	public void verifyConfirmAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement clickMeConfirm=driver.findElement(By.id("confirmButton"));
		clickMeConfirm.click();
		Alert ale =driver.switchTo().alert();
		//ale.accept();
		ale.dismiss();
	}
	
	public void verifyPromptAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement clickMePrompt = driver.findElement(By.id("promtButton"));
		clickMePrompt.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Eve");
		alert.accept();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	AlertHandling alerthandling = new AlertHandling();
	alerthandling.initializeBrowser();
	//alerthandling.verifySimpleAlert();
    //alerthandling.verifyConfirmAlert();
    alerthandling.verifyPromptAlert();
	}

}
