package basic;
//String is sequence of characters.
public class P009_String {
	public static void main(String[] args) {
		char c[] = {'J','A','V','A'};
		System.out.println(c);
		String name= "java tech is used for selenium";
		System.out.println(name);
		System.out.println(name.length());
		String s1 = "java";
		String s2 = "JAVA";
		System.out.println(s1.concat(s2));
		System.out.println(s1);
		System.out.println(s1.charAt(2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		String s3= "   ";
		System.out.println("blank "+s3.isBlank());
		System.out.println("empty "+s3.isEmpty());
		
		
		
		StringBuffer s = new StringBuffer("java");
		System.out.println(s);
		s.append("hello");
		System.out.println(s);
		
		StringBuilder ss = new StringBuilder("java");
		System.out.println(ss);
		ss.append("hello");
		System.out.println(ss);
		
	}
}
