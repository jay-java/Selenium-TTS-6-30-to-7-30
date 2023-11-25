package eshop;

import org.testng.annotations.Test;

public class User {
	@Test(groups = "smoke")
	public void createAccount() {
		System.out.println("create account");
	}
	
	@Test(groups = {"purchase","smoke"})
	public void login() {
		System.out.println("login");
	}
	@Test
	public void logout() {
		System.out.println("logout");
	}
	
}
