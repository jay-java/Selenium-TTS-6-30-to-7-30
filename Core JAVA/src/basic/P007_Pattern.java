package basic;

public class P007_Pattern {
	public static void main(String[] args) {
//		for(int i=1;i<=5;i++) {				*****
//			for(int j=1;j<=5;j++) {			*****
//				System.out.print("*");		*****
//			}								*****
//			System.out.println();			*****
//		}

//		for(int i=1;i<=5;i++) {				*
//			for(int j=1;j<=i;j++) {			**
//				System.out.print("*");		***
//			}								****
//		System.out.println();				*****
//		}
		
		for(int i =1;i<=5;i++) {//row
			for(int j = 1;j<=i;j++) { //column
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(int i =1;i<=5;i++) {//row
			for(int j = 1;j<=i;j++) { //column
				System.out.print(i);
			}
			System.out.println();
		}
		
		
	}
}
