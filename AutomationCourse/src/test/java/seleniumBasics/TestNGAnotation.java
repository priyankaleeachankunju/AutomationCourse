package seleniumBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnotation {

	@Test 
	public void sameTest() {
		System.out.println("This is a Testcase");
	}
	
    @BeforeMethod 
	public void beforeMethod() {
    	System.out.println("This is before Method");
    }
    
    @AfterMethod
    public void afterMethod() {
    	System.out.println("This is after Method");
    }
   
    @BeforeTest
    public void beforeTest() {
    	System.out.println("This is before Test");
    }
    
    @AfterTest
    public void afterTest( ) {
    	System.out.println("This is after Test");
    }
    
    @BeforeClass
    public void beforeClass() {
    	System.out.println("This is before class");
    }
   
    @AfterClass
    public void afterClass() {
    	System.out.println("This is after class");
    }
    
    @BeforeSuite
    public void beforeSuite() {
    	System.out.println("This is before suite");
    }
    
    @AfterSuite
    public void afterSuite() {
    	System.out.println(("This is after suite"));
    }
    
    
}
