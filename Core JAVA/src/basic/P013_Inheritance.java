package basic;
class Parent{
	public void parentMethod() {
		System.out.println("parent method");
	}
}
class Child extends Parent{
	public void childMethod() {
		System.out.println("child method");
	}
}
class A1{
	
}
class GrandChild extends Child{
	public void grandChildMethod() {
		System.out.println("grand child method");
	}
}
public class P013_Inheritance {
	public static void main(String[] args) {
//		Parent p = new Parent();
//		p.parentMethod();
//		Child c = new Child();
//		c.parentMethod();
//		c.childMethod();
		GrandChild g = new GrandChild();
		g.parentMethod();
		g.childMethod();
		g.grandChildMethod();
	}
}
