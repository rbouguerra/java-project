package part1;

public class ConstructorDemo {

	int x;
	int y;

	ConstructorDemo() { // default constructor

		x = 20;
		y = 10;
	}

	ConstructorDemo(int a, int b) { // Parameterized constructor

		x = a;
		y = b;
	}

	void display() {
		System.out.println(x + y);
	}

	public static void main(String[] args) {

		// ConstructorDemo cm=new ConstructorDemo(); //invoke default constructor
//		ConstructorDemo cm=new ConstructorDemo(100,200); // invoke parameterized constructor
//		
//		cm.display();

		// if calling the 2 constructors
		ConstructorDemo cm1 = new ConstructorDemo();
		ConstructorDemo cm2 = new ConstructorDemo(100, 200);
		cm1.display();
		cm2.display();

	}

}
