package part5;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("Programe is started");

		int a = 100;

		try {
			System.out.println(a / 2);

		} catch (Exception e) {
			System.out.println("Entred in to catch block");
		} finally {
			System.out.println("Entred in to finally block");
		}

		System.out.println("Programe is exited");

	}

}
