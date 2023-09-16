package basic;
class Calculate{
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a , int b ,int c) {
		return a+b+c;
	}
	public int add(int a,int b,int c,int d) {
		return a+b+c+d;
	}
}
public class P015_Overloading {
	public static void main(String[] args) {
		Calculate c = new Calculate();
		int a = c.add(1, 2);
		System.out.println(a);
		int b = c.add(1, 2,3);
		System.out.println(b);
		int d = c.add(1, 2,3,4);
		System.out.println(d);
	}
}
