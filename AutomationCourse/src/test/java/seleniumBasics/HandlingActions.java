package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base{
	
	public void verifyRightClick() {
	
	WebElement otherElm = driver.findElement(By.id("others"));
	Actions action = new Actions(driver);
	action.contextClick(otherElm).build().perform();
	}
	
	public void verifyMouseOver() {
		WebElement otherElm = driver.findElement(By.id("others"));
		Actions action = new Actions(driver);
		action.moveToElement(otherElm).build().perform();
	}

	public void verifyDragAndDrop() {
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement dragme = driver.findElement(By.id("draggable"));
		WebElement dropme = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(dragme, dropme).build().perform();
		
	}
	
	public void verifyKeyboardAction() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HandlingActions handlingactions = new HandlingActions();
     handlingactions.initializeBrowser();
     //handlingactions.verifyRightClick();
     //handlingactions.verifyMouseOver();
     //handlingactions.verifyDragAndDrop();
     try {
		handlingactions.verifyKeyboardAction();
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
	}

}
