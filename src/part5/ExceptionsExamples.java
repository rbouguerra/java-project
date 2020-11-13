package part5;

public class ExceptionsExamples {

	public static void main(String[] args) {

		System.out.println("Programe is started");
		System.out.println("Programe is in progress");

		// ArithmeticException
//		int a = 100;
//
//		try {
//			System.out.println(a / 0); // throw ArithmeticException
//		} catch (ArithmeticException e) {
//			System.out.println("Entred in to catch block");
//		}

//		String s=null;
//		
//		try {
//			System.out.println(s.length());//throws NullpointerException
//		}catch(Exception e) {
//			System.out.println("Entred in to catch block");
//		}

		String x = "abc";
		int i = Integer.parseInt(x); //NumberFormatException
		
		int arr[]=new int[5];
		arr[10]=100; // throw ArrayIndexOutOfBoundsException

		System.out.println("Programe is completed");
		System.out.println("Programe is exited");

	}

}
