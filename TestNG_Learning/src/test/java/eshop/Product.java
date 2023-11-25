package eshop;

import org.testng.annotations.Test;

public class Product {
	@Test
	public void searchProduct() {
		System.out.println("search product");
	}
	@Test(groups = {"purchase","smoke"})
	public void addToCart() {
		System.out.println("add to cart");
	}
	@Test(groups = "smoke")
	public void addToWishList() {
		System.out.println("wish list");
	}
	@Test
	public void removeFromCArt() {
		System.out.println("remove from cart");
	}
}
