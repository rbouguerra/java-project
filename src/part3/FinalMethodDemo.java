package part3;

class Bike {
	
	final void run() { // add final - so we cannot ovverid this method in child class
		System.out.println("Running .............");
	}
}


class Honda extends Bike{
	
	void run() { // compile time error
		System.out.println("Started.......");
	}
}


public class FinalMethodDemo {

	public static void main(String[] args) {

	}

}
