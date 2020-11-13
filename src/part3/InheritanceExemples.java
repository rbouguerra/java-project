package part3;

class A { //Parent
	
	int a;
	void display() {
		System.out.println(a);
	}
}

class B extends A { //B is child class, A is parent class
	
	int b;
	void print() {
		System.out.println(b);
	}
	
}

//Multilevel
class C extends B{
	int c;
	void show() {
		System.out.println(c);
	}
}

public class InheritanceExemples {

	public static void main(String[] args) {

		//Single
//		A aobj=new A();
//		aobj.a=100;
//		aobj.display();
//		
//		B bobj=new B();
//		bobj.a=10;
//		bobj.b=20;
//		bobj.display();
//		bobj.print();
		
		
		//Multilevel
		C cobj=new C();
		cobj.a=10;
		cobj.b=20;
		cobj.c=30;
		
		cobj.display();
		cobj.print();
		cobj.show();
	}

}
