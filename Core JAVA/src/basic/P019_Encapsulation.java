package basic;
class Employee{
	private int eid;
	private String name;
	private String address;
	public Employee(int eid,String name,String address) {
		this.eid=eid;
		this.name=name;
		this.address=address;
	}
	@Override
	public String toString() {
		return "eid : "+eid+" name : "+name+" address : "+address;
	}
}
public class P019_Encapsulation {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "hemal", "ahmedabad");
		System.out.println(e1);
	}
}
