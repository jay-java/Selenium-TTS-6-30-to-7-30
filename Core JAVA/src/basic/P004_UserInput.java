package basic;

import java.util.Scanner;

class ABC{
	int i=1;
	public void run() {
		System.out.println("run function inside abc class");
	}
}
public class P004_UserInput {
	public static void main(String[] args) {
		ABC jay = new ABC();
		jay.run();
		System.out.println("in user input classs");
		int i,j,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter i = ");
		i = sc.nextInt();
		System.out.println("enter j = ");
		j = sc.nextInt();
		k = i+j;
		System.out.println(k);
	}
}
