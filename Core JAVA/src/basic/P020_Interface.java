package basic;
interface inter1{
	public void interface1();
	public static void StaticMethod() {
		System.out.println("static in interface1");
	}
}
interface inter2{
	
}
interface inter3{
	
}
class InterfaceCall implements inter1{

	@Override
	public void interface1() {
		// TODO Auto-generated method stub
		System.out.println("interface 1");
		
	}
	
}
public class P020_Interface {
	public static void main(String[] args) {
		InterfaceCall i = new InterfaceCall();
		i.interface1();
		inter1.StaticMethod();
	}
}
