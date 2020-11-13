package myPackage;

public class StringMethods {

	public static void main(String[] args) {
		
		String s="welcome";
		String s1="to java";
		
		System.out.println(s.length());//length of a string
		System.out.println(s.concat(s1));// joining of strings
		
		//trimming the string
		s="      welcome   ";
		System.out.println("Before trimming strings is: "+s);
		
		System.out.println("After trimming string is: " +s.trim());//remove space
		
		//chartAt()
		s="welcome";
		System.out.println(s.charAt(4));
		
		//contains()--> return true
		System.out.println(s.contains("wel"));
		System.out.println(s.contains("com"));
		
		//comparing string equals()
		s="welcome";
		System.out.println(s.equals("Welcome"));//false
		System.out.println(s.equals("wel   come"));//false
		System.out.println(s.equals("welcome"));//true
		
		//replacing characters
		s="welcome to java";
		System.out.println(s.replace('o', 'i'));//welcime ti java
		
		System.out.println(s.replace("java", "selenium"));// welcome to selenium
		
		//extracting substring from the main string
		s="Welcome";
		System.out.println(s.substring(0,4));//Welc
		
		//converting case
		s="WELCOME";
		System.out.println(s.toLowerCase());
		
		s="welcome";
		System.out.println(s.toUpperCase());
		

	}

}
