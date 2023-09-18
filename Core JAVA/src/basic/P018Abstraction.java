package basic;

abstract class RBI {
	abstract public void interest();// method declaration
	abstract public void HL();
	public static void repoRate() {
		System.out.println("repo rate : +-4%");
	}
	public void call() {
		
	}
}

class SBI extends RBI {

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("sbi interest : 6%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("sbi HL 7%");
	}

}

class PNB extends RBI {

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("pnb interest : 7%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("pnb HL 8%");
	}

}

class JAVA extends RBI {

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("java interest : 8%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("java HL 9%");
	}

}

public class P018Abstraction {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.interest();
		s.HL();
		SBI.repoRate();
		PNB p = new PNB();
		p.interest();
		p.HL();
		PNB.repoRate();
		JAVA j = new JAVA();
		j.interest();
		j.HL();
		JAVA.repoRate();
	}
}
