package part3;

//1
public class Animal {
	
	String color="white";
	
	//2
	void eating() {
		System.out.println("Eating...........");
	}
	
	//3
	Animal(){ //Constructor
		System.out.println("Animal is created");
	}

}

class Dog extends Animal{
	
	//we can also call this overriding - different body
	String color="Black";
	
	
	Dog(){ //constructor
		
		super(); // add super - invoke parent class constructor
		System.out.println("Dog is created");
		
		
	}
	
	//1
	void displayColor() {
		
		System.out.println(color);
		System.out.println(super.color); // when add supper - int test super we print black and white
	}
	
	//2
	void eating() {
		System.out.println("Eating bread ........");
		super.eating(); // we execute the method in Animal class
	}
	
}
