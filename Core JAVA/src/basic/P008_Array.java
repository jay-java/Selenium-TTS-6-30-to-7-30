package basic;

import java.util.Scanner;

//array -> array is group of elements with same data type.
//types -> 1.single dimensional 2.multi
public class P008_Array {
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		//Multi dimensional array
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for(int row=0;row<=2;row++) {
			for(int col=0;col<=2;col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
		System.out.println("enter num of rows : ");
		int r = sc.nextInt();
		System.out.println("enter num of cols : ");
		int c = sc.nextInt();
		int arr1[][] = new int[r][c];
		for(int row=0;row<r;row++) {
			for(int col=0;col<c;col++) {
				System.out.print("enter ele at arr1["+row+"]["+col+"] : ");
				arr1[row][col] = sc.nextInt();
			}
		}
		System.out.println("final array : ----->");
		for(int row=0;row<r;row++) {
			for(int col=0;col<c;col++) {
				System.out.print(arr1[row][col]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		//single dimensional array
		
		int i=1,j=2,k=3,l=4,p=5,o=6;
		System.out.println(j);
		int b[] = new int[20];
		b[0] = 132;
		b[1] = 34;
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		for(int index=0;index<=9;index++) {
			System.out.println(a[index]);
		}
		
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
