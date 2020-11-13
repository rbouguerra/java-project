package accessModifiers;

class A {
	
//	 private int data=10;
//	 private void m1() {};
	
//	int data=10;
//	void m1() {
//		System.out.println(data);
//	}
	
	
	protected int data=10;
	protected void m1() {
		System.out.println(data);
	}
}

public class Simple {

	public static void main(String[] args) {
		
		A aobj=new A();
		aobj.data=20; // compile time error bcz private modifier
		aobj.m1(); // compile time error bcz private modifier

	}

}
