package basic;

import java.util.Scanner;

//5 Type
/* 1.simple if
 * 2.if else
 * 3.nested if
 * 4.else if ladder
 * 5.switch case
 * */
public class P005_ConditionalStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter i = ");
		int i = sc.nextInt();
		
		if(i != 0) {
			System.out.println(" i = "+i);
		}
		else {
			System.out.println("i is 0");
		}
		
		
		
//		if(i == 0) {
//			System.out.println("i is zero");
//		}
//		else {
//			System.out.println("i is not zero");
//		}
		
		
		
		
		
		
		System.out.println("enter j = ");
		int j = sc.nextInt();
		
		//1.simple if
		if(i > j) {
			System.out.println("i is greater than j");
		}
		
		//2.if else
		if(i < j) {
			System.out.println("i is less than j");
		}
		else {
			System.out.println("j is less than i");
		}
	}
}
