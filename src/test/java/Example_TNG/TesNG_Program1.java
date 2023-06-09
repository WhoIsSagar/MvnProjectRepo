package Example_TNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TesNG_Program1 {

	
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is Before_Suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is Before Test");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is Before Class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is Before Method");
	}
	@Test
	public void test_1() {
		System.out.println("This is Test");
	}
	
	@Test
	public void test_2() {
		System.out.println("This is Test 2 ");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is After Method");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("This is After Class");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("This is After Test");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is After Suite");
	}
	
}
