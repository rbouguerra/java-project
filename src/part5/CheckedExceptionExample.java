package part5;

public class CheckedExceptionExample {

	public static void main(String[] args) throws InterruptedException  {
		
		System.out.println("Programe is started");
		System.out.println("Programe is in progress");
		
		//by using try -- catch
		try {
			Thread.sleep(3000);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		// by using keyword --- throws InterruptedException
		Thread.sleep(5000);
		
		
		
		System.out.println("Programe is completed");
		System.out.println("Programe is exited");

	}

}
