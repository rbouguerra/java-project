package part3;

final class Bike1{ //add final - so we cannont extend into child class
	
	int speed=40;
	void run() {
		System.out.println(speed);
	}
}

class Honda1 extends Bike1{ // compile time error
	
}



public class FinalClassDemo {

	public static void main(String[] args) {

	}

}
