package part3;

public class FinalVariableDemo {
	
	//without final we can change variable - 
	final int speed =40; //final variable- we can not change tis value

	public static void main(String[] args) {

		FinalVariableDemo fm=new FinalVariableDemo();
		fm.speed=100; // compile time error because of final
		System.out.println(fm.speed);
	}

}
