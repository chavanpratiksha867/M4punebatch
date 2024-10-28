package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleTestscript1 {
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("beforeSuit");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforetest");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod");
	}
	@Test
	public void test1() {
		System.out.println("TestScript");
	}
	@Test
	public void test2() {
		System.out.println("TestScript");
	}
	@Test
	public void test3() {
		System.out.println("TestScript");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("aftertest");
	}
	@AfterSuite
	public void afterSuit() {
		System.out.println("afterSuit");
	}
	









}
