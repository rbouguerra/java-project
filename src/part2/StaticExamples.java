package part2;

public class StaticExamples {
	
	static int a=10; //static variable
	int b=20; //non static variable
	
	static void m1() { //static method
		System.out.println("This is m1 - static method");
		
		//access to variable b non  access
		//create object
		StaticExamples se=new StaticExamples();
		System.out.println(se.b);
	}
	
	void m2() { //non static method
		System.out.println("This is m2 - non static method");
	}
	
	void m3() {
		System.out.println("This is m3 - non static method");
		
		System.out.println(a);
		System.out.println(b);
		
		m1();
		m2();
	}
	
	public static void main(String[] args) {
		
		//static method can access only static stuff(directly)==>without create an object
		System.out.println(a);
		
		System.out.println(StaticExamples.a); // By class name
		
		m1();
		StaticExamples.m1(); //by class name
		
		//System.out.println(b);  // incorrect, beacause b is non static variable
		
		//m2();//incorrect, beacause m2 is non static method
		
		
		//static method can also access non static stuff but through object
		StaticExamples se=new StaticExamples();
		System.out.println(se.b);
		se.m2();
		
		//call m3
		se.m3();
	}

}
