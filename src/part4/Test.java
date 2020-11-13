package part4;

interface A {
	int a=10; // by default variables in interface are static and final
	void m1(); //abstract method (without implementation of code), by defalt public
}

class B{
	int b;
}
public class Test extends B implements A {
	
	// here we are implement the method
	public void m1() { // modifier in class by default is default
		System.out.println(a);
	}
	public static void main(String[] args) {

		//here we can access to the method
//		Test test=new Test();
//		test.m1();
		
		
		A a=new Test(); //Create memory for the interface bcz interface don't have a memory by default
		a.m1();
		
		
	}

}
