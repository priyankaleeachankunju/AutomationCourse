package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommand extends Base {
	
	public void verifyCommand() {
		
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	
	WebElement messageBox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
	messageBox.sendKeys("priyanka");
	WebElement showMessageBtn = driver.findElement(By.id("button-one"));
	System.out.println(showMessageBtn.isDisplayed()); //to check an element is displayed in webpage
	System.out.println(showMessageBtn.isEnabled());// to check element is enabled or not
	showMessageBtn.click();
	
	WebElement yourMsgTxt = driver.findElement(By.id("message-one"));
	System.out.println(yourMsgTxt.getText() );
	System.out.println(showMessageBtn.getTagName());
	System.out.println(showMessageBtn.getCssValue("color"));
	messageBox.clear();
	}

	public static void main(String[] args) {
		
    WebElementCommand command = new WebElementCommand();
    command.initializeBrowser();
    command.verifyCommand();
	}

}
