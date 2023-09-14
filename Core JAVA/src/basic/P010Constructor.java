package basic;
class A{
	A(){
		System.out.println("default");
	}
	A(int i){
		System.out.println("para "+i);
	}
	A(int j,int k){
		System.out.println("para "+j+" : "+k);
	}
	A(String name){
		System.out.println("name : "+name);
	}
	public void run() {
		System.out.println("run function");
//		return "java";
	}
}
public class P010Constructor {
	public static void main(String[] args) {
		A a = new A();
		a.run();
		A a1 = new A(12);
		A a2 = new A("java");
	}
}
