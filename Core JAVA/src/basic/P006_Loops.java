package basic;
//Loops
//1.for(initialization;condition;incre/decre){body}
//2.while(condition){body}
//3.do{body} while(condition);
//4. for each
public class P006_Loops {
	public static void main(String[] args) {
		System.out.println("for loop");
		for(int i=10;i>=1;i--) {
			System.out.println("hello java : "+i);
		}
		System.out.println("while loop");
		int j=10;
		while(j>=1) {
			System.out.println(j);
			j--;
		}
		
		System.out.println("do while loop");
		int k =10;
		do {
			System.out.println(k);
			k--;
		}
		while(k>=1);
		
		
		String name[] = {"hemal","rushika","nishit","bhoomika"};
		for(String s:name) {
			System.out.println(s);
		}
		
		for(int index=0;index<name.length;index++) {
			System.out.println(name[index]);
		}
		
	}
}
