package basic;
class Circle{
	public void shape() {
		System.out.println("circle class");
	}
}
class Square extends Circle{
	public void shape() {
		super.shape();
		System.out.println("sqaure class");
	}
}
public class P016_Overriding {
	public static void main(String[] args) {
		Square s = new Square();
		s.shape();
	}
}
