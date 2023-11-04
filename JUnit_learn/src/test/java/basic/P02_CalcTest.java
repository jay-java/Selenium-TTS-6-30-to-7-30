package basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class P02_CalcTest {
	@Test
	public void calcTest() {
		Calc c = new Calc();
		int res = c.add(10, 20);
		System.out.println(res);
		assertEquals(30, res);
	}
}
