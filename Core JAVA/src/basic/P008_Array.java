package basic;

import java.util.Scanner;

//array -> array is group of elements with same data type.
//types -> 1.single dimensional 2.multi
public class P008_Array {
	public static void main(String[] args) {
		int i=1,j=2,k=3,l=4,p=5,o=6;
		System.out.println(j);
		int b[] = new int[20];
		b[0] = 132;
		b[1] = 34;
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		for(int index=0;index<=9;index++) {
			System.out.println(a[index]);
		}
		Scanner sc=  new Scanner(System.in);
		System.out.println("enter size of array : ");
		int size = sc.nextInt();
		int ar[] = new int[size];
		for(int index=0;index<ar.length;index++) {
			System.out.print("enter value at ar["+index+"] : ");
			ar[index] = sc.nextInt();
		}
		int sum = 0;
		for(int index=0;index<ar.length;index++) {
			sum = sum+ar[index];
			System.out.println(sum);
		}
		System.out.println("sum = "+sum);
	}
}
