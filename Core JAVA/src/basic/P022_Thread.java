package basic;

public class P022_Thread {
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread();
		System.out.println(t.currentThread());
		t.setName("MyThread");
		System.out.println(t);
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			Thread.sleep(2000);
		}
	}
}
