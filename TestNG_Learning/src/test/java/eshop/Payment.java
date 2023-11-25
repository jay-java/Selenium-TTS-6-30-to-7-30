package eshop;

import org.testng.annotations.Test;

public class Payment {
	@Test(groups = "smoke")
	public void COD() {
		System.out.println("COD");
	}
	@Test(groups = "purchase")
	public void creaditCard() {
		System.out.println("creadit card");
	}
	@Test
	public void debitCard() {
		System.out.println("debit card");
	}
	@Test
	public void UPI() {
		System.out.println("UPI");
	}
}
