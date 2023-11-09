package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class P02_Annotations {
	@Test
	public void test1() {
		System.out.println("test 1");
	}
	@Test
	public void test2() {
		System.out.println("test 2");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}
}
