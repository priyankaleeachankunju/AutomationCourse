package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base {
	
	public void verifyDropDown() {
	driver.navigate().to(" https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	
	WebElement selectLang = driver.findElement(By.id("dropdowm-menu-1"));
	
    Select select = new Select(selectLang);
    //select.selectByIndex(1);
   // select.selectByValue("python");
    select.selectByVisibleText("SQL");
	
	}
	
	public void verifyCheckBox() {
	driver.navigate().to(" https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	
	WebElement checkoption =driver.findElement(By.xpath("//input[@value='option-1']"));
	checkoption.click();
	
	}

	public void verifyRadioButton() {
	driver.navigate().to(" https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement radiobutton =driver.findElement(By.xpath("//input[@value='green']"));
	radiobutton.click();
			
	}
	
	public static void main(String[] args) {
		
		
		HandlingDropDown handlingDropdown = new HandlingDropDown();
		handlingDropdown.initializeBrowser();
		//handlingDropdown.verifyDropDown();
		//handlingDropdown.verifyCheckBox();
		handlingDropdown.verifyRadioButton();
        
		
	}

}
