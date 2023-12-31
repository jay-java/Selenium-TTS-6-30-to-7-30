package basic;

/*Operators
1.Assignment -> =,+=,-=,*=,/=
2.Unary -> ++,--
3.Arithmetic -> +,-,*,/,%
4.Relational -> <,>,<=,>=,==,!=
5.Logical -> &&,||   */
public class P003_Operators {
	public static void main(String[] args) {
		// 1.Assignment
		int a = 10, b = 3;
		System.out.println(a);
		// a+=b; //a = a+b
		a -= 20; // a = a-20
		System.out.println(a);

		// 2.Unary
		int i = 10, j = 0;
		System.out.println("i = " + i);
		i--; // i = i+1 ->11
		System.out.println("i = " + i);
		j = i++;
		System.out.println("j = "+j);
		System.out.println(i);

	}
}
