package testng;

import org.testng.annotations.Test;

public class P01_Test {
	@Test(priority = 1)
	public void test() {
		System.out.println("test method");
	}

	@Test(priority = 2)
	public void createAccount() {
		System.out.println("create accout test");
	}
	@Test(priority = 5)
	public void logout() {
		System.out.println("logout test");
	}

	@Test(priority = 3)
	public void login() {
		System.out.println("login test");
	}

	@Test(priority = 4)
	public void profile() {
		System.out.println("profile test");
	}
	@Test(priority = 6,expectedExceptions = ArithmeticException.class)
	public void divide() {
		int i= 10/0;
		System.out.println(i);
	}

	
	
}
