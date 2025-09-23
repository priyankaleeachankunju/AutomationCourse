package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base {

	public void verifyFileUploadUsingSendkeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement  fileuploadBtn =driver.findElement(By.id("uploadfile_0"));
		fileuploadBtn.sendKeys("C:\\Users\\PRIYANKA\\git\\AutomationCourse\\AutomationCourse\\src\\test\\resources\\CamScanner 05-20-2025 19.15.pdf");
        WebElement checkbox=driver.findElement(By.id("terms"));
        checkbox.click();
        WebElement submit =driver.findElement(By.id("submitbutton"));
        submit.click();
       
	}
	
	public void verifyFileUploadUsingRobot() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement  fileuploadRbt =driver.findElement(By.id("pickfiles"));
		fileuploadRbt.click();
		StringSelection stringselection = new StringSelection("C:\\Users\\PRIYANKA\\git\\AutomationCourse\\AutomationCourse\\src\\test\\resources\\CamScanner 05-20-2025 19.15.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
		
		Robot r=new Robot();
		r.delay(2500);
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HandlingFileUpload handlingfileupload = new HandlingFileUpload();
		handlingfileupload.initializeBrowser();
		//handlingfileupload.verifyFileUploadUsingSendkeys();
		try {
			handlingfileupload.verifyFileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
