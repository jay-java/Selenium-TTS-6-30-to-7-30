package basic;

//datatype -> type of data user wants to access for operation
//Two types 
//1.Primitive -> byte,short,int,long,float,double,boolean,char
//					byte,short,int,long -> whole number
//					float,double -> decimles
//					boolean -> true/false
//					char -> character
//2.Non-Primitive -> Array,String,Class
public class P001_DataType {
	public static void main(String[] args) {
		byte b = 127;
		System.out.println(b);
		short s = 128;
		System.out.println(s);
		int i = 1235;
		long l = 34656765765767676l;
		float f = 3.1456869679f;
		System.out.println(f);
		double d = 3.1456869679;
		System.out.println(d);
		boolean b1 = false;
		char c = 'a';
		System.out.println(c);
		double a = 3.0+2.0;
		System.out.println(a);
		double base = 5.0,height=6.5;
		double area = (base*height)/2;
		System.out.println(area);
	}
}
