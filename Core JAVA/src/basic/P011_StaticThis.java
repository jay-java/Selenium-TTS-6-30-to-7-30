package basic;
class Student{
	static {
		System.out.println("inside student class");
	}
	int id;
	String name;
	static String cname="TOPS";
	Student(int id,String name){
		System.out.println("id : "+id+" name : "+name);
		this.id = id;
		this.name = name;
	}
	
	public void showData() {
		System.out.println("id : "+id+" name : "+name+" c_name : "+cname);
	}
	
	public static void call() {
		
		System.out.println("static method ");
	}
	
}
public class P011_StaticThis {
	
	public static void main(String[] args) {
		System.out.println("inside main");
		Student s1 = new Student(1, "java");
		s1.showData();
		Student.call();
		s1.call();
		Student s2 = new Student(2, "python");
		s2.showData();
		Student s3 = new Student(3, "dart");
		s3.showData();
	}
	static {
		System.out.println("inside main class");
	}
}
