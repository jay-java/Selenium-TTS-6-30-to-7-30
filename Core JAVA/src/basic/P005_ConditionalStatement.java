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

		if (i != 0) {
			System.out.println(" i = " + i);
		} else {
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

		// 1.simple if
		if (i > j) {
			System.out.println("i is greater than j");
		}

		// 2.if else
		if (i < j) {
			System.out.println("i is less than j");
		} else {
			System.out.println("j is less than i");
		}

		// else if ladder
		System.out.println("enter marks : ");
		int m = sc.nextInt();
		if (m < 35) {
			System.out.println("fail");
		} else if (m >= 35 && m <= 50) {
			System.out.println("pass class");
		} else if (m >= 51 && m <= 70) {
			System.out.println("C grade");
		} else if (m >= 71 && m <= 80) {
			System.out.println("B grade");
		} else if (m >= 81 && m <= 90) {
			System.out.println("A grade");
		} else if (m >= 91 && m <= 100) {
			System.out.println("A+ grade");
		} else {
			System.out.println("invalid input");
		}

		// nested if
		System.out.println("enter age : ");
		int age = sc.nextInt();
		if (age > 18) {
			System.out.println("greater than 18 checked");
			if (age < 65) {
				System.out.println("less than 65");
				System.out.println("you are eligible");
			} else {
				System.out.println("age is greater than 18 but not less than 65");
			}
		} else {
			System.out.println("age is less than 18");
		}

		// 5.Switch case
		System.out.println("Enter your choice : ");
		System.out.println("1.For English\n2.For Hindi\n3.For Gujarati");
		int c = sc.nextInt();
		switch (c) {
		case 1:
			System.out.println("You selected English");
			break;
		case 2:
			System.out.println("You selected Hindi");
			break;
		case 3:
			System.out.println("You selected Gujarati");
			break;
		default:
			System.out.println("invalid input");
		}
	}
}
