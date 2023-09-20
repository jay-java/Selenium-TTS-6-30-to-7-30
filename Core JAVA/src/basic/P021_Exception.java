package basic;

import java.util.InputMismatchException;
import java.util.Scanner;

class Divide {// developer
	public void division() throws ArithmeticException, InputMismatchException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		int c = a / b;
		System.out.println(c);
	}

	public void checkNumber(int i) {
		if(i>0) {
			System.out.println(i);
		}
		else {
			throw new ArithmeticException();
		}
	}
}

public class P021_Exception { // tester
	public static void main(String[] args) {
		try {
			Divide d = new Divide();
//			d.division();
			d.checkNumber(-98);
		} catch (ArithmeticException e) {
			System.out.println("");
		}
		
		
		
		
		

//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter a = ");
//			int a = sc.nextInt();
//			System.out.println("enter b = ");
//			int b = sc.nextInt();
//			int c = a/b;
//			System.out.println(c);
//		}
//	
//		catch (ArithmeticException e) {
//			System.out.println("number cannot divide by zero");
//		}
//		catch(InputMismatchException e) {
//			System.out.println("denominator should be numeric value");
//		}
//		catch(Exception e) {
//			System.out.println("error");
//		}
//		finally {
//			System.out.println("finally executes everytime");
//		}
	}
}
