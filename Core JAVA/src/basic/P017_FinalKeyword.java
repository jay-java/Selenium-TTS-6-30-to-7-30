package basic;

final class First {
	final int i = 1;
	final public void change() {
//		i++;
		System.out.println(i);
	}
}

class Second extends First{
	public void change() {
		System.out.println("change method in ssecond class");
	}
}

public class P017_FinalKeyword {
	public static void main(String[] args) {
		First f = new First();
		f.change();
	}
}
