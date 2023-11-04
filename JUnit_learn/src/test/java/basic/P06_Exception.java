package basic;

import org.junit.Test;

public class P06_Exception {
	@Test(expected = ArithmeticException.class)
	public void test1() {
		int i = 10/0;
		System.out.println(i);
	}
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void test2() {
		int a[] = {1,2,3,4,5};
		System.out.println(a[8]);
	}
}
