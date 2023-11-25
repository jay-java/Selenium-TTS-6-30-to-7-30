package dependency;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class Depends {
	@Test
	public void createAccount() {
		System.out.println("create account");
		assertFalse(true);
	}
	
	@Test(dependsOnMethods = "createAccount")
	public void login() {
		System.out.println("login");
	}
	@Test(dependsOnMethods = "login")
	public void logout() {
		System.out.println("logout");
	}
}
